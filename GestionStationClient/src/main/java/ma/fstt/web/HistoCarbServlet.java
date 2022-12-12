package ma.fstt.web;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.fstt.ws.histocarb.Carburant;
import ma.fstt.ws.carburant.CarburantService;
import ma.fstt.ws.carburant.CarburantServiceImplService;
import ma.fstt.ws.histocarb.HistoCarb;
import ma.fstt.ws.histocarb.HistoCarbService;
import ma.fstt.ws.histocarb.HistoCarbServiceImplService;
import ma.fstt.ws.histocarb.Station;
import ma.fstt.ws.station.StationService;
import ma.fstt.ws.station.StationServiceImplService;

@WebServlet("/histocarb")
public class HistoCarbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HistoCarbService histoCarbService;
	private CarburantService carburantService;
	private StationService stationService;

	public HistoCarbServlet() {
		super();
		HistoCarbServiceImplService histoCarb = new HistoCarbServiceImplService();
		histoCarbService = histoCarb.getHistoCarbServiceImplPort();

		CarburantServiceImplService carburant = new CarburantServiceImplService();
		carburantService = carburant.getCarburantServiceImplPort();

		StationServiceImplService station = new StationServiceImplService();
		stationService = station.getStationServiceImplPort();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		try {
			if (action == null)
				listHistoCarbs(request, response);
			else {
				switch (action) {
				case "new":
					showNewForm(request, response);
					break;
				case "add":
					addHistoCarb(request, response);
					break;
				case "delete":
					deleteHistoCarb(request, response);
					break;
				case "edit":
					showEditForm(request, response);
					break;
				case "update":
					updateHistoCarb(request, response);
					break;
				case "compare":
					comparerDeuxCarburants(request, response);
					break;
				case "list":
					listHistoCarbs(request, response);
					break;
				default:
					listHistoCarbs(request, response);
					break;
				}
			}

		} catch (SQLException | ParseException ex) {
			throw new ServletException(ex);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void listHistoCarbs(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<HistoCarb> listHistoCarb = histoCarbService.getHistoCarbs();
		request.setAttribute("listHistoCarb", listHistoCarb);
		RequestDispatcher dispatcher = request.getRequestDispatcher("HistoCarbList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("HistoCarbForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		Long histoCarbId = Long.parseLong(request.getParameter("id"));
		HistoCarb existingHistoCarb = histoCarbService.findHistoCarb(histoCarbId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("HistoCarbForm.jsp");
		request.setAttribute("histoCarb", existingHistoCarb);
		dispatcher.forward(request, response);
	}

	private void addHistoCarb(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
		float prix = Float.parseFloat(request.getParameter("prix"));
		Long stationId = Long.parseLong(request.getParameter("station_id"));
		Long carburantId = Long.parseLong(request.getParameter("carburant_id"));

		histoCarbService.persistHistoCarb(date, prix, carburantId, stationId);
		response.sendRedirect("/GestionStationClient/histocarb");
	}

	private void updateHistoCarb(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ParseException {
		Long histoCarbId = Long.parseLong(request.getParameter("id"));
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
		float prix = Float.parseFloat(request.getParameter("prix"));
		Long stationId = Long.parseLong(request.getParameter("station_id"));
		Long carburantId = Long.parseLong(request.getParameter("carburant_id"));

		histoCarbService.updateHistoCarb(histoCarbId, date, prix, carburantId, stationId);
		response.sendRedirect("/GestionStationClient/histocarb");
	}

	private void deleteHistoCarb(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		Long histoCarbId = Long.parseLong(request.getParameter("id"));

		HistoCarb histoCarb = histoCarbService.findHistoCarb(histoCarbId);
		histoCarbService.deleteHistoCarb(histoCarb);
		response.sendRedirect("/GestionStationClient/histocarb");
	}
	
	private void comparerDeuxCarburants(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ParseException, ServletException {
		String stationNom = request.getParameter("nom");
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
		
		List<HistoCarb> listHistoCarb = histoCarbService.getTwoCarburant(stationNom, date);
		RequestDispatcher dispatcher = request.getRequestDispatcher("HistoCarb.jsp");
		request.setAttribute("listHistoCarb", listHistoCarb);
		dispatcher.forward(request, response);
	}

}

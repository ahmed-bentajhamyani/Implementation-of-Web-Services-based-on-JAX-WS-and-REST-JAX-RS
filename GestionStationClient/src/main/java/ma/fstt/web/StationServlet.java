package ma.fstt.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.fstt.ws.station.Station;
import ma.fstt.ws.station.StationService;
import ma.fstt.ws.station.StationServiceImplService;

@WebServlet("/station")
public class StationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StationService stationService;

	public StationServlet() {
		super();
		StationServiceImplService station = new StationServiceImplService();
		stationService = station.getStationServiceImplPort();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		try {
			if (action == null)
				listStations(request, response);
			else {
				switch (action) {
				case "new":
					showNewForm(request, response);
					break;
				case "add":
					addStation(request, response);
					break;
				case "delete":
					deleteStation(request, response);
					break;
				case "edit":
					showEditForm(request, response);
					break;
				case "update":
					updateStation(request, response);
					break;
				case "list":
					listStations(request, response);
					break;
				default:
					listStations(request, response);
					break;
				}
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void listStations(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Station> listStation = stationService.getStations();
		request.setAttribute("listStation", listStation);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StationList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("StationForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		Long stationId = Long.parseLong(request.getParameter("id"));
		Station existingStation = stationService.findStation(stationId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StationForm.jsp");
		request.setAttribute("station", existingStation);
		dispatcher.forward(request, response);
	}

	private void addStation(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String nom = request.getParameter("nom");
		String ville = request.getParameter("ville");
		String adresse = request.getParameter("adresse");

		Station newStation = new Station(nom, ville, adresse);
		stationService.persistStation(newStation);
		response.sendRedirect("/GestionStationClient/station");
	}

	private void updateStation(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		Long stationId = Long.parseLong(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String ville = request.getParameter("ville");
		String adresse = request.getParameter("adresse");

		Station newStation = new Station(stationId, nom, ville, adresse);
		stationService.updateStation(newStation);
		response.sendRedirect("/GestionStationClient/station");
	}

	private void deleteStation(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		Long stationId = Long.parseLong(request.getParameter("id"));

		Station station = stationService.findStation(stationId);
		stationService.deleteStation(station);
		response.sendRedirect("/GestionStationClient/station");
	}

}

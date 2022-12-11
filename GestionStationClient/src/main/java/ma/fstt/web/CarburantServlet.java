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

import ma.fstt.ws.carburant.Carburant;
import ma.fstt.ws.carburant.CarburantService;
import ma.fstt.ws.carburant.CarburantServiceImplService;

@WebServlet("/carburant")
public class CarburantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CarburantService carburantService;

	public CarburantServlet() {
		super();
		CarburantServiceImplService carburant = new CarburantServiceImplService();
		carburantService = carburant.getCarburantServiceImplPort();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		try {
			if (action == null)
				listCarburants(request, response);
			else {
				switch (action) {
				case "new":
					showNewForm(request, response);
					break;
				case "add":
					addCarburant(request, response);
					break;
				case "delete":
					deleteCarburant(request, response);
					break;
				case "edit":
					showEditForm(request, response);
					break;
				case "update":
					updateCarburant(request, response);
					break;
				case "list":
					listCarburants(request, response);
					break;
				default:
					listCarburants(request, response);
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

	private void listCarburants(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Carburant> listCarburant = carburantService.getCarburants();
		request.setAttribute("listCarburant", listCarburant);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CarburantList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("CarburantForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		Long carburantId = Long.parseLong(request.getParameter("id"));
		Carburant existingCarburant = carburantService.findCarburant(carburantId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CarburantForm.jsp");
		request.setAttribute("carburant", existingCarburant);
		dispatcher.forward(request, response);
	}

	private void addCarburant(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String nom = request.getParameter("nom");
		String description = request.getParameter("description");

		Carburant newCarburant = new Carburant(nom, description);
		carburantService.persistCarburant(newCarburant);
		response.sendRedirect("/GestionStationClient/Carburant?action=list");
	}

	private void updateCarburant(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		Long carburantId = Long.parseLong(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String description = request.getParameter("description");

		Carburant newCarburant = new Carburant(carburantId, nom, description);
		carburantService.updateCarburant(newCarburant);
		response.sendRedirect("/GestionStationClient/Carburant?action=list");
	}

	private void deleteCarburant(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		Long carburantId = Long.parseLong(request.getParameter("id"));

		Carburant Carburant = carburantService.findCarburant(carburantId);
		carburantService.deleteCarburant(Carburant);
		response.sendRedirect("/GestionStationClient/Carburant?action=list");
	}

}

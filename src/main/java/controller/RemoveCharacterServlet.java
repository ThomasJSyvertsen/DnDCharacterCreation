package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DnDCharacter;

/**
 * Servlet implementation class RemoveCharacterServlet
 */
@WebServlet("/RemoveCharacterServlet")
public class RemoveCharacterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCharacterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DnDCharacterHelper dh = new DnDCharacterHelper();
		DnDCharacter charToRemove = dh.searchForDnDCharacterById(Integer.parseInt(request.getParameter("playerId")));
		
		dh.removeDnDCharacter(charToRemove);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

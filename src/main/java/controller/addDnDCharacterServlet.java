package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DnDCharacter;

/**
 * Servlet implementation class addDnDCharacterServlet
 */
@WebServlet("/addDnDCharacterServlet")
public class addDnDCharacterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addDnDCharacterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DnDCharacterHelper ch = new DnDCharacterHelper();
		String playerName = request.getParameter("playerName");
		String characterName = request.getParameter("characterName");
		String hitPoints = request.getParameter("hitPoints");
		String hitDamage = request.getParameter("hitDamage");
		
		DnDCharacter toAdd = new DnDCharacter(playerName, characterName, Integer.parseInt(hitPoints), Integer.parseInt(hitDamage));
		
		ch.insertCharacter(toAdd);
				getServletContext().getRequestDispatcher("/resultCreateCharacter.jsp").forward(request, response);
	}

}

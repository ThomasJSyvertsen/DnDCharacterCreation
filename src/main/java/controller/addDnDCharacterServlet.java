package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Attributes;
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
		String hitPointsString = request.getParameter("hitPoints");
		String hitDamageString = request.getParameter("hitDamage");
		
		int hitPoints = Integer.parseInt(hitPointsString);
		int hitDamage = Integer.parseInt(hitDamageString);
		
		String strengthString = request.getParameter("strength");
		String intelligenceString = request.getParameter("intelligence");
		String wisdomString = request.getParameter("wisdom");
		String dexterityString = request.getParameter("dexterity");
		String constitutionString = request.getParameter("constitution");
		String charismaString = request.getParameter("charisma");
		
		int strength = Integer.parseInt(strengthString);
		int intelligence = Integer.parseInt(intelligenceString);
		int wisdom = Integer.parseInt(wisdomString);
		int dexterity = Integer.parseInt(dexterityString);
		int constitution = Integer.parseInt(constitutionString);
		int charisma = Integer.parseInt(charismaString);
		Attributes att = new Attributes(strength, intelligence, wisdom, dexterity, constitution, charisma);
		
		DnDCharacter toAdd = new DnDCharacter(playerName, characterName, att, hitPoints, hitDamage);
		
		ch.insertCharacter(toAdd);
				getServletContext().getRequestDispatcher("/resultCreateCharacter.jsp").forward(request, response);
	}
}

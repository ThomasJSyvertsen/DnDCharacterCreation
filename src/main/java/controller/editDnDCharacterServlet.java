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
 * Servlet implementation class editDnDCharacterServlet
 */
@WebServlet("/editDnDCharacterServlet")
public class editDnDCharacterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editDnDCharacterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DnDCharacterHelper dh = new DnDCharacterHelper();
		DnDCharacter charToEdit = dh.searchForDnDCharacterById(Integer.parseInt(request.getParameter("playerId")));
		
		String[] toEditString = new String[8];
		
		String playerName = request.getParameter("playerName");
		String characterName = request.getParameter("characterName");	
		
		if (playerName == "") {
			playerName = charToEdit.getPlayerName();
		}
		
		if (characterName == "") {
			characterName = charToEdit.getCharacterName();
		}
		
		String hitPointsString = request.getParameter("hitPoints");
		String hitDamageString = request.getParameter("hitDamage");
		
		String strengthString = request.getParameter("strength");
		String intelligenceString = request.getParameter("intelligence");
		String wisdomString = request.getParameter("wisdom");
		String dexterityString = request.getParameter("dexterity");
		String constitutionString = request.getParameter("constitution");
		String charismaString = request.getParameter("charisma");
		
		toEditString[0] = hitPointsString;
		toEditString[1] = hitDamageString;
		
		toEditString[2] = strengthString;
		toEditString[3] = intelligenceString;
		toEditString[4] = wisdomString;
		toEditString[5] = dexterityString;
		toEditString[6] = constitutionString;
		toEditString[7] = charismaString;	
		
		Attributes att = new Attributes(charToEdit.getAttributes().getStrength(), charToEdit.getAttributes().getIntelligence(), charToEdit.getAttributes().getWisdom(),
				charToEdit.getAttributes().getDexterity(), charToEdit.getAttributes().getConstitution(), charToEdit.getAttributes().getCharisma());
		
		for (int i = 0; i < toEditString.length; i++) {
			if (toEditString[i] != "") {
				switch(i) {
					case 0:
						charToEdit.setHitPoints(Integer.parseInt(hitPointsString));
						break;
					case 1:
						charToEdit.setHitPoints(Integer.parseInt(hitDamageString));
						break;
					case 2:
						att.setStrength(Integer.parseInt(strengthString));
						break;
					case 3:
						att.setStrength(Integer.parseInt(intelligenceString));
						break;
					case 4:
						att.setStrength(Integer.parseInt(wisdomString));
						break;
					case 5:
						att.setStrength(Integer.parseInt(dexterityString));
						break;
					case 6:
						att.setStrength(Integer.parseInt(constitutionString));
						break;
					case 7:
						att.setStrength(Integer.parseInt(charismaString));
						break;
				}
			}
		}
		
		charToEdit.setPlayerName(playerName);
		charToEdit.setCharacterName(characterName);
		charToEdit.setAttributes(att);
		
		dh.updateDnDCharacter(charToEdit);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

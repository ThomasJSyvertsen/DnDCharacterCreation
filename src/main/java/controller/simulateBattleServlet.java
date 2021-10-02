package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DnDCharacter;

/**
 * Servlet implementation class simulateBattleServlet
 */
@WebServlet("/simulateBattleServlet")
public class simulateBattleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public simulateBattleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DnDCharacterHelper dh = new DnDCharacterHelper();
		String attacker = request.getParameter("attackingCharacter");
		int attackerId = Integer.parseInt(attacker);
		String defender = request.getParameter("defendingCharacter");
		int defenderId = Integer.parseInt(defender);
		DnDCharacter attackerChar = dh.searchForDnDCharacterById(attackerId);
		DnDCharacter defenderChar = dh.searchForDnDCharacterById(defenderId);
		
		attackerChar.doDamage(defenderChar);
		
		dh.updateDnDCharacter(defenderChar);
			getServletContext().getRequestDispatcher("/resultSimulateBattle.jsp").forward(request, response);
	}

}

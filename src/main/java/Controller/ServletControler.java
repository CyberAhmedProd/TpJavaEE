package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Entrees;

/**
 * Servlet implementation class ServletControler
 */
@WebServlet("/ServletControler")
public class ServletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 request.setAttribute("errorVal1", "");
		 request.setAttribute("errorVal2", "");
		 request.setAttribute("Entrees", "");
		 request.setAttribute("v1", request.getParameter("va1"));
		 request.setAttribute("v2", request.getParameter("va2"));
		 request.setAttribute("errorVal2", "vide");
		 if(request.getParameter("va1").isEmpty() || request.getParameter("va2").isEmpty())
		 {
			 if(request.getParameter("va1").isEmpty())
			 {
				 request.setAttribute("errorVal1", "vide");
			 }
			 
			 
			 if(request.getParameter("va2").isEmpty())
			 {
				 request.setAttribute("errorVal2", "vide");
			 }
			 this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		 }
		
		 
		 int val1 = Integer.parseInt(request.getParameter("va1"));
		 int val2 = Integer.parseInt(request.getParameter("va2"));
		 if(val1 <1 || val2 < 1)
		 {
			 if(val1 <1)
				 request.setAttribute("errorVal1", "inf à 1");
			 if(val2 < 1)
				 request.setAttribute("errorVal2", "inf à 1");
			 this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		 }
			 
		 else
		 {
			 Entrees entre = new Entrees(val1,val2);
			 int pgcd = entre.pgcd(val1, val2);
			 int ppcm = entre.ppcm(val1,val2);
			 String choix = request.getParameter("choix");
			 if(choix.equals("PGCD"))
				 request.setAttribute("Entrees",pgcd);
			 else
				 request.setAttribute("Entrees",ppcm);
			 this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		 }
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

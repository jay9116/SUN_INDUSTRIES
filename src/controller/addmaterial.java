package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.materialdao;
import VO.materialvo;

/**
 * Servlet implementation class addmaterial
 */
@WebServlet("/addmaterial")
public class addmaterial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addmaterial() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type=request.getParameter("type").toString();
		String b=request.getParameter("size");
		float c=Float.parseFloat(b);
		String d=request.getParameter("weight").toString();
		double e=Double.parseDouble(d);
		
		materialdao dao=new materialdao();
		materialvo vo=new materialvo();
		vo.setMaterialtype(type);
		vo.setSize(c);
		vo.setWeight(e);
		
		
		
		dao.add(vo);
		System.out.print("hi");
		response.sendRedirect("/include.jsp");

	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

package com.cos.product.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.product.action.Action;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final String TAG = "ProductController : ";
	private static final long serialVersionUID = 1L;
       
    public ProductController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
//	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String cmd = request.getParameter("cmd");
//		System.out.println(TAG + "doProcess" + cmd);
//		Action action = router(cmd);
//		action.execute(request, response);
//	}
//	
//	public Action router(String cmd) {
//		if (cmd.equals("home")) {
//			return 
//		}
//	}

}

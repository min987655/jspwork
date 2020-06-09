package com.cos.chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {super();}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트에서 전송되어오는 id라는 이름의 파라미터값과 
		// psaawd라는 이름의 파리미터 값을 받는 부분
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		// 데이터타입, 문자인코딩 지정
		response.setContentType("text/html;charset=utf-8");
		// 문자열 단위로 response 객체에 내용을 출력할 수 있는 출력스트림 생성 
		PrintWriter out = response.getWriter();
		// 응답에 id, password 변수 값을 출력하는 부분
		out.println("아이디 : " + id + "<br>");
		out.println("비밀번호 : " + passwd + "<br>");		
	}
}

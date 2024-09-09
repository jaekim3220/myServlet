package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// 한글 폰트
		response.setContentType("text/html");
		
		// request params(디버깅을 통해 request가 옳바르게 동작하는지 확인)
		String name = request.getParameter("name");
		String resume = request.getParameter("resume");
		
		PrintWriter out = response.getWriter();
		out.println("<html><header><title>입사지원서</title></header><body>");
		out.println("<b>" + name + "</b>님 지원이 완료되었습니다. <br>");
		out.println("<p><b> 지원 내용 </b></p>");
		out.println("<p><b>" + resume + "</b></p>");
		out.println("</body></html>");
	}
}

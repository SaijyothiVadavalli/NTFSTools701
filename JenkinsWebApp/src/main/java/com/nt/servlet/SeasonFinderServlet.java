package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/seasonurl")
public class SeasonFinderServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	System.out.println("SeasonFinderServlet.doGet()");
PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	LocalDateTime idt=LocalDateTime.now();
	int month=idt.getMonthValue();
	String SeasonName=null;
	if(month>=3 && month<=6)
		SeasonName="Summer Season";
	else if(month>=7 && month<=10)
		SeasonName="Rainy Season";
	else
		SeasonName="Winter Season";
	pw.println("<h1 style='color:yellow;text-align:center'>"+SeasonName +"</h1>");
	pw.println("<a href='index.jsp'>home<img src='Images/Heart-image.png' width='50' height='50'> </a>");
pw.close();
}
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	doGet(req, res);
}
}

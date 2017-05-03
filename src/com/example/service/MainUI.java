
package com.example.service;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.example.command.Controller;

public class MainUI {
	public MainUI(){
	
	}
		
	public String login(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		Boolean success = false;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		success = controller.login(username, password);
		HttpSession session = request.getSession();
		if(success){
			
			session.setAttribute("username", username);
			forwardToJsp = "/homepage.jsp";
			System.out.printf("should send to test.jsp");
			
		}
		else{
			session.setAttribute("username", null);
			forwardToJsp = "/homepage.html";
		}
		
		return forwardToJsp;
	}
	
	public String logout(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";		
		controller.logout();
		HttpSession session = request.getSession();
		session.setAttribute("username", null);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}
	
	public String register(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String regUsername = request.getParameter("regUsername");
		String regPassword = request.getParameter("regPassword");
		String regConfirmPassword = request.getParameter("regConfirmPassword");
		String registerEmail = request.getParameter("registerEmail");
		String regDOB = request.getParameter("regDOB");
		String regContactNumber = request.getParameter("regContactNumber");
		System.out.printf("regDOB: %s",regDOB);
		controller.register(regUsername, regPassword, regConfirmPassword, registerEmail, regDOB, regContactNumber);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}
	
	public String searchRoom(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String checkInDate = request.getParameter("checkInDate");		//TODO:
		String checkOutDate = request.getParameter("checkOutDate");		//Change according to front end
		String roomType = request.getParameter("roomType");
		//System.out.printf("regDOB: %s",regDOB);
		controller.searchRoom(checkInDate, checkOutDate, roomType);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}

	public String removeRoom(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String roomNo = request.getParameter("roomNo");
		controller.removeRoom(roomNo);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}
	
	public String addRoom(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String roomNo = request.getParameter("roomNo");
		String bedType = request.getParameter("bedType");
		String smoking = request.getParameter("smoking");
		String price = request.getParameter("price");
		controller.addRoom(roomNo,bedType,smoking,price);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}

	public String ammendRoom(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String roomNo = request.getParameter("roomNo");
		String bedType = request.getParameter("bedType");
		String smoking = request.getParameter("smoking");
		String price = request.getParameter("price");
		controller.ammendRoom(roomNo,bedType,smoking,price);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}

	public String getBooking(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String userId = null;
		String referenceNo=null;
		userId=request.getParameter("userId");
		referenceNo= request.getParameter("referenceNo")
		controller.getBooking(userId,referenceNo);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}
	
	public String searchAvailableRoom(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String checkInDatetemp = request.getParameter("checkInDate");
		String checkOutDatetemp = request.getParameter("checkOutDate");
		String roomType = request.getParameter("roomType");
		
		controller.searchAvailableRoom(checkInDate,checkOutDate,roomType);
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}

	private String userId;
	private String roomNo;
	private String referenceNo;
	private String reserveTime;
	private Date arrDate;
	private Date depDate;
	private String checkInStatus;
	public String makeBooking(HttpServletRequest request, HttpServletResponse repsonse){
		Controller controller = new Controller();
		String forwardToJsp = "";	
		String userId = request.getParameter("userId");
		String roomNo = request.getParameter("roomNo");
		String referenceNo = request.getParameter("referenceNo");
		String reserveTime = request.getParameter("reserveTime");
		String arrDatetemp =request.getParameter("checkIn");
		String depDate =request.getParameter("checkOut");
		Date arrDate;
		Date depDate;
		controller.makeBooking(userId,roomNo,referenceNo,reserveTime,arrDate,depDate,"not arrived");
		forwardToJsp = "/homepage.html";
		return forwardToJsp;
	}
}

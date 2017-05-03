
package com.example.command;

import com.example.dao.BookingDao;
import com.example.dao.RoomDao;
import com.example.dao.UserDao;
import com.example.exceptions.DaoException;
import com.example.business.Booking;
import com.example.business.Room;

import java.sql.Date;
import java.util.ArrayList;

public class Controller {
	
	UserDao userdao = new UserDao();
	RoomDao roomdao = new RoomDao();
	BookingDao bookingdao= new BookingDao();
	
	public boolean login(String username, String password){
		Boolean success = false;
		try {			
			success = userdao.login(username, password);
			
		} 
		catch (DaoException e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}//End login
	
	public boolean logout(){
		return true;
	}//End logout
	
	public boolean register(String regUsername, String regPassword, String regConfirmPassword, String registerEmail, String regDOB, String regContactNumber){
		try {			
			userdao.register(regUsername, regPassword, regConfirmPassword, registerEmail, regDOB, regContactNumber);
			return true;
		} 
		catch (DaoException e) {
			e.printStackTrace();
			return false;
		}
	}//End login
	
	public ArrayList<Room> searchRoom(String checkInDate, String checkOutDate, String roomType){
		
		try {			
			return roomdao.searchRoom(checkInDate, checkOutDate,roomType);
		} 
		catch (DaoException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean removeRoom(String roomNo){
		
		try {
			return roomdao.removeRoom(roomNo);
		} 
		catch (DaoException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean addRoom(String roomNo,String bedType,String smoking, String price){
		
		try {			
			return roomdao.addRoom(roomNo,bedType,smoking,price);
		} 
		catch (DaoException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean ammendRoom(String roomNo,String bedType,String smoking, String price){
		
		try {			
			return roomdao.ammendRoom(roomNo,bedType,smoking,price);
		} 
		catch (DaoException e) {
			e.printStackTrace();
			return false;
		}
	}

	public ArrayList<Booking> getBooking(String userId,String bookingId)
	{
		try {			
			return bookingdao.getBooking(userId,bookingId);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean makeBooking(String userId,ArrayList<String> roomNo,String checkIn,String checkOut,String reserveTime,String visitedTime)
	{
		try {			
			return bookingdao.makeBooking(userId,roomNo,checkIn,checkOut,reserveTime,visitedTime);
		} 
		catch (DaoException e) {
			e.printStackTrace();
			return false;
		}
	}
	public ArrayList<Room> searchAvailableRoom(Date checkInDate, Date checkOutDate, String roomType) 
	{
		try {			
			return bookingdao.searchAvailableRoom(checkInDate,checkOutDate,roomType);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean cancelBooking(String bookingId)
	{
		try {			
			return bookingdao.canselBooking(bookingId);
		} 
		catch (DaoException e) {
			e.printStackTrace();
			return false;
		}
	}

}
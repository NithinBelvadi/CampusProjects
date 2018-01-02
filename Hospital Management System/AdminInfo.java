package com.sdp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class AdminInfo {
public String adminIDInput;
public String adminPasswordInput;

public boolean adminLoginCheck(){
	System.out.println("Please enter Admin userID for Login :");
	Scanner scanForLogin=new Scanner(System.in);
	String adminIDInput=scanForLogin.nextLine();
	System.out.println("Please enter your password :");
	String adminPasswordInput=scanForLogin.nextLine();
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
	Statement myStatement=myConn.createStatement();
	String query="Select adminUserName from hms.admininfo where adminPassword= ? and adminUserName =? ";
	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
	prepstmt.setString(1, adminPasswordInput);
	prepstmt.setString(2, adminIDInput);
	ResultSet rs=prepstmt.executeQuery();

	
	while(rs.next()){
	
		System.out.println("------------------LOGIN SUCCESS------------");
		System.out.println(rs.getString(1)); 
		
		return true;
	}
	System.out.println("INCORRECT PASSWORD");
	/*if(rs.next()){
		System.out.println("INCORRECT PASSORD/ID");
		return false;
	}*/
	
	}//END OF TRY
	catch(Exception e){
		e.printStackTrace();
	}
	return false;
	
	
}

}

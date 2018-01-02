package com.sdp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;
import java.util.UUID;

import com.mysql.jdbc.PreparedStatement;

public class DoctorInfo {
	static int MAX_PATIENCE=10;
	public String doctorFirstName;
	public String doctorLastName;
	public String doctorDepartment;
	public int doctorID;
	public String doctorAddress;
	public String doctorPhoneNumber;
	public String doctorEmailID;
	public String doctorPassword;
	
	
	
	
	public void displayDoctors(){
		//DISPLAY TO BE DONE FROM JDBC CONNECTION
	}
	   
	public void doctorLoginCheck(String email,String password){
		if(email.equals(this.doctorEmailID) && password.equals(this.doctorPassword))
			{
			System.out.println("LOGIN SUCCESS----");
			System.out.println("---CODE TO BE ADDED AFTER LOGIN-----");
			
		}
		
		else
			System.out.println("Login Loading..");
			
	}
	
	
	public void doctorAvailabilityInfo(){
		
    	
    	System.out.println("Hello Doc,. Please let me know which are the days you are available.\n");
    	Scanner scanner=new Scanner(System.in);
    	String doctorAvailability=scanner.nextLine();
    	System.out.println("Please confirm your Password :");
    	doctorPassword=scanner.nextLine();
    	PreparedStatement stmt = null;
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    	
    	String sqlForInsertPatients="UPDATE hms.doctorinfo SET doctorAvailability =? WHERE doctorPassword=?;";
    	Connection myConn = DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	stmt = (PreparedStatement) myConn.prepareStatement(sqlForInsertPatients);
    	
    	stmt.setString(1, doctorAvailability);
    	stmt.setString(2, doctorPassword);
    	stmt.execute();
    	
		}
		
    	catch(Exception e){
    		e.printStackTrace();
    		
    	}
    	
    	
	}
	public void insertPatientInfo(){
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("----------PLEASE FILL THE FORM FOR ADDING A DOCTOR----------");
		
		
		System.out.println("First Name :");
		this.doctorFirstName=scanner.nextLine();
		
		System.out.println("Last Name :");
		this.doctorLastName=scanner.nextLine();
		
		
		Scanner scan=new Scanner(System.in);
		
		
		
	
		
		
		
		System.out.println("Please enter Doctors Department");
		this.doctorDepartment=scan.nextLine();
		
		System.out.println("Please enter Doctors phone number:");
		this.doctorPhoneNumber=scan.nextLine();
		
		
		
		System.out.println("Enter desired Login ID for doctor :");
		this.doctorEmailID=scan.nextLine();
		
		System.out.println("Enter your desired password for login:");
		this.doctorPassword=scan.nextLine();
		
		PreparedStatement stmt = null;
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    	
    	String sqlForInsertPatients="INSERT INTO hms.doctorinfo (doctorFirstName,doctorLastName,doctorDepartment,doctorPhoneNumber,doctorEmailID,doctorPassword) VALUES (?, ?, ?, ?, ?, ?);";
    	Connection myConn = DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	stmt = (PreparedStatement) myConn.prepareStatement(sqlForInsertPatients);
    	
    	stmt.setString(1, doctorFirstName);
    	stmt.setString(2, doctorLastName);
    	stmt.setString(3, doctorDepartment);
    	stmt.setString(4,doctorPhoneNumber);
    	stmt.setString(5,doctorEmailID);
    	stmt.setString(6,doctorPassword);
    	stmt.execute();
    	System.out.println("---------------------------------------------------------------------");
		System.out.println("Thanks for submitting the application.");
    	System.out.println("SIGN-UP COMPLETE");
    	}
		
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	
		
		
	}
	
	public boolean doctorLoginCheck(){
		
		System.out.println("Please enter your userID for Login :");
		Scanner scanForLogin=new Scanner(System.in);
		String doctorIDInput=scanForLogin.nextLine();
		
		System.out.println("Please enter your password :");
		String doctorPasswordInput=scanForLogin.nextLine();
		
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	Statement myStatement=myConn.createStatement();
    	String query="Select doctorID,doctorFirstName,doctorLastName,doctorDepartment from hms.doctorinfo where doctorPassword= ? and doctorEmailID =?";
    	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
    	prepstmt.setString(1,doctorPasswordInput);
    	prepstmt.setString(2,doctorIDInput);
    	ResultSet rs=prepstmt.executeQuery();
    
    	
    	while(rs.next()){
    	
    		System.out.println("------------------LOGIN SUCCESS------------");
    		System.out.println(rs.getInt(1)+" \t\t"+rs.getString(2)+"\t\t " + rs.getString(3)+"\t\t "+rs.getString(4)); 
    		
    		return true;
    	}
    	System.out.println("INCORRECT PASSWORD/USERNAME");
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
	
	
	
	
	
	
	public boolean doctorDelete(){
		System.out.println("Please enter your username to Delete :");
		Scanner scanForLogin=new Scanner(System.in);
		String doctorDeleteName=scanForLogin.nextLine();
		
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	//Statement myStatement=myConn.createStatement();
    	String query="delete from hms.doctorinfo where doctorFirstName= ? ";
    	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
    	
    	prepstmt.setString(1, doctorDeleteName);
    	prepstmt.execute();
    	return true;
    	
    	/*while(rs.next()){
    	
    		System.out.println("------------------DELETE SUCCESS------------");
    		System.out.println(rs.getInt(1)+" \t\t"+rs.getString(2)+"\t\t " + rs.getString(3)+"\t\t "+rs.getString(4)); 
    		
    		return true;
    	} */
    	
    	
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
	
public void setPatientPriscription(){
		
    	
    	System.out.println("Hello Doc,. Please select the patient Name to set his/her Priscription\n");
    	Scanner scanner=new Scanner(System.in);
    	String patientScannedName=scanner.nextLine();
    	System.out.println("Please fill in the Priscription");
    	String patientScannedPriscription=scanner.nextLine();
    	System.out.println("Please write the remarks on the patient's condition");
    	String patientScannedRemarks=scanner.nextLine();
    	PreparedStatement stmt = null;
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    	
    	String sqlForInsertPatients="UPDATE hms.patientInfo SET patientPriscription=?, doctorsRemarks=? WHERE patientFirstName=?;";
    	Connection myConn = DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	stmt = (PreparedStatement) myConn.prepareStatement(sqlForInsertPatients);
    	
    	stmt.setString(1, patientScannedPriscription);
    	stmt.setString(2, patientScannedRemarks);
    	stmt.setString(3, patientScannedName);
    	stmt.execute();
    	System.out.println("THE PRISCRIPTION DETAILS HAVE BEEN ADDED SUCCESSFULLY...");
		}
		
    	catch(Exception e){
    		e.printStackTrace();
    		
    	}
    	
    	
	}

public void viewPatientRecord(){
	
	
	
	
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
    	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	Statement myStatement=myConn.createStatement();
    	String query="select patientFirstName,patientLastName,patientIllness,patientPriscription,doctorsRemarks from hms.patientinfo; ";
    	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
    	ResultSet rs=prepstmt.executeQuery();
    	
    	System.out.println("PATIENT FIRST NAME \tPATIENT LAST NAME\t\tPATIENT ILLNESS\t\tPATIENT PRISCRIPTION\t\tPATIENT REMARKS");
    	System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
	while(rs.next()){
    	
		
		System.out.println(rs.getString(1)+" \t\t\t"+rs.getString(2)+"\t\t\t\t " + rs.getString(3)+"\t\t\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)); 
		
		
	}
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
	}
	
	catch(Exception e){
		e.printStackTrace();
		
	}
	
	
}
	
	
}

package com.sdp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author user
 *
 */
public class PatientInfo{
	static int MAX_PATIENCE=10;
	public String patientFirstName;
	public String patientLastName;
	public String patientAge;
	public int patientID;
	public String patientsex;
	public String isPatientDiabetic;
	public String isPatientMarried;
	public String isPatientAllergic;
	public String patientAddress;
	public String patientInsuranceNumber;
	public String patientReferredByDoctor;
	public String patiencePhoneNumber;
	public String patientEmailID;
	public String tempVariableForChecking;
	public String patientPassword;
	public String patientPriscriptionDetails;
	public String patientCurrentIllness;
	

	public void insertPatientInfo(){
			
					
		Scanner scanner=new Scanner(System.in);
		System.out.println("----------PLEASE FILL THE PATIENT FORM----------");
		System.out.println("First Name :");
		this.patientFirstName=scanner.nextLine();
		
		System.out.println("Last Name :");
		this.patientLastName=scanner.nextLine();
		
		System.out.println("Age :");
		this.patientAge=scanner.nextLine();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sex :");
		this.patientsex=scan.nextLine();
		
		System.out.println("Are you diabetic:(y/n)");
		this.isPatientDiabetic=scan.nextLine();
		
		System.out.println("Are you Married:(y/n)");
		this.isPatientMarried=scan.nextLine();
		
		
		System.out.println("Are you Allergic:(y/n)");
		this.isPatientAllergic=scanner.nextLine();
		
		System.out.println("Adress:");
		this.patientAddress=scanner.nextLine();
		
		System.out.println("Your Insurance Number :");
		this.patientInsuranceNumber=scanner.nextLine();
		
		
		
		System.out.println("Please enter your phone number:");
		this.patiencePhoneNumber=scanner.nextLine();
		
		System.out.println("Your Current Illness ? :");
		this.patientCurrentIllness=scanner.nextLine();
		
		System.out.println("Enter your desired Login ID :");
		this.patientEmailID=scanner.nextLine();
		
		System.out.println("Enter your desired password for login:");
		this.patientPassword=scanner.nextLine();
		
		PreparedStatement stmt = null;
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    	
    	String sqlForInsertPatients="insert into hms.patientinfo(patientFirstName,patientLastName,patientAge,patientSex,isPatientDiabetic,isPatientMarried,isPatientAllergic,patientAddress,patientInsuranceNumber,patientPhoneNumber,patientEmailID,patientIllness,patientPassword) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    	Connection myConn = DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	stmt = (PreparedStatement) myConn.prepareStatement(sqlForInsertPatients);
    	stmt.setString(1, patientFirstName);
    	stmt.setString(2, patientLastName);
    	stmt.setString(3, patientAge);
    	stmt.setString(4,patientsex);
    	stmt.setString(5, isPatientDiabetic);
    	stmt.setString(6,isPatientMarried);
    	stmt.setString(7, isPatientAllergic);
    	stmt.setString(8, patientAddress);
    	stmt.setString(9, patientInsuranceNumber);
    	stmt.setString(10, patiencePhoneNumber);
    	stmt.setString(11, patientEmailID);
    	stmt.setString(12, patientCurrentIllness);
    	stmt.setString(13, patientPassword);
    	stmt.execute();
    	System.out.println("---------------------------------------------------------------------");
		System.out.println("Thanks for submitting the application.");
    	System.out.println("SIGN-UP COMPLETE");
    	}
		
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	
		
		
	}
	
	
	
	
	
	public boolean patientLoginCheck(){
		System.out.println("Please enter your userID for Login :");
		Scanner scanForLogin=new Scanner(System.in);
		String patientIDInput=scanForLogin.nextLine();
		System.out.println("Please enter your password :");
		String patientPasswordInput=scanForLogin.nextLine();
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	Statement myStatement=myConn.createStatement();
    	String query="Select patientID,patientFirstName,patientLastName,patientInsuranceNumber from hms.patientinfo where patientPassword= ? and patientEmailID =? ";
    	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
    	prepstmt.setString(1, patientPasswordInput);
    	prepstmt.setString(2, patientIDInput);
    	ResultSet rs=prepstmt.executeQuery();
    
    	
    	while(rs.next()){
    	
    		System.out.println("------------------LOGIN SUCCESS------------");
    		System.out.println(rs.getInt(1)+" \t\t"+rs.getString(2)+"\t\t " + rs.getString(3)+"\t\t "+rs.getString(4)); 
    		
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
	
	public boolean patientDelete(){
		System.out.println("Please enter your username to Delete :");
		Scanner scanForLogin=new Scanner(System.in);
		String patientDeleteID=scanForLogin.nextLine();
		
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	//Statement myStatement=myConn.createStatement();
    	String query="delete from hms.patientinfo where patientFirstName= ? ";
    	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
    	
    	prepstmt.setString(1, patientDeleteID);
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
	
public void viewDoctorAvailability(){
		
    	
    	
    	
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
	    	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
	    	Statement myStatement=myConn.createStatement();
	    	String query="Select doctorFirstName,doctorLastName,doctorDepartment,doctorAvailability,doctorPhoneNumber from doctorinfo; ";
	    	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
	    	ResultSet rs=prepstmt.executeQuery();
	    	
	    	System.out.println("DOCTOR FIRST NAME \tDOCTOR LAST NAME\t\tDOCTOR DEPARTMENT\t\tAVAILABILITY\t\tDOCTOR PHONE NUMBER");
	    	System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
    	while(rs.next()){
        	
    		
    		System.out.println(rs.getString(1)+" \t\t"+rs.getString(2)+"\t\t\t\t " + rs.getString(3)+"\t\t\t"+rs.getString(4)+"\t\t\t"+rs.getString(5)); 
    		
    		
    	}
    	System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		}
		
    	catch(Exception e){
    		e.printStackTrace();
    		
    	}
    	
    	
	}
	
public void viewPatientPriscription(){
	
	
	System.out.println("To view the priscription, Please confirm your password : ");
	Scanner scanForPriscription=new Scanner(System.in);
	String scannedPassword=scanForPriscription.nextLine();
	
	
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
    	Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	Statement myStatement=myConn.createStatement();
    	String query="Select patientPriscription,doctorsRemarks from patientinfo where patientPassword=? ";
    	PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
    	prepstmt.setString(1, scannedPassword);
    	ResultSet rs=prepstmt.executeQuery();
    	
    	System.out.println("PATIENT PRISCRIPTION \t\tDOCTORS REMARKS");
    	System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
	while(rs.next()){
    	
		
		System.out.println(rs.getString(1)+" \t\t"+rs.getString(2)); 
		
		
	}
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
	}
	
	catch(Exception e){
		e.printStackTrace();
		
	}
	
	
}
	
	
	}
	
	
	


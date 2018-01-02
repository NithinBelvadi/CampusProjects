package com.sdp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class HospitalActivity {

	public void AddHospitalActivity(int patientID,int departmentID,String fees){
PreparedStatement stmt = null;
		
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    	
    	String sqlForInsertPatients="insert into hms.hospitalactivity(patientID,departmentID,fees) values (?,?,?);";
    	Connection myConn = DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
    	stmt = (PreparedStatement) myConn.prepareStatement(sqlForInsertPatients);
    	stmt.setInt(1, patientID);
    	stmt.setInt(2, departmentID);
    	stmt.setString(3, fees);
    	
    	stmt.execute();
    	System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------Activity Added----------------------");
    	}
		
    	catch(Exception e){
    		e.printStackTrace();
    	}
	}
	
	public boolean patientFeesView(){
		System.out.println("Please Enter the Patient ID to view his/her fees :");
		Scanner scan=new Scanner(System.in);
		int patientIDforActivity=scan.nextInt();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
		Statement myStatement=myConn.createStatement();
		String query="select p.patientFirstName,h.fees,d.departmentName from patientinfo p,hospitalactivity h,department d where d.departmentID=h.departmentID and p.patientID=?";
		PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
		prepstmt.setInt(1, patientIDforActivity);
		ResultSet rs=prepstmt.executeQuery();
		System.out.println("------------------PATIENT FEES STRUCTURE------------------");
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("FIRST NAME\tFEES(Euros)\tDEPARTMENT");
		System.out.println("-----------------------------------------------------------");
		while(rs.next()){
		
			
			
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
			System.out.println();
			
			
		}
		return true;
		
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
	
	public boolean allpatientFeesView(){
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		Connection myConn=DriverManager.getConnection("jdbc:mysql:///hms","Nithin","alone@12345");
		Statement myStatement=myConn.createStatement();
		String query="select p.patientFirstName,p.patientLastName,h.fees,d.departmentName from hms.patientinfo p ,hms.hospitalactivity h,hms.department d where p.patientID=h.patientID and h.departmentID=d.departmentID ";
		PreparedStatement prepstmt=(PreparedStatement) myConn.prepareStatement(query);
		
		
		System.out.println("------------------PATIENT FEES STRUCTURE------------------");
		ResultSet rs=prepstmt.executeQuery();
		System.out.println("-----------------------------------------------------------");
		System.out.println("FIRST NAME\tLAST NAME\tFEES(Euros)\tDEPARTMENT");
		System.out.println("-----------------------------------------------------------");
		while(rs.next()){
		
			
			
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
			
			
			
		}
		
		return true;
		
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

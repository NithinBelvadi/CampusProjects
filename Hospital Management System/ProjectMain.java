package com.sdp.project;

import java.util.Scanner;

import java.sql.*;

public class ProjectMain {

	/**
	 * @param args
	 * @author Nithin Narayan
	 */
	public static void main(String[] args) {
		int choice;
		
		
	
    	
    	
    	
		for(;;)
		{
			
			
		System.out.println("\t\t\t\t-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-");
	    System.out.println("\t\t\t\t------------------ANNA HOSPITAL--------------------");
	    System.out.println("\t\t\t\t-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-");
	    System.out.println();
	    
	    
	    System.out.println("---------------------------------------HOSPITAL PAGE-----------------------------------------------------------------------------");
	    System.out.println("PLEASE SELECT AN OPTION");
	    System.out.println("1.PATIENT\t2.DOCTOR\t3.ADMIN\t\t4.EXIT");
	    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
	    Scanner scan=new Scanner(System.in);
	    int loginChoice=scan.nextInt();
	    switch(loginChoice){
	    case 1:
	    {
	    	 System.out.println("---------------------------------------PATIENT PAGE-----------------------------------------------------------------------------");
	 	    System.out.println("1.SIGN UP A PATIENT \t \t2.PATIENT LOGIN\t" +"\n3.EXIT");
	 	    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
	 	    Scanner scanner=new Scanner(System.in);
	 	    choice=scanner.nextInt();
	 	    	switch(choice){
	 	    	case 1:
	 	    		System.out.println("PATIENT SIGN-UP PAGE");
	 	    		System.out.println("-------------------------------------------");
	 	    		PatientInfo patientSignUp=new PatientInfo();
	 	    		patientSignUp.insertPatientInfo();
	 	    		break;
	 	    	
	 	    	case 2:
	 	    		System.out.println("PATIENT LOGIN PAGE");
	 	    		System.out.println("--------------------------------------------");
	 	    		PatientInfo patientLogin=new PatientInfo();
	 	    		boolean flag=patientLogin.patientLoginCheck();
	 	    		if(flag==true){
	 	    			System.out.println("----------------------------------------------------------------------------");
	 	    			System.out.println("LOGIN SUCCESS..\nPlease select the Acitivity to perform..");
	 	    			System.out.println("1.View Priscription Details\t 2.View Doctors Availability\t 3.Exit");
	 	    			System.out.println("----------------------------------------------------------------------------");
	 	    			int patientOption=scan.nextInt();
	 	    			if(patientOption==1){

	 	    			PatientInfo patientcheck=new PatientInfo();
	 	    			patientcheck.viewPatientPriscription();
	 	    			break;
	 	    			
	 	    			
	 	    			}
	 	    			if(patientOption==3){break;}
	 	    			if(patientOption==2){
	 	    			PatientInfo patientAvailabilityView=new PatientInfo();
	 	    			patientAvailabilityView.viewDoctorAvailability();
	 	    			break;
	 	    			}
	 	    			else break;
	 	    		}
	 	    		break;
	 	    		/*
	 	    	{
	 	    	System.out.println("------- PATIENTS RECORD DISPLAYING.. -------");
	 	    	for(int f=0;f<OBJECT_COUNT;f++){
	 	    	System.out.println(patient[f].toString());
	 	    	System.out.println("Patient ID : "+patient[f].getPatientID());
	 	    	}
	 	    	System.out.println("----------PATIENTS DISPLAYED----------");
	 	    	break; 
	 	    	System.out.println("--------------PATIENT LOGIN----------------");
	 	    	System.out.println("Enter the username:");
	 	    	Scanner patientLogin=new Scanner(System.in);
	 	    	String username=patientLogin.nextLine();
	 	    	System.out.println("Enter the password:");
	 	    	String password=patientLogin.nextLine();
	 	    	for(int i=0;i<MAX_COUNT;i++){
	 	    	patient[i].patientLoginCheck(username,password);}
	 	    	System.out.println("--------------------------------");
	 	    	
	 	    	break;
	 	    	} //end of case 2 in patients
	 	    	*/
	 	    	case 3:
	 	    	break;
	 	    	
	 	    	
	 	    case 6:
	 	    	
	 	    	{
	 	    	System.out.println("-------THANK YOU------");
	 	    	break;
	 	    	}
	 	    
	 	    	}
	 	    	break; // Patient page break */
	    }
	    case 2:
	    {	
	    	System.out.println("---------------------------------------DOCTOR PAGE-----------------------------------------------------------------------------");
	    	System.out.println("1.DOCTOR LOGIN \t2.HOSPITAL MAIN PAGE");
	 	    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
	 	    Scanner scanner=new Scanner(System.in);
	 	    choice=scanner.nextInt();
	 	    	switch(choice){
	 	    	case 1:
	 	    	{
	 	    		System.out.println("DOCTOR LOGIN PAGE");
	 	    		System.out.println("--------------------------------------------");
	 	    		
	 	    		DoctorInfo doctorLogin=new DoctorInfo();
	 	    		boolean flag=doctorLogin.doctorLoginCheck();
	 	    		if(flag==true){
	 	    			System.out.println("----------------------------------------------------------------------------");
	 	    			System.out.println("Please select the options . u have logged in successfully. !!");
	 	    			System.out.println("1.Set Availability\t 2.Update Patient Priscription\t 3.View patients List\t 4.Exit");
	 	    			System.out.println("----------------------------------------------------------------------------");
	 	    			int patientOption=scan.nextInt();
	 	    			if(patientOption==1){
	 	    			
	 	    			DoctorInfo doc=new DoctorInfo();
	 	    			doc.doctorAvailabilityInfo();
	 	    			break;
	 	    			}
	 	    			if(patientOption==2){
	 	    				
	 	    				DoctorInfo doctorPriscription=new DoctorInfo();
	 	    				doctorPriscription.setPatientPriscription();
	 	    				break;
	 	    				
	 	    			}
	 	    			if(patientOption==3){
	 	    				DoctorInfo docViewPatients=new DoctorInfo();
	 	    				docViewPatients.viewPatientRecord();
	 	    				break;
	 	    				
	 	    				
	 	    			}
	 	    			else break;
	 	    		}
	 	    		break;
	 	    	}
	 	    	case 2:{
	 	    		break;
	 	    	}
	 	    	
	 	    	
	 	    	
	 	    	
	 	    	
	 	    	} // Switch ENDS
	 	break;
	    } // DOC PAGE ENDS
	    
	    case 3:
	    {
	    	System.out.println("---------------------------------------ADMIN PAGE------------------------------------------------------------------------------");
	    	System.out.println("1.ADMIN LOGIN \t\t 2.EXIT");
	    	int adminChoice=scan.nextInt();
	    	switch(adminChoice){
	    	case 1: 
	    		
	    		System.out.println("ADMIN LOGIN PAGE");
 	    		System.out.println("--------------------------------------------");
 	    		AdminInfo adminLogin=new AdminInfo();
 	    		boolean flag=adminLogin.adminLoginCheck();
 	    		if(flag==true){
 	    			System.out.println("----------------------------------------------------------------------------");
 	    			System.out.println("Please select an option.. u have logged in successfully. !!");
 	    			System.out.println("1.Add Doctors\t2.Delete Patients\t3.Delete Doctors\n4.View patient Current Fees Info \t5.Hospital Activity\t6.View All Patient Current Fees Info\n7.Exit");
 	    			System.out.println("----------------------------------------------------------------------------");
 	    			int patientOption=scan.nextInt();
 	    			if(patientOption==1){
 	    				System.out.println("DOCTOR SIGN-UP PAGE");
 	   	    		System.out.println("-------------------------------------------");
 	   	    		DoctorInfo doctorSignUp=new DoctorInfo();
 	   	    		doctorSignUp.insertPatientInfo();
 	   	    		break;
 	    			
 	    			}
 	    			if(patientOption==6){
 	    				HospitalActivity hospital=new HospitalActivity();
 	    				Boolean flagForCheckingActivity= hospital.allpatientFeesView();
 	    				if (flagForCheckingActivity) System.out.println("-------------------------ACTIVIY COMPLETE-------------------------");
 	    				break;
 	    				
 	    				
 	    			}
 	    			
 	    			if(patientOption==4){
 	    				HospitalActivity hospital=new HospitalActivity();
 	    				Boolean flagForCheckingActivity= hospital.patientFeesView();
 	    				if (flagForCheckingActivity) System.out.println("-------------------------ACTIVIY COMPLETE-------------------------");
 	    				break;
 	    				
 	    				
 	    				
 	    			}
 	    			if(patientOption==2){
 	    				System.out.println("CHOICE 2 of ADMIN");
 	    				PatientInfo patientDeleting=new PatientInfo();
 	    				boolean flagDeleteStatus=patientDeleting.patientDelete();
 	    	    		if(flagDeleteStatus==true){
 	    	    			System.out.println("PATIENT DELETE SUCCESSFULL");
 	    	    			break;
 	    	    		}
 	    	    		else
 	    	    		{
 	    	    			System.out.println("RECHECK THE PATIENT FIRST NAME AND TRY AGAIN");
 	    	    			break;
 	    	    		}
 	    			}
 	    			if(patientOption==3){System.out.println("CHOICE 3 of ADMIN");
 	    			
	    				DoctorInfo doctorDeleting=new DoctorInfo();
	    				boolean flagDeleteStatus=doctorDeleting.doctorDelete();
	    	    		if(flagDeleteStatus==true){
	    	    			System.out.println("PATIENT DELETE SUCCESSFULL");
	    	    			break;
	    	    		}
	    	    		else
	    	    		{
	    	    			System.out.println("RECHECK THE PATIENT FIRST NAME AND TRY AGAIN");
	    	    			break;
	    	    		}
 	    			
 	    			}
 	    			
 	    		if(patientOption==5){
 	    			System.out.println("HOSPITAL ACTIVITY UPDATE");
 	    			System.out.println("---------------------------------------------------");
 	    			System.out.println("Please enter the Patient ID to add Activty");
 	    			Scanner scanActivity=new Scanner(System.in);
 	    			int patientIDForActivity=scanActivity.nextInt();
 	    			System.out.println("Please enter the Department of the hospital");
 	    			System.out.println("1.Casualty\t\t2.Aneasthetics\t\t3.Cardiology\n4.Critical Case\t\t5.Ears,Nose and Throat\t6.Geriatrics\n7.General Surgery\t8.Gynaecology\t\t9.Neurology\n10.House Keeping\t11.Pharmacy\t\t12.Administration");
 	    			int departmentIDActivity=scanActivity.nextInt();
 	    			Scanner scanner3=new Scanner(System.in);
 	    			System.out.println("Enter the fees that patient has to give to the Department");
 	    			String patientFeesActivity=scanner3.nextLine();
 	    			HospitalActivity hospitalActivity=new HospitalActivity();
 	    			hospitalActivity.AddHospitalActivity(patientIDForActivity, departmentIDActivity, patientFeesActivity);
 	    			break;
 	    			
 	    		}
 	    			else break;
 	    		}
 	    		break;
	    		
	    		/*System.out.println("ADD DOC FUNCTION GOES HERE");
	    	System.out.println("DOCTOR SIGN-UP PAGE");
	    		System.out.println("-------------------------------------------");
	    		DoctorInfo doctorSignUp=new DoctorInfo();
	    		doctorSignUp.insertPatientInfo();
	    		break;*/
	    	case 2: System.out.println("REPORT FUNCTION GOES HERE");
	    	}
	    	
	    	
	    break;//admin page break
	    }
	    case 4:
	    {
	    	System.out.println("THANK YOU FOR USING OUR APPLICATION");
	    	System.exit(0);
	    }//EXIT OF MAIN
	    }
	   
		}
		
		
	}
	

}

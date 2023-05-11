package com.payrollmanagement.service;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.multipart.MultipartFile;

import com.payrollmanagement.entity.AddCandidate;
import com.payrollmanagement.entity.AddEmployee;

public interface AddEmployeeService {
	
	    AddCandidate addCandidate(AddCandidate candidate);
	    
	  
				
		 AddEmployee getEmployeeById(String empId);

		  List<AddEmployee> getAllEmployees();
		  
		  public AddEmployee updateEmployee(String empId, MultipartFile offerLetter, MultipartFile joiningLetter, MultipartFile agreement,
				  MultipartFile experienceLetter, MultipartFile photo, String accountHolderName, String accountNumber, String ifscCode, 
				  String branch,String bankName, String panCard, String bloodGroup, String nominee, String nomineeContact,
				  Date joiningDate, AddCandidate candidateId) throws IOException;


		AddEmployee saveEmployeeDetails(@Valid AddEmployee emp, String joiningDateString, MultipartFile offerLetter,
				MultipartFile joiningLetter, MultipartFile agreement, MultipartFile experienceLetter,
				MultipartFile photo, String accountHolderName, String accountNumber, String ifscCode, String branch,
				String bankName, String panCard, String bloodGroup, String nominee, String nomineeContact)
				throws IOException;
			


		
}
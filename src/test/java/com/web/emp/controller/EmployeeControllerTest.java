package com.web.emp.controller;

import java.util.ArrayList;
import java.util.List;

import com.web.emp.model.EmployeeVO;
import com.web.emp.service.EmployeeManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class EmployeeControllerTest {
	
	@Mock
	private EmployeeManager employeeManager;
	
	@InjectMocks
	private EmployeeController employeeController;
	
	
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
	}


	@Test
	public void testGetAllEmployees() {
		EmployeeVO emp = new EmployeeVO();
		emp.setId(1112);emp.setFirstName("Prabath");emp.setLastName("Kariyawasam");
		List<EmployeeVO> empList = new ArrayList<>();
		empList.add(emp);
		Mockito.when(
				employeeManager.getAllEmployees()).thenReturn(empList);
		        String actualResult =emp.getFirstName();
				Assert.assertEquals("Prabath",actualResult );
		
	}

}

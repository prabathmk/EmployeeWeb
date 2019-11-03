package com.web.emp.dao;

import java.util.List;

import com.web.emp.model.EmployeeVO;
 

public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
}
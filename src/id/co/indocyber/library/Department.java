/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.library;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Department {
   
    private String deptName;
    private List<Employee> employee;

    public Department() {
        employee = new ArrayList<>();
    }
        
    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return the employee
     */
    public List<Employee> getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
    
    
}

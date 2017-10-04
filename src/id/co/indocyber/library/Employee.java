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
public class Employee {
    
    private String name;
    private int age;
    private Department dept;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the dept
     */
    public Department getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(Department dept) {
        this.dept = dept;
    }
    
}

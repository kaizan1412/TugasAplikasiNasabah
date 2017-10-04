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
public class Client {

    private String nama;
    private int age;
    private String mobilePhone;
    private String job;
    private boolean married;
    private String address;
    private double salary;
    private CreditCard creditnum;

    public Client() {
    }


    public Client(String nama, int age, String mobilePhone, String job, boolean married, String address, double salary) {
        this.nama = nama;
        this.age = age;
        this.mobilePhone = mobilePhone;
        this.job = job;
        this.married = married;
        this.address = address;
        this.salary = salary;
    }
    
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
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
     * @return the mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone the mobilePhone to set
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the married
     */
    public boolean isMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(boolean married) {
        this.married = married;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the creditnum
     */
    public CreditCard getCreditnum() {
        return creditnum;
    }

    /**
     * @param creditnum the creditnum to set
     */
    public void setCreditnum(CreditCard creditnum) {
        this.creditnum = creditnum;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class Transaction {
    
    private Date transactionDate;
    private List<Employee> emp;
    private List<Client> client;
    private List<CreditCard> credit;

    public Transaction() {
        emp = new ArrayList<>();
        client = new ArrayList<>();
        credit = new ArrayList<>();
    }

    /**
     * @return the transactionDate
     */
    public Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the emp
     */
    public List<Employee> getEmp() {
        return emp;
    }

    /**
     * @param emp the emp to set
     */
    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    /**
     * @return the client
     */
    public List<Client> getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(List<Client> client) {
        this.client = client;
    }

    /**
     * @return the credit
     */
    public List<CreditCard> getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(List<CreditCard> credit) {
        this.credit = credit;
    }
    
    
}

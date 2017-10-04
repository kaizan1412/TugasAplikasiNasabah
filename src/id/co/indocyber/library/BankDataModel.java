/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class BankDataModel {
    
    private Department deptMarketing = new Department();
    private Department deptProduction = new Department();
    private Department deptFinance = new Department();
    private Employee emp = new Employee();
    private Client client;
    
    private Map<String, CreditCard> creditID = new HashMap<>();
    
    private String path;
    private String pesan;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");;
    
    public List<Client> getClient() throws FileNotFoundException, IOException, ParseException{
        List<Client> clientData = new ArrayList<>();
        path = String.valueOf(getClass().getResource("/id/co/indocyber/library/transactionData.txt"));
        FileReader fileReader = null;
        File file = new File(path.substring(6, path.length()));
            if(!file.exists()){
                pesan= "File Tidak Ditemukan";
            }
            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            
            String line = null;
            
            while((line=reader.readLine())!= null){
                
                String[]data = line.split(",");
                CreditCard credit = new CreditCard();
                
                credit.setCardNumber(data[7].trim());
                
                client = new Client(
                        data[0], 
                        Integer.parseInt(data[1].trim()), 
                        data[2].trim(), 
                        data[3].trim(), 
                        Boolean.parseBoolean(data[4].trim()), 
                        data[5].trim(), 
                        Double.parseDouble(data[6].trim()));
                client.setCreditnum(credit);
                credit.setClient(client);                
                clientData.add(client);
                
            }
           
        return clientData;
    }
    
    public List<Employee> getEmployee() throws FileNotFoundException, IOException, ParseException{
        List<Employee> employeeData = new ArrayList<>();
        path = String.valueOf(getClass().getResource("/id/co/indocyber/library/transactionData.txt"));
        FileReader fileReader = null;
        File file = new File(path.substring(6, path.length()));
            if(!file.exists()){
                pesan= "File Tidak Ditemukan";
            }
            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            
            String line = null;
            
            while((line=reader.readLine())!= null){
                
                String[]data = line.split(",");
                CreditCard credit = new CreditCard();
                credit.setCardNumber(data[7].trim());
                
                //credit.setTransactionDate(dateFormat.parse(data[8].trim()));
                emp = new Employee(
                        data[9],Integer.parseInt(data[10].trim()));
                String dept = data[11].trim();
                if(dept.equalsIgnoreCase("Finance")){
                    deptFinance.setDeptName(dept);
                    deptFinance.getEmployee().add(emp);
                    emp.setDept(deptFinance);
                }
                else if(dept.equalsIgnoreCase("Marketing")){
                    deptMarketing.setDeptName(dept);
                    deptMarketing.getEmployee().add(emp);
                    emp.setDept(deptMarketing);
                }
                else if(dept.equalsIgnoreCase("Production")){
                    deptProduction.setDeptName(dept);
                    deptProduction.getEmployee().add(emp);
                    emp.setDept(deptProduction);
                }
                employeeData.add(emp);
                
            }
           
        return employeeData;
    }
    
        /**
     * @return the pesan
     */
    public String getPesan() {
        return pesan;
    }
    
}

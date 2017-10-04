/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TreeTableView;

/**
 *
 * @author user
 */
public class TesFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TesFile a = new TesFile();
        a.PrintFile();
                
    }
    
    public void PrintFile(){
        
        try {
            // TODO code application logic here
            //path = String.valueOf(getClass().getResource("id/co/indocyber/transactionData.txt"));
            String path = String.valueOf(getClass().getResource("/id/co/indocyber/main/transactionData.txt"));
            FileReader file = new FileReader(new File(path.substring(6, path.length())));
            BufferedReader reader = new BufferedReader(file);
            
            String line = null;
            while((line=reader.readLine())!=null){
                String[]data=line.split(",");
                System.out.println("Nama Client: "+ data[0]+" umur: "+data[1]);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TesFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TesFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

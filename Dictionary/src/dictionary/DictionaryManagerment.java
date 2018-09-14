package dictionary;

import java.io.*;
import java.util.*;

public class DictionaryManagerment {
    public static final String NAMEIN = "input.txt"; 
    public static final String NAMEOUT = "output.txt"; 
    public static void InsertComandline(LinkedList<Word> data, int n) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(NAMEIN));
        for (int i = 0; i < n; i++){
            Word data1 = new Word();
            String s1 = new String(); 
            String s2 = new String(); 
            String s3 = br.readLine(); 
            s1 = s3.substring(0, s3.indexOf('\t')); 
            s2 = s3.substring(s3.indexOf('\t')+1); 
            data1.Set_spelling(s1);
            data1.Set_explain(s2);
            data.add(data1); 
        }
    }
    // xuat du lieu ra file. 
    public static void DictionaryExportToFile() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(NAMEOUT)); 
        // xuat du lieu hien tai ra file. 
    }
    public static void dictionaryLookup(){
        // chua co gi. 
        System.out.println("chua co gi"); 
    }
    public static void InsertData(){
        
    }

    static void InsertComandline(LinkedList<Word> data, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

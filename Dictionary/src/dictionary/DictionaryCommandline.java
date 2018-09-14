package dictionary;

import java.io.*;
import java.util.*;

public class DictionaryCommandline {
    public static LinkedList<Word> dictionarySearcher(LinkedList<Word> data, int n){
       Scanner input = new Scanner(System.in); 
       LinkedList<Word> data1 = new LinkedList<>(); 
       System.out.println("Input keyword"); 
       String s1 = new String(); 
       s1 = input.nextLine(); 
       for (int i = 0; i < n; i++){
           String s2 = data.get(i).spelling; 
           if (s2.indexOf(s1) == 0){
               Word d1 = new Word(); 
               d1.spelling = data.get(i).spelling; 
               d1.explain  = data.get(i).explain; 
               data1.add(d1); 
           }
       }
       return data1; 
    }
    // ham in. 
    public static void showAllWords(LinkedList<Word> data, int n){
        System.out.println("NO" + "\t"+"\t" + "English" + "\t"+"\t" + "|" + "Vietnamese"); 
        for (int i = 0; i < n; i++){
            System.out.println(i+1 + "\t"+"\t" + data.get(i).spelling + "\t"+"\t" + "|" + data.get(i).explain); 
        }
    }
    // ham in ra phien ban 1 co ban. 
    public static void dictionaryBasic(LinkedList<Word> data, int n) throws IOException{
        DictionaryManagerment.InsertComandline(data, n);    
        showAllWords(data, n); 
    }
    // ham in ra phien ban 2 Advanced. 
    public static void dictionaryAdvanced(LinkedList<Word> data, int n) throws IOException{
        DictionaryManagerment.InsertComandline(data, n);   
        DictionaryManagerment.dictionaryLookup();
        showAllWords(data, n); 
    }
    // ham in ra phien ban 3 Advanced. 

    static void dictionaryBasic(LinkedList<Word> data, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}

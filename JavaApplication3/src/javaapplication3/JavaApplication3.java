package javaapplication3;

import java.util.Scanner; 

class Bank{
    String name; 
    int age; 
    String coutry; 
    Bank(String _name, int _age, String _coutry){
        name = _name; 
        age = _age;
        coutry = _coutry; 
    }
    void printf(){
        System.out.println("tài khoản của quý khách là: \n");
        System.out.println("name account: "+ name); 
        System.out.println("\nage: "+age); 
        System.out.println("\ncoutry: "+coutry); 
    }
}
public class JavaApplication3{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); 
        String name = "Nguyen Duy Chien"; 
        int age = 19; 
        String coutry = "Thai Binh"; 
        Bank bidv = new Bank(name, age, coutry); 
        bidv.printf();
    }
}

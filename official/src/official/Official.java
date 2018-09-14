package official;

import java.io.*; 
import java.util.*; 

class Official{
    public static void main(String[] args){
        try{
            int k = 50/0; 
        }catch(ArithmeticException e){
            System.out.println(e); 
        }
        System.out.println("nguyen duy chien"); 
    }
}
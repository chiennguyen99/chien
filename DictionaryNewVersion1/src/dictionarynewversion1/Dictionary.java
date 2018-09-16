package dictionarynewversion1;

import java.io.*;
import java.util.*; 

public class Dictionary {
    private final ListWord LWO = new ListWord();
    private final ListWord LWI = new ListWord(); 
    void SearchKeyWord(){
        LWO.CreatList();
        LWO.Sort();
        Scanner inp = new Scanner(System.in); 
        System.out.println("Please enter keyword: ");
        String S0 = inp.nextLine(); 
        for (int i = 0; i < LWO.ReturnSizeList(); i++){
            String S1 = LWO.ReturnWordSpelling(i); 
            if (S1.indexOf(S0) == 0){
                LWI.AddWordToList(LWO.ReturnWordList(i));
            }
        }
        LWI.PrintList();
    }
}

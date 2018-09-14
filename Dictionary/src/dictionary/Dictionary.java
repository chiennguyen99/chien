package dictionary;
import java.util.*; 
import java.io.*;

public class Dictionary {   
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in); 
        int n; 
        n = input.nextInt(); 
        LinkedList<Word> data = new LinkedList<>();
        DictionaryCommandline.dictionaryBasic(data, n);
//        DictionaryCommandline.dictionaryAdvanced(data, n);
    }
}

package dictionary;
import java.util.Scanner; 

class Word{
    String spelling;
    String explain; 
    void Set_spelling(String spelling){
        this.spelling = spelling; 
    }
    void Set_explain(String explain){
        this.explain = explain; 
    }
}
class DictionaryManagerment{
    public static void InsertComandline(Word data[], int n){
        Scanner input = new Scanner(System.in);
        String s1; 
        String s2; 
        for (int i = 0; i < n; i++){
            s1 = input.nextLine(); 
            data[i].Set_spelling(s1);
            s2 = input.nextLine();
            data[i].Set_explain(s2);
        }
    }
}
class DictionaryCommandline{
    public static void showAllWords(Word data[], int n){
        System.out.println("NO" + "\t"+"\t" + "English" + "\t"+"\t" + "|" + "Vietnamese"); 
        for (int i = 0; i < n; i++){
            System.out.println(i+1 + "\t"+"\t" + data[i].spelling + "\t"+"\t" + "|" + data[i].explain); 
        }
    }
    public static void dictionaryBasic(Word data[], int n){
        DictionaryManagerment.InsertComandline(data, n);
        showAllWords(data, n); 
    }
}
public class Dictionary {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int n; 
        n = input.nextInt(); 
        Word data[] = new Word[n];
        for (int i = 0; i < n; i++){
            data[i] = new Word();  
        }
        DictionaryCommandline.dictionaryBasic(data, n);
    }
}

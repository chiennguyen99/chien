package dictionarynewversion1;
import java.io.*; 
import java.util.*; 

public class ListWord {
    LinkedList<Word> LIST = new LinkedList<>();   
    void CreatList(){
        MyFile F = new MyFile(); 
        FileReader Fr = null; 
        BufferedReader Br = F.OpenFileReader(Fr); 
        try {
           String s1, s2, s3;
           while((s1 = Br.readLine()) != null){
               Word W = new Word(); 
               s2 = s1.substring(0, s1.indexOf("\t")); 
               s3 = s1.substring(s1.indexOf("\t") + 1); 
               W.setSpelling(s2);
               W.setExplain(s3);
               LIST.add(W); 
           }
        } catch (IOException ex) {
              System.out.println(ex.getMessage()); 
        }
        F.CloseFileReader(Fr,Br);
    }
    void PrintList(){
        CreatList(); 
        for (int i = 0; i < this.LIST.size(); i++){
            LIST.get(i).getSpelling();
            LIST.get(i).getExplain(); 
        }
    }
}

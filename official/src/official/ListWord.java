package official;

import java.io.*; 
import java.util.*; 

public class ListWord {
    private final LinkedList<Word> LIST = new LinkedList<>();   
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
    // local sort. 
    void SwapWord(Word W1, Word W2){
        Word temp = new Word(); 
        temp.setSpelling(W1.getSpelling());
        temp.setExplain(W1.getExplain());
        W1.setSpelling(W2.getSpelling());
        W1.setExplain(W2.getExplain()); 
        W2.setSpelling(temp.getSpelling());
        W2.setExplain(temp.getExplain());
    }
    // end. 
    void sort(){
        Collections.sort(LIST);
    }
    void PrintList(){
//        CreatList(); 
        for (int i = 0; i < this.LIST.size(); i++){
            System.out.print(LIST.get(i).getSpelling() + " ");
            System.out.println(LIST.get(i).getExplain());
        }
    }
}

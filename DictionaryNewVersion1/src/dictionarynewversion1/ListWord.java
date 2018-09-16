package dictionarynewversion1;
import java.io.*; 
import java.util.*; 

public class ListWord {
    private final LinkedList<Word> LIST = new LinkedList<>();
    
    private final MyFile F = new MyFile(); 
    
    public ListWord() {}
    
    void CreatList(){
        FileInputStream Fr = null; 
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
   
    void AddWordToList(Word W){
        LIST.add(W); 
    }
    
    void WriteListToFile(){
        FileOutputStream Fw1 = null; 
        BufferedWriter Bw = F.OpenFileWriter(Fw1); 
        try{      
            for (int i = 0; i < this.LIST.size(); i++) {
                String s1 = LIST.get(i).getSpelling();
                String s2 = LIST.get(i).getExplain(); 
                Bw.write(s1);
                Bw.write("\t");
                Bw.write(s2);
                Bw.newLine();
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
        }
        F.CloseFileWriter(Fw1, Bw);
    }
    
    String ReturnWordSpelling(int i){
        return LIST.get(i).getSpelling(); 
    }
    
    int ReturnSizeList(){
        return LIST.size(); 
    }
    
    Word ReturnWordList(int i){
        return LIST.get(i); 
    }
      
    void Sort(){
        Collections.sort(LIST);
    }
    
    void PrintList(){
        for (int i = 0; i < this.LIST.size(); i++){
            System.out.print(LIST.get(i).getSpelling() + " ");
            System.out.println(LIST.get(i).getExplain());
        }
    }
}

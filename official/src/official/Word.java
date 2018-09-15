package official;
import java.util.*; 

public class Word {
    private String Spelling; 
    private String explain; 
    void setSpelling(String Spelling){
        this.Spelling = Spelling;
    }
    void setExplain(String explain){
        this.explain = explain; 
    }
    String getSpelling(){
        return Spelling; 
    }
    String getExplain(){
        return explain; 
    }
}
class sort{
    LinkedList<Word> LW = new LinkedList<>();
    void creat(){
        Scanner inp = new Scanner(System.in); 
        String s1, s2, s3, s4, s5, s6; 
        Word W1 = new Word(), W2 = new Word(), W3 = new Word(); 
        s1 = inp.nextLine(); 
        s2 = inp.nextLine(); 
        s3 = inp.nextLine(); 
        s4 = inp.nextLine(); 
        s5 = inp.nextLine(); 
        s6 = inp.nextLine(); 
        W1.setSpelling(s1);
        W1.setExplain(s2);
        W2.setSpelling(s3);
        W2.setExplain(s4);
        W3.setSpelling(s5);
        W3.setExplain(s6);
        LW.add(W1); 
        LW.add(W2); 
        LW.add(W3); 
    }
    void SwapWord(Word W1, Word W2){
        Word temp = new Word(); 
        temp.setSpelling(W1.getSpelling());
        temp.setExplain(W1.getExplain());
        W1.setSpelling(W2.getSpelling());
        W1.setExplain(W2.getExplain()); 
        W2.setSpelling(temp.getSpelling());
        W2.setExplain(temp.getExplain());
    }
    void ShiftDown(int a, int b){
        int i = a; 
        int j = 2*i + 1; 
        while (j <= b){
            int k = j + 1; 
            String S1 = new String(), S2 = new String(); 
            S1 = LW.get(k).getSpelling().substring(0, 1); 
            S2 = LW.get(j).getSpelling().substring(0, 1); 
            int q = S1.compareTo(S2); 
            if (k <= b && q > 0){
                j = k; 
            }
            S1 = LW.get(i).getSpelling().substring(0, 1);
            S2 = LW.get(j).getSpelling().substring(0, 1);
            q = S1.compareTo(S2); 
            if (q < 0){
                SwapWord(LW.get(i), LW.get(j));  
                i = j; 
                j = 2*i + 1; 
            }
            else {
                break; 
            }
        }
    }
    void HeapSort(){
        int k = LW.size(); 
        for (int i = k/2 - 1; i >= 0; i--){
            ShiftDown(i, k-1); 
        }
        for (int i = k-1; i >= 1; i--){
            SwapWord(LW.get(0), LW.get(i)); 
            ShiftDown(0, i-1); 
        }
    }
    void PrintList(){
        for (int i = 0; i < this.LW.size(); i++){
            System.out.print(LW.get(i).getSpelling() + " ");
            System.out.println(LW.get(i).getExplain());
        }
    }
}


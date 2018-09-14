package dictionarynewversion1;

public class Word {
    private String Spelling; 
    private String explain; 
    void setSpelling(String Spelling){
        this.Spelling = Spelling;
    }
    void setExplain(String explain){
        this.explain = explain; 
    }
    void getSpelling(){
        System.out.println(Spelling); 
    }
    void getExplain(){
        System.out.println(explain); 
    }

}

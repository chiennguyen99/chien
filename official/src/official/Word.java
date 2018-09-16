package official;

public class Word implements Comparable<Word>{
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

    @Override
    public int compareTo(Word o) {
        return (Spelling.compareTo(o.Spelling)); 
    }
}

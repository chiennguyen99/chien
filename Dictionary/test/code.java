import java.util.*; 

class Student{
    private String name; 
    private int ID; 
    void SetName(String name){
        this.name = name; 
    }
    void SetID(int ID){
        this.ID = ID; 
    }
    void GetName(){
        System.out.println(name);
    }
    void GetID(){
        System.out.println(ID);
    }
}

public class code {
    public static void main(String[] args){
        String S1 = "Hanh"; 
        int ID = 17020707; 
        Student sv1 = new Student(); 
        sv1.SetName(S1);
        sv1.SetID(ID);
        sv1.GetName();
        sv1.GetID();
    }
}

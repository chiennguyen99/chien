package bai_tap_tren_lop;
import java.util.Scanner; 
class Student{
    String ID; 
    String name; 
    void setID(String ID){
        this.ID = ID; 
    }
    String getID(){
        return ID; 
    }
    void setname(String name){
        this.name = name; 
    }
    String getname(){
        return name; 
    }
    void printf(){
        System.out.println(ID + " " + name);
    }
}

public class Bai_tap_tren_lop {
    static void delete(Student s1){
        s1 = null; 
    }
    public static void main(String[] args) {
        int n; 
        Scanner scan = new Scanner(System.in); 
        n = scan.nextInt(); 
        Student[] s1 = new Student[n];
        for (int i = 0; i < n; i++){
            s1[i] = new Student(); 
        }
        String c1, c2; 
        scan.nextLine();
        for (int i = 0; i < n; i++){           
            c1 = scan.nextLine();
            s1[i].setID(c1);
            c2 = scan.nextLine();           
            s1[i].setname(c2);           
        }
        for (int i = 0; i < n; i++){
            if (i == 2){
               delete(s1[i]); 
            }
        }
        for (int i = 0; i < n; i++){
            if (i != 2){
               s1[i].printf();
            }
            else if (s1[i] == null){
                System.out.println("da xoa"); 
            }
        }
    }
}

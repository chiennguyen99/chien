package official; 
import java.util.Scanner; 
//import java.util.ArrayList; 
//import java.util.Iterator; 
//class delete{
//    Student [] p1 = new Student[20]; 
//    void xoa(int index, int n){
//        for (int i = 0; i < n; i++){
//            if (i == index){
//                
//            }
//        }
//    }
//}
class Official{
    
    static void delete(int index, Student s1[], int n){
        for (int i = 0; i < n; i++){
            if (i == index){
                s1[i] = null; 
            }
        }
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
//        Student p1 = new Student("17020650", "Chien", "IE6", "werafe@gmai");
//        System.out.println(p1.getName());
//        System.out.print(p1.getInfo());
//        
//        Student p2 = new Student(p1);
//        System.out.print(p2.getInfo());
//        System.out.println(sameGroup(p1,p2)); 
//        Student [] K62 = new Student[10];
//        int n; 
//        n = scan.nextInt(); 
//        for (int i = 0; i < n; i++){
//            String s1 = scan.nextLine(); 
//            K62[i].setID(s1); 
//            K62[i] = null;
//        }
         
        Student[] k62 = new Student[20];
        for(int i=0;i<3;i++)
        {
            k62[i] = new Student();
        }
        for (int i = 0; i < 3; i++){
            String s1 = new String(),s2=new String(),s3=new String(),s4=new String(); 
            System.out.println("nhap ID: ");
            //scan.nextLine();
            s1 = scan.nextLine(); 
            k62[i].setID(s1);
            System.out.println("nhap name: ");
            //scan.nextLine();
            s2 = scan.nextLine();
            k62[i].setName(s2);
            System.out.println("nhap group: "); 
            //scan.nextLine();
            s3 = scan.nextLine();
            k62[i].setGroup(s3);
            System.out.println("nhap email: ");
            //scan.nextLine();
            s4 = scan.nextLine();
            k62[i].setEmail(s4);
        }
        delete(1, k62, 3);
        for (int i = 0; i < 3; i++){
            System.out.println(k62[i].getInfo());
        }
        try
        {
            System.out.println(s1.getInfo());
        }
        catch(Exception ex)
        {
            System.out.println("asdasdf");
        }
        //System.out.println(s2.getInfo());
    }
    
    public static Boolean sameGroup(Student s1,Student s2)
    {
        if(s1==null || s2==null) return false;
        if(s1.getGroup() == s2.getGroup())
            return true;
        else {
            return false;
        }
    }
}
import java.util.Scanner; 
class JavaApplication2{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n; 
        n = inp.nextInt(); 
        int Count = 0, Score, sum = 0; 
        while(Count < n){
            System.out.println("nhap vao diem so: "+Count);
            Score = inp.nextInt(); 
            if (Score < 0){
                System.out.println("write again!"); 
                continue; 
            }
            sum = sum + Score; 
            Count++; 
        }
        System.out.println("Tong diem trung binh la: "+sum/n); 
    }
}

package demosapxep;
// import static java.nio.file.Files.delete;
import java.util.Scanner; 

public class Demosapxep {
    int n = 20; 
    int[] Array1 = new int[n]; 
//    void sort_simple(int n, int[] Array1){
//        for (int i = 0; i < n-1; i++){
//            for (int j = i + 1; j < n; j++){
//                if (Array1[i] > Array1[j]){
//                    int temp = Array1[i]; 
//                    Array1[i] = Array1[j]; 
//                    Array1[j] = temp; 
//                }
//            }
//        }
//    }
//    void swap1(int a, int b){
//        int temp = a; 
//        a = b; 
//        b = temp; 
//    }
//    void  BubbleSort(int n1, int[] Array2){
//        for (int i = n1-1; i > 0 ; i--){
//            boolean check1 = true; 
//            for (int j = 0; j < i; j++){
//                if (Array2[j] > Array2[j+1]){
//                    int temp = Array2[j]; 
//                    Array2[j] = Array2[j+1]; 
//                    Array2[j+1] = temp; 
//                    check1 = false; 
//                }
//                if (check1){
//                    break; 
//                }
//            }
//        }
//    }
    void merge(int[] Array3, int a, int c, int b){
        int k = b-a+1; 
        int i = a, j = c+1; 
        int[] Array4 = new int[k];
        int size = 0; 
        while ((i <= c) && (j <= b)){
            if (Array3[i] < Array3[j]){
                Array4[size++] = Array3[i++]; 
            }
            else {
                Array4[size++] = Array3[j++]; 
            }
        }
        while (i <= c){
            Array4[size++] = Array4[i++]; 
        }
        while (j <= b){
            Array4[size++] = Array4[j++]; 
        }
        i = a; 
        for (int z = 0; z < k; z++){
            Array3[i++] = Array4[z]; 
        }
    }
    void mergeSort(int[] Array3, int a, int b){
        if (a < b){
            int c = (a+b)/2; 
            mergeSort(Array3, a, c); 
            mergeSort(Array3, c+1, b); 
            merge(Array3, a, c, b); 
        }
    }  
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        Demosapxep p1 = new Demosapxep(); 
        p1.n = input.nextInt(); 
        for (int i = 0; i < p1 .n; i++){
            p1.Array1[i] = input.nextInt(); 
        }
        p1.mergeSort(p1.Array1, 0, p1.n-1);
        System.out.println(); 
        for (int i = 0; i < p1.n; i++){
            System.out.println(p1.Array1[i]);
        }
    }
}

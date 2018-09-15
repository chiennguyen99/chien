package official;

import java.io.*; 
import java.util.*; 
import java.util.LinkedList; 
//class num{
//    int a; 
//    void set(int a){
//        this.a = a; 
//    }
//    int get(){
//       return a;  
//    }
//}
class Official{
//    static void swap(num N1, num N2){
//        int temp = N1.get(); 
//        N1.set(N2.get());
//        N2.set(temp); 
//    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); 
        sort S = new sort(); 
        S.creat();
        S.HeapSort();
        S.PrintList();
    }
    
//    static void ShiftDown(int a, int b, LinkedList<num> p1){
//        int i = a; 
//        int j = 2*i + 1; 
//        while (j <= b){
//            int k = j + 1; 
//            if (k <= b && p1.get(k).get() > p1.get(j).get()){
//                j = k; 
//            }
//            if (p1.get(i).get() < p1.get(j).get()){
//                swap(p1.get(i), p1.get(j)); 
//                i = j; 
//                j = 2*i + 1; 
//            }
//            else {
//                break; 
//            }
//        }
//    }
//    static void HeapSort(LinkedList<num> p1){
//        int k = p1.size(); 
//        for (int i = k/2 - 1; i >= 0; i--){
//            ShiftDown(i, k-1, p1); 
//        }
//        for (int i = k-1; i >= 1; i--){
//            swap(p1.get(0), p1.get(i)); 
//            ShiftDown(0, i-1, p1); 
//        }
//    }
}
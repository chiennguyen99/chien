package gamelauncher; 
import java.util.Scanner; 

class start{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int[] arr = new int[5]; 
        for (int i = 0; i < 5; i++){
            arr[i] = input.nextInt(); 
        }
        miniMaxSum(arr); 
    }
    static void miniMaxSum(int[] arr) {
        int max = arr[0], min = arr[0];
        long t = 0; 
        for (int i = 0; i < arr.length; i++){
            t = t + arr[i]; 
            if (arr[i] > max){
                max = arr[i]; 
            }
            if (arr[i] < min){
                min = arr[i]; 
            }
        }
        long num1 = t - max, num2 = t - min; 
        System.out.println(num1+" "+num2); 
    }
}
package gamelauncher;
import java.util.Scanner; 
class guess_game{
    player_guess p1 = new player_guess();
    player_guess p2 = new player_guess(); 
    player_guess p3 = new player_guess(); 
    int i = 0; 
    public void start_game(){
        while(true){
            int num1, num2, num3; 
            num1 = p1.guess_number();
            num2 = p2.guess_number(); 
            num3 = p3.guess_number(); 
            int system_guess = (int)(Math.random()*10), count = 0; 
            boolean nguoi1 = false, nguoi2 = false, nguoi3 = false; 
            if (num1 == system_guess){
                nguoi1 = true;
                count = 1; 
            }
            if (num2 == system_guess){
                nguoi2 = true; 
                count = 2; 
            }
            if (num3 == system_guess){
                nguoi3 = true; 
                count = 3; 
            }
            i++; 
            if (nguoi1 || nguoi2 || nguoi3){ 
                System.out.println("nguoi choi so: " + count); 
           
                System.out.println("so duoc doan la: " + system_guess);
                System.out.println("\nso luot choi la: "+(i+1));
                break; 
            }
        }
    }
    
}

class player_guess{
    int number; 
    player_guess(){
        number = 0; 
    }
    public int guess_number(){
        number = (int)(Math.random()*10); 
        return number; 
    }
}

public class GameLauncher{
    public static void main(String[] agrs){
        Scanner inp = new Scanner(System.in); 
        guess_game p1 = new guess_game(); 
        p1.start_game();
    }
}
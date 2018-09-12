package gamelauncher;
import java.util.Scanner;
import java.util.Random; 

class game_Sink_A_Ship{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        Creat_game p1 = new Creat_game(); 
        p1.creat_matrix();
        p1.creat_Ship_1();
        p1.printf();
    }
}

class Creat_game{
    char[][] matrix = new char[7][7]; 
    void creat_matrix(){
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                matrix[i][j] = '*'; 
            }
        }
    }
    void creat_Ship_1(){
        Random rd = new Random(); 
        Scanner input = new Scanner(System.in); 
        int num_Ship, size_Ship; 
        System.out.println("Nhap so tau (so tau <= 7): ");
        num_Ship = input.nextInt(); 
        System.out.println("Nhap size tau: "); 
        size_Ship = input.nextInt(); 
        for (int i = 0 ; i < num_Ship; i++){
            int index_row  = rd.nextInt(7); 
            int index_col  = rd.nextInt(7); 
            int select1    = rd.nextInt(2); 
            // tạo tàu trong 
            if ((select1 == 0 && index_row <= 7-size_Ship) || (select1 == 1 && index_col <= 7-size_Ship)){
                if (select1 == 0 && index_col <= 7-size_Ship){
                    // in ngang
                    if (Check(0, size_Ship, index_row, index_col) == false){
                        i = i-1; 
                        continue;
                    }
                    for (int i1 = index_col; i1 < index_col + size_Ship; i1++){
                        if (i1 == index_col){
                            matrix[index_row][i1] = '+';
                        }
                        else {
                            matrix[index_row][i1] = '#';
                        }
                    }
                }
                else {
                    if (Check(1, size_Ship, index_row, index_col) == false){
                        i = i-1; 
                        continue; 
                    }
                    for (int i2 = index_row; i2 < index_row + size_Ship; i2++){
                        if (i2 == index_row){
                            matrix[i2][index_col] = '+';  
                        }
                        else {
                            matrix[i2][index_col] = '#';  
                        }
                    }
                }
            }
            // in tau o vien
//       
            else if ((select1 == 0 && index_row > 7-size_Ship) || (select1 == 1 && index_col > 7-size_Ship)){
                if (select1 == 0 && index_row > 7-size_Ship){
                    if (Check(0, size_Ship, index_row, index_col-size_Ship+1) == false){
                        i = i - 1; 
                        continue; 
                    }
                    for (int i3 = index_col-size_Ship+1; i3 <= index_col; i3++){
                        if (i3 == index_col-size_Ship+1){
                            matrix[index_row][i3] = '+';
                        }
                        else {
                            matrix[index_row][i3] = '#';
                        }
                    }
                }
                else{
                    if (Check(1, size_Ship, index_row - size_Ship+1, index_col) == false){
                        i = i - 1; 
                        continue; 
                    }
                    for (int i4 = index_row - size_Ship+1; i4 <= index_row; i4++){
                        if (i4 == index_row - size_Ship+1){
                            matrix[i4][index_col] = '+';  
                        }
                        else{
                            matrix[i4][index_col] = '#';  
                        }
                    }
                }
            }
        }
    }
    // kiem tra xem co the dien tau duoc khong
    boolean Check(int select, int size_Ship, int index_row, int index_col){
        if (select == 0){
            for (int i = index_col; i < index_col + size_Ship; i++){
                if (matrix[index_row][i] == '#'){
                    return false; 
                }
            }
            return true; 
        }
        else {
            for (int i = index_row; i < index_row + size_Ship; i++){
                if (matrix[i][index_col] == '#'){
                    return false;
                }
            }
            return true; 
        }
    }
    void printf(){
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(matrix[i][j]+ " "); 
            }
            System.out.println(); 
        }
    }
}
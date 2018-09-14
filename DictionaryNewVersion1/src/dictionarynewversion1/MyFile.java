package dictionarynewversion1;
import java.io.*; 
public class MyFile {
    private final String NAMEFILE = "dictionary.txt"; 
    BufferedReader OpenFileReader(FileReader Fr1){
        BufferedReader Br = null; 
        FileReader Fr = null; 
        try{
            Fr = new FileReader(NAMEFILE); 
            Br = new BufferedReader(Fr);             
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        Fr1 = Fr; 
        return Br; 
    }
    void CloseFileReader(FileReader Fr1, BufferedReader Br){
        try{
            if (Br != null){
                Br.close();
            }
            if (Fr1 != null){
                Fr1.close();
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
        }
    }
    BufferedWriter OpenFileWriter(FileWriter Fw1){
        BufferedWriter Bw = null; 
        FileWriter Fw = null; 
        try{
            Fw = new FileWriter(NAMEFILE); 
            Bw = new BufferedWriter(Fw);             
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        Fw1 = Fw; 
        return Bw; 
    }
    void CloseFileWriter(FileWriter Fw1, BufferedWriter Bw){
        try{
            if (Fw1 != null){
                Fw1.close();
            }
            if (Bw != null){
                Bw.close();
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
        }
    }
}

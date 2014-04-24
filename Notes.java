import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Notes{
    static ArrayList<String> Lines = new ArrayList<String>();
    String name;
    public Notes(String n, String directory){
        name = n;
        try{
            Scanner file = new Scanner(new File(directory));    //Instead of using System.in(), it accesses a file from the directory, given by a string
            while (file.hasNext()){
                Lines.add(file.nextLine());     //The ArrayList will contain each line of the .txt as a separate string
            }
        }
        catch (Exception e){}        //I don't know what it does but it makes it work
    }
    public String getName(){
        return name;
    }
    public static void printNotes(){
        for (String line : Lines){
            System.out.println(line);
        }
    }
}
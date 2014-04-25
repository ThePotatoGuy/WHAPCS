import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Notes{
    static ArrayList<String> Lines = new ArrayList<String>();
    String name;
    public Notes(String n, String directory){
        name = n;
        try{
        	parseNotes(directory);
        }
        catch(Exception e){
        	// File not found or bad file
        }
    }
    public String getName(){
        return name;
    }
    
    private void parseNotes(String directory) throws FileNotFoundException{
    	Scanner file = new Scanner(new File(directory));    //Instead of using System.in(), it accesses a file from the directory, given by a string
    	try{
            while (file.hasNext()){
                Lines.add(file.nextLine());     //The ArrayList will contain each line of the .txt as a separate string
            }
        }
        catch (Exception e){
        	throw e; // throw the caught exception to the next try catch
        }        //I don't know what it does but it makes it work
    	finally{
    		file.close(); //close the Scanner resource leak
    	}
    }
    public void printNotes(){
        for (String line : Lines){
            System.out.println(line);
        }
    }
}
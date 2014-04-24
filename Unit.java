import java.util.ArrayList;

/** The object itself is an ArrayList of PoliticalUnits, but the class includes
        methods which are to be shared among each unit. */
        
public class Unit{
    static ArrayList<PoliticalUnit> PoliticalUnits;
    int unitNumber;
    public Unit(int num){
        PoliticalUnits = new ArrayList<PoliticalUnit>();
        unitNumber = num;
    }
    //Returns the ArrayList which contains all of the Political Units.
    public static ArrayList getPoliticalUnits(){
        return PoliticalUnits;
    }
    //Returns specified Political Unit.
    public static PoliticalUnit getPoliticalUnit(String input){
        return PoliticalUnits.get(indexOf(input , PoliticalUnits));
    }
    public static void newEvent(String unit, String name, String directory){
        PoliticalUnits.get(indexOf(unit, PoliticalUnits)).addEvent(new Notes(name, directory));
    }
    public static void newAccomplishment(String unit, String name, String directory){
        PoliticalUnits.get(indexOf(unit, PoliticalUnits)).addAccomplishment(new Notes(name, directory));
    }
    public static void newPerson(String unit, String name, String directory){
        PoliticalUnits.get(indexOf(unit, PoliticalUnits)).addPerson(new Notes(name, directory));
    }
    public static int indexOf(String input, ArrayList list){
        for (int i = 0; i < list.size(); i++){
            if (PoliticalUnits.get(i).isSameUnit(input)) return i;
        }
        System.out.println("indexOf isn't working");
        return -1;
    }
}
import java.util.ArrayList;

public class Unit2{
    static ArrayList<PoliticalUnit> PoliticalUnits;
    public static void main (String [] args){
        //Notes test = new Notes("Name", "Notes/Events/Persian Wars.txt");
        //test.printNotes();
        addAchaemenid();
        //PoliticalUnits.add(new PoliticalUnit("Achaemenid Empire", new Years(-558, -330)));
        
        /**
            new Notes("Persian Wars", "Notes/Events/Persian Wars.txt"),
            new Notes("Achaemenid Administration", "Notes/Accomplishments/Achaemenid Administration"),
            new Notes ("Cyrus", "Notes/People/Cyrus")));
        */
        //PoliticalUnits.get(indexOf("Achaemenid Empire", PoliticalUnits)).addEvent(new Notes("Persian Wars", "Notes/Events/Persian Wars.txt"));
        PoliticalUnits.get(indexOf("Achaemenid Empire", PoliticalUnits)).listEvents();
    }
    public Unit2(){
        //
    }
    public static void addAchaemenid(){
        PoliticalUnits.add(new PoliticalUnit("Achaemenid Empire", new Years(-558, -330)));
        newEvent("Achaemenid Empire", "Persian Wars", "Notes/Events/Persian Wars.txt");
        newAccomplishment("Achaemenid Empire", "Achaemenid Administration", "Notes/Accomplishments/Achaemenid Administration");
        newPerson("Achaemenid Empire", "Cyrus", "Notes/People/Cyrus");
        //PoliticalUnits.get(indexOf("Achaemenid Empire", PoliticalUnits)).addEvent(new Notes("Persian Wars", "Notes/Events/Persian Wars.txt"));
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
            if (PoliticalUnits.get(i).equals(input)) return i;
        }
        return -1;
    }
}
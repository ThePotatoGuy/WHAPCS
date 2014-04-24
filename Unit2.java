import java.util.ArrayList;

public class Unit2 extends Unit{
    public Unit2(){
        super(2);
        addAchaemenid();
    }
    
    public static void addAchaemenid(){
        PoliticalUnits.add(new PoliticalUnit("Achaemenid Empire", new Years(-558, -330)));
        
        /** Events */
        newEvent("Achaemenid Empire", "Persian Wars", "Notes/Events/Persian Wars.txt");
        
        /** Accomplishments */
        newAccomplishment("Achaemenid Empire", "Achaemenid Administration", "Notes/Accomplishments/Achaemenid Administration");
        
        /** People */
        newPerson("Achaemenid Empire", "Cyrus", "Notes/People/Cyrus");
    }
}
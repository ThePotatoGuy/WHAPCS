import java.util.ArrayList;

public class PoliticalUnit{
    String name;
    Years span;// = new Years();
    ArrayList<Notes> events, accomplishments, people;
    public PoliticalUnit(String n, Years y){
    	//System.out.println("creating");
        name = n;
        span = y;
        events = new ArrayList<Notes>();
        accomplishments = new ArrayList<Notes>();
        people = new ArrayList<Notes>();
    }
    public PoliticalUnit(String n, Years y, Notes e, Notes a, Notes p){
        name = n;
        //span = new Years();
        span = y;
        events = new ArrayList<Notes>();
        events.add(e);
        accomplishments = new ArrayList<Notes>();
        accomplishments.add(a);
        people = new ArrayList<Notes>();
        people.add(p);
    }
    
    public ArrayList<Notes> getEvents(){
        return events;
    }
    public ArrayList<Notes> getAccomplishments(){
        return accomplishments;
    }
    public ArrayList<Notes> getPeople(){
        return people;
    }
    
    public Notes getEvent(String input){
        for (int i = 0; i < events.size(); i++){
            if (events.get(i).getName().equals(input)) return events.get(i);
        }
        System.out.println("Event not found");
        return null;
    }
    
    public void addEvent(Notes notes){
        events.add(notes);
    }
    public void addAccomplishment(Notes notes){
        accomplishments.add(notes);
    }
    public void addPerson(Notes notes){
        people.add(notes);
    }
    public void printSpan(){
        span.printYears();
    }
    /** Prints a list of events/accomplishments associated with the unit */
    public void listEvents(){
        for (Notes item : events){
            System.out.println(item.getName());
        }
    }
    public void listAccomplishments(){
        for (Notes item: accomplishments){
            System.out.println(item.getName());
        }
    }
    
    public boolean isSameUnit(PoliticalUnit t){
    	return isSameUnit(t.name);
    }
    
    public boolean isSameUnit(String name){
    	if(this.name.equals(name)){
    		return true;
    	}
    	return false;
    }
}
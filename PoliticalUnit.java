import java.util.ArrayList;

public class PoliticalUnit{
    String name;
    Years span;// = new Years();
    ArrayList<Notes> events, accomplishments, people;
    public PoliticalUnit(String n, Years y){
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
    
    public ArrayList getEvents(){
        return events;
    }
    public ArrayList getAccomplishments(){
        return accomplishments;
    }
    public ArrayList getPeople(){
        return people;
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
}
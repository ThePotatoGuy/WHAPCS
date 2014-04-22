public class Person{
    String name;
    Notes notes;
    public Person(String n, Notes text){
        name = n;
        notes = text;
    }
    public String getName(){
        return name;
    }
}
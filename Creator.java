public class Creator extends Person{
    /** Someone who made something, such as a philosophy/religion/idea, or a
       tangible invention*/
    String creation;
    public Creator(String n, Notes text, String c){
        super(n, text);
        creation = c;
    }
    
    public String getCreation(){
        return creation;
    }
}
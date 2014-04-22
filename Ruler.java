public class Ruler extends Person{
    String place;
    Years yearsRuled;
    public Ruler(String n, Notes text, String p, Years y){
        super(n, text);
        place = p;
        yearsRuled = y;
    }
    
    public String getPlace(){
        return place;
    }
    public void printYearsRuled(){
        yearsRuled.printYears();
    }
}
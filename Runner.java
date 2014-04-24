public class Runner{
    public static void main (String[] args){
        /** Constructs all of the unit objects */
        Unit ONE = new Unit1();
        Unit TWO = new Unit2();
        Unit THREE = new Unit3();
        Unit FOUR = new Unit4();
        Unit FIVE = new Unit5();
        Unit SIX = new Unit6();
        
        /** Running stuff */
        //TWO.getPoliticalUnit("Achaemenid Empire").getEvent("Persian Wars").printNotes();
        System.out.println(TWO.getPoliticalUnits().size());
    }
}
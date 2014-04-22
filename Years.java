public class Years{
    /** Takes in two ints. Negative values are BCE while positive values are CE */
    int start, end;
    
    public Years(){
        start = end = 0;
    }
    public Years(int x, int y){
        if (x > y){
            end = x;
            start = y;
        }
        else{
            end = y;
            start = x;
        }
    }
    
    /** Converts negative/positive ints into corresponding eras when printed.*/
    public void printYears(){
        if (end < 0){
            System.out.println(Math.abs(start) + "BCE - " + Math.abs(end) + "BCE");
        }
        else{
            if (start < 0){
                System.out.print(Math.abs(start) + "BCE - ");
            }
            else{
                System.out.print(start + "CE - ");
            }
            System.out.println(end + "CE");
        }
    }
}
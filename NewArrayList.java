import java.util.ArrayList;

public class NewArrayList {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Saurav");
        arr.add("Shubham");
        arr.add("CDAC");
        arr.add("DBDA");
        for ( String s : arr)
        {
            System.out.println(s);
        }
    }
}

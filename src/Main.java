import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(s);


        String toCheck = s.replaceAll("[^a-zA-Z0-9]", "");
        toCheck = toCheck.toLowerCase();

        System.out.println(toCheck);

    }
}
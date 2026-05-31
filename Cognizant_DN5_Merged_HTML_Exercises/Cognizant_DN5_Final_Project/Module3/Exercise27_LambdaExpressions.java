import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise27_LambdaExpressions {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Akhil");
        names.add("Priya");
        names.add("Sneha");

        Collections.sort(names,(a,b) -> a.compareTo(b));

        System.out.println(names);
    }
}
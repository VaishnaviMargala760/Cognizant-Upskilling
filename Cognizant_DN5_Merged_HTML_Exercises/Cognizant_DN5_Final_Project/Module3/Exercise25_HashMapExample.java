import java.util.HashMap;
import java.util.Scanner;

public class Exercise25_HashMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Rahul");
        map.put(102,"Priya");
        map.put(103,"Akhil");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.println("Name = " + map.get(id));

        sc.close();
    }
}
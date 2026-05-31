import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise22_FileWriting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        try {

            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();

            System.out.println("Data Written Successfully");

        } catch(IOException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
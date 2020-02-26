import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class InsertionSort
{


    public void ReadingfromFile(){

    }

    public static void main(String[] args){
        int count=0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        try {
            File myObj = new File("1Kint.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                int data = myReader.nextInt();
                System.out.println(data);
                numbers.add(data);
            }
            System.out.println(numbers);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

}

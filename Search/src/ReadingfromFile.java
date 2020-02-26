import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingfromFile {
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    public void read(){
        try {
            File myObj = new File("1Kint.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                numbers.add(myReader.nextInt());
            }

            myReader.close();
            System.out.println(numbers);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void InsertionSort(){
        read();
        System.out.println("-----------------------------------------------------------------");
        int itemToBeInserted=0;
        int currentItem=0;
            for(int pointer = 1; pointer<numbers.size(); pointer++){
                itemToBeInserted= numbers.get(pointer);
                currentItem=pointer-1;//pointer to last item in sorted part of list
                while((numbers.get(currentItem) >itemToBeInserted)&&(currentItem>0)){
                    numbers.set((currentItem+1),numbers.get(currentItem));//move current itme down
                    currentItem=currentItem-1;//look at the itme above
                }
                numbers.set((currentItem+1), itemToBeInserted);//insert item
            }
        System.out.println(numbers);
    }
}

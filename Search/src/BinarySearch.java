public class BinarySearch {
    public static void main(String[] args){
        ReadingfromFile rd = new ReadingfromFile();
        rd.InsertionSort();
        int[] cars = {0,10,16,15,5};
        System.out.println((1+5)/2);
        int searchItem = 5;
        Boolean found = false;
        Boolean searchFaled = false;
        int first = 1;
        int last = cars.length;
        int middle =0;
        while(!found && !searchFaled){
            middle = (first+last)/2;
            if(cars[middle]==searchItem){
                found = true;
            }else {
                if(first>=last) {//no search area left
                    searchFaled=true;
                }else{
                    if (cars[middle]>searchItem){ //must be in the first half
                        last=middle-1;//move upper boundary
                    }else{//must be in the second half
                        first=middle+1;//move lower boundary
                    }
                }
            }
        }
        if(found=true){
            System.out.println(middle+1);
        }
    }

}



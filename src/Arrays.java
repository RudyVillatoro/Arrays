import java.util.Random;

public class Arrays {

    public static void main(String[] args){

        int[] numbers;
        numbers = new int[4];
        System.out.println(numbers.length);

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;

        for(int i = 0; i < numbers.length; i++){
            //fills the array elements with twice the value of the element in the array
            if (numbers[i] != 0){
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }else{
            numbers[i] = 100;
            System.out.println(numbers[i]);
            }
         System.out.println(numbers[i]);
        }

        //let us create an array that contains strings
        String[] myStrArray = new String[3];

        myStrArray[0] = new String("Hello");
        myStrArray[1] = new String("Hi");
        myStrArray[2] = "RV";

        for(int i = 0; i < myStrArray.length; i++){
            System.out.println(myStrArray[i]);
        }

        //this doesn't copy an array
        //String[] my2ndStrArray = myStrArray;
        String[] my2ndStrArray = new String[3];
        //Copy over
        for(int i = 0; i < my2ndStrArray.length; i++){
            my2ndStrArray[i] = myStrArray[i];
        }
        for(int i = 0; i < my2ndStrArray.length; i++){
            //print content of String array
            System.out.print(myStrArray[i] + ", ");
            System.out.println(my2ndStrArray[i] + " ");
        }

        //two dimensional arrays
        int[][] scores = new int[3][4];
        for(int row = 0; row < 3; row++){
            for (int col = 0; col < 4; col++){
                Random random = new Random();
                scores[row][col] = random.nextInt();
                System.out.println(scores[row][col]);
            }
        }
    }
}

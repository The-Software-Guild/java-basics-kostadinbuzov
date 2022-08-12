public class SummativeSums {

    public static void main(String[] args) {

        //Initialize arrays to test the program
        int [][] arrays = new int[3][];
        arrays[0] = new int[]{ 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        arrays[1] = new int[]{ 999, -60, -77, 14, 160, 301 };
        arrays[2] = new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 } ;

        //Print out the added value of each array
        for(int i = 0; i < arrays.length; i++){
            System.out.println("#" + (i+1) + " Array Sum: " + Adder(arrays[i]));
        }

    }

    //Function to add all numbers in an array of numbers
    public static int Adder(int [] numbers){
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

}

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


// 01. Create an array to hold the numbers 1-10.
// 02. Loop through that array and sum the numbers 1-10, then print that total to the screen.

        int[] numbers = new int[10];
        int numbersSum = 0;
        int jValue = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            numbersSum = numbersSum + (i + 1);
            System.out.println("numbers [" + i + "] has the value of " + (i + 1));

        }
            System.out.println();
            System.out.println("The sum of the values in the array = " + numbersSum);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


// 03. Create an array to hold 10 number inputs from the user and print that total to the screen.
// 04. Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.

        int[] numbers2 = new int[10];
        int numbersSum2 = 0;
        int numbersAverage2 = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);


        for (int j = 0; j < numbers2.length; j++){
            System.out.println();
            System.out.println("Enter an integer:  ");
            number = input.nextInt();

            numbers2[j] = number;
            numbersSum2 = numbersSum2 + number;
            jValue = j + 1;



        }
            numbersAverage2 = numbersSum2 / jValue;
            System.out.println();
            System.out.println("The sum of the 10 numbers entered is: " + numbersSum2);
            System.out.println("The average of the 10 numbers entered is: " + numbersAverage2);

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();



// 05. Create an array to store 3 names, loop through that array to print out the names.


            String [] names = new String[] {"Larry", "Curly", "Moe"};

            for (int i = 0; i < names.length; i++ ){
                System.out.println(names[i]);
            }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



// 06. Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
// String[] colors3 = new String[]{"blue", "orange", "yellow"};

            int [] numbers5 = new int[]{2,5,9,0,2,1,8,5,4};

            for (int i = 0; i < numbers5.length; i++){
                if ( numbers5[i] == 5){
                    System.out.println("The array at index " + i + " contains the value of " + numbers5[i]);

                }

            }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


// 07. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.

        int [] numbers7 = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = (numbers7.length - 1) ; i >= 0 ; i--){
            System.out.println(numbers7[i]);

        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


// 08. Given the following array: ['w','t','y','h','k']
//Loop through the array and replace the the letter 't' with the word "hello" once it's found.

        String [] letters8 = new String[]{"w","t","y","h","k"};

        for (int i = 0; i < letters8.length; i++){
            if (letters8[i] == "t"){
                letters8[i] = "hello";
            }

            System.out.println(letters8[i]);

        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


// 09. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
//Write a program that will print out all matching pairs from arrays 1 and 2.
//Expected output:
//(7,7) and (6,6)

        int [] numbers8 = new int[]{1,7,6,5,9};
        int [] numbers9 = new int[]{2,7,6,3,4};

        for (int i = 0; (i < numbers8.length && i < numbers9.length); i++){
            if (numbers8[i] == numbers9[i]){
                System.out.println("(" + numbers8[i] + "," + numbers9[i] + ")");

            }


        }





    }


}

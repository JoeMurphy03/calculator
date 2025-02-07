import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create scanner object for input
        Scanner sc = new Scanner(System.in);

        //need to create an array that will hold the whole calculation, could be a string array
        String[] history = new String[10];
        //array will be updated every calculation, all elements will be pushed back one, pushing the last element out of the array if full
        //create a main loop that will go until the user decides to exit the program

        displayMenu();
        System.out.print("\nENTER SELECTION -- ");
        int selection = sc.nextInt();
        while(selection != 9)
        {
            if(selection == 1)
            {
                //addition
                System.out.println("**** ADDITION ****");
                System.out.print("\nEnter First Number: ");
                double fNum = sc.nextDouble();
                System.out.print("\nEnter Second Number: ");
                double sNum = sc.nextDouble();
                double ans = new Addition().addition(fNum, sNum);
                String calc = new CalculationString().calcStr(fNum, sNum, ans, "+");
                System.out.print("Calculation: " + calc + "\n\n");
                updateArray(history, calc);
            }
            if(selection == 2)
            {
                //subtraction
                System.out.print("**** SUBTRACRTION ****");
                System.out.print("\nEnter First Number: ");
                double fNum = sc.nextDouble();
                System.out.print("\nEnter Second Number: ");
                double sNum = sc.nextDouble();
                double ans = new Subtraction().subtraction(fNum, sNum);
                String calc = new CalculationString().calcStr(fNum, sNum, ans, "-");
                System.out.print("Calculation: " + calc + "\n\n");
                updateArray(history, calc);
            }
            if(selection == 3)
            {
                //multiplication
                System.out.print("**** MULTIPLICATION ****");
                System.out.print("\nEnter First Number: ");
                double fNum = sc.nextDouble();
                System.out.print("\nEnter Second Number: ");
                double sNum = sc.nextDouble();
                double ans = new Multiplication().multiply(fNum, sNum);
                String calc = new CalculationString().calcStr(fNum, sNum, ans, "*");
                System.out.print("Calculation: " + calc + "\n\n");
                updateArray(history, calc);
            }
            if(selection == 4)
            {
                //division
                System.out.print("**** DIVISION ****");
                System.out.print("\nEnter First Number: ");
                double fNum = sc.nextDouble();
                System.out.print("\nEnter Second Number: ");
                double sNum = sc.nextDouble();
                double ans = new Division().division(fNum, sNum);
                String calc = new CalculationString().calcStr(fNum, sNum, ans, "/");
                System.out.print("Calculation: " + calc + "\n\n");
                updateArray(history, calc);
            }
            if(selection == 5)
            {
                //show history
                System.out.print("**** HISTORY ****\n");
                displayArr(history);
            }
            if(selection == 6)
            {
                //exit program
                break;
            }
            if(selection < 1 || selection > 6)
            {
                System.out.print("Enter Number Listed On Menu\n");
            }
            //display the menu
            displayMenu();
            //get user input
            System.out.print("\nENTER SELECTION -- ");
            selection = sc.nextInt();
        }
    }

    public static void displayMenu()
    {
        System.out.println("*** CALCULATOR  ***");
        System.out.println("ADDITION -------- 1");
        System.out.println("SUBTRACTION ----- 2");
        System.out.println("MULTIPLICATION -- 3");
        System.out.println("DIVISION -------- 4");
        System.out.println("HISTORY --------- 5");
        System.out.println("EXIT ------------ 6");
    }

    public static void updateArray(String[] array, String calculation)
    {
        //create a swap sequence to make room for the new string
        //could start at the back of the array and move towards the front pulling the element ahead of current index backwards
        for(int i = array.length; i > 1; i--)
        {
                array[i-1] = array[i-2];    //pulls all elements towards the back getting rid of the last one
        }
        array[0] = calculation;     //sets the first element to the most recent calculation
    }

    public static void testFillArr(String[] array)
    {
        for(int i = 0; i< array.length; i++)
        {
            array[i] = Integer.toString(i);
        }
    }

    public static void displayArr(String[] array)
    {
        for (String s : array) {
            System.out.print("[" + s + "]");
        }
        System.out.print("\n\n");
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//      1. Write a program that checks the role of the user

        System.out.print("Please, enter your role: ");
        String role = input.next();

        if (role.equalsIgnoreCase("superadmin"))
            System.out.println("\nWelcome Superadmin!");

        else if (role.equalsIgnoreCase("admin"))
            System.out.println("\nWelcome Admin!");

        else System.out.println("\nWelcome User!");


//      2. Take three numbers from the user and print the greatest number

        int max = 0;

        System.out.print("\n\nInput the 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = input.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = input.nextInt();

        if (max < num1)
            max = num1;

        if (max < num2)
            max = num2;

        if (max < num3)
            max = num3;

        System.out.println("\nThe greatest number: " + max);


//      3. Write a Java program that generates an integer between 1 and 7
//      and displays the name of the weekday

        Random random = new Random();

        int randomNum = random.nextInt(7) + 1;

        System.out.println("\n\nTest Data: number: " + randomNum);

        switch (randomNum) {
            case 1: System.out.println("Saturday"); break;
            case 2: System.out.println("Sunday"); break;
            case 3: System.out.println("Monday"); break;
            case 4: System.out.println("Tuesday"); break;
            case 5: System.out.println("Wednesday"); break;
            case 6: System.out.println("Thursday"); break;
            default: System.out.println("Friday");
        }


//      4. Write a program that takes a numeric score as input and prints
//      the corresponding letter grade using the following grading scale:

        System.out.print("\n\nEnter your numeric score: ");
        int score = input.nextInt();

        char grade;

        if(score >= 90 && score <= 100)
            grade = 'A';

        else if (score >= 80 && score <= 89)
            grade = 'B';

        else if (score >= 70 && score <= 79)
            grade = 'C';

        else if (score >= 60 && score <= 69)
            grade = 'D';

        else grade = 'F';

        System.out.println("\nNumeric Score: " + score);
        System.out.println("Letter Grade: " + grade);


//      5. Write a Java program that takes a person's age as input and
//      categorizes them into one of three age categories: "Child,"
//      "Teenager," or "Adult" using an if statement

        System.out.print("\n\nEnter your age: ");
        int age = input.nextInt();
        String ageCategorie;

        if (age >= 20)
            ageCategorie = "Adult";

        else if (age >= 13 && age <= 19)
            ageCategorie = "Teenager";

        else ageCategorie = "Child";

        System.out.println("\nYou are a " + ageCategorie);
    }
}

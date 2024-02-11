//Rodrigo Espinoza
//Lab 3, #1
//CS/IS 112

//create input using scanner class
/*create 3 variables for each test score
Test_1, Test_2, Test_3 */
//create variable "mean" of 3 test scores
//print test scores with average

import java.util.Scanner;   //must use for scanner class to activate

public class Lab3_1
{
    public static void main(String[] args)
    {
            double Test_1, Test_2, Test_3, mean;
        Scanner moveon= new Scanner(System.in);
        System.out.println("Input first test score");
            Test_1=moveon.nextDouble();
         System.out.println("Input second test score");
            Test_2=moveon.nextDouble();
        System.out.println("Input third test score");
            Test_3=moveon.nextDouble();
            mean=(Test_1+Test_2+Test_3)/3;
        System.out.print("The average tests scores for "+Test_1);
        System.out.print(", "+Test_2+" ,and "+Test_3+" is "+mean+".");
        moveon.close();
    }
}
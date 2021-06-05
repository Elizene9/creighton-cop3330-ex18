/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Create a program that converts temperatures from Fahrenheit to Celsius
 or from Celsius to Fahrenheit. Prompt for the starting temperature.
  The program should prompt for the type of conversion and then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9 and F = (C × 9 / 5) + 32
Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.
 */
package Exercise_18;

import java.util.Scanner;
public class ex18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.print("Press F to convert from Celsius to Fahrenheit.\n");

        char user = input.next().charAt(0);
        double formula;
        double temp;

        if (user == 'F' || user == 'f') {
            System.out.printf("Your choice: %c\nPlease enter the temperature in Celsius: ", user);
            temp = input.nextDouble();
            formula = (temp * 9 / 5) + 32;
            System.out.printf("\nThe temperature in Fahrenheit is %.2f", formula);
        }

        if (user == 'C' || user == 'c') {
            System.out.printf("Your choice: %c\nPlease enter the temperature in Fahrenheit: ", user);
            temp = input.nextDouble();
            formula = (temp - 32) * 5 / 9;
            System.out.printf("\nThe temperature in Celsius is %.2f", formula);
        }

    }
}

package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List05 {
    public static void main(String[] args) {
        /*
        Write a program that accepts an integer as input and prints first 10 prime numbers greater than input
Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */
/*
It prompts the user to enter an integer input.
It creates an empty list to hold the prime numbers.
It initializes a variable currentNumber to the input plus one.
It enters a loop that runs until the list of primes has 10 elements.
For each iteration of the loop, it checks if currentNumber is prime by calling the isPrime method. If it is, it adds it to the list of primes.
After each iteration of the loop, it increments currentNumber.
Once the loop finishes, it prints out the list of primes.
The isPrime method checks if a number is prime by testing if it is divisible by any number from 2 up to the square root of the number. The isEven method checks if a number is even by checking if its remainder when divided by 2 is 0.

 */
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int input = scanner.nextInt();
                //scanner.close();


                List<Integer> primes = new ArrayList<>();
                int currentNumber = input + 1;
                while (primes.size() < 10) {
                    if (isPrime(currentNumber)) {
                        primes.add(currentNumber);
                    }
                    currentNumber++;
                }

                System.out.println(primes);
            }

            public static boolean isEven(int number) {
                return number % 2 == 0;
            }

            public static boolean isPrime(int number) {
                if (number <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }


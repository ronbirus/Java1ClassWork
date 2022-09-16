package Sept16Examples;

import java.util.Scanner;

public class FunWithEqualityAndRelationalOperators {

    public static void main(String[] args) {
        System.out.println("Fun with ... Equality and Relational Operators!");

        //Get X and Y
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = input.nextInt();
        System.out.println("Enter second number: ");
        int y = input.nextInt();

        if(x == y){
            System.out.printf("%d == %d is true",x ,y);
        } else {
            System.out.printf("%d == %d is false",x ,y);
        }

        if(x != y){
            System.out.printf("\n%d != %d is true",x ,y);
        } else {
            System.out.printf("\n%d != %d is false",x ,y);
        }

        if(x > y){
            System.out.printf("\n%d > %d is true",x ,y);
        } else {
            System.out.printf("\n%d > %d is false",x ,y);
        }

        if(x < y){
            System.out.printf("\n%d < %d is true",x ,y);
        } else {
            System.out.printf("\n%d < %d is false",x ,y);
        }

    }

}


package com.codewithjach;

import java.util.Scanner;

public class AlmightyFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();

        System.out.println(" enter the value of b:");
        int b = sc.nextInt();

        System.out.println("enter the value of c:");
        int c = sc.nextInt();

        double solve1 = -b+Math.sqrt(Math.pow(b, 2))-4*a*c;
        double solve2 = solve1/2*a;

        double solve3 = -b-Math.sqrt(Math.pow(b, 2))-4*a*c;
        double solve4 = solve3/2*a;
        System.out.println("your answer is x= "+solve2 +"  or x= "+solve4);




    }
}

package org.management.dsa;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter value:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((j +"*" +i+"="+j*i) + "\t");
            }
            System.out.println();
        }
    }



}

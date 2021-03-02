package com.codewitheli;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner h = new Scanner(System.in);
        System.out.println("please enter you height:");
        String height = h.nextLine();

        Scanner a = new Scanner(System.in);
        System.out.println("please enter you age:");
        String age = a.nextLine();




        Scanner m = new Scanner(System.in);
        System.out.println("please enter your mom height in CM:");
        int mom = m.nextInt();

        Scanner d = new Scanner(System.in);
        System.out.println("please enter your dad height in CM:");
        int dad = d.nextInt();

        System.out.print("are you male if yes type true if no type false  ");
        Scanner scan = new Scanner(System.in);
        if(scan.nextBoolean()==true) {
            System.out.println("your height will be: " + ((dad + mom)/2+6.5));
        }else {
            System.out.println("your height will be: " + ((dad + mom)/2 - 6.5));
        }
        scan.close();
        System.out.println("your is height is: " + height  );
        System.out.println("you are " + age + " years old");
        System.out.println("your mom height is: " + mom  );
        System.out.println("your dad height is: " + dad  );





    }
}
package org.example;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner melumat= new Scanner(System.in);
        System.out.println("Ilk eded");
        String input = melumat.nextLine();
        int a = Integer.valueOf(input);
        System.out.println("Ikinci eded");
        String next = melumat.nextLine();
        int b = Integer.valueOf(next);
        System.out.println("emeliyyat");
        String emel = melumat.nextLine();

       int c ;
        if(emel.equals("+")){
            c=a+b;
            System.out.println(c);
        }else if(emel.equals("*")){
            c=a*b;
            System.out.println(c);
        }else if(emel.equals("-")){
            c=a-b;
            System.out.println(c);
        }else if(emel.equals("/")){
            double c1 = 1.0 * a / b;

            System.out.println(c1);
        }else if(emel.equals("%")){
            c=a%b;
            System.out.println(c);
        }
        else{
            System.out.println("Emeliyyat sehvdir");
        }



    }

    }

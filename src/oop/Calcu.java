package oop;

import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {

        int a, b ,c,select;
        double d;


        Scanner in = new Scanner(System.in);

        System.out.println("Enter first num");
        a = in.nextInt();
        System.out.println("Enter second num");
        b = in.nextInt();

        System.out.println("Enter 1 for add ");
        System.out.println("Enter 2 for sub ");
        System.out.println("Enter 3 for mul ");
        System.out.println("Enter 4 for div ");

        select=in.nextInt();

        Lator irfan=new Lator();
        if (select==1){
            irfan.add(a,b);


        }else if(select==2){
            irfan.sub(a,b);
        }else if(select==3){
            irfan.div(a,b);
        }else if(select==4){
            irfan.div(a,b);
        }else {
            System.out.println("wrong number");
        }

    }
}
package ru.geekbrains.lesson1;

public class Thirdapp {
    //1//
    public static void main(String[] args)
    {
        hw2();
        hw3(int a, int b, int c, int d);
        hw4(int x, int y);
        hw5(int n);
        hw6(int p);
        String stringV = "Name";;
        int year = 2020;

    }
    //2//
    static void hw2()
    {
        boolean b = true;
        byte bt = 120;
        char c = 'л';
        short s = 234;
        int i = 45;
        long l = 574573L;
        float f = 31.24f;
        double d = 6.235;
    }
    //3//
    static void hw3(int a, int b, int c, int d)
    {
        int a = 11;
        int b = 30;
        int c = 10;
        int d = 2;
        int v = a * (b + (c / d));
        System.out.println(v);
    }
     //4//
    static boolean hw4(int x, int y)
    {
         int x = 10;
         int y = 5;
         if ((x + y) >= 10 && (x + y) <= 20)
         {
             return true;
         }
         else
         {
             return false;
         }
    }
    //5//
    static void hw5(int n)
    {
        int n;
        if (n >= 0)
        {
            System.out.println("Число n - положительное");
        }
        else
        {
            System.out.println("Число n - отрицательное");
        }
    }
    //6//
     static boolean hw6(int p)
     {
         if (p > 0)
             return true;
         else
             return false;
     }
     //7//
    static void hw7(String Stringv)
    {
        System.out.println ("Привет,"+ Name);
    }
    //8//
    static void hw8(int year)
    {
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println("Год высокосный");
        }
        else {
            System.out.println("Год не высокосный");
        }

    }

}

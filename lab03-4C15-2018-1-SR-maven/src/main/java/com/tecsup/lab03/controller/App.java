package com.tecsup.lab03.controller;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        Double res,res2,a,b;
        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("Ingrese primer numero");
        a=sc.nextDouble();
        System.out.println("Ingrese segundo numero");
        b=sc.nextDouble();
        
        Multiplicacion uno = new Multiplicacion();
        res=uno.funcion1(a,b);
         System.out.println("resultado multiplicacion: "+res);
        
        Division dos = new Division();
        res2=dos.funcion2(a, b);
        System.out.println("resultado division: "+res2);
        
    }
}

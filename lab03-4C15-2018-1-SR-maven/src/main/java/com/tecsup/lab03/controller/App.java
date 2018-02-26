package com.tecsup.lab03.controller;

import javax.swing.JOptionPane;





import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

    	
        Suma suma = new Suma();
        Resta resta = new Resta();
        
        JOptionPane.showMessageDialog(null,"El resultado es el siguiente:" + suma.operacion());

        JOptionPane.showMessageDialog(null,"El resultado es :" + resta.operacion());
       
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

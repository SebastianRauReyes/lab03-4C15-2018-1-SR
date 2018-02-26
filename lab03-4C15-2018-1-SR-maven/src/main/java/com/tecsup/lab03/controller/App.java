package com.tecsup.lab03.controller;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Suma suma = new Suma();
        Resta resta = new Resta();
        
        JOptionPane.showMessageDialog(null,"El resultado es :" + suma.operacion());
 
        JOptionPane.showMessageDialog(null,"El resultado es :" + resta.operacion());
    }
}

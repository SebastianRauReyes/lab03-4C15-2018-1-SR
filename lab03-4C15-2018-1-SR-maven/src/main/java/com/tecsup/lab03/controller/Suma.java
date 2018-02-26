package com.tecsup.lab03.controller;

import javax.swing.JOptionPane;

public class Suma {
	
		
	public int operacion() {
		JOptionPane.showMessageDialog(null,"SUMAR ");
		int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer numero "));
	    int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el segundo numero"));
	   
	    int resultado=a+b;
	    
	    return resultado; 	    
	}
	
	

}

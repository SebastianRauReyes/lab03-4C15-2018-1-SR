package com.tecsup.lab03.controller;

import javax.swing.JOptionPane;

public class Resta {
	
	public int operacion() {
		JOptionPane.showMessageDialog(null,"RESTAR ");
		int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer numero "));
	    int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el segundo numero"));
	   
	    int resultado=a-b;
	    
	    return resultado; 	    
	}

}

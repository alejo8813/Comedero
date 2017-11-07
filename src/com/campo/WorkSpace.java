package com.campo;

	import java.awt.Color;
	import javax.swing.*;
	import java.awt.event.*;
	import java.awt.*;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import java.sql.*;
	import java.util.Hashtable;

	public class WorkSpace extends JFrame{

	     public static void main(String[] args) {
	        WorkSpace objeto= new WorkSpace();
	    }

	    public WorkSpace(){
	        JFrame frame= new JFrame(".:: Atencion Animales ::.");

	        Panel panel=new Panel();
	        panel.setLayout(null);
	        panel.setBounds(0,0,450,750);
	        panel.setBackground(Color.WHITE);

	        frame.setSize(450, 750);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);

	        
	        Label txid_name=new Label("Nombre");
	        txid_name.setBounds(50, 60, 100, 20);

	        final TextField id_name=new TextField("");
	        id_name.setBounds(250, 60, 100, 50);

	        Label txpeso=new Label("PESO");
	        txpeso.setBounds(50, 180, 100, 20);

	        final TextField peso=new TextField("");
	        peso.setBounds(250, 180, 100, 50);

	        JButton ins=new JButton("Insertar");
	        ins.setBounds(50, 360, 100, 50);
	        
	        panel.add(txid_name);
	        panel.add(id_name);
	        panel.add(txpeso);
	        panel.add(peso);
	        panel.add(ins);
	        frame.add(panel);

	        frame.setVisible(true);

	       frame.addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent we){
	            System.exit(0);
	            }
	        }
	        );

	  
	        ins.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	             JOptionPane.showMessageDialog(null,"Insertando Datos");
	             db_inserta objeto = new db_inserta();
	             objeto.insertar(id_name.getText(), Integer.parseInt(peso.getText()));
	             JOptionPane.showMessageDialog(null,"Datos Insertados");
	           }
	       }
	       );
	  }
	    public void mostrar()
	    {
	       setVisible(true);
	    }

	}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol20;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Bol20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Librería miLibrería = new Librería();
        boolean condicion=true;
        do{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija opción:\n1)Engadir Libro\n2)Amosar\n3)Dar de baja libros sin unidades\n4)Vender Libro\n5)Consultar libro\n6)Salir"));
            switch(opcion){
                case 1:
                   miLibrería.engadirLibro(new Libro(JOptionPane.showInputDialog("Titulo:"),JOptionPane.showInputDialog("Autor:"),JOptionPane.showInputDialog("ISBN:"),Float.parseFloat(JOptionPane.showInputDialog("Prezo:")),Integer.parseInt(JOptionPane.showInputDialog("Unidades:"))));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,miLibrería.amosarLibros());
                    break;
                case 3:
                   miLibrería.darBaixaUnidades0();
                    break;
                case 4:
                    int posicionLibro = Integer.parseInt(JOptionPane.showInputDialog("Posición del libro a vender:"));
                    miLibrería.venderLibro(posicionLibro);
                    break;
                case 5:
                   miLibrería.consultarLibro();
                    break;
                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Numero incorrecto");
            }
        }while(condicion);
    }
    
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipc1_practica2_202100086;
import javax.swing.JOptionPane;
/**
 *
 * @author Fati
 */
public class IPC1_Practica2_202100086 {
    private double precio;
    private String producto;
    
        
    public double getPrecio (){
        return precio;
    }
    
    public void setPrecio (double precio){
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    

    public static void main(String[] args) {
        
        
        
        Administrador a = new Administrador ();
        a.setVisible(true);
        
    }

    
}

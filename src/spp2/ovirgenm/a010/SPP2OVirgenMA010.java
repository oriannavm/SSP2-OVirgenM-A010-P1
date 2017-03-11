/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a010;

import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMA010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
       int [][] a;
       int [][] b;
       int [][] r;
       int tamaño = solicitarTamaño();
       
      
       //Crear matrices
       a= crearMatriz("A", tamaño);
       b= crearMatriz("B", tamaño);
       
       //Sumar matrices
       r= restaMatrices (a,b);
       
       //Mostrar el resultado
       
      muestraResultado (r);
    }
    
    
    public static int validacionEnteros(){
        Scanner keyboard = new Scanner (System.in);
        boolean flag;
        int n=0;
            do{
        try{
                 n = keyboard.nextInt();
                 flag = false;
                 }catch (Exception er){
                 System.out.println("El valor introducido no es un entero");
                 flag = true;
                     keyboard.next();   
                    
                }
             
            }while (flag);
            return  n;
    }
    public static int solicitarTamaño(){
        System.out.println("Tamaño del arreglo: ");
        int tamaño;
        tamaño = validacionEnteros();
        return tamaño;
    }
    
    public static int[][] crearMatriz(String nom, int tamaño){
        System.out.println("Introduce las matrices: ");
        int [][] miMatriz = new int [tamaño][tamaño];
        for (int i = 0; i < miMatriz.length; i++){
        for (int j = 0; j < miMatriz[i].length; j++){
        miMatriz[i][j] = validacionEnteros();
            }
        }
        return miMatriz;
        }
    
    public static int [][] restaMatrices(int[][]a, int[][]b){
        int [][]r = new int [a.length][a.length];
        for (int i = 0; i < r.length;i++){
        for (int j = 0; j < r[i].length; j++){
            r[i][j]= a[i][j]-b[i][j];    
           }
           }
           return r;
           
    }
    public static void muestraResultado(int[][]r) {
        for (int i = 0; i < r.length;i++){
        for (int j = 0; j < r[i].length; j++){
         System.out.print("["+r[i][j]+"]");
    }
            System.out.println("\n");
}
    }
}



    

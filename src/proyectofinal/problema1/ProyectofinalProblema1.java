/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.problema1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author danii
 */
public class ProyectofinalProblema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int tamano=solicitaentero("Escribe el número de materias");
            String[] materias=nombrematerias(tamano);
            double [][]arreglo=arreglo(tamano,materias);
            imprimirarreglo(arreglo,materias);    
    }
    
    
    
    
     public static String[] nombrematerias(int tamano){

         String []materias= new String[tamano];
         for (int i=0; i<tamano;i++){
            materias[i]=JOptionPane.showInputDialog("Teclea el nombre de la materia "+(i+1)+": ");            
        } 
        return materias;
        }
     
     
     
     
       public static double[][] arreglo(int tamano,String materia[]){

        double [][]arreglo= new double [tamano][3];
      
        for (int i=0; i<tamano;i++){
        for (int j=0;j<3;j++){
        
        arreglo[i][j]= solicitadouble("Escribe la calificación del parcial: "+(j+1)+": ");
        }
        }
        return arreglo;
        }
    
            
         public static void imprimirarreglo(double [][]a, String materia[]){
        double suma=0,prom=0;
              
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            suma= suma+a[i][j];
            prom=suma/3;
        }
        System.out.println();
        JOptionPane.showMessageDialog(null, "Promedio de la materia "+materia[i]+":\n"+ prom);
        prom=0;
        suma=0;
            
        }
            
        }
         
         public static int solicitaentero(String men){
        int num=0;
        boolean flag;
        do{
            
                /*String[] options = { "CANCELAR", "IMPRIMIR" };      
                int resp= JOptionPane.showOptionDialog(null, "Elige imprimir o cancelar", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
                if(resp==0){
                flag=false;
                }*/
                
       /* int codigo=JOptionPane.showConfirmDialog(null, men, "Calificaciones", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        
        if (codigo==JOptionPane.OK_OPTION){
            System.out.println("Has pulsado en SI");
            flag=false;
        }else if(codigo==JOptionPane.CANCEL_OPTION){
            System.out.println("Adios!");
        flag=false;
                }
                else{*/


                    try{
                String dato = JOptionPane.showInputDialog(men);
                num = Integer.parseInt(dato);
                 flag=false;}
                    catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error");
                flag=true;
            }
                     
        }
        while(flag);
        return num;
    }
         
          public static double solicitadouble(String men){
        double num=0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Double.parseDouble(dato);
                flag=false;
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(null, "Error");
                flag=true;
            }
        }
        while(flag);
        return num;
    }
    
}

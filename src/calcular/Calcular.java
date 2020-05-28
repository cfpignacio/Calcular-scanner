/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Calcular{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,ope;
        
        Scanner leer  = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1: ");
        
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el numero 2: ");
        
        num2 = leer.nextInt();
        
        
        System.out.println("Ingrese una operacion \n 1-> sumar \n 2 -> multiplicar \n 3 -> restar \n Ejemplo 1 :");
        ope = leer.nextInt();
        
       if(ope == 1){
           
           System.out.println("Resultado de la suma " + (num1 + num2));
       }else if( ope == 2 ){
           System.out.println("Resultado de la multiplicacion " + (num1 * num2));
       }else if (ope == 3){
           System.out.println("Resultado de la resta " + (num1 - num2));
       }else{
           System.out.println("Operacion no valida");
       }
        
        
    }
    
}

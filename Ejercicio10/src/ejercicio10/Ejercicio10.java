/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author PersonaL-CTI
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // resolucion
        double var1 = 25;
        int var2 = 10;
        int var3 = 100;
        boolean var4 = true;
        boolean var5 = false;
        int var6 = 10;
        int var7 = 5;
        int var8 = 2;
        
        boolean resultado = (((Math.sqrt(var1)* var2)>=100)&&(var4)||(var5)||
                ((var6/var7)>=2));
        System.out.println(resultado);
    }
    
}

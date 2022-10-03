/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author user
 */
public class Matricula {
    public static double pago_matricula (double patrimonio, int estrato) {
        double matricula;
        if (patrimonio>=2000000 && estrato >= 3){
        matricula= 50000+ (2000000*0.03);
    }
        else 
            matricula=50000;
        
        return matricula;
    }
    
}

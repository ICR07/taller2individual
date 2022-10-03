/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author user
 */
public class Mayor_Menor {

    public static String calcular_numero(int a, int b) {
        String c = null;
        if (a == b) {
            c = "Las variables son iguales";
        }

        if (a > b) {
            c = "La variable a es mayor que b";
        }
        if (a > b) {
            c = "La variable a es menor que b";
        }
        return c;

    }

}

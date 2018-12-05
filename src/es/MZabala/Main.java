package es.MZabala;

import java.util.Scanner;

public class Main {

    //Funcion main para llamar a las funciones que realizan el ejercicio.
    public static void main(String[] args) {
        boolean result;
        System.out.println("Introduzca un número a analizar:");
        Scanner scan = new Scanner(System.in);
        String numero= scan.next();
        Numero resultado= new Numero(numero);
        if(numero.length()<2||numero.length()>3){
            if (numero.length()==1){
                result=resultado.DivisorTres();
                if (result){
                    System.out.println("Es divisible por 3");
                }else{
                    System.out.println("No es divisible por 3");
                }
            }else{
                result=resultado.Par();
                if (result){
                    System.out.println("Es par");
                }else{
                    System.out.println("No es par");
                }
            }
        }else{
            result=resultado.Capicua();
            if (result){
                System.out.println("Es capicua");
            }else{
                System.out.println("No es capicua");
            }
        }
    }
}

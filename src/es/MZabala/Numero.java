package es.MZabala;

//Implementación de una interfaz donde se decalaran las funciones abtractas a realizar

public class Numero implements FuncionNumero {

    // Inicializacion de variables a usar, con sus contructores, getters, setter y string

    private String numero;

    public Numero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero='" + numero + '\'' +
                '}';
    }


    //Función que mediante 2 if comprueba si el numero es capicua
    @Override
    public boolean Capicua() {
        boolean capicua=false;
        if(numero.length()==2){
            if(numero.charAt(0)==numero.charAt(1)){
                capicua=true;
            }
        }
        if(numero.length()==3){
            if(numero.charAt(0)==numero.charAt(2)){
                capicua=true;
            }
        }
        return capicua;
    }

    //Función que mediante el resto comprueba si el numero es divisor de tres
    @Override
    public boolean DivisorTres() {
        boolean DivisorTres=false;
        int numero2= Integer.parseInt(numero);
        if(numero2%3==0){
            DivisorTres=true;
        }
        return DivisorTres;
    }

    //Función que mediante el resto comprueba si el numero es par

    @Override
    public boolean Par() {
        boolean Par=false;
        int numero2= Integer.parseInt(numero);
        if(numero2%2==0){
            Par=true;
        }
        return Par;
    }
}

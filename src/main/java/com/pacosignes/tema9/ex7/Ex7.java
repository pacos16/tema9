package com.pacosignes.tema9.ex7;

public class Ex7 {

    public static void main(String[] args) {

        String[] cadenas= new String[5];

        cadenas[0]="Lolaso";
        cadenas[3]="Oh my god";
        cadenas[4]="Tralalalananala";
        mostrarCadenasArray(cadenas);
    }

    public static void mostrarCadenasArray(String [] cadenas){

        for (int i =0; i<cadenas.length;i++){

            if(cadenas[i]!=null){
                System.out.println(cadenas[i].charAt(0));
            }
        }


    }
}

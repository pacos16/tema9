package com.pacosignes.tema9.ex5;
//Lo siento, he pecado.
import java.util.Scanner;

public class Alumno {

    private String nombre;
    private int edad;
    private float altura;



    public Alumno(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String toString(){


        return String.format("Nombre: %15s  ",nombre) + String.format("Edad: %4d",edad)+
                String.format(" Altura: %2.2f",altura);
    }

    public static Alumno crearAlumno(){

    Scanner lector=new Scanner(System.in);
    String n;
    int e=0;
    float a=0;
    boolean correcto=true;

    do{
        System.out.println("Dime un nombre");
        n=lector.nextLine();
        if(n.length()<3 || n.length()>15){
            System.out.println("El nombre no cumple los requisitos, introduzcalo de nuevo");
        }

    }while(n.length()<3 || n.length()>15);
    do{

        System.out.println("Dime una edad");

        try{
            e=Integer.parseInt(lector.nextLine());
            correcto=true;
            if(e<3){
                System.out.println("La edad debe ser superior a trea anyos");
            }
        }catch (NumberFormatException nfe){
            System.out.println("No introduzca letras");
            correcto=false;
        }


    }while(!correcto || e<3);

        do{

            System.out.println("Dime una altura (en metros)");

            try{
                a=Float.parseFloat(lector.nextLine());
                correcto=true;
                if(a<0 || a>2.7){
                    System.out.println("No conozco a nadie con esa altura");

                }
            }catch (NumberFormatException nfe){
                System.out.println("No introduzca letras");
                correcto=false;
            }


        }while(a<=0 || a>2.7 || !correcto);



        return new Alumno(n,e,a);

    }
}

package com.pacosignes.tema9.ex4;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    static Scanner lector= new Scanner(System.in);

    public static void main(String[] args) {

        int [] num=new int[5];
        excepciones(num);
        int [] n=null;
        excepciones(n);

    }

    static void excepciones(int[] num){
        boolean condicion = true;
        int i=0;

        while(condicion){
            try {
                System.out.println("Dime un numero");
                num[i] = Integer.parseInt(lector.nextLine());
                i++;
            }catch (NumberFormatException nfe){

                System.out.println("Introduzca un numero porfi");


            }catch(NullPointerException npe){
                condicion=false;
                System.out.println("El este no esta creado amigo");
            }catch (IndexOutOfBoundsException iob){
                System.out.println(Arrays.toString(num));
                System.out.println("Esta lleno");
                condicion=false;
            }
        }
    }
}

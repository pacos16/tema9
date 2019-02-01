package com.pacosignes.tema9.ex1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num=0;
        boolean correcto=true;

        do{

            System.out.println("Dime un numero");
            try {
                num = lector.nextInt();
                lector.nextLine();
            } catch (InputMismatchException e) {

                System.out.println("Mismatch Excepcion");
                correcto=false;
            }
            if(!correcto && num>=0){
                System.out.println("fatal");
            }

        }while(correcto && num>=0);

    }


}
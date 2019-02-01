package com.pacosignes.tema9.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        float num=0;
        float max=0;
        int contMME=0;
        int contNFE=0;
        for (int i =10;i>0;i--){

            try{
                System.out.println("dime un numero");
                num=Float.parseFloat(lector.nextLine());
                if (num<max){
                    max=num;
                }

            }catch(InputMismatchException ime){
                contMME++;

            }catch(NumberFormatException nfe){
                contNFE++;
            }
        }
        System.out.println("Max "+max);
        System.out.println("IME "+contMME);
        System.out.println("NFE "+contNFE);
    }


}

package com.pacosignes.tema9.ex10;
import java.util.Scanner;

public class Ex10 {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //declaracion de variables
        int menu;
        float num1=0;
        int natural1;
        float num2=0;
        int natural2;
        float resultado;
        String str="2";

        //Bucle principal de la calculadora
        do{
            //Bucle de impresion del menu
            do{
                System.out.println("---Calculadora---");
                System.out.println("Elige una operacion");
                System.out.println("1.Suma");
                System.out.println("2.Resta");
                System.out.println("3.Multiplicacion");
                System.out.println("4.Division");
                System.out.println("5.Resto division entera");
                System.out.println("---------");
                System.out.println("0.Salir");
                //Entrada de datos menu
                try {
                    menu = Integer.parseInt(lector.nextLine());

                }catch(NumberFormatException nfe){
                    menu=-1;
                }
                if (menu<0 || menu>5){
                    System.out.println("Por favor un NUMERO del 0 al 5.");
                    System.out.println("Pulsa intro para continuar");
                    lector.nextLine();

                }

            }while(menu<0 || menu>5);
            //Entrada principal de datos con if por si la entrada es cero
            if (menu!=0){
                boolean correcto;
                do {
                    correcto=true;
                    try {
                        System.out.println("Dime el primer numero");
                        num1 = Float.parseFloat(lector.nextLine());

                    } catch (NumberFormatException nfe) {
                        System.out.println("Pon numeros plis");
                        correcto=false;
                    }
                    if(correcto) {
                        do {
                            try {
                                System.out.println("Dime el segundo numero");
                                num2 = Float.parseFloat(lector.nextLine());
                            } catch (NumberFormatException nfe) {
                                System.out.println("Numeros plis");
                                correcto = false;
                            }
                        }while(!correcto);
                    }
                }while (!correcto);
                //precision de float
                System.out.println("Dime cuantos decimales de precision quieres(escribe un numero que sea igual o mayor a 0");
                str=lector.next();
                lector.nextLine();
            }
            //En el switch estan todas las operaciones, la precision sera de dos decimales.
            switch(menu){
                //suma
                case 1:
                    System.out.println("---Suma---");
                    resultado=num1+num2;
                    System.out.printf("%."+str+"f \n",resultado);
                    break;
                //resta
                case 2:
                    System.out.println("---Resta---");
                    resultado=num1+num2;
                    System.out.printf("%."+str+"f \n",resultado);
                    break;
                //multiplicacion
                case 3:
                    System.out.println("---Multiplicacion---");
                    resultado=num1*num2;
                    System.out.printf("%."+str+"f \n",resultado);
                    break;

                //division
                case 4:
                    System.out.println("---Division---");
                    try {
                        resultado = num1 / num2;
                        System.out.printf("%." + str + "f \n", resultado);
                    }catch (ArithmeticException ae){
                        System.out.println("No metas cosas raras!!!");
                    }
                    break;
                //resto
                case 5:
                    System.out.println("---Resto---");
                    natural1=(int)num1;
                    natural2=(int)num2;
                    try {
                        resultado = natural1 % natural2;
                        System.out.printf("%.0f \n", resultado);

                    }catch (ArithmeticException ae){
                        System.out.println("No metas cosas raras!!!");
                    }
                    break;

            }
            //Intro para continuar, aunque hay un metodo especifico keylistener
            if(menu!=0){
                System.out.println("Pulsa intro para continuar");
                lector.nextLine();
            }

            //Texto fin de programa
            if (menu==0){
                System.out.println("Un placer calcular para ti! Hasta luego!");
            }
        }while(menu!=0);


    }


}

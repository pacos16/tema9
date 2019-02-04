package com.pacosignes.tema9.ex6;

public class Ex6 {

    public static void main(String[] args) {
        int[] array={-2,-1,0,1,2};
        int num=2;

        dividirEntreArray(num,array);
    }




    public static void dividirEntreArray(int num ,int[] array){
        float result;

        for(int i =0; i<array.length;i++){
            try{
                if(array[i]!=0) {
                    result = num / array[i];
                    System.out.println(result);
                }
            }catch(ArithmeticException ae){
                System.out.println("lol");
            }
        }
    }


}

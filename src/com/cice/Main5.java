package com.cice;

public class Main5 {

    public static void main (String[] args){

        int[] numeros = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < numeros.length; i++){

           // System.out.println(numeros[i]);
            //ejercicio



        }

        //FOREACH

        for(int numero : numeros){

            System.out.println(numero);

        }

        //WHILE
        int condicion = 3;

        while(numeros[4]> condicion){

            System.out.println(condicion++);

        }

        // DO WHILE

        do {
            System.out.println(condicion++);

        } while (numeros[4]> condicion);

    }


}
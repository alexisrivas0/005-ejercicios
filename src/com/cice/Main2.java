package com.cice;

import java.util.Scanner;

public class Main2 {



    public static void main(String[] args) {


        int horadeldia;

        Scanner sc = new Scanner(System.in);

        System.out.print("introduce la hora actual: ");

        horadeldia = sc.nextInt();

        if (horadeldia>=21 && horadeldia<=24){

            System.out.println("Buenas noches");

        } else if (horadeldia>=0&&horadeldia<6){

            System.out.println("Buenas noches");

        } else if (horadeldia>=6&&horadeldia<=12){

            System.out.println("Buenos días");

        } else if (horadeldia>12&&horadeldia<21){
            System.out.println("Buenas tardes");
        } else {

            System.out.println("Introduce tu hora en un formato 24 horas");
        }


        switch (horadeldia) {

            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Buenas noches");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Buenos días");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenas tardes");
                break;
            default:
                System.out.println("No has introducido una hora en un formato válido");
        }

        }

    }


package com.dana;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.util.Scanner;


    public class Main {

        public static void main(String[] args) {
            // write your code here

            try (Scanner scanner = new Scanner(System.in)) {


           // REĢISTRĀCIJAS DAĻA

                System.out.println("Ievadiet savu vārdu:");
                String name = scanner.nextLine();

                System.out.println("Ievadiet savu e-past adresi:");
                String email = scanner.nextLine();

                System.out.println("Ievadiet vēlamo paroli");
                String password = scanner.nextLine();



                while (password.length() <10) {
                    System.out.println("Nepietiekams simbolu skaits!");
                    password = scanner.next();
                }


            // LIETOTĀJA LOGINA DAĻA



                System.out.println(" Ievadiet lietotāja vārdu ");
                String userName = scanner.nextLine();

                System.out.println("Ievadiet paroli ");
                password = scanner.nextLine();




            if (userName.equals ("Dana") && password.equals ("labadiena")) {

                System.out.println("Esat veiksmīgi ielogojies!");

            }
            else {
                System.out.println("Nepareizs lietotāja vārds vai parole");
            }

                }




                }
            }






















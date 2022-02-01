package com.dana;

import java.util.Scanner;

class Registration {


    static Register register = new Register();

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ievadi savu vārdu");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);


            System.out.print("Ievadi savu epasta adresi");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);


            System.out.print("Ievadi savu paroli");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.println(register.toString());

        }
    }
}


        class Register {
            private String firstName;
            private String emailId;
            private String password;

            public String getFirstName () {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }


            public String getEmailId () {
                return emailId;
            }

            public void setEmailId(String emailId) {
                this.emailId = emailId;
            }


            public String getPassword () {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }


            public String toString () {

                return "Register [firstName=" + firstName +", emailId= "+ emailId+", password= " +password+"]";



        }



}


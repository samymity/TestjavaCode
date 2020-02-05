package com.example.demo.example2;


interface RBI {

    void deposit();


}


/*class SBI implements RBI {

    @Override
    public void deposit() {

        System.out.println("  SBI deposit)");

    }
}*/


public class Bank {

    public static void main(String[] args) {

   /*     RBI a = new SBI()
        {
            public void deposit() {

                System.out.println("  SBI deposit)");

            }

        };
*/

        RBI a = () ->
        {
            System.out.println("  SBI deposit)");

        };


          
        a.deposit();

    }


}
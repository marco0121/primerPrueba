package Poo;

public class ContadorHilos {
    public static void main (String[] args) {
        //crear dos hilos que cuentan simultaneamente
        //dos formas de crear un hilo
        new Thread (
                ()-> {
                    for (int i=1; i<=5; i++){
                        try {
                            Thread.sleep (500);
                            System.out.println ("Hilo 1"+i);
                        }catch (Exception e){

                        }

                    }
                }).start ();
        new Thread (
                ()-> {
                    for (int i=1 ; i <= 5;
                         i++) {
                        try {
                            Thread.sleep (500);
                        } catch (
                                Exception e) {


                        }

                    }
                });

        }
    }


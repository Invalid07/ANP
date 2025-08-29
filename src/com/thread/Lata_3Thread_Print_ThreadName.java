package com.thread;

public final class Lata_3Thread_Print_ThreadName {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            System.out.println(" - " + Thread.currentThread().getName());
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            System.out.println(" - " + Thread.currentThread().getName());
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            System.out.println(" - " + Thread.currentThread().getName());
        });

        try {
            t1.setName("Thread1");
            t1.start();
            Thread.sleep(2000);

            t2.setName("Thread2");
            t2.start();
            Thread.sleep(2000);

            t3.setName("Thread3");
            t3.start();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

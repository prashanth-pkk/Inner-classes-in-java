package org.pk.innerclasses;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Thread is running...");
            }
        };
        thread.start();
    }
}

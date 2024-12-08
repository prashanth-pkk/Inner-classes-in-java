package org.pk.innerclasses;

public class LocalInnerClass {
    public void executeTask() {
        class TaskListener implements Runnable {
            @Override
            public void run() {
                System.out.println("Task completed");
            }
        }
        TaskListener listener = new TaskListener();
        new Thread(listener).start();
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.executeTask();
    }
}

package org.pk.innerclasses;

public class MemberInnerClass {
    private String task;

    public MemberInnerClass(String task) {
        this.task = task;
    }

    class TaskThread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": Task " + task + " started");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": Task " + task + " completed...");
        }

    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass("A");
        MemberInnerClass.TaskThread taskThread = memberInnerClass.new TaskThread();
        Thread thread = new Thread(taskThread);
        thread.start();
    }
}

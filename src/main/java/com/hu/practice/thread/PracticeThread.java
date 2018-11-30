package com.hu.practice.thread;

public class PracticeThread {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.run();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.run();
    }
}

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try{
            for(int i = 4; i > 0; i--){
                System.out.println("Thread: " + threadName + "," + i);
                //让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (Exception e){
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + "existing.");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

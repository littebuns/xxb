package org.example;


public class newThread {

    public static void main(String[] args) {
        //新建类继承Thread
        ThreadNew thread1 = new ThreadNew();
        thread1.start();

        //传递runnable
        Thread thread2 = new Thread(new RunnableNew());
        thread2.start();

        //lambda 表达式
        new Thread(() -> System.out.println("线程3")).start();

    }


}

class ThreadNew extends Thread {
    @Override
    public void run() {
        System.out.println("线程1");
    }
}

class RunnableNew implements   Runnable{
    @Override
    public void run() {
        System.out.println("线程2");
    }
}

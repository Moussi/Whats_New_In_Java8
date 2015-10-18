package com.moussi.lambdaexpression;
/**
 * https://github.com/Moussi/Whats_New_In_Java8
 * @author MOUSSI Aymen
 *
 */
public class RunnableLambda {

  public static void main(String[] args) throws InterruptedException {
    // Normal Expressoin
    Runnable runnable = new Runnable() {

      @Override
      public void run() {
        for (int i = 0; i < 3; i++) {
          System.out.println("Hello World from Thread [" + Thread.currentThread().getName() + "]");
        }
      }
    };

    // Lambda Expression
    Runnable runnableLambda = () -> {
      for (int i = 0; i < 3; i++) {
        System.out.println("Hello World from Thread [" + Thread.currentThread().getName() + "]");
      }
    };

    System.out.println("***********Standart Runnable Example*************");
    Thread t = new Thread(runnable);
    t.start();
    t.join();
    System.out.println("***********Lambda Runnable Example*************");
    Thread t2 = new Thread(runnableLambda);
    t2.start();
    t2.join();

  }

}

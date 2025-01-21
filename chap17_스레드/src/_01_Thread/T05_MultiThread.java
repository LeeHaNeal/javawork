package _01_Thread;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("|");
        }
    }
}

public class T05_MultiThread {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        MyThread myThread = new MyThread();
        
        startTime = System.currentTimeMillis();
        myThread.start();
       
        long mainStartTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.print("-");
        }
        long mainEndTime = System.currentTimeMillis();

     
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();

        long mythTime = endTime - startTime;
        long mainTime = mainEndTime - mainStartTime;

        System.out.println("\n출력문 myThread 소요시간 : " + mythTime);
        System.out.println("출력문 mainThread 소요시간 : " + mainTime);
    }
}

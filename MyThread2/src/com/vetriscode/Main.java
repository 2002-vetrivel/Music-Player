
class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("\nNow the thread is running ...\n");
    }

    public static void main(String argvs[]) {

        Runnable r1 = new MyThread2();

        Thread th1 = new Thread(r1, "\nNew thread program\n");

        th1.start();

        String str = th1.getName();
        System.out.println(str);
    }
}

package Module5;

class LifeCycleDemo extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        LifeCycleDemo t = new LifeCycleDemo();
        System.out.println("Thread state: " + t.getState());
        t.start();
        System.out.println("Thread state after start: " + t.getState());
    }
}
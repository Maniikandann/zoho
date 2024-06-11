package combinedassignment14;

class ResourceA {
    public void methodA(ResourceB resourceB) {
        synchronized (this) {
            System.out.println("ResourceA: Holding lock on ResourceA");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("ResourceA: Waiting for lock on ResourceB");
            synchronized (resourceB) {
                System.out.println("ResourceA: Holding lock on ResourceA and ResourceB");
            }
        }
    }
}

class ResourceB {
    public void methodB(ResourceA resourceA) {
        synchronized (this) {
            System.out.println("ResourceB: Holding lock on ResourceB");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("ResourceB: Waiting for lock on ResourceA");
            synchronized (resourceA) {
                System.out.println("ResourceB: Holding lock on ResourceA and ResourceB");
            }
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            resourceA.methodA(resourceB);
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            resourceB.methodB(resourceA);
        });

        thread1.start();
        thread2.start();
    }
}


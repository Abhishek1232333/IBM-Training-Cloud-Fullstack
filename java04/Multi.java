package java04;

class Task extends Thread{
    private String task;
    Task(String task){
        this.task=task;
    }

    @Override
    public void run(){
        System.out.println(task+" is being executed by:"+Thread.currentThread().getName());
    }
}

class RTask implements Runnable{
    private String task;
    RTask(String task){
        this.task=task;
    }
    @Override
    public synchronized void run(){
        System.out.println(task+" is being executed by R:"+Thread.currentThread().getName());
    }
}

class Counter{
    private int count=0;
    public synchronized void inc(){
        count++;
    }

    public synchronized void getcount(){
        System.out.println(count);
    }
}

public class Multi {
    public static void main(String[] args) throws InterruptedException{
        Thread th1=new Task("Learn Java");
        Thread th2=new Thread(new Task("Learn Python"));

        Counter c=new Counter();

        //th1.start();
        //th2.start();
        Thread th3=new Thread(()->{
            for(int i=1;i<=1000;i++){
                c.inc();
            }
        });
        Thread th4=new Thread(()->{
            for(int i=1;i<=1000;i++){
                c.inc();
            }
        });

        th3.start();
        //th4.sleep(10000);
        th4.start();

        th3.join();
        th4.join();

        c.getcount();
        
    }
}

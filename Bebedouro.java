import java.util.concurrent.Semaphore;

public class Bebedouro {

    private Semaphore semaforo = new Semaphore(1);

    public void beberComSemaforo(){
        try {
            semaforo.acquire();
            System.out.println( Thread.currentThread().getName() + " está enchendo a garrafinha de água!" );
        }
        catch(InterruptedException e){

        } finally {
            System.out.println( Thread.currentThread().getName() + " terminou de encher a garrafinha!" );
            semaforo.release();
        }
    
    }

    public void beberSemSemaforo(){
        System.out.println( Thread.currentThread().getName() + " está enchendo a garrafinha de água!" );
        System.out.println( Thread.currentThread().getName() + " terminou de encher a garrafinha!" );
    }

}
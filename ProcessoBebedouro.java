public class ProcessoBebedouro implements Runnable {
    
    private Bebedouro bebedouro;

    public ProcessoBebedouro(Bebedouro b) {
        this.bebedouro = b;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " está pronto para encher a garrafinha.");
        bebedouro.beberComSemaforo();
    }
}

import java.util.Scanner;

public class Main {
    Bebedouro bebedouro = new Bebedouro();
    Thread[] threadsControle = new Thread[3];
    Thread[] threadsSemControle = new Thread[3];

    public static void main(String[] args) {
        Main exemplo = new Main();
        exemplo.startThreads();
    }

    public void startThreads() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Exemplo Sem Controle");
        System.out.println("2 - Exemplo Com Controle");
        System.out.println("Entre com a opcao desejada:");
        int op = in.nextInt();

        if(op == 1){
            System.out.println("========= Exemplo Sem Controle =========");
            for(int i = 0; i < 3; i++) {
                threadsSemControle[i] = new Thread(new ProcessoBebedouroSemControle(bebedouro));
            }

            for(int j = 0; j < 3; j++) {
                threadsSemControle[j].start();
            }
        }
        else {
            System.out.println("========= Exemplo Com Controle =========");
            for(int i = 0; i < 3; i++) {
                threadsControle[i] = new Thread(new ProcessoBebedouro(bebedouro));
            }

            for(int j = 0; j < 3; j++) {
                threadsControle[j].start();
            }

        }
    }
}

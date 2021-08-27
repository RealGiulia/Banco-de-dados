import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fibonacci numero1;

        numero1 = new Fibonacci();


        System.out.println("Digite 0 ou 1: ");
        numero1.n1 = sc.nextInt();
        System.out.println("Posição do número? ");
        numero1.count = sc.nextInt();

        int sequencia = numero1.soma();
        System.out.print("Aqui está o último número da  sequência de Fibonacci: "+ sequencia);


    }
}

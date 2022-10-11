    import java.util.Scanner;

    public class Ex03 {
        public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro número:");
            int x = sc.nextInt();
            System.out.print("Digite o segundo número:");
            int y = sc.nextInt();

            sc.close();
            
            int soma = x + y;
            System.out.println(" A soma dos dois numeros é: " + soma);
        }
    }

import java.util.Scanner;

public class aloMundo2 {
    public static void main(String[] args) {
        double n1, n2, n3;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = sc.next();
        System.out.print("Digite a nota 1: ");
       n1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
       n2 = sc.nextDouble();
       System.out.print("Digite a nota 3: ");
       n3 = sc.nextDouble();
        sc.close();

        m = (n1+n2+n3)/2;
        System.out.println("o valor de x é: " + n1);
        System.out.println("o valor de y é: " + n2);
        System.out.println("o valor de z é: " + n3);
        System.out.println("o valor de z é: " + z);
if (m >= 7) {
    System.out.println(nome + " passou");
} else {
    System.out.println(nome + " se ferrou");
     }
   }
 }
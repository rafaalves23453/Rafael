import java.util.Scanner;
public class sextou {
    public static void main(String[] args) {
        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite d dia");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.print("Domingo é");
                break;
            case 2:
                System.out.print("Segunda é");
                break;
            case 3:
                System.out.print("Terça é");
                break;    
            case 4:
                System.out.print("Quarta é");
                break;    
            case 5: 
                System.out.print("Quinta é");
                break;
            case 6:   
                System.out.print("Sexta é");
                break;    
            case 7:    
                System.out.print("sabado é");
                break;
            default:
              System.out.print("Nao importa o dia, é ");        
        }
         if (dia <= 3) {
            System.out.println("inicio de semana");
         } else if (dia >=5) {
            System.out.println("fim de semana");
         } else {
            System.out.println("meio de semana");
         }
    }
}
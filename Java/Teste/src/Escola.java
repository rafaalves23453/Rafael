import java.util.Scanner;
import java.util.Scanner;

import br.com.professor;
import br.com.rafael.Alunos;
import br.com.rafael.Turma;

public class Escola {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        professor p1 = new professor();
        Alunos a1 = new Alunos();
        Turma t1 = new Turma();

        t1.codigo = "KY5";
        t1.materia = "java";
        t1.professor = "Rafael";
        t1.alunos = "vamos testar";
        System.out.println(t1);
       
        
        System.out.print("Digite a matricula: ");
        p1.matricula = sc.next();
        System.out.print("Digite o nome do professor: ");
        p1.nome = sc.next();
        System.out.print("Digite a matricula: ");
        p1.materia = sc.next();

        System.out.println(p1.toString());

        System.out.print("Digite o nome do aluno: ");
        a1.nome = sc.next();
        System.out.print("Digite a nota 1: ");
        a1.n1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        a1.n2 = sc.nextDouble();
        System.out.print("Digite a nota 3: ");
       a1.n3 = sc.nextDouble();

        double media = a1.cauculaMedia();
        System.out.println(a1.mostraSituacao(media));

        System.out.println(a1);
        
    }
}
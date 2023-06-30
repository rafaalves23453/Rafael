public class escola {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "jupira";
        a1.n1 = 3.0;
        a1.n2 = 7.5;

        double media = a1.calculaMedia();
        String resultado = a1.resultado(media);

        System.out.println(a1.nome);
        System.out.println(a1.n1);
        System.out.println(a1.n2);
        System.out.println(media);
        System.out.println(resultado);
    }
}

class Aluno{
    String nome;
    double n1, n2;
    
    public double calculaMedia(){
        return (n1+n2)/2;
    }

    public String resultado(double x){
        if (x < 7.0) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
}

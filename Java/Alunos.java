package br.com.Rafael;

public class Alunos {
    public String nome;
    public double n1, n2, n3;
    public double media;

    public double cauculaMedia(){
        media = (n1+n2+n3)/3;
        return media;
    }

    public String mostraSituacao(double x){
        if (x<7) {
            return "se deu mal. Não entre em depressão";
        } else {
            return "Tudo bem. não fez mais que sua obrigacao.";
        }
    }
}

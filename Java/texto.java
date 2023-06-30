public class texto {
    public static void main(String[] args) {
        String texto = "ABC abc abC aBc ABC abc";
        int conta = texto.length();
        String s1 = texto.toLowerCase();
        String s2 = texto.toUpperCase();
        String s3 = texto.trim();
        String s4 = texto.substring(6);
        String s5 = texto.substring(6,9);
        String s6 = texto.replace("ABC", "xyz");
        int x = texto.indexOf("ABC");
        int y = texto.lastIndexOf("ABC");

        System.out.println("variavel texto: *" + texto + "*");
        System.out.println("tamanho do texto: " + conta + " caracteres");
        System.out.println("variavel s1: *" + s1 + "*");
        System.out.println("variavel s2: *" + s2 + "*");
        System.out.println("variavel s3: *" + s3 + "*");
        System.out.println("variavel s4: *" + s4 + "*");
        System.out.println("variavel s5: *" + s5 + "*");
        System.out.println("variavel s6: *" + s6 + "*");
        System.out.println("valor de x é: " + x );
        System.out.println("valor de y é: " + y );
        
        for(int i=s2.length(); i>0; i--){
            System.out.print(s2.substring(i-1, i));
        }

        System.out.println("vamos fazer split");

        String nome = "jupira pereira costa carvalho santos silva barbosa";
        String[] pedaco = nome.split(" ");
        int i = pedaco.length;
        System.out.println("sao " + i + " nomes");
        for (int n=0;n<i;n++) {
            System.out.println(pedaco[n]);
        }

        i = 0;
        while (i == 0) {
            System.out.println("valor de i: " + i);
            i++;
        }

        do {
            System.out.println("o valor de i agora é: " + i);
            i--;
        } while (i > 0);
    }
}

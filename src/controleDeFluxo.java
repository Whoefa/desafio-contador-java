import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroParametro = 0;
        int segundoParametro = 0;
        try {
            System.out.println("Informe o primeiro parametro");
            primeiroParametro = entrada.nextInt();
            System.out.println("Informe o segundo parametro");
            segundoParametro = entrada.nextInt();
            entrada.close();
            if (!(primeiroParametro > segundoParametro)) {
                throw new ParameterException("Nao corresponde ao solicitado, segundo parametro maior que o primeiro");
            }
            for (int i = 0; i < primeiroParametro; i++) {
                System.out.println(i);
            }
        } catch (ParameterException e) {
            System.out.println(e.getMessage());
        }
    }
}
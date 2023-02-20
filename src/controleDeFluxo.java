import java.util.Scanner;

public class controleDeFluxo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int primeiroParametro = 0;
        int segundoParametro = 0;
        try {

            System.out.println("Informe o primeiro parametro");
            primeiroParametro = entrada.nextInt();

            System.out.println("Informe o segundo parametro");
            segundoParametro = entrada.nextInt();
            entrada.close();
            if (primeiroParametro > segundoParametro) {
                for (int i = 0; i < primeiroParametro; i++) {
                    System.out.println(i);

                }
            } else {
                throw new parameterException();
            }
        } catch (parameterException e) {

            System.out.println("Nao corresponde ao solicitado, segundo parametro maior que o primeiro");
        }

    }
}
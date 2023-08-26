import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        valorFinal *= calcularJuros(valorInicial, taxaJuros, periodo);
        String formato = "###0.00";
        DecimalFormat df = new DecimalFormat(formato);
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
    public static Double calcularJuros (double valor_inicial, double taxa_juros, int periodo) {
        return Math.pow(1 + taxa_juros, periodo);
    }
}
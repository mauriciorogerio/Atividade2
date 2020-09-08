import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Número: ");
        int numero = sc.nextInt();
        System.out.println("Data: (dd/mm/yyyy)");
        Date data = sdf.parse(sc.next());
        System.out.println("Valor: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.println("Número de parcelas: ");
        int parc = sc.nextInt();

        ContratoService contratoService = new ContratoService(new Paypal());
        contratoService.processaContrato(contrato, parc);
    }
}

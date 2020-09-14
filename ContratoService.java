import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContratoService {

    private PagamentoOnline pagamentoOnline;

    public ContratoService(PagamentoOnline pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
    }

    public void processaContrato(Contrato contrato, int meses) {

        double parcela = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {

             double juros = parcela + pagamentoOnline.juros(parcela, i);
             double valorTotal = juros + pagamentoOnline.taxaDePagamento(juros);

            Date data = adMouths(contrato.getDataContrato(), i);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = sdf.format(data);
            System.out.println("Valor da parcela: " + valorTotal + " Vencimento: " + dataFormatada);
        }
    }

    private Date adMouths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return  cal.getTime();

    }
}

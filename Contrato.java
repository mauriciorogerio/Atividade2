import java.util.Date;

public class Contrato {

    private int nroContrato;
    private Date dataContrato;
    private double valorTotal;

    public Contrato(int nroContrato, Date dataContrato, double valorTotal) {
        this.nroContrato = nroContrato;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public int getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(int nroContrato) {
        this.nroContrato = nroContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

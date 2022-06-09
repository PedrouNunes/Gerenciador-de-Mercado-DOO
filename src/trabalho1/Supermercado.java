
package trabalho1;

public class Supermercado {
    private Cliente cliente;
    private Double receber;

    public Supermercado(Cliente cliente, Double receber) {
        this.cliente = cliente;
        this.receber = receber;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getReceber() {
        return receber;
    }

    public void setReceber(Double receber) {
        this.receber = receber;
    }
}

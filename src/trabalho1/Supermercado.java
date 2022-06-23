
package trabalho1;

import java.util.ArrayList;

public class Supermercado {
    static ArrayList<Cliente> clientesNotaFiscal;
    private Double receber;

    public Supermercado(Double receber) {
        this.receber = receber;
    }

    public static ArrayList<Cliente> getClientesNotaFiscal() {
        return clientesNotaFiscal;
    }

    public static void setClientesNotaFiscal(ArrayList<Cliente> clientesNotaFiscal) {
        Supermercado.clientesNotaFiscal = clientesNotaFiscal;
    }

    public Double getReceber() {
        return receber;
    }

    public void setReceber(Double receber) {
        this.receber = receber;
    }
}

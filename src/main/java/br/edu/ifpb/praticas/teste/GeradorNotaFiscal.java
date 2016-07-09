package br.edu.ifpb.praticas.teste;

import java.util.Calendar;

/**
 * @author diogomoreira
 */
public class GeradorNotaFiscal {

    public NotaFiscal gera(Pedido pedido) {
        NotaFiscal nf = new NotaFiscal(pedido.getCliente(), pedido.getValorTotal() * 0.94, Calendar.getInstance());
        new NFDao().persiste(nf);
        return nf;
    }

}

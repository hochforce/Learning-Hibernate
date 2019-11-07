package br.com.empresa.testes;

import br.com.empresa.dao.DeptoDao;
import br.com.empresa.models.Depto;

public class teste {
    public static void main(String[] args){
        Depto Depto = new Depto();
        DeptoDao dpd = new DeptoDao();
        Depto.setNome("Vendas");
        dpd.InsereDepto(Depto);
    }
}

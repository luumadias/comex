package br.com.alura.comex;

import br.com.alura.comex.integracao.ViaCepResponse;
import br.com.alura.comex.integracao.ViaCepService;

public class TestaIntegracaoViaCep {
    public static void main(String[] args) {
        ViaCepService servico = new ViaCepService();
        ViaCepResponse resposta = servico.buscaCep("02301100");
        System.out.println(resposta);
    }
}

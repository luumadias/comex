package br.com.alura.comex;

public class Endereco {
    String bairro;
    String cidade;

    String complemento;
    String estado;
    String rua;
    int numero;

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }
}

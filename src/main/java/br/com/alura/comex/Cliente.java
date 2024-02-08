package br.com.alura.comex;

public class Cliente {
    public String nome;
    public String cpf;
    public String email;
    public String profissao;
    public String telefone;
    public Endereco endereco;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", profissao='" + profissao + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

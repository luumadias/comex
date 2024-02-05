package br.com.alura.comex;

public class Sprint7 {

    public static void main (String[] args) {
        Produto livro = new Produto("Box de livros Harry Potter");

        livro.setDescricao("Bruxo que perdeu os pais, viveu com os tios e foi estudar magia");
        livro.setPrecoUnitario(359.90);
        livro.setQuantidade(7);

        System.out.println(livro.getNome());
        System.out.println(livro.getDescricao());
        System.out.println(livro.getPrecoUnitario());
        System.out.println(livro.getQuantidade());

        Produto filme = new Produto("Velozes e Furiosos");

        filme.setDescricao("Filme sobre um grupo de amigos praticando drift");
        filme.setPrecoUnitario(29.99);
        filme.setQuantidade(10);

        System.out.println(filme.getNome());
        System.out.println(filme.getDescricao());
        System.out.println(filme.getPrecoUnitario());
        System.out.println(filme.getQuantidade());

        if (livro.equals(filme)) {
            System.out.println("São iguais");

        } else {
            System.out.println("Não são iguais ");

        }

        System.out.println(filme.toString());

        Endereco endereco = new Endereco();
        endereco.bairro = "Jardim São Paulo";
        endereco.cidade = "São Paulo";
        endereco.complemento = "Apartamento 01";
        endereco.estado = "São Paulo";
        endereco.rua = "Rua Joaquim Norberto";
        endereco.numero = 507;
        System.out.println(endereco.toString());

        Cliente cliente = new Cliente();
        cliente.nome = "Luma Dias";
        cliente.cpf = "56401875810";
        cliente.email = "luumadiaslima@gmail.com";
        cliente.profissao = "Estudante";
        cliente.telefone = "11 996418177";
        cliente.endereco = endereco;

    }

}

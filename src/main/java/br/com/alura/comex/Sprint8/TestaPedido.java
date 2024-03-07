package br.com.alura.comex.sprint8;

import br.com.alura.comex.Cliente;
import br.com.alura.comex.Endereco;
import br.com.alura.comex.Produto;
import br.com.alura.comex.sprint8.Pedido;
public class TestaPedido {
  public static void main(String[] args) {

        Produto produto = new Produto("Box de livros Harry Potter");
        Cliente cliente = new Cliente();
      cliente.nome = "Luma Dias";
      cliente.cpf = "56401875810";
      cliente.email = "luumadiaslima@gmail.com";
      cliente.profissao = "Estudante";
      cliente.telefone = "11 996418177";

      cliente.endereco = new Endereco("Jardim São Paulo","São Paulo", "Apartamento 01", "São Paulo", "Rua Joaquim Norberto", 507);
        Pedido pedido = new Pedido(cliente,359.90,7);

        System.out.println(pedido);

    }
}

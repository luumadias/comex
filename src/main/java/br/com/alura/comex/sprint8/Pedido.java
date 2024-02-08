package br.com.alura.comex.sprint8;

import br.com.alura.comex.Cliente;

public class Pedido {
   private int id;
   private Cliente cliente;
   private double preco;
   private int quantidade;

   public Pedido (Cliente cliente, double preco, int quantidade) {
      this.preco = preco;
      this.cliente = cliente;
      this.quantidade = quantidade;
   }

   public Cliente getCliente() {
      return cliente;
   }

   public int getId() {
      return id;
   }

   public double getPreco() {
      return preco;
   }

   public int getQuantidade() {
      return quantidade;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }

   public String toString (){
      return ">> Dados dos Pedidos \n" +
      "Nome do Cliente: " + cliente + " \n" +
      "Id do pedido: " + id + " \n " +
      "Preço: " + preco + "\n" +
      "Quantidade: " + quantidade + "\n";

   }
}

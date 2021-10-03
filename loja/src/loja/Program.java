package loja;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1, LocalDate.now(), 2, 4);
		Pedido pedido2 = new Pedido(2, LocalDate.of(2021, 10, 03), 5, 5.00);
		Pedido pedido3 = new Pedido(3, LocalDate.now(), 3, 3);
		
		System.out.println("Número do pedido: " + pedido1.getNumero());
		System.out.println("Data do pedido: " + pedido1.getDataPedido());
		System.out.println("Quantidade: " + pedido1.getQuantidade());
		System.out.println("Valor do produto: " + pedido1.getValor());
		System.out.println("Valor total dos produtos: " + pedido1.getTotal());
		System.out.println("Valor total dos produtos com desconto: " + pedido1.finalizarPedido(LocalDate.now(), 8) + "\n");
		
		System.out.println("Número do pedido: " + pedido2.getNumero());
		System.out.println("Data do pedido: " + pedido2.getDataPedido());
		System.out.println("Quantidade: " + pedido2.getQuantidade());
		System.out.println("Valor do produto: " + pedido2.getValor());
		System.out.println("Valor total dos produtos: " + pedido2.getTotal());
		System.out.println("Valor total dos produtos com desconto: " + pedido2.finalizarPedido(LocalDate.of(2021, 10, 03), 25) + "\n");
		
		System.out.println("Número do pedido: " + pedido3.getNumero());
		System.out.println("Data do pedido: " + pedido3.getDataPedido());
		System.out.println("Quantidade: " + pedido3.getQuantidade());
		System.out.println("Valor do produto: " + pedido3.getValor());
		System.out.println("Valor total dos produtos: " + pedido3.getTotal());
		System.out.println("Valor total dos produtos com desconto: " + pedido3.finalizarPedido(LocalDate.now(), 9));
		
	}

}

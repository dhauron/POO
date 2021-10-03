package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	public int numero;
	public LocalDate dataPedido;
	public int quantidade;
	public double valor;
	public double total;
	
	
	public Pedido(int numero, LocalDate dataPedido, int quantidade, double valor) {
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public int getNumero() {
		return numero;
	}


	public LocalDate getDataPedido() {
		return dataPedido;
	}


	public int getQuantidade() {
		return quantidade;
	}
	
	public double getValor() {
		return valor;
	}


	public double getTotal() {
		return this.total = valor * quantidade;
	}


	public double finalizarPedido(LocalDate dataPedido, double total) {
		   double desconto = this.total - this.total * 0.1; 
		   if (dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
		   this.total = desconto;
	}return this.total;
	}
		
}
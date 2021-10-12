package classes;

import classes.exceptions.ClassificacaoForaDoRangeException;
import uteis.Categoria;
import uteis.TipoPrograma;

import java.util.concurrent.TimeUnit;

public class Filme extends Programa {

	private int duracao;
	protected TipoPrograma tipoPrograma;

	public Filme(String nome, Integer pontuacao, Categoria categoria, int duracao) throws ClassificacaoForaDoRangeException {
		super(nome, categoria, pontuacao, TipoPrograma.FILME);
		this.duracao = duracao;
		this.tipoPrograma = TipoPrograma.FILME;
	}

	private String formatTime(){
		long horas = TimeUnit.MINUTES.toHours(Long.valueOf(this.duracao));
		long minutos = this.duracao - TimeUnit.HOURS.toMinutes(horas);
		return String.format("%02dh %02dmin", horas, minutos);
	}

	@Override
	public String toString() {
		return
				super.toString() + "\n" +
				"Duração: " + this.formatTime() + "\n";
	}
}
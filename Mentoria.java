package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public double calcularXP() {
		return XP_PADRAO + 20d;

	}

	public LocalDate getDate() {
		return data;

	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria{" +
				"titulo='" + getTitulo() + '\'' +
				", descricao='" + getDescricao() + '\'' +
				", data=" + data +
				'}';

	}
}

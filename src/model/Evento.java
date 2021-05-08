package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
	
	// Atributos
	private String nome;
	private LocalDate dataEvento;
	private int duracao;
	private float custosEvento;
	private int vagas;
	
	// Construtor
	public Evento(String nome, LocalDate dataEvento, int duracao, float custosEvento, int vagas) {
		this.nome = nome;
		this.dataEvento = dataEvento;
		this.duracao = duracao;
		this.custosEvento = custosEvento;
		this.vagas = vagas;
	}
	
	
	// Gets
	public String getNome( ) {
		return this.nome;
	}
	
	public LocalDate getDataEvento() {
		return this.dataEvento;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	public float getCustosEvento() {
		return this.custosEvento;
	}
	
	public int getVagas() {
		return this.vagas;
	}
	
	
	
	//Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void setCustosEvento(float custosEvento) {
		this.custosEvento = custosEvento;
	}
	
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	
	//Método
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Evento: " + this.nome + "\n");
		sb.append("Data do evento: " + this.dataEvento + "\n");
		sb.append("Duração: " + this.duracao + "\n");
		sb.append("Custo: " + this.custosEvento + "\n");
		sb.append("Vagas: " + this.vagas);
		return sb.toString();
	}

}

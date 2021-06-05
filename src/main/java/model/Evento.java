package model;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	// Atributos
	private String nome;
	private String dataEvento;
	private int duracao;
	private float custosEvento;
	private int vagas;
	private String funcionario;
	private String objetivo;
	private String parceira;
	private String metas;
	List<Evento> eventosCadastrados = new ArrayList<Evento> ();
	List<String> trabalhosCadastrados = new ArrayList<String> ();
        public ArrayList<Evento> eventos = new ArrayList<Evento>();
	
	
	// Construtor
	public Evento() {
	}
	
	public Evento(String nome, String dataEvento, int duracao, float custosEvento, int vagas, String funcionario, String objetivo, String parceria, String metas) {
		this.nome = nome;
		this.dataEvento = dataEvento;
		this.duracao = duracao;
		this.custosEvento = custosEvento;
		this.vagas = vagas;
		this.funcionario = funcionario;
		this.objetivo = objetivo;
		this.parceira = parceria;
		this.metas = metas;
	}
	


	// Gets
	public String getNome( ) {
		return this.nome;
	}
	
	public String getDataEvento() {
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
	
	public String getFuncionario() {
		return funcionario;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public String getParceira() {
		return parceira;
	}
	
	public String getMetas() {
		return metas;
	}
	
	//Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataEvento(String dataEvento) {
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
	
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void setParceira(String parceira) {
		this.parceira = parceira;
	}

	public void setMetas(String metas) {
		this.metas = metas;
	}
	
	
	//M�todo
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Evento: " + this.nome + "\n");
		sb.append("Data do evento: " + this.dataEvento + "\n");
		sb.append("Duração: " + this.duracao + "\n");
		sb.append("Custo: " + this.custosEvento + "\n");
		sb.append("Vagas: " + this.vagas + "\n");
		sb.append("Funcion�rio respons�vel: " + this.funcionario + "\n");
		sb.append("Objetivo: " + this.objetivo + "\n");
		sb.append("Empresa parceira: " + this.parceira + "\n");
		sb.append("Metas do evento: " + this.metas + "\n");
		return sb.toString();
	}
	
	public void cadastrarEvento(Evento evento) {
		this.eventosCadastrados.add(evento);
                Evento evento1 = new Evento("Bingo", "25/12/2021", 5, 10000, 100, "Lucas", "Lar da Providência", "Uniesp", "Arrecadar para o Natal");
                this.eventos.add(evento1);
                 Evento evento2 = new Evento("Baile", "31/12/2021", 6, 15000, 200, "Lucas", "FUNAD", "Uniesp", "Festa de Reveillon");
                this.eventos.add(evento2); 
	}
	
	public void cadastrarTrabalho(String trabalho) {
		this.trabalhosCadastrados.add(trabalho);
	}
	
 //       public void buscarEvento(palavraChave){
 //           ArrayList<Evento> eventoResul = new ArrayList<Evento>();
            
 //           for (Evento ev : eventos){
 //               if (ev.contains(palavraChave)){
 //                   eventoResul.add(ev);
  //              }
  //          }
  //      }
	

}

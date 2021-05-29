package model;

public class Financeiro {
	double receita;
	double despesa;
	double saldo;
	
	public Financeiro() {
		
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getReceita() {
		return receita;
	}

	public void setReceita(double receita) {
		this.receita = receita;
	}

	public double getDespesa() {
		return despesa;
	}

	public void setDespesa(double despesa) {
		this.despesa = despesa;
	}
	public String saldo() {
		
		double resultado = this.getReceita() - this.getDespesa();
		String str = Double.toString(resultado);
		return str;
		
	}
		
}

package br.com.proway.senior.solid;

public class CarroGasolina extends Carro implements InterfaceCarroGasolina{

	Integer combustivel = 0;
	
	public Integer getCombustivel() {
		return this.combustivel;
	}
	
	public void colocarCombustivel() {
		Posto posto = new Posto();
		posto.abastecer(this);
	}

	public void abastecer() {
		// TODO Auto-generated method stub
		
	}
}

package br.com.proway.senior.solid;

public class Carro {

	int velocidade = 0;
	
	boolean isLigado = false;
	
	public void acelerarCarro() {
		this.velocidade++;
	}

	public void frearCarro() {
		if(this.velocidade > 1) {
			this.velocidade--;
		}else {
			this.velocidade = 0;
		}
	}
	
	public void ligarCarro() {
		this.isLigado = true;
	}
	

}

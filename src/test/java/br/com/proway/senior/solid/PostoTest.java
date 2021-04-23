package br.com.proway.senior.solid;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostoTest {

	@Test
	public void testAbastecer() {
		CarroGasolina carro = new CarroGasolina();
		Posto posto = new Posto();
		posto.abastecer(carro);
	}

}

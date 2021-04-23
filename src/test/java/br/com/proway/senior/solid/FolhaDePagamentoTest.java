package br.com.proway.senior.solid;

import static org.junit.Assert.*;

import org.junit.Test;

public class FolhaDePagamentoTest {

	@Test
	public void test() {
		FolhaDePagamento folha = new FolhaDePagamento();
		Trabalhador trabalhador = new Trabalhador();
		folha.pagarComissao(trabalhador);
		VendedorExterno vendedor = new VendedorExterno();
		folha.pagarComissao(vendedor);
	}

}

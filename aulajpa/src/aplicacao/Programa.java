package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Wesley Vicente da Silva", "wesley1535@hotmail.com");
		Pessoa p2 = new Pessoa(2, "Aline Fernanda Gomes Oliveira", "aalineet@hotmail.com");
		Pessoa p3 = new Pessoa(3, "Welson Vicente da Silva", "welson1535@hotmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}

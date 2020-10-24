package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		/* Instanciando para inserir no banco */
//		Pessoa p1 = new Pessoa(null, "Wesley Vicente da Silva", "wesley1535@hotmail.com");
//		Pessoa p2 = new Pessoa(null, "Aline Fernanda Gomes Oliveira", "aalineet@hotmail.com");
//		Pessoa p3 = new Pessoa(null, "Welson Vicente da Silva", "welson1535@hotmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/* Inserindo no banco */
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();

		
		/* Buscando uma pessoa do ID 3 usando o Find */
		Pessoa p = em.find(Pessoa.class, 3);
		
		/* Removendo do banco Monitorando, usando o find */
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}

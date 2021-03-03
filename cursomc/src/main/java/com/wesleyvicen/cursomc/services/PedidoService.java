package com.wesleyvicen.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesleyvicen.cursomc.domain.Pedido;
import com.wesleyvicen.cursomc.repositories.PedidoRepository;
import com.wesleyvicen.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto Não encontrado! ID: "+ id + ", Tipo: "+ Pedido.class.getName())); 
	}
	
}

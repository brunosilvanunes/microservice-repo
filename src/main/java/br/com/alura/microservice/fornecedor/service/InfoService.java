package br.com.alura.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoFornecedor infoPorEstado(String estado) {
		return this.infoRepository.findByEstado(estado);
	}

}

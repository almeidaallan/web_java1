package com.allancorp.projetopdv.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.allancorp.projetopdv.dao.UsuarioDAO;
import com.allancorp.projetopdv.model.Usuario;


@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioDAO dao;
	
	
	@GetMapping("/usuarios")
	public ArrayList<Usuario> recuperaTodos(){
		
		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>)dao.findAll();
		return lista;
		
		
	}

}

package com.fiap.psmicrosservicos.controller;


import com.fiap.psmicrosservicos.dto.Curso;
import com.fiap.psmicrosservicos.service.impl.CursoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class HomeController {
	
	@Autowired
	private CursoServiceImpl service;

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView view = new ModelAndView("login");
		return view;
	}
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home-cursos");
		List<Curso> curso = service.listaCurso();
		view.addObject("curso", curso);
		return view;		
	}

	@GetMapping("/usuario")
	public ModelAndView homeUsuario() {
		ModelAndView view = new ModelAndView("home-usuario");
		List<Curso> curso = service.listaCurso();
		view.addObject("curso", curso);
		return view;
	}
}

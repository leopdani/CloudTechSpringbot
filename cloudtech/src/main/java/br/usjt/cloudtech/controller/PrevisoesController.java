package br.usjt.cloudtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.cloudtech.model.Previsao;
import br.usjt.cloudtech.service.PrevisoesService;

@Controller
public class PrevisoesController {
	/*
	 * @Autowired private PrevisoesRepository previsoesRepo;
	 */
	
	@Autowired
	private PrevisoesService previsoesService;
	
	@Autowired
	public PrevisoesController(PrevisoesService previsoesService) {
		super();
		this.previsoesService = previsoesService;
	}

	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsoes");
		
		mv.addObject(new Previsao());
		
		List<Previsao> previsoes = previsoesService.listarTodos();
		
		mv.addObject("previsoes", previsoes);		
		
		
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar(Previsao previsoes){
		previsoesService.salvar(previsoes);
		return "redirect:/previsoes";
	}

	@Autowired
	public PrevisoesService getPrevisoesService() {
		return previsoesService;
	}

	@Autowired
	public void setPrevisoesService(PrevisoesService previsoesService) {
		this.previsoesService = previsoesService;
	}
	
	
}
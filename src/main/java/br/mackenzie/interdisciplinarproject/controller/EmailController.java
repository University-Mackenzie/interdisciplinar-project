package br.mackenzie.interdisciplinarproject.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.interdisciplinarproject.service.impl.EmailService;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Controller
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	private EmailService emailservice;
	
	/**
	 * Metodo que tem como funcao listar Chamadas em aulas.
	 * 
	 * @return jsonChamadas
	 */
	@RequestMapping(value = "/enviaremail", method = RequestMethod.GET)
	@ResponseBody
	public void enviarEmail() {

	try {
		emailservice.generateAndSendEmail();
	} catch (MessagingException e) {
		System.out.println("Nao foi possivel enviar email");
	}

	}
}
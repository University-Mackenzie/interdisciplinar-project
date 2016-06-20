package br.mackenzie.interdisciplinarproject.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UploadService {
	
	/**
	 * Retorna lista de Alunos
	 * @return
	 */
	//List<Aluno> listarAlunos();
	public void processRequest();
	public void FileUpload(HttpServletRequest request, HttpServletResponse response);
	public String getString();
}
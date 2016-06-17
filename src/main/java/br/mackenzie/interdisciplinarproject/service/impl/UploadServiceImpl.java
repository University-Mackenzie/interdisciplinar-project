package br.mackenzie.interdisciplinarproject.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UploadServiceImpl extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {

			//this.FileUpload(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

//	private String FileUpload(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		DiskFileItemFactory factory = new DiskFileItemFactory();
//		ServletFileUpload upload = new ServletFileUpload(factory);
//		upload.setSizeMax(50 * 1024 * 1024);
//		String nome = "";
//		List items = upload.parseRequest(request); // request vem na
//													// controladora
//
//		// Processa os itens do upload
//		Iterator iter = items.iterator();
//		while (iter.hasNext()) {
//			FileItem item = (FileItem) iter.next();
//			if (item.getFieldName().equals("arquivo")) {
//				nome = item.getName();
//				StringBuffer bn = new StringBuffer();
//				bn.append("/uploads/monitores/"); // caminho
//				bn.append(nome);
//				File uploadedFile = new File(bn.toString());
//				item.write(uploadedFile);
//			}
//		}
//		nome = "/uploads/monitores/" + nome;
//		return nome;
//	}
}
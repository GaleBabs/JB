package com.Attence.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Attence.service.ATTENCEservice;
import com.Attence.service.Impl.ATTENCEserviceImpl;

public class Deleteservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int ID = Integer.parseInt(req.getParameter("id"));
		ATTENCEservice service = new ATTENCEserviceImpl();
		PrintWriter out = resp.getWriter();
		System.out.print(ID);
		int rows = service.delete(ID);
		if (rows > 0) {
			out.print("ɾ���ɹ�");
			resp.sendRedirect("GB");
		}else {
			out.print("ɾ��ʧ��");
			resp.sendRedirect("GB");
		}
		
	}

	
	
}

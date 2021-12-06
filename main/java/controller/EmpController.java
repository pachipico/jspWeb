package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import action.emp.EmpDeleteAction;
import action.emp.EmpDetailAction;
import action.emp.EmpListAction;
import action.emp.EmpRegisterAction;
import action.emp.EmpUpdateAction;

public class EmpController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); // view에서 자바로 전송되는 데이터의 인코딩
		resp.setCharacterEncoding("utf-8"); // 자바에서 view로 전송되는 데이터의 인코딩
		resp.setContentType("text/html; charset=utf-8"); // 화면출력을 담당하는 브라우저에 전달하는 문자코드
		
		String uri = req.getRequestURI();
//		log.info(">>> uri > {}", uri);
		String context = req.getContextPath();
//		log.info(">>> context > {}", context);
		String path = uri.substring(context.length());
		log.info(">>> ProductController > path > {}", path);
		
		Action action = null;
		String destPage = null;
		if(path.equals("/emp/register.em")) {
			
			req.getRequestDispatcher("/emp/register.jsp").forward(req, resp);
		} else if (path.equals("/emp/insert.em")) {
			action = new EmpRegisterAction();
			action.execute(req, resp);
			req.getRequestDispatcher("/emp/list.em").forward(req, resp);
		} else if(path.equals("/emp/list.em")) {
			action = new EmpListAction();
			action.execute(req, resp);
			req.getRequestDispatcher("/emp/list.jsp").forward(req, resp);
		} else if (path.equals("/emp/detail.em")) {
			action = new EmpDetailAction();
			action.execute(req, resp);
			req.getRequestDispatcher("/emp/detail.jsp").forward(req, resp);
		} else if(path.equals("/emp/modify.em")) {
			action = new EmpDetailAction();
			action.execute(req, resp);
			req.getRequestDispatcher("/emp/modify.jsp").forward(req, resp);
		} else if(path.equals("/emp/update.em")) {
			action = new EmpUpdateAction();
			action.execute(req, resp);
			req.getRequestDispatcher("/emp/detail.em").forward(req, resp);
		}
		else if (path.equals("/emp/delete.em")) {
			action = new EmpDeleteAction();
			action.execute(req, resp);
			req.getRequestDispatcher("/emp/list.em").forward(req, resp);
		}
	}
}

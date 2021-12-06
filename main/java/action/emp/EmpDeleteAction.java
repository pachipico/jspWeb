package action.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import controller.ProductController;
import service.EmpService;
import service.EmpServiceImpl;

public class EmpDeleteAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		System.out.println(empno);
		EmpService esv = new EmpServiceImpl();
		
		esv.remove(empno);
		
		
	}
}

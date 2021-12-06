package action.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import controller.ProductController;
import domain.EmpVO;
import service.EmpService;
import service.EmpServiceImpl;

public class EmpDetailAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		EmpService esv = new EmpServiceImpl();
		int empno = Integer.parseInt(req.getParameter("empno"));

		EmpVO emp = esv.getDetail(empno);
		req.setAttribute("emp", emp);
		
	}
}

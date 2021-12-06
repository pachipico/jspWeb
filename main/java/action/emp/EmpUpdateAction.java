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

public class EmpUpdateAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		EmpService esv = new EmpServiceImpl();
		int empno = Integer.parseInt(req.getParameter("empno"));
		String ename = req.getParameter("ename");
		String job = req.getParameter("job");
		int mgr = Integer.parseInt(req.getParameter("mgr"));
		Double sal = Double.valueOf(req.getParameter("sal"));
		Double comm = Double.valueOf(req.getParameter("comm"));
		int deptno = Integer.parseInt(req.getParameter("deptno"));
		EmpVO emp = new EmpVO(empno, ename, job, mgr, null, sal, comm, deptno);
		System.out.println(emp.toString());
		esv.modify(emp);
	}
}

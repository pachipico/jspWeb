package action.emp;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import controller.ProductController;
import domain.EmpVO;
import service.EmpService;
import service.EmpServiceImpl;

public class EmpListAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		List<EmpVO> list = new ArrayList<>();
		EmpService esv = new EmpServiceImpl();

		list = esv.getList();
		req.setAttribute("list", list);
	}
}

package action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import controller.ProductController;
import domain.ProductVO;
import service.ProductService;
import service.ProductServiceImple;

public class ProductDetailAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		int pno = Integer.parseInt(req.getParameter("pno"));
		ProductService psv = new ProductServiceImple();
		ProductVO pvo = psv.getDetail(pno);
		req.setAttribute("pvo", pvo);
	}
}

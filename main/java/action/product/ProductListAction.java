package action.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import controller.ProductController;
import domain.ProductVO;
import service.ProductService;
import service.ProductServiceImple;

public class ProductListAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		ProductService psv = new ProductServiceImple();
		List<ProductVO> list = psv.getList();
		log.info(">>> product list size > {}", list.size());
		req.setAttribute("list", list);
	}
}

package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controller.ProductController;
import domain.EmpVO;
import repository.EmpDAO;
import repository.EmpDAOImpl;

public class EmpServiceImpl implements EmpService {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);
	private static EmpDAO dao = new EmpDAOImpl();
	@Override
	public int register(EmpVO evo) {
		
		return dao.insert(evo);
	}

	@Override
	public List<EmpVO> getList() {
		
		return dao.selectList();
	}

	@Override
	public EmpVO getDetail(int empno) {
		
		return dao.selectOne(empno);
	}

	@Override
	public int modify(EmpVO evo) {
		
		return dao.update(evo);
	}

	@Override
	public int remove(int empno) {
		
		return dao.delete(empno);
	}
}

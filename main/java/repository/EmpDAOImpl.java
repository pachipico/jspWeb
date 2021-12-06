package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.EmpVO;

public class EmpDAOImpl implements EmpDAO {

	private static Logger log = LoggerFactory.getLogger(ProductDAOImple.class);
	private Connection cn;
	private PreparedStatement pst;
	private ResultSet rs;
	private String sql;

	public EmpDAOImpl() {
		this.cn = DBConnector.getConnection();
	}
	@Override
	public int insert(EmpVO evo) {
		sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values( ?, ?, ?, ?, now(), ?, ?, ?);";
		try {
			pst = cn.prepareStatement(sql);

			pst.setInt(1, evo.getEmpno());
			pst.setString(2, evo.getEname());
			pst.setString(3, evo.getJob());
			pst.setInt(4, evo.getMgr());
			pst.setDouble(5, evo.getSal());
			pst.setDouble(6, evo.getComm());
			pst.setInt(7, evo.getDeptno());

			return pst.executeUpdate();
		} catch (SQLException e) {
			log.info("DAO - Insert-----------------");
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public List<EmpVO> selectList() {
		sql = "select * from emp;";
		List<EmpVO> list = new ArrayList<>();

		try {
			pst = cn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(new EmpVO(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"), rs.getInt("mgr"),
						null, rs.getDouble("sal"), rs.getDouble("comm"), rs.getInt("deptno")));
			}

			return list;
		} catch (SQLException e) {
			log.info("DAO - SelectList-----------------");
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public EmpVO selectOne(int empno) {
		sql = "select * from emp where empno = ?";
		
		try {
			pst = cn.prepareStatement(sql);
			pst.setInt(1, empno);
			
			rs = pst.executeQuery();
			if(rs.next()) {
				return new EmpVO(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"), rs.getInt("mgr"), null, rs.getDouble("sal"), rs.getDouble("comm"), rs.getInt("deptno"));
			}
		} catch (SQLException e) {
			log.info("DAO - SelectOne-----------------");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int update(EmpVO evo) {
		sql = "update emp set ename = ?, job = ? , mgr = ? , sal = ?, comm = ?, deptno = ?;";
		try {
			pst = cn.prepareStatement(sql);
			pst.setString(1, evo.getEname());
			pst.setString(2, evo.getJob());
			pst.setInt(3, evo.getMgr());
			pst.setDouble(4, evo.getSal());
			pst.setDouble(5, evo.getComm());
			pst.setInt(6, evo.getDeptno());

			return pst.executeUpdate();

		} catch (SQLException e) {
			log.info("DAO - update-----------------");
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int delete(int empno) {
		sql = "delete from emp where empno = ?";

		try {
			pst = cn.prepareStatement(sql);
			pst.setInt(1, empno);
			int result = pst.executeUpdate();
			
		} catch (SQLException e) {
			log.info("DAO - delete-----------------");
			e.printStackTrace();
		}

		return 0;
	}
}

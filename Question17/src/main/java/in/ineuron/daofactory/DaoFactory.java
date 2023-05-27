package in.ineuron.daofactory;

import in.ineuron.dao.BlogDaoImpl;
import in.ineuron.dao.IBlogDao;

public class DaoFactory {

	private static IBlogDao dao;

	private DaoFactory() {
	}

	public static IBlogDao getDaoObject() {
		if (dao == null) {
			dao = new BlogDaoImpl();
		}
		return dao;
	}

}

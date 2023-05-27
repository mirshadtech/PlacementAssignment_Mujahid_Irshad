package in.ineuron.service;

import in.ineuron.dao.IBlogDao;
import in.ineuron.daofactory.DaoFactory;
import in.ineuron.dto.BlogData;

public class BlogServiceImpl implements IBlogService {

	private IBlogDao dao;

	@Override
	public String insertBlogData(BlogData data) {
		dao = DaoFactory.getDaoObject();
		return dao.insertBlogData(data);
	}

	@Override
	public BlogData getheBlogDataById(Integer id) {
		dao = DaoFactory.getDaoObject();
		return dao.getheBlogDataById(id);
	}

	@Override
	public Integer findIdOfLatestInsertedRow() {
		dao = DaoFactory.getDaoObject();
		return dao.findIdOfLatestInsertedRow();
	}

}

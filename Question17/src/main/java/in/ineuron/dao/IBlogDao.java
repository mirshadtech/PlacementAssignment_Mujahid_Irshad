package in.ineuron.dao;

import in.ineuron.dto.BlogData;

public interface IBlogDao {

	public String insertBlogData(BlogData data);

	public BlogData getheBlogDataById(Integer id);

	public Integer findIdOfLatestInsertedRow();
}

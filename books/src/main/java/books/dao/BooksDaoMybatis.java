package books.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import books.domain.BooksVO;

@Repository
public class BooksDaoMybatis implements BooksDao{

	private SqlSessionTemplate sqlSessionTemplate;
	
	public BooksDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public List<BooksVO> list() {
		return sqlSessionTemplate.selectList("list");
	}

	@Override
	public BooksVO select(int num) {
		BooksVO vo = (BooksVO) sqlSessionTemplate.selectOne("select", num);
		return vo;
	}

	@Override
	public void insert(BooksVO booksVO) {
		sqlSessionTemplate.insert("insert", booksVO);
	}

	@Override
	public List<BooksVO> search(String keyword) {
		return sqlSessionTemplate.selectList("search", keyword);
	}

}

package books.service;

import java.util.List;

import books.dao.BooksDao;
import books.domain.BooksVO;

public class BooksServiceImpl implements BooksService{
	private BooksDao booksDao;
	
	public BooksDao getBooksDao() {
		return booksDao;
	}

	public void setBooksDao(BooksDao booksDao) {
		this.booksDao = booksDao;
	}

	@Override
	public List<BooksVO> list() {
		return booksDao.list();
	}

	@Override
	public void write(BooksVO booksVO) {
		booksDao.insert(booksVO);
	}

	@Override
	public List<BooksVO> search(String keyword) {
		return booksDao.search(keyword);
	}

	@Override
	public BooksVO read(int num) {
		return booksDao.select(num);
	}

	
	
}

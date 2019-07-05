package books.dao;

import java.util.List;

import books.domain.BooksVO;

public interface BooksDao {
	public abstract List<BooksVO> list();
	public abstract BooksVO select(int num);
	public abstract void insert(BooksVO booksVO);
	public abstract List<BooksVO> search(String keyword);
}

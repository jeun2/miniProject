package books.service;

import java.util.List;

import books.domain.BooksVO;

public interface BooksService {
	public abstract List<BooksVO> list();
	public abstract void write(BooksVO booksVO);
	public abstract List<BooksVO> search(String keyword);
	public abstract BooksVO read(int num);
}

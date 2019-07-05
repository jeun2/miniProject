package books.controller;

import java.io.File;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import books.domain.BooksVO;
import books.service.BooksService;

@Controller
public class BooksController {
	private BooksService booksService;

	public void setBooksService(BooksService booksService) {
		this.booksService = booksService;
	}
	
	@RequestMapping(value="/books/list")
	public String list(Model model) {
		model.addAttribute("booksList", booksService.list());
		return "/books/list";
	}
	
	@RequestMapping(value="/books/add", method=RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("formData", new BooksCommand());
		return "/books/write";
	}
	
	@RequestMapping(value="/books/add", method=RequestMethod.POST)
	public String write(@ModelAttribute("formData")BooksCommand booksCmd, MultipartHttpServletRequest request, BindingResult bindingResult) {
		
		MultipartFile mf = booksCmd.getImgname();
		String path = request.getSession().getServletContext().getRealPath("/upload");
		String fileName = mf.getOriginalFilename();
		File uploadFile = new File(path + "//" + fileName);
		try {
			mf.transferTo(uploadFile);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		BooksVO vo = new BooksVO(booksCmd.getIsbn(), booksCmd.getName(), booksCmd.getWriter(),
				booksCmd.getPub(),booksCmd.getCharge(), booksCmd.getContent(), fileName);
 		
		booksService.write(vo);
		return "redirect:/books/list";
		
	}
	
	@RequestMapping(value="/books/read/{num}", method=RequestMethod.GET)
	public String read(Model model, @PathVariable int num) {
		model.addAttribute("booksVO", booksService.read(num));		
		return "/books/read";
	}
	
	@RequestMapping(value="/books/search", method=RequestMethod.GET)
	public String search(Model model, @RequestParam String keyword) {
		model.addAttribute("booksList", booksService.search(keyword));
		return "/books/list";
	}
}

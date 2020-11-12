package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.dao.AuthorDao;
import pl.coderslab.entity.Author;

import java.util.List;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorDao authorDao;

    public AuthorController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Author> authors = authorDao.findAll();
        model.addAttribute("authors", authors);
        return "author/list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("author", new Author());
        return "author/form";
    }

    @PostMapping("/form")
    public String processForm(Author author) {
        if (author.getId() != null) {
            authorDao.update(author);
        } else {
            authorDao.saveAuthor(author);
        }
        return "redirect:/author/list";
    }

    @GetMapping("confirm/{id}")
    public String confirm(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "author/confirm";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        authorDao.delete(authorDao.findById(id));
        return "redirect:/author/list";
    }

    @GetMapping("/form/{id}")
    @Transactional
    public String form(@PathVariable int id, Model model) {
        Author author = authorDao.findById(id);
        model.addAttribute("author", author);
        return "author/form";
    }
}

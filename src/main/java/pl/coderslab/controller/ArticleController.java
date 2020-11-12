package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.ArticleDao;
import pl.coderslab.dao.AuthorDao;
import pl.coderslab.dao.CategoryDao;
import pl.coderslab.entity.Article;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Category;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    private final ArticleDao articleDao;
    private final AuthorDao authorDao;
    private final CategoryDao categoryDao;

    public ArticleController(ArticleDao articleDao, AuthorDao authorDao, CategoryDao categoryDao) {
        this.articleDao = articleDao;
        this.authorDao = authorDao;
        this.categoryDao = categoryDao;
    }

    @ModelAttribute("authors")
    public List<Author> authors() {
        return authorDao.findAll();
    }

    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryDao.findAll();
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Article> articles = articleDao.findAll();
        model.addAttribute("articles", articles);
        return "article/list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("article", new Article());
        return "article/form";
    }

    @PostMapping("/form")
    public String processForm(Article article) {
        if (article.getId() != null) {
            articleDao.update(article);
        } else {
            articleDao.saveArticle(article);
        }
        return "redirect:/article/list";
    }

    @GetMapping("/confirm/{id}")
    public String confirm(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "article/confirm";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        articleDao.delete(articleDao.findById(id));
        return "redirect:/article/list";
    }

    @GetMapping("/form/{id}")
    @Transactional
    public String form(@PathVariable int id, Model model) {
        Article article = articleDao.findById(id);
        model.addAttribute("article", article);
        return "article/form";
    }
}

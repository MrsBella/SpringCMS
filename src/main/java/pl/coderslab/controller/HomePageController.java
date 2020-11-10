package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.dao.ArticleDao;
import pl.coderslab.entity.Article;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomePageController {

    ArticleDao articleDao = new ArticleDao();

    public HomePageController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        List<Article> articles = articleDao.findLastFive();
        return articles.toString();
    }
}

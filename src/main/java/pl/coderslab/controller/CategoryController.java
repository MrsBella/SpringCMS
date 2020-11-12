package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.dao.CategoryDao;
import pl.coderslab.entity.Category;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryDao categoryDao;

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Category> categories = categoryDao.findAll();
        model.addAttribute("categories", categories);
        return "category/list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("category", new Category());
        return "category/form";
    }

    @PostMapping("/form")
    public String processForm(Category category) {
        if (category.getId() != null) {
            categoryDao.update(category);
        } else {
            categoryDao.saveCategory(category);
        }
        return "redirect:/category/list";
    }

    @GetMapping("/confirm/{id}")
    public String confirm(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "category/confirm";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        categoryDao.delete(categoryDao.findByID(id));
        return "redirect:/category/list";
    }

    @GetMapping("/form/{id}")
    @Transactional
    public String form(@PathVariable int id, Model model) {
        Category category = categoryDao.findByID(id);
        model.addAttribute("category", category);
        return "category/form";
    }
}

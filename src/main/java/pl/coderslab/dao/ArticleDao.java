package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class ArticleDao {

    @PersistenceContext
    EntityManager entityManager;

    public void saveArticle(Article article) {
        entityManager.persist(article);
    }

    public void delete(Article article) {
        entityManager.remove(entityManager.contains(article) ?
                article : entityManager.merge(article));
    }

    public void update(Article article) {
        entityManager.merge(article);
    }

    public List<Article> findAll() {
        TypedQuery<Article> query = entityManager.createQuery("SELECT a FROM Article a", Article.class);
        return query.getResultList();
    }

    public List<Article> findLastFive() {
        TypedQuery<Article> query = entityManager.createQuery("SELECT a FROM Article a ORDER BY a.id DESC",
                Article.class).setMaxResults(5);
        return query.getResultList();
    }

    public Article findById(int id) {
        Article article = entityManager.find(Article.class, id);
        return article;
    }
}

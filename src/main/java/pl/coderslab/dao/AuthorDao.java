package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class AuthorDao {

    @PersistenceContext
    EntityManager entityManager;

    public void saveAuthor(Author author) {
        entityManager.persist(author);
    }

    public void delete(Author author) {
        entityManager.remove(entityManager.contains(author) ?
                author : entityManager.merge(author));
    }

    public void update(Author author) {
        entityManager.merge(author);
    }

    public List<Author> findAll() {
        TypedQuery<Author> query = entityManager.createQuery("SELECT a FROM Author a", Author.class);
        return query.getResultList();
    }

    public Author findById(int id) {
        Author author = entityManager.find(Author.class, id);
        return author;
    }
}

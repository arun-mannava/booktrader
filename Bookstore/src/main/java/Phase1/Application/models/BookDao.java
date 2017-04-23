package Phase1.Application.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * Created by manju on 3/26/2017.
 */
@Transactional
public interface BookDao extends CrudRepository<Book, Long> {
    Iterable<Book> findByISBN(String isbn);
    Iterable<Book> findBycourseName(String cName);

    @Query("select b from Book b where BOOK_NAME LIKE CONCAT('%',:BOOK_NAME,'%') OR iSBN LIKE CONCAT('%',:BOOK_NAME,'%') OR AUTHOR LIKE CONCAT('%',:BOOK_NAME,'%')")
    Iterable<Book> getBookBybookName(@Param("BOOK_NAME")String BOOK_NAME);

}

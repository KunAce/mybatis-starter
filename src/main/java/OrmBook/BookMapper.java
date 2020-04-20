package OrmBook;

public interface BookMapper {
    Book getBookById(Integer id);

    Book getBookById2(Integer id);

    Author getAuthorById(Integer id);
}

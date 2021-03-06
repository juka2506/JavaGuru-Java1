package students.andrew_galashin.lesson_11.level_3;

import java.util.Objects;

class Book {
    private Long id;
    private String title;
    private String author;
    private String year;

    Book(String author, String title, String year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYear() {
        return this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "[" + id + ", " + author + ", " + title + "]";
    }
}

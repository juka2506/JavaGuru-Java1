package students.julija_katukova.lesson_10.level_5;

import java.util.Arrays;

class FindBookByAuthorTest {

    BookValidator bookValidator = new BookValidator();

    public static void main(String[] args) {
        FindBookByAuthorTest addNewBookTest = new FindBookByAuthorTest();
        addNewBookTest.test1();
        addNewBookTest.test2();
        addNewBookTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("The Brothers Karamazov", "Fyodor Dostoyevsky");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.add(book3);
        Book[] realResult = bookReaderImpl.findBooksByAuthor("Jane Austen");
        check(realResult, new Book[]{book1}, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("The Brothers Karamazov", "Fyodor Dostoyevsky");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.add(book3);
        Book[] realResult = bookReaderImpl.findBooksByAuthor("Fyodor Dostoyevsky");
        check(realResult, new Book[]{book2, book3}, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("The Brothers Karamazov", "Fyodor Dostoyevsky");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        Book book4 = new Book("Demons", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.add(book3);
        bookReaderImpl.add(book4);
        Book[] realResult = bookReaderImpl.findBooksByAuthor("Fyodor Dostoyevsky");
        check(realResult, new Book[]{book2, book3, book4}, "Test3");
    }

    private void check(Book[] realResult, Book[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

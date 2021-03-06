package students.deniss_jankovskis.lesson_11.level_6;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter e-book title: ");
        String bookTitle = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(bookTitle);
        System.out.println(bookList);
    }
}

package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabase;
import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteObjectUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindBookBySearchCriteriaUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new FindUniqueWordsUIAction(bookDatabase));
        menuNumberToActionMap.put(16, new GetAuthorBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(17, new CountAuthorsBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(18, new GetLibraryUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("0. Exit" + ("\n") + "1. Save book" + ("\n") + "2. Find by ID" + ("\n") + "3. Find by author" + ("\n")
                    + "4. Find by title" + ("\n") + "5. Delete by ID" + ("\n") + "6. Delete Object" + ("\n") + "7. Count all saved books" + ("\n")
                    + "8. Delete books by author" + ("\n") + "9. Delete book by title" + ("\n") + "10. Find book by criteria" + ("\n")
                    + "11. Find unique titles" + ("\n") + "12. Find unique authors" + ("\n") + "13. Find unique books" + ("\n")
                    + "14. Contains check" + ("\n") + "15. Find unique words" + ("\n") + "16. Show all authors books" + ("\n") + "17. Count books"
                    + ("\n") + "18. Show all books");
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
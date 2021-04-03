package students.alex_kalashnikov.lesson_10.level_5.task_18;

class BooksRepository implements BookReader {

    private Book[] repository = {};
    private int count;

    public Book[] getRepository() {
        return repository;
    }

    private Book[] createArr(int count) {
        return new Book[count];
    }

    private void save(Book book) {
        count++;
        Book[] arr = createArr(count);
        for (int i = 0; i < repository.length; i++) {
            arr[i] = repository[i];
        }
        repository = arr;
        repository[repository.length - 1] = book;
    }

    private void remove(Book book) {
        count--;
        Book[] arr = createArr(count);
        for (int i = 0; i < repository.length; i++) {
            if (repository[i].equals(book)) {
                repository[i] = null;
            }
        }
        int count1 = 0;
        for (Book value : repository) {
            if (value == null) {
                continue;
            } else {
                arr[count1] = value;
                count1++;
            }
        }
        repository = arr;
    }

    private boolean contains(Book book) {
        for (Book value : repository) {
            if (value.equals(book)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkParameters(Book book) {
        return !book.getName().equals("") && !book.getAuthor().equals("");
    }

    @Override
    public boolean add(Book book) {
        if (contains(book) && checkParameters(book)) {
            save(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (contains(book)) {
            return false;
        } else {
            remove(book);
            return true;
        }
    }

    @Override
    public String[] findAll() {
        String[] arr = new String[repository.length];
        for (int i = 0; i < repository.length; i++) {
            arr[i] = repository[i].getName() + " [" + repository[i].getAuthor() + "]";
        }
        return arr;
    }

    @Override
    public String[] findByAuthor(String author) {
        int counter = 0;
        int counter1 = 0;
        for (Book book : repository) {
            if (book.getAuthor().equals(author)) {
                counter++;
            }
        }
        String[] arr = new String[counter];
        for (Book book : repository) {
            if (book.getAuthor().equals(author)) {
                arr[counter1] = book.getName() + " [" + book.getAuthor() + "]";
                counter1++;
            }
        }
        return arr;
    }

    private String[] splitWords(String searchWord) {
        String lowerCase = searchWord.toLowerCase();
        return lowerCase.split("");
    }

    private boolean compareLetters(String[] searchWord, String[] index) {
        int counter = 0;
        for (int i = 0; i < searchWord.length; i++) {
            if (searchWord.length > index.length) {
                return false;
            } else if (searchWord[i].equals(index[i])) {
                counter++;
            }
        }
        return counter == searchWord.length;
    }

    @Override
    public String[] findByAuthorLetters(String word) {
        int counter = 0;
        int counter1 = 0;
        for (Book book : repository) {
            if (compareLetters(splitWords(word), splitWords(book.getAuthor()))) {
                counter++;
            }
        }
        String[] arr = new String[counter];
        for (Book book : repository) {
            if (compareLetters(splitWords(word), splitWords(book.getAuthor()))) {
                arr[counter1] = book.getName() + " [" + book.getAuthor() + "]";
                counter1++;
            }
        }
        return arr;
    }

}

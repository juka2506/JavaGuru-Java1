package students.alex_kalashnikov.lesson_4.level_6.task_17;

class StockDemo {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);
        google.finalCurrentPrice = google.currentPrice;
        google.minPrice = google.currentPrice;
        google.maxPrice = google.currentPrice;
        String priceInformation = google.getPriceInformation();
        {
            System.out.println(priceInformation);
        }

        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);


        priceInformation = google.getPriceInformation(); {
            System.out.println(priceInformation);
        }
    }

}
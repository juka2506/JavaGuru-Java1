package students.bogdans_pavlovs.lesson_9.level_5;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Jamaica"));
    }

}

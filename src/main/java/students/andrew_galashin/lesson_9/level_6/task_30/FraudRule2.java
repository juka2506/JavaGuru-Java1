package students.andrew_galashin.lesson_9.level_6.task_30;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }

}

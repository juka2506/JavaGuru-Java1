package students.andrew_galashin.lesson_8.task_32;

class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}

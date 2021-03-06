package students.julija_katukova.lesson_9.level_7.task_34;

class EndOfGameDetector {

    public boolean isEndOfTheGame(char[][] field) {
        WinningRule[] winningRules = initializeArray();
        WinningDetector winningDetector = new WinningDetector(winningRules);
        DrawDetector drawDetector = new DrawDetector(winningRules);
        if (winningDetector.isWinForPlayer(field, 'R')) {
            System.out.println("Red player WIN!");
            return true;
        }
        if (winningDetector.isWinForPlayer(field, 'Y')) {
            System.out.println("Yellow player WIN!");
            return true;
        }
        if (drawDetector.isDraw(field)) {
            System.out.println("DRAW!");
            return true;
        }
        return false;
    }

    private WinningRule[] initializeArray() {
        return new WinningRule[]{
                new WinningRuleForVerticals(),
                new WinningRuleForHorizontals(),
                new WinningRuleForDiagonalFromLeftCorner(),
                new WinningRuleForDiagonalFromRightCorner()
        };
    }
}

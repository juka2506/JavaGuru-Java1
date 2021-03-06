package students.andrew_galashin.lesson_13.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {
    @Test
    public void check0LiveNeighbour() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();

        Board board1 = new Board(3, 3);
        board1.ttrue(1, 1);
        game.calculate(board1.getBoard());

        Board board2 = new Board(3, 3);

        Assertions.assertArrayEquals(board1.getBoard(), board2.getBoard());
    }

    @Test
    public void check1LiveNeighbour() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();

        Board board1 = new Board(3, 3);
        board1.ttrue(1, 1);
        board1.ttrue(1, 2);
        game.calculate(board1.getBoard());

        Board board2 = new Board(3, 3);

        Assertions.assertArrayEquals(board1.getBoard(), board2.getBoard());
    }

    @Test
    public void checkDiesMoreThanThreeNeighbours() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
        Board board1 = new Board(3, 3);
        board1.ttrue(1, 1);
        board1.ttrue(1, 2);
        board1.ttrue(1, 0);
        board1.ttrue(0, 2);
        board1.ttrue(2, 1);
        game.calculate(board1.getBoard());

        Board board2 = new Board(3, 3);
        board2.ttrue(1, 2);
        board2.ttrue(1, 0);
        board2.ttrue(0, 2);
        board2.ttrue(2, 1);

        Assertions.assertArrayEquals(board1.getBoard(), board2.getBoard());
    }

    @Test
    public void checkLivesWithTwoNeighbours() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();

        Board board1 = new Board(3, 3);
        board1.ttrue(0, 0);
        board1.ttrue(0, 1);
        board1.ttrue(1, 0);
        board1.ttrue(2, 2);
        game.calculate(board1.getBoard());

        Board board2 = new Board(3, 3);
        board2.ttrue(0, 0);
        board2.ttrue(0, 1);
        board2.ttrue(1, 0);

        Assertions.assertArrayEquals(board1.getBoard(), board2.getBoard());
    }

    @Test
    public void checkLivesWithThreeNeighbours() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();

        Board board1 = new Board(2, 2);
        board1.ttrue(0, 0);
        board1.ttrue(0, 1);
        board1.ttrue(1, 0);
        board1.ttrue(1, 1);
        game.calculate(board1.getBoard());

        Board board2 = new Board(2, 2);
        board2.ttrue(0, 0);
        board2.ttrue(0, 1);
        board2.ttrue(1, 0);
        board2.ttrue(1, 1);

        Assertions.assertArrayEquals(board1.getBoard(), board2.getBoard());
    }

    @Test
    public void checkResurrectWithThreeNeighbours() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();

        Board board1 = new Board(2, 2);
        board1.ttrue(0, 0);
        board1.ttrue(0, 1);
        board1.ttrue(1, 0);
        game.calculate(board1.getBoard());

        Board board2 = new Board(2, 2);
        board2.ttrue(0, 0);
        board2.ttrue(0, 1);
        board2.ttrue(1, 0);
        board2.ttrue(1, 1);

        Assertions.assertArrayEquals(board1.getBoard(), board2.getBoard());
    }

}
package cn.tangyancode.ego.sudoku;

import cn.tangyancode.ego.sudoku.helper.ConsolePrinter;
import cn.tangyancode.ego.sudoku.helper.InputDriver;
import cn.tangyancode.ego.sudoku.player.SudokuPlayer;
import cn.tangyancode.ego.sudoku.exception.NoAnswerException;
import cn.tangyancode.ego.sudoku.exception.ValidFailException;

public class Main {

    public static void main(String[] args) {
        Integer[][] map = InputDriver.readMap();
        SudokuPlayer player = new SudokuPlayer(map);
        Integer[][] result;
        try {
            result = player.play();
            ConsolePrinter.printMap(result);
        } catch (NoAnswerException e) {
            System.out.println("没有答案");
        } catch (ValidFailException e) {
            System.out.println("输入不合法");
        }
    }
}

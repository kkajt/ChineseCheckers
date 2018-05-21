package pl.kkorzycki.chinesecheckers.Client.GraphicBoard;

import pl.kkorzycki.chinesecheckers.Client.GraphicField;

/**
 * Is pattern to every new type of board.
 */
public interface GraphicBoardPattern {

    /**
     * returns array representation of board.
     * @return array representation of board.
     */
    GraphicField[][] getBoard();
}

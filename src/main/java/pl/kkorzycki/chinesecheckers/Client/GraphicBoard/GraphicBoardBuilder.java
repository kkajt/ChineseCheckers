package pl.kkorzycki.chinesecheckers.Client.GraphicBoard;

import pl.kkorzycki.chinesecheckers.Client.GraphicField;

/**
 *  Is common interface to all concrete builders.
 */
public interface GraphicBoardBuilder {

    GraphicField[][] getBoard();

    void fillBoardWithNulls ();

    void buildBoard();

    void setPawnsForPlayers();

}

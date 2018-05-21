package pl.kkorzycki.chinesecheckers.Client.GraphicBoard;

import pl.kkorzycki.chinesecheckers.Client.GraphicField;

/**
 * Assembles board.
 */
public class GraphicBoardAssembler {

    public  GraphicBoardAssembler () {

    }

    public GraphicField[][] getBoard (GraphicBoardBuilder graphicBoardBuilder) {
        graphicBoardBuilder.fillBoardWithNulls();
        graphicBoardBuilder.buildBoard();
        graphicBoardBuilder.setPawnsForPlayers();
        return graphicBoardBuilder.getBoard();
    }
}

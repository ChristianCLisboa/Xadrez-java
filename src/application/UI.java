package application;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces){
        for(int i = 0; i < pieces.length; i ++){
            System.out.printf((8 - i) + "" );
            for (int j = 0 ; j <pieces.length; i++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    public static void printPiece(ChessPiece piece){
        if(piece ==null){
            System.out.printf("-");
        }else {
            System.out.print("piece");
        }
        System.out.printf(" ");
    }

}

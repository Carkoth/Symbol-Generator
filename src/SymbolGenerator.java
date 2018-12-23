import java.util.LinkedList;

public class SymbolGenerator {

    public static void main(String args[]) {

        final int scale = 10;
        StdDraw.setCanvasSize(103 * scale, 100 * scale);
        /*StdDraw.setXscale(0.1, 0.2);
        StdDraw.setYscale(0.1, 0.2);*/
        LinkedList<Symbol> symbolList = new LinkedList<>();
        int symbolOrder = 1;
        //int x = -51;
        //int y = 49;
        int x = 0;
        int y = 0;
        //Cycles through all the characters
        //TODO Check symbols
        for (int firstChar = 1; firstChar <= 15; firstChar++) {

            Symbol newSymbol = new Symbol();
            newSymbol.addCharacter(firstChar, 0);
            for (int secondChar = firstChar + 1; secondChar <= 16; secondChar++) {

                newSymbol.addCharacter(secondChar, 1);
                for (int thirdChar = secondChar + 1; thirdChar <= 17; thirdChar++) {

                    newSymbol.addCharacter(thirdChar, 2);
                    for (int fourthChar = thirdChar + 1; fourthChar <= 18; fourthChar++) {

                        newSymbol.addCharacter(fourthChar, 3);
                        if (x >= 51 * scale) {

                            x = -51 * scale;
                            y -= 5 * scale;

                        }
                        newSymbol.drawSymbol(x, y, symbolOrder);
                        x += 3 * scale;
                        symbolOrder++;

                    }

                }

            }

        }

    }

}

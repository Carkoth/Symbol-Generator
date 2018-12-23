import java.util.LinkedList;

public class Symbol {

    //Line IDs all compressed into one string
    private String lineIDs;
    private boolean[] lines = new boolean[20];
    private int[] charIDs = new int[4];
    //Cycles through the symbol linked list rotating and flipping the current symbol looking for duplicates TODO
    public boolean checkForDuplicates(LinkedList checkingList) {

        return false;

    }
    //Adds a character to the current symbol
    void addCharacter(int characterToAdd, int charPosition) {

        //Checks for conflicts between sub-characters
        for (int i = 0; i < 4; i++) {

            if (((characterToAdd == 7 || characterToAdd == 8 || characterToAdd == 9 || characterToAdd == 10) && (charIDs[i] == 5 || charIDs[i] == 6)) || ((characterToAdd == 15 || characterToAdd == 16 || characterToAdd == 17 || characterToAdd == 18) && (charIDs[i] == 7 || charIDs[i] == 8 || charIDs[i] == 9 || charIDs[i] == 10))) return;

        }
        //If the character to add is 7, 8, 9, or 10, adjust the 1, 2, 3, 4 characters appropriately
        if (characterToAdd == 7 || characterToAdd == 8 || characterToAdd == 9 || characterToAdd == 10) {

            for (int i = 0; i < 4; i++) {

                switch (charIDs[i]) {

                    case 1:

                        lines[1] = false;
                        lines[5] = true;
                        break;

                    case 2:

                        lines[19] = false;
                        lines[15] = true;
                        break;

                    case 3:

                        lines[9] = false;
                        lines[5] = true;
                        break;

                    case 4:

                        lines[11] = false;
                        lines[15] = true;
                        break;

                }

            }

        }
        //If the character to add is 7 or 8, adjust the 11 and 12 characters appropriately
        if (characterToAdd == 7 || characterToAdd == 8) {

            for (int i = 0; i < 4; i++) {

                switch (charIDs[i]) {

                    case 11:

                        lines[4] = false;
                        lines[8] = true;
                        break;

                    case 12:

                        lines[16] = false;
                        lines[12] = true;
                        break;

                }

            }

        }
        //If the character to add is 9 or 10, adjust the 13 and 14 characters appropriately
        if (characterToAdd == 9 || characterToAdd == 10) {

            for (int i = 0; i < 4; i++) {

                switch (charIDs[i]) {

                    case 13:

                        lines[6] = false;
                        lines[2] = true;
                        break;

                    case 14:

                        lines[14] = false;
                        lines[18] = true;
                        break;

                }

            }

        }
        //Add the lines for the character
        switch (characterToAdd) {

            case 1:

                lines[0] = true;
                lines[1] = true;
                lines[10] = true;
                break;

            case 2:

                lines[0] = true;
                lines[10] = true;
                lines[19] = true;
                break;

            case 3:

                lines[0] = true;
                lines[7] = true;
                lines[10] = true;
                break;

            case 4:

                lines[0] = true;
                lines[10] = true;
                lines[11] = true;
                break;

            case 5:

                lines[0] = true;
                lines[5] = true;
                lines[10] = true;
                break;

            case 6:

                lines[0] = true;
                lines[10] = true;
                lines[15] = true;
                break;

            case 7:

                lines[2] = true;
                lines[10] = true;
                lines[0] = false;
                break;

            case 8:

                lines[10] = true;
                lines[18] = true;
                lines[0] = false;
                break;

            case 9:

                lines[0] = true;
                lines[8] = true;
                lines[10] = false;
                break;

            case 10:

                lines[0] = true;
                lines[12] = true;
                lines[10] = false;
                break;

            case 11:

                lines[0] = true;
                lines[4] = true;
                lines[10] = true;
                break;

            case 12:

                lines[0] = true;
                lines[10] = true;
                lines[16] = true;
                break;

            case 13:

                lines[0] = true;
                lines[6] = true;
                lines[10] = true;
                break;

            case 14:

                lines[0] = true;
                lines[10] = true;
                lines[14] = true;
                break;

            case 15:

                lines[0] = true;
                lines[2] = true;
                lines[10] = true;
                break;

            case 16:

                lines[0] = true;
                lines[10] = true;
                lines[18] = true;
                break;

            case 17:

                lines[0] = true;
                lines[8] = true;
                lines[10] = true;
                break;

            case 18:

                lines[0] = true;
                lines[10] = true;
                lines[12] = true;
                break;

        }
        charIDs[charPosition] = characterToAdd;

    }
    //Return a version of the symbol flipped 90 degrees clockwise
    private Symbol rotate90Clockwise() {

        Symbol rotatedSymbol = new Symbol();
        for (int i = 0; i < 20; i++) {

            if (lines[i]) {

                if (i == 0 || i == 5 || i == 10 || i == 15) {

                    if (i == 15) rotatedSymbol.lines[0] = true;
                    else rotatedSymbol.lines[i + 5] = true;

                }
                switch (i) {

                    case 1:

                        rotatedSymbol.lines[7] = true;
                        break;

                    case 2:

                        rotatedSymbol.lines[8] = true;
                        break;

                    case 3:

                        rotatedSymbol.lines[9] = true;
                        break;

                    case 4:

                        rotatedSymbol.lines[6] = true;
                        break;

                    case 6:

                        rotatedSymbol.lines[14] = true;
                        break;

                    case 7:

                        rotatedSymbol.lines[11] = true;
                        break;

                    case 8:

                        rotatedSymbol.lines[12] = true;
                        break;

                    case 9:

                        rotatedSymbol.lines[13] = true;
                        break;

                    case 11:

                        rotatedSymbol.lines[17] = true;
                        break;

                    case 12:

                        rotatedSymbol.lines[18] = true;
                        break;

                    case 13:

                        rotatedSymbol.lines[19] = true;
                        break;

                    case 14:

                        rotatedSymbol.lines[16] = true;
                        break;

                    case 16:

                        rotatedSymbol.lines[4] = true;
                        break;

                    case 17:

                        rotatedSymbol.lines[1] = true;
                        break;

                    case 18:

                        rotatedSymbol.lines[2] = true;
                        break;

                    case 19:

                        rotatedSymbol.lines[3] = true;
                        break;

                }

            }

        }
        return rotatedSymbol;

    }
    //Return a version of the symbol flipped along the y-axis
    private Symbol flipVertical() {

        Symbol flippedSymbol = new Symbol();
        for (int i = 0; i < 20; i++) {

            if (lines[i]) {

                if (i == 0) flippedSymbol.lines[0] = true;
                flippedSymbol.lines[20 - i] = true;

            }

        }
        return flippedSymbol;

    }
    //Draw the symbol on the grid TODO
    public void drawSymbol(int x, int y, int symbolOrder) {

        final int scale = 10;
        for (int i = 0; i < 20; i++) {

            if (lines[i]) {

                switch (i) {

                    case 0:

                        StdDraw.line(x, y, x, y + scale);
                        break;

                    case 1:

                        StdDraw.line(x, y + scale, x + scale, y + scale);
                        break;

                    case 2:

                        StdDraw.line(x, y, x + scale, y + scale);
                        break;

                    case 3:

                        StdDraw.line(x + scale, y, x + scale, y + scale);
                        break;

                    case 4:

                        StdDraw.line(x, y + scale, x + scale, y);
                        break;

                    case 5:

                        StdDraw.line(x, y, x + scale, y);
                        break;

                    case 6:

                        StdDraw.line(x, y - scale, x + scale, y);
                        break;

                    case 7:

                        StdDraw.line(x, y, x + scale, y - scale);
                        break;

                    case 8:

                        StdDraw.line(x, y, x + scale, y - scale);
                        break;

                    case 9:

                        StdDraw.line(x, y - scale, x + scale, y - scale);
                        break;

                    case 10:

                        StdDraw.line(x, y, x, y - scale);
                        break;

                    case 11:

                        StdDraw.line(x, y - scale, x - scale, y - scale);
                        break;

                    case 12:

                        StdDraw.line(x, y, x - scale, y - scale);
                        break;

                    case 13:

                        StdDraw.line(x - scale, y, x - scale, y - scale);
                        break;

                    case 14:

                        StdDraw.line(x, y - scale, x - scale, y);
                        break;

                    case 15:

                        StdDraw.line(x, y, x - scale, y);
                        break;

                    case 16:

                        StdDraw.line(x, y + scale, x - scale, y);
                        break;

                    case 17:

                        StdDraw.line(x - scale, y, x - scale, y + scale);
                        break;

                    case 18:

                        StdDraw.line(x, y, x - scale, y + scale);
                        break;

                    case 19:

                        StdDraw.line(x, y + scale, x - scale, y + scale);
                        break;

                }

            }

        }
        StdDraw.text(x, y - 3, Integer.toString(symbolOrder));

    }
    //Creates the line IDs using lines[]
    public void createLineID() {

        for (int i = 0; i < 20; i++) {

            if (lines[i]) lineIDs = lineIDs + i;

        }

    }

}
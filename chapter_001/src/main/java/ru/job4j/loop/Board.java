package ru.job4j.loop;

/**
 * Board.
 *
 * @author Anton Frolov (spitfires111@gmail.com)
 * @version $Id$
 * @since 19.02.19
 */


public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; int i <=height;
        i++){
            for (int j = 0; int j <=width;
            j++){
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
package ru.job4j.loop;

/**
 * Board.
 *
 * @author Anton Frolov (spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */


public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (width = 0; width <= 5;
             width++) {
            for (height = 0; height <= 4;
                 height++) {
                if (width + height % 2 == 0) {
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
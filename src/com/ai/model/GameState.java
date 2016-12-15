package com.ai.model;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by z on 12/2/16.
 */
public class GameState {
    public int[][] tileValues = new int[4][4];

    public GameState(GameState src) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.tileValues[i][j] = src.tileValues[i][j];
            }
        }
    }

    public GameState(String concatenatedTileValues) {
        String[] vals = concatenatedTileValues.split(" ");
        if (vals.length != 16) {
            throw new RuntimeException("Constructor parameter for Game State must have all 16 tile values");
        }
        for (int i = 0; i < vals.length; i++) {
            int x = i / 4;
            int y = i % 4;
            int value = Integer.parseInt(vals[i]);
            tileValues[x][y] = value;
        }
    }
}

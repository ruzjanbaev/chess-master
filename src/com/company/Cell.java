package com.company;

import java.util.HashSet;
import java.util.Objects;

public class Cell {
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Cell(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        if (this.x==cell.x && this.y==cell.y) {
            return true;
        }
        return false;
    }
}

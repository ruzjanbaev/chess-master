package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = find_distance(-2,-2);
        System.out.println(x);
    }

    public static int find_distance(int target_x, int target_y) {
        int layer_number = 0;
        Cell targetCell = new Cell(target_x, target_y);
        Set previous_layer = new HashSet<>();
        Set current_layer = new HashSet<>();
        current_layer.add(new Cell(0,0));
        while (!current_layer.contains(targetCell)) {
            Set next_layer = new HashSet();
            for (Object c: current_layer)
            {
                Set nextCells = moves((Cell) c);
                for (Object nextCell: nextCells)
                {
                    Cell cc = (Cell) c;
                    if (!previous_layer.contains(nextCell)) {
                        next_layer.add(nextCell);
                        if (cc.equals(targetCell)) {
                            return layer_number;
                        }
                    }
                }
            }
            previous_layer = current_layer;
            current_layer = next_layer;
            layer_number++;
        }
        return layer_number;
    }

    public static Set moves(Cell c) {
       Set moves = new HashSet<>();
       moves.add(new Cell(c.getX()-2, c.getY()+1));
       moves.add(new Cell(c.getX()-2, c.getY()-1));
       moves.add(new Cell(c.getX()-1, c.getY()+2));
       moves.add(new Cell(c.getX()-1, c.getY()-2));
       moves.add(new Cell(c.getX()+1, c.getY()+2));
       moves.add(new Cell(c.getX()+1, c.getY()-2));
       moves.add(new Cell(c.getX()+2, c.getY()+1));
       moves.add(new Cell(c.getX()+2, c.getY()-1));
       return moves;
    }
}

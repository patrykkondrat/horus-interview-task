package org.horus.interview;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Block> wallList = new ArrayList<>();

        wallList.add(new SimpleBlock("red", "wood"));
        wallList.add(new SimpleBlock("blue", "brick"));
        wallList.add(new SimpleBlock("green", "concrete"));
        wallList.add(new SimpleBlock("yellow", "wood"));

        List<Block> complexBlockList = new ArrayList<>();
        complexBlockList.add(new SimpleBlock("red", "concrete"));
        complexBlockList.add(new SimpleBlock("blue", "wood"));
        wallList.add(new ComplexBlock("red", "wood", complexBlockList));

        Wall wall = new Wall(wallList);

        wall.findBlockByColor("red").ifPresent(block -> System.out.println(block.getColor()));

        System.out.println(wall.findBlocksByMaterial("wood"));

        System.out.println(wall.count());
    }
}

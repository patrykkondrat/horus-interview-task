package org.horus.interview;

import java.util.List;

public class ComplexBlock implements CompositeBlock {
    private String color;
    private String material;
    private List<Block> blocks;

    public ComplexBlock(String color, String material, List<Block> blocks) {
        this.color = color;
        this.material = material;
        this.blocks = blocks;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }
}

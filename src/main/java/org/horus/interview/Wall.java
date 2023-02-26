package org.horus.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> result = new ArrayList<>();
        for (Block block : blocks) {
            if (block.getMaterial().equals(material)) {
                result.add(block);
            }
            if (block instanceof CompositeBlock) {
                List<Block> innerBlocks = ((CompositeBlock) block).getBlocks();
                innerBlocks.stream()
                        .filter(inner -> inner.getMaterial().equals(material))
                        .forEach(result::add);
                }
            }
        return result;
    }

    @Override
    public int count() {
        int count = 0;
        for (Block block : blocks) {
            if (block instanceof CompositeBlock) {
                count += ((CompositeBlock) block).getBlocks().size();
            } else {
                count++;
            }
        }
        return count;
    }
}

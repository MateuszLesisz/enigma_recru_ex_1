package com.enigma.ex1.oop.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Slf4j
public non-sealed class DeciduousTree extends Tree {

    private long leaves;

    public DeciduousTree(Trunk trunk, int branch, int height, long leaves) {
        super(trunk, branch, height);
        this.leaves = leaves;
    }

    @Override
    public void grow() {
        log.info("The deciduous tree grows, the number of leaves increases");
        leaves += 2;
    }

    @Override
    public String toString() {
        return String.format("Deciduous tree:\n Trunk: %s\n Height: %dm\n Number of branches: %d\n Number of leaves: %d", trunk.toString(), height, branch, leaves);
    }
}

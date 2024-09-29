package com.enigma.ex1.oop.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = false)
@Slf4j
public non-sealed class ConiferTree extends Tree {

    private long needle;

    public ConiferTree(Trunk trunk, int branch, int height, long needle) {
        super(trunk, branch, height);
        this.needle = needle;
    }

    @Override
    public void grow() {
        log.info("The conifer tree grows, the number of needles increases");
        needle += 2;
    }

    @Override
    public String toString() {
        return String.format("Conifer tree:\n Trunk: %s\n Height: %dm\n Number of branches: %d\n Number of needle: %d", trunk.toString(), height, branch, needle);
    }
}

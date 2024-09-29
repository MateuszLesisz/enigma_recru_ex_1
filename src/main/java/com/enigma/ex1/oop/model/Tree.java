package com.enigma.ex1.oop.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
public abstract sealed class Tree permits DeciduousTree, ConiferTree {

    protected final Trunk trunk;
    protected int branch;
    protected int height;

    public abstract void grow();

}

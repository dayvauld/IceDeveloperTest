package com.iceedge.TreeFramework.Node;

import com.iceedge.TreeFramework.Visitor.NodeVisitor;

/**
 * Created by davidauld on 2017-04-16.
 */
public class IntNode extends Node<Integer> {
    public IntNode(Integer data) {
        super(data);
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return Integer.toString(getData());
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!IntNode.class.isAssignableFrom(other.getClass())) {
            return false;
        }
        final IntNode intNodeOther = (IntNode) other;
        if(this.getData() != intNodeOther.getData()) {
            return false;
        }

        return true;
    }
}

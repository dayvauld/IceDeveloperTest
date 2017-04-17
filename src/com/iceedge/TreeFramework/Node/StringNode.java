package com.iceedge.TreeFramework.Node;

import com.iceedge.TreeFramework.Visitor.NodeVisitor;

/**
 * Created by davidauld on 2017-04-16.
 */
public class StringNode extends Node<String>{
    public StringNode(String data) {
        super(data);
    }

    @Override
    public String toString() {
        return getData();
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!StringNode.class.isAssignableFrom(other.getClass())) {
            return false;
        }
        final StringNode stringNodeOther = (StringNode) other;
        if(this.getData().compareTo(stringNodeOther.getData()) != 0) {
            return false;
        }

        return true;
    }
}

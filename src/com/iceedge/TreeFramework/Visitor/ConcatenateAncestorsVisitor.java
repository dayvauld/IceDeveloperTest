package com.iceedge.TreeFramework.Visitor;

import com.iceedge.TreeFramework.Node.IntNode;
import com.iceedge.TreeFramework.Node.StringNode;

/**
 * Created by davidauld on 2017-04-16.
 */
public class ConcatenateAncestorsVisitor implements NodeVisitor{
    StringBuffer concatenatedAncestors = new StringBuffer();

    @Override
    public void visit(IntNode node) {
        concatenatedAncestors.append(node.toString());
    }

    @Override
    public void visit(StringNode node) {
        concatenatedAncestors.append(node.toString());
    }

    public String getAncestorsString() {
        return concatenatedAncestors.toString();
    }
}

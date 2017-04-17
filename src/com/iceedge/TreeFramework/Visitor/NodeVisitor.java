package com.iceedge.TreeFramework.Visitor;

import com.iceedge.TreeFramework.Node.IntNode;
import com.iceedge.TreeFramework.Node.StringNode;

/**
 * Created by davidauld on 2017-04-16.
 */
public interface NodeVisitor {
    void visit(IntNode node);
    void visit(StringNode node);
}

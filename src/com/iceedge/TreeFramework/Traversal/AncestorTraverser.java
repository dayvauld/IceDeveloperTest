package com.iceedge.TreeFramework.Traversal;

import com.iceedge.TreeFramework.Node.Node;
import com.iceedge.TreeFramework.Visitor.NodeVisitor;

/**
 * Created by davidauld on 2017-04-16.
 */
public class AncestorTraverser extends TreeTraverser {
    @Override
    public void traverseTree(Node node, NodeVisitor nodeVisitor) {
        while(node != null) {
            node.accept(nodeVisitor);
            node = node.getParent();
        }
    }
}

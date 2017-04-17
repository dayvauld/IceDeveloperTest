package com.iceedge.TreeFramework.Traversal;

import com.iceedge.TreeFramework.Node.Node;
import com.iceedge.TreeFramework.Visitor.NodeVisitor;

/**
 * Created by davidauld on 2017-04-16.
 */
public abstract class TreeTraverser  {
    public abstract void traverseTree(Node root, NodeVisitor nodeVisitor);
}

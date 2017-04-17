package com.iceedge.TreeFramework;

import com.iceedge.TreeFramework.Node.Node;
import com.iceedge.TreeFramework.Traversal.TreeTraverser;
import com.iceedge.TreeFramework.Visitor.NodeVisitor;

import java.util.List;

/**
 * Created by davidauld on 2017-04-16.
 */
interface Tree {
    // Will return empty list if node has no children
    public List getChildren(Object node) throws ObjectNotInTreeException;

    // Will return null if node is the root of the tree
    public Object getParent(Object node) throws ObjectNotInTreeException;

    public boolean isInTree(Object node);

    public void walkTreeFromNode(Node node, TreeTraverser treeTraverser, NodeVisitor nodeVisitor);
    // ObjectNotInTreeException is a checked Exception
}



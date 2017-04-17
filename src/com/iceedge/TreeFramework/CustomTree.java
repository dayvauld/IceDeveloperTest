package com.iceedge.TreeFramework;

import com.iceedge.TreeFramework.Node.Node;
import com.iceedge.TreeFramework.Traversal.TreeTraverser;
import com.iceedge.TreeFramework.Visitor.ConcatenateAncestorsVisitor;
import com.iceedge.TreeFramework.Visitor.NodeVisitor;
import com.iceedge.TreeFramework.Visitor.StringNodeVisitor;

import java.util.List;

/**
 * Created by davidauld on 2017-04-16.
 */
public class CustomTree implements Tree {
    private TreeTraverser treeTraverser;
    private NodeVisitor nodeVisitor;
    private Node root;

    public CustomTree() {
        this.root = null;
    }

    /**
     * Adds the tree root Node
     * @param node The root of tree
     */
    public void addRoot(Node node) {
        if (root == null) {
            root = node;
        }
    }

    /**
     * Returns the tree root
     * @return The root of tree
     */
    public Node getRoot() {
        return this.root;
    }

    /**
     * Returns the immediate children of the given Node as a List
     * @param node The Node to get the children of.
     * @return The children of the given Node
     */
    @Override
    public List getChildren(Object node) throws ObjectNotInTreeException {
        if(isInTree(node)) {
            return ((Node) node).getChildren();
        } else {
            throw new ObjectNotInTreeException();
        }
    }

    /**
     * Returns the parent of the given Node as an Object
     * @param node The Node to get the parent of
     * @return The parent object
     */
    @Override
    public Object getParent(Object node) throws ObjectNotInTreeException {
        if(isInTree(node)) {
            return ((Node) node).getParent();
        } else {
            throw new ObjectNotInTreeException();
        }
    }

    /**
     * Returns boolean of whether given Node is present in tree
     * @param node The node to find in tree
     * @return The boolean value of whether the Node is found or not
     */
    @Override
    public boolean isInTree(Object node) {
        if(findNode(root, (Node) node) != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Simple DFS for searching through tree using recursion
     * @param n Starting Node for DFS search. Typically root Node.
     * @param target The target Node for searching
     * @return The matching node in tree. Will be null if Node is not found in search.
     */
    public Node findNode(Node n, Node target) {
        if (n.equals(target)) {
            return n;
        } else {
            for (Object child: n.getChildren()) {
                Node result = findNode((Node)child, target);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * Will walk tree in a customizable way and allow a customizable operation be performed on each Node as it's visited.
     * @param node The starting Node of the walk operation.
     * @param treeTraverser A customizable traversal for walking tree.
     * @param nodeVisitor The NodeVisitor to use for visiting nodes and performing arbitrary operations on them
     */
    @Override
    public void walkTreeFromNode(Node node, TreeTraverser treeTraverser, NodeVisitor nodeVisitor) {
        if(node != null) {
            treeTraverser.traverseTree((Node) node, nodeVisitor);
        }
    }
}

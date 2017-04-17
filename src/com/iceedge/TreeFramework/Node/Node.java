package com.iceedge.TreeFramework.Node;

import com.iceedge.TreeFramework.Visitor.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidauld on 2017-04-16.
 */
public abstract class Node<T> {
    private T data;
    private Node<T> parent;
    private List<Node<T>> children;

    public Node(T data) {
        this.data = data;
    }

    public void addChild(Node<T> child) {
        if (children == null) {
            this.children = new ArrayList<Node<T>>();
        }
        child.setParent(this);
        this.children.add(child);
    }

    public List<Node<T>> getChildren() {
        if (this.children == null) {
            return new ArrayList();
        }
        return this.children;
    }

    public Node<T> getParent() {
        return this.parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public abstract void accept(NodeVisitor v);

    public abstract String toString();
}


package com.iceedge.TreeFramework.Traversal;

import com.iceedge.TreeFramework.Node.Node;
import com.iceedge.TreeFramework.Visitor.NodeVisitor;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by davidauld on 2017-04-16.
 */
public class BreadthFirstSearch extends TreeTraverser {
    Queue<Node> queue = new LinkedList<>() ;

    @Override
    public void traverseTree(Node root, NodeVisitor visitor) {
        if (root == null)
            return;
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            node.accept(visitor);
            for (Object child: node.getChildren()) {
                queue.add((Node)child);
            }
        }

    }
}

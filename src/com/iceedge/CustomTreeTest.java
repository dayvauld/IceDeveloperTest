package com.iceedge;

import com.iceedge.TreeFramework.CustomTree;
import com.iceedge.TreeFramework.Node.IntNode;
import com.iceedge.TreeFramework.Node.Node;
import com.iceedge.TreeFramework.Node.StringNode;
import com.iceedge.TreeFramework.Traversal.AncestorTraverser;
import com.iceedge.TreeFramework.Traversal.BreadthFirstSearch;
import com.iceedge.TreeFramework.Visitor.ConcatenateAncestorsVisitor;
import com.iceedge.TreeFramework.Visitor.StringNodeVisitor;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by davidauld on 2017-04-16.
 */
public class CustomTreeTest {
    CustomTree tree = new CustomTree();

    @org.junit.Before
    public void setUp() throws Exception {
        Node root = new StringNode("root");
        Node hello = new StringNode("hello");
        Node world = new StringNode("world");
        hello.addChild(world);
        root.addChild(hello);
        Node one = new IntNode(1);
        Node two = new IntNode(2);
        Node three = new IntNode(3);
        one.addChild(two);
        one.addChild(three);
        root.addChild(one);

        tree.addRoot(root);
    }


    @org.junit.Test
    public void walkTreeFromNode() throws Exception {
        //Test Case for Assignment Question B
        List<Node> childList = new ArrayList<>();
        childList.add(new StringNode("root"));
        childList.add(new StringNode("hello"));
        childList.add(new StringNode("world"));

        StringNodeVisitor stringNodeVisitor = new StringNodeVisitor();
        tree.walkTreeFromNode(tree.getRoot(), new BreadthFirstSearch(), stringNodeVisitor);
        List<Node> descendents = stringNodeVisitor.getStringNodeList();
        Assert.assertEquals(childList, descendents);

        //Test Case for Assignment Question C
        ConcatenateAncestorsVisitor ancestorsVisitor = new ConcatenateAncestorsVisitor();
        tree.walkTreeFromNode(tree.findNode(tree.getRoot(),new IntNode(2)), new AncestorTraverser(), ancestorsVisitor);
        Assert.assertEquals("21root", ancestorsVisitor.getAncestorsString());
    }

}
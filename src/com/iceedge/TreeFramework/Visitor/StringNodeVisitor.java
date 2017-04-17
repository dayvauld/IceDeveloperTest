package com.iceedge.TreeFramework.Visitor;

import com.iceedge.TreeFramework.Node.IntNode;
import com.iceedge.TreeFramework.Node.StringNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidauld on 2017-04-16.
 */
public class StringNodeVisitor implements NodeVisitor {
    List<StringNode> stringNodeList = new ArrayList<>();

    @Override
    public void visit(IntNode node) {
        //do nothing
    }

    @Override
    public void visit(StringNode node) {
        stringNodeList.add(node);
    }

    public List getStringNodeList() {
        return stringNodeList;
    }
}

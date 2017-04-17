# Ice Software Developer Test

A simple yet flexible framework for walking the tree in an arbitrary manner, and if an arbitrary condition holds on the Objects visited, performs an arbitrary action on that Object.


Arbitrary traversal and visitor types
------
This framework is built using the ideas presented around Visitor and Iterator design patterns defined in "Design Patterns: Elements of Reusable Object-Oriented Software". 

Traversal types are added in the 'Traversal' package and must implement the TreeTraverser abstract class.

Visitors can be used to visit nodes, check conditions on the nodes and if desired, perform actions on the nodes. They are defined within the Visitor package and must implement the NodeVisitor interface.

Additional node types can be added to the Node class and must extend the abstract Node class.

Usage
------
Use or extend the CustomTree class. Call the walkTreeFromNode(...) method with the respective arguments of your choice to traverse and operate on the tree in an arbitrary way.



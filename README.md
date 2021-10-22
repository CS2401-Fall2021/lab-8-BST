# lab 8: Binary Search-ish tree
## Background
At Not-Perfect-But-Good-Enough, you create products that mostly fit the standard description. But we all make mistakes, and at Not-Perfect-But-Good-Enough, most of the things we create have a flaw or two. 

Today the production line is making binary search trees(BST)! But maybe we're not as careful when placing the elements as we'd like. 

Your job is the tree inspector. You want to enforce the following

* You can allow *m* mistakes in a BST, but no more! Remember, BSTs have every node's left value less than or equal to the node's value, and the right value greater than or equal to. A mistake is if this is not the case.

* Sometimes we get trees that look less like actual trees and more like linked lists. That's not great either! If our maximum tree depth in a tree that holds n items is more than k*log(n), we didn't do a good enough job and need to toss out that tree.

## Node Class
We start each tree at a Node root. Node is defined in Node.java. While you may add fields, you cannot remove them or change the exisiting constructor if you wish the autograder to work properly.

## Part 1: Number of Mistakes in a BST
In Main.java implement numTreeMistakes(Node root), which counts how many mistakes appear in a tree that keep it from being a true BST. BSTs have every node's left value less than or equal to the node's value, and the right value greater than or equal to. A mistake is if this is not the case. If your root is null, we have no mistakes to report.

## Part 2: Max depth
In Main.java implement ma(Node root). However we don't want to count duplicates! If we have the following tree:
 >       A
 >      / \
 >     A   A

It's depth is only going to be 1.
 >       A
 >      / \
 >     A   A
 >        / \
 >       B   C

Would have depth 2.
## Part 3: Number of unique items (assuming we have a valid BST)
In Main.java implement treeDepth(Node root). However we don't want to count duplicates! If we have the following tree:
 >       A
 >      / \
 >     A   A

Will have only 1 unique item.
 >       A
 >      / \
 >     A   A
 >        / \
 >       B   B

Would have 3 unique items, even though B is present twice, since it is not identical to it's parent, it counts a being 'unique' both times.

## Part 4: ShouldKeepTree
In Main.java implement keepTree(Node root, int maxMistakes, double logFactor). It should return true only if both are true:
* Number of Mistakes is less than or equal to maxMistakes
* MaxDepth is less than logFactor * Number of unique items

## Part 5: Tests
Let's make sure our methods 1-4 work! Remember to include
* Input
* Desired Output
* Actual Output
* What we are testing

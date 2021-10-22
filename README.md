# lab 8: Binary Search-ish tree
## Background
At Not-Perfect-But-Good-Enough, you create products that mostly fit the standard description. But we all make mistakes, and at Not-Perfect-But-Good-Enough, most of the things we create have a flaw or two. 

Today the production line is making binary search trees(BST)! But maybe we're not as careful when placing the elements as we'd like. 

Your job is the tree inspector. You want to enforce the following

* You can allow *m* mistakes in a BST, but no more! Remember, BSTs have every node's left value less than or equal to the node's value, and the right value greater than or equal to. A mistake is if this is not the case.

Furthermore, sometimes we get trees that look less like actual trees and more like linked lists. That's not great either! If our maximum tree depth in a tree that holds n items is more than 2*log(n), we didn't do a good enough job and need to toss out that tree.

## Node Class
We start each tree at a Node root. Node is defined in Node.java. While you may add fields, you cannot remove them if you wish the autograder to work properly.

## Part 1: Number of Mistakes in a BST

## Part 2: Number of items in a BST

## Part 3: Max Depth of BST

## Part 4: ShouldKeepTree

## Part 5: Tests

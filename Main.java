public class Main {
  public static void main(String[] args) {
    String treeString="D(D(C)(A))(D(E))";
    Node root = TreeParser.treeFromString(treeString,0,treeString.length()-1);
    System.out.println("Mistakes should be 2, but is:"+numTreeMistakes(root));
    System.out.println("Depth should be 2, but is:"+treeDepth(root));
    System.out.println("Items should be 4, but is:"+treeItems(root));
    System.out.println("KeepTree should be true, but is:"+keepTree(root,2,4));
  }

  // Part 1: Calculate number of mistakes in a tree that starts at root. 
  public static int numTreeMistakes(Node root){
    if(root==null){return 0;}
    int numMistakes =  numTreeMistakes(root.left)+numTreeMistakes(root.right);
    if(root.left!= null && root.left.data>root.data){
      numMistakes++;
    }
    if(root.right!=null && root.right.data<root.data){
      numMistakes++;
    }
    return numMistakes;
  }

  // Part 2: Calculate the maximum depth of the tree
  public static int treeDepth(Node root){
    if(root==null){return 0;}
    int left= treeDepth(root.left);
    int right =treeDepth(root.right);
    if(root.left==null || root.left.data!=root.data){
      left++;
    }
    if(root.right==null|| root.right.data!=root.data){
      right++;
    }
    return Math.max(left,right);
  }
  // Part 3: Calculate the number of unique values in the tree
  public static int treeItems(Node root){
    if(root==null){return 0;}
    int left= treeItems(root.left);
    int right =treeItems(root.right);
    if(root.left!=null&& root.left.data==root.data){
      left--;
    }
    if(root.right!=null&& root.right.data==root.data){
      right--;
    }
    return 1+left+right;
  }
  // Part 4: Quality control! Combine parts 1-3 to see if we can keep the tree
  public static boolean keepTree(Node root, int maxMistakes, double logFactor){
    return numTreeMistakes(root)<=maxMistakes && treeDepth(root)<logFactor*Math.log(treeItems(root));
  }
}
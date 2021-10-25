import java.util.Stack;

public class TreeParser {
    // function to return the index of close parenthesis
 public  static int findIndex(String str, int si, int ei)
  {
    if (si > ei)
      return -1;
 
    // Inbuilt stack
    Stack<Character> s = new Stack<>();
    for (int i = si; i <= ei; i++)
    {
 
      // if open parenthesis, push it
      if (str.charAt(i) == '(')
        s.add(str.charAt(i));
 
      // if close parenthesis
      else if (str.charAt(i) == ')')
      {
        if (s.peek() == '(')
        {
          s.pop();
 
          // if stack is empty, this is
          // the required index
          if (s.isEmpty())
            return i;
        }
      }
    }
 
    // if not found return -1
    return -1;
  }
 
  // function to contree from String
 public static Node treeFromString(String str, int si, int ei){
 
    // Base case
    if (si > ei)
      return null;
 
    // new root
    Node root = new Node(String.valueOf(str.charAt(si)));
    int index = -1;
 
    // if next char is '(' find the index of
    // its complement ')'
    if (si + 1 <= ei && str.charAt(si+1) == '(')
      index = findIndex(str, si + 1, ei);
 
    // if index found
    if (index != -1)
    {
 
      // call for left subtree
      root.left = treeFromString(str, si + 2, index - 1);
 
      // call for right subtree
      root.right
        = treeFromString(str, index + 2, ei - 1);
    }
    return root;
  }
}

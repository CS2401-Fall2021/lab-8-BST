public class Node {
    public char data;
    public Node left, right;
 
  public  Node(char data){
    this.data = data;
  }
    
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + this.data);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    else if(right != null) System.out.println(prefix + "\u251C " + "\u2400");
    if(right != null) right.print(prefix + "\u2514 ");
    else if(left != null) System.out.println(prefix + "\u2514 " + "\u2400");
  }
 
}

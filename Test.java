import java.util.Arrays;
import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs = line.split("-");
    int[] array;
    Node root = TreeParser.treeFromString(inputs[1], 0 ,inputs[1].length());
    if(inputs[1].equals("null")){root=null;}
    if (inputs[0].equals("err")) {
      System.out.println("err:" + Main.numTreeMistakes(root));
    }
    if (inputs[0].equals("depth")) {
      System.out.println("depth:" + Main.treeDepth(root));
    }
    if (inputs[0].equals("items")) {
      System.out.println("items:" + Main.treeItems(root));
    }
    if (inputs[0].equals("keep")) {
      System.out.println("keep:" + Main
          .keepTree(root, Integer.parseInt(inputs[2]),
              Double.parseDouble(inputs[3])));
    }
  }
}


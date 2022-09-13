import java.util.*;

class Program {
  public static boolean validateBst(BST tree) {
    // Write your code here.
    
    return isValid (tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public static boolean isValid( BST tree, int min, int max) {
    if(tree == null) return true;

    if(tree.value < min || tree.value >= max) return false;
    return isValid(tree.left, min, tree.value) && isValid (tree.right, tree.value, max);
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}

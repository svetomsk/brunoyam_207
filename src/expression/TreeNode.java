package expression;

public class TreeNode {
    String value;
    TreeNode left;
    TreeNode right;

    public static int walk(TreeNode node) {
        System.out.println("Enter " + node.value);
        System.out.println(node.value);
        int a = 0;
        int b = 0;
        if (node.left != null) {
            a = walk(node.left);
            System.out.println("Back to " + node.value);
        }
        if (node.right != null) {
            b = walk(node.right);
            System.out.println("Back to " + node.value);
        }

        try {
            int value = Integer.valueOf(node.value);
            return value;
        } catch (NumberFormatException exc) {
            System.out.println("Operation");
        }
        System.out.println("Exit " + node.value);
        if (node.value.equalsIgnoreCase("*")) {
            return a * b;
        } else if (node.value.equalsIgnoreCase("+")) {
            return a + b;
        } else{
            return 0;
        }
    }
}

class Test {
    public static void main(String[] args) {
        TreeNode mul = new TreeNode();
        mul.value = "+";
        TreeNode three = new TreeNode();
        three.value = "3";
        TreeNode four = new TreeNode();
        four.value = "4";
        mul.left = three;
        mul.right = four;

        System.out.println(TreeNode.walk(mul));
    }
}

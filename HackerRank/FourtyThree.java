package HackerRank;
    import java.util.ArrayList;
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;
    
    import java.util.ArrayList;
    import java.util.Scanner;
    
    enum Color {
        RED, GREEN
    }
    
    abstract class Tree {
    
        private int value;
        private Color color;
        private int depth;
    
        public Tree(int value, Color color, int depth) {
            this.value = value;
            this.color = color;
            this.depth = depth;
        }
    
        public int getValue() {
            return value;
        }
    
        public Color getColor() {
            return color;
        }
    
        public int getDepth() {
            return depth;
        }
    
        public abstract void accept(TreeVis visitor);
    }
    
    class TreeNode extends Tree {
    
        private ArrayList<Tree> children = new ArrayList<>();
    
        public TreeNode(int value, Color color, int depth) {
            super(value, color, depth);
        }
    
        public void accept(TreeVis visitor) {
            visitor.visitNode(this);
    
            for (Tree child : children) {
                child.accept(visitor);
            }
        }
    
        public void addChild(Tree child) {
            children.add(child);
        }
    }
    
    class TreeLeaf extends Tree {
    
        public TreeLeaf(int value, Color color, int depth) {
            super(value, color, depth);
        }
    
        public void accept(TreeVis visitor) {
            visitor.visitLeaf(this);
        }
    }
    
    abstract class TreeVis
    {
        public abstract int getResult();
        public abstract void visitNode(TreeNode node);
        public abstract void visitLeaf(TreeLeaf leaf);
    
    }
    
    class SumInLeavesVisitor extends TreeVis {
        private int sum = 0;
        public int getResult() {
            //implement this
            return sum;
        }
    
        public void visitNode(TreeNode node) {
            //implement this
        }
    
        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            sum += leaf.getValue();
        }
    }
    
    class ProductOfRedNodesVisitor extends TreeVis {
        private long product = 1;
        private final int MOD = 1000000007;
        public int getResult() {
            //implement this
            return (int) product;
        }
    
        public void visitNode(TreeNode node) {
            //implement this
            if(node.getColor() == Color.RED){
                product = (product * node.getValue()) % MOD;
            }
        }
    
        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            if(leaf.getColor() == Color.RED){
                product = (product * leaf.getValue()) % MOD;
            }   
        }
    }
    
    class FancyVisitor extends TreeVis {
        private int evenDepthNonLeafSum = 0;
        private int greenLeafSum = 0;
        public int getResult() {
            //implement this
            return Math.abs(evenDepthNonLeafSum - greenLeafSum);
        }
    
        public void visitNode(TreeNode node) {
            //implement this
            if(node.getDepth()%2 == 0){
                evenDepthNonLeafSum += node.getValue();
            }
        }
    
        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            if(leaf.getColor() == Color.GREEN){
                greenLeafSum += leaf.getValue();
           }
        }
    }
    
    public class FourtyThree {
        static int[] values;
        static Color[] colors;
        static Map<Integer, Set<Integer>> treeMap = new HashMap<>();
      
        public static Tree solve() {
            //read the tree from STDIN and return its root as a return value of this function
            Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        values = new int[n + 1];
        colors = new Color[n + 1];
    
        for (int i = 1; i <= n; i++) {
            values[i] = scanner.nextInt();
        }
    
        for (int i = 1; i <= n; i++) {
            int c = scanner.nextInt();
            colors[i] = (c == 0) ? Color.RED : Color.GREEN;
        }
    
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
    
            if (!treeMap.containsKey(u)) {
                treeMap.put(u, new HashSet<Integer>());
            }
            treeMap.get(u).add(v);
    
            if (!treeMap.containsKey(v)) {
                treeMap.put(v, new HashSet<Integer>());
            }
            treeMap.get(v).add(u);
        }
    
        scanner.close();
        return buildTree(1, 0);
        }
        
        private static Tree buildTree(int nodeNum, int depth){
            Set<Integer> neighbors = treeMap.get(nodeNum);
        if (neighbors == null) {
            neighbors = new HashSet<Integer>();
        }
    
        if (neighbors.isEmpty()) {
            return new TreeLeaf(values[nodeNum], colors[nodeNum], depth);
        } else {
            TreeNode node = new TreeNode(values[nodeNum], colors[nodeNum], depth);
            for (int neighbor : neighbors) {
                treeMap.get(neighbor).remove(nodeNum); // remove backward edge
                node.addChild(buildTree(neighbor, depth + 1));
            }
            return node;
        }
        }
    
    
        public static void main(String[] args) {
            Tree root = solve();
            SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
            ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
            FancyVisitor vis3 = new FancyVisitor();
    
            root.accept(vis1);
            root.accept(vis2);
            root.accept(vis3);
    
            int res1 = vis1.getResult();
            int res2 = vis2.getResult();
            int res3 = vis3.getResult();
    
            System.out.println(res1);
            System.out.println(res2);
            System.out.println(res3);
        }
    }
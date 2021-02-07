package com.thoughtworks.ddd;

import java.util.*;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        //[1,2,3,4,5,null,6]

        TreeNode six = new TreeNode(6, null, null);

        TreeNode five = new TreeNode(5, null, null);
        TreeNode four = new TreeNode(4, null, null);

        TreeNode three = new TreeNode(3, null, six);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode one = new TreeNode(1, two, three);

        int answer = widthOfBinaryTree(one);
        System.out.println(answer);
    }
    /*
               1
         2           3
       n   5      4     n
          6  n   n  7
     */

    /*
               1
         2           3
       n   n      4     n

     */
    public static int widthOfBinaryTreeWithQueue(TreeNode root) {
        TreeNode nullNode = new TreeNode(Integer.MIN_VALUE, null, null);
        TreeNode boundaryNode = new TreeNode(Integer.MAX_VALUE, null, null);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(boundaryNode);
        int maxWidth = queue.size() - 1;

          /*
                1
          1             1
       1     n       n      1
     1   n         n   n  n    1

         */

        /*
              1
         2           3
      4    5       n   6
     n n  n n         n n

    */

        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();

            //if not Null node
            if (head.val != Integer.MIN_VALUE) {
                //if boundary node
                if (head.val == Integer.MAX_VALUE) {
                    maxWidth = Math.max(maxWidth, queue.size());
                    if (!queue.isEmpty()) {
                        queue.add(boundaryNode);
                    }
                } else {
                    if (head.left == null) {
                        queue.add(nullNode);
                    } else {
                        queue.add(head.left);
                    }
                    if (head.right == null) {
                        queue.add(nullNode);
                    } else {
                        queue.add(head.right);
                    }
                }
            }
        }
        return maxWidth;
    }

    public static int widthOfBinaryTree(TreeNode root) {
        HashMap<Integer, List<TreeNode>> levelMap = new HashMap<>();
        widthOfBinaryTreeUtil(root, 0, levelMap);

        int max = Integer.MIN_VALUE;

        for (Integer level : levelMap.keySet()) {

        }
    }

    public static void widthOfBinaryTreeUtil(TreeNode root, int level,
                                             Map<Integer, List<TreeNode>> levelMap) {
        if (root == null) {
            return;
        }

        if (levelMap.containsKey(level)) {
            levelMap.get(level).add(root);
        } else {
            List<TreeNode> list = new LinkedList<>();
            list.add(root);
            levelMap.put(level, list);
        }

        widthOfBinaryTreeUtil(root.left, level + 1, levelMap);
        widthOfBinaryTreeUtil(root.left, level + 1, levelMap);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

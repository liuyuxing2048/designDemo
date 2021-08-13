package com.example.designdemo.test_design_composite;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 使用场景：将多个对象组合在一起进行操作，
 *                      常用于表示树形结构中，例如二叉树，数等。
 * @createTime 2021年08月11日 16:10:00
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name){
        root = new TreeNode(name);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");

        b.add(c);
        tree.root.add(b);
        System.out.println("build tree finish");
        System.out.println(tree);
    }
}

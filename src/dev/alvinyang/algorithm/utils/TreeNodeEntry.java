package dev.alvinyang.algorithm.utils;

public class TreeNodeEntry<Key,Value> {
    public Key key;
    public Value value;
    public TreeNodeEntry left, right;
    public int size;

    public TreeNodeEntry(Key key, Value value, TreeNodeEntry left, TreeNodeEntry right, int size) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
        this.size = size;
    }

    public TreeNodeEntry(Key key) {
        this(key,null,null,null,0);
    }

    public TreeNodeEntry(Key key,Value value) {
        this(key,value,null,null,0);
    }

    public void setChildren(TreeNodeEntry left, TreeNodeEntry right) {
        this.left = left;
        this.right = right;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

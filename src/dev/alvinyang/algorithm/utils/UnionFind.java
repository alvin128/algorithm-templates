package dev.alvinyang.algorithm.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionFind<E> {

    private Map<E,E> relation;
    private Map<E,Integer> cap;
    private int size;

    public UnionFind(List<? extends E> input) {
        size = input.size();
        relation = new HashMap<>(size);
        cap = new HashMap<>();
        for (E e: input) {
            relation.put(e,e);
            cap.put(e,1);
        }
    }

    public <E1 extends E, E2 extends E> void  union(E1 e1, E2 e2) {
        E p1 = find(e1);
        E p2 = find(e2);
        if (p1.equals(p2)) {
            return;
        }
        relation.put(p1,p2);
        size--;
        cap.put(p2,cap.get(p2) + cap.get(p1));
    }

    public E find(E e) {
        if (relation.get(e).equals(e)){
            return e;
        }
        E p = find(relation.get(e));
        relation.put(e,p);
        return p;
    }

}

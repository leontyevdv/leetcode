package dev.oddsystems.leetcode.graphs;

class QuickUnionDisjointSet {
  private int[] root;

  // O(N)
  public QuickUnionDisjointSet(int size) {
    root = new int[size];
    for (int i = 0; i < size; i++) {
      root[i] = i;
    }
  }

  // O(N)
  public int find(int x) {
    while (x != root[x]) {
      x = root[x];
    }
    return x;
  }

  // O(N)
  public void union(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);
    if (rootX != rootY) {
      root[rootY] = rootX;
    }
  }

  // O(N)
  public boolean connected(int x, int y) {
    return find(x) == find(y);
  }
}

public class QuickUnionDisjointSetApp {
  public static void main(String[] args) throws Exception {
    QuickUnionDisjointSet uf = new QuickUnionDisjointSet(10);
    // 1-2-5-6-7 3-8-9 4
    uf.union(1, 2);
    uf.union(2, 5);
    uf.union(5, 6);
    uf.union(6, 7);
    uf.union(3, 8);
    uf.union(8, 9);
    System.out.println(uf.connected(1, 5)); // true
    System.out.println(uf.connected(5, 7)); // true
    System.out.println(uf.connected(4, 9)); // false
    // 1-2-5-6-7 3-8-9-4
    uf.union(9, 4);
    System.out.println(uf.connected(4, 9)); // true
  }
}
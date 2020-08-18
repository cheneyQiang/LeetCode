package code.AlgorithmsAndDataStructures.chapter7;

import java.util.Vector;

public class SparseGraph {
    private int n;//节点数
    private int m;//边数
    private boolean directed; //是否为有向图
    private Vector<Integer>[] g;

    //构造函数
    public SparseGraph(int n, boolean directed){
        assert n >= 0;
        this.n = n;
        this.directed = directed;
        g = new Vector[n];
        for (int i = 0; i < n; i++) {
            g[i] = new Vector<>();
        }
    }
    public int V(){ return n;} // 返回节点个数
    public int E(){ return m;} // 返回边的个数

    // 向图中添加一个边
    public void addEdge( int v, int w ){

        assert v >= 0 && v < n ;
        assert w >= 0 && w < n ;

        g[v].add(w);
        if( v != w && !directed )
            g[w].add(v);

        m ++;
    }

    public Iterable<Integer> adj(int v){
        assert v >= 0 && v < n;
        return g[v];
    }

}

package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg6;

public class GraphEdge {
    
    GraphNode src;
    GraphNode dst;
    double distance;
    
    public GraphEdge(GraphNode new_src, GraphNode new_dst, double new_distance) {
        
        this.src = new_src;
        this.dst = new_dst;
        this.distance = new_distance;
        
    }
    
}

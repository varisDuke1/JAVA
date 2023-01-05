package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg6;

import java.util.ArrayList;

public class Graph {

    ArrayList<GraphNode> nodes;
    ArrayList<GraphEdge> edges;

    public Graph() {
        this.nodes = new ArrayList<GraphNode>();
        this.edges = new ArrayList<GraphEdge>();
    }

    void add_node(GraphNode new_node) {
        this.nodes.add(new_node);
    }

    void add_edge(GraphEdge new_edge) {
        this.edges.add(new_edge);
    }

    void remove_node(GraphNode deleted_node) {
        this.nodes.remove(deleted_node);
        int i = 0;
        while (i < this.edges.size()) {
            GraphEdge edge = edges.get(i);
            if (edge.src == deleted_node || edge.dst == deleted_node) {
                this.edges.remove(edge);
            } else {
                i++;
            }
        }
    }

    void remove_edge(GraphEdge deleted_edge) {
        this.edges.remove(deleted_edge);
    }

    ArrayList<GraphEdge> get_edges_by_source_node(GraphNode node) {
        ArrayList<GraphEdge> node_edges = new ArrayList<GraphEdge>();
        for (int i = 0; i < this.edges.size(); i++) {
            GraphEdge edge = this.edges.get(i);
            if (edge.src == node || edge.dst == node) {
                node_edges.add(edge);
            }
        }
        return node_edges;
    }

    GraphNode get_node_by_data(int data) {
        for (int i = 0; i < this.nodes.size(); i++) {
            GraphNode node = this.nodes.get(i);
            if (node.data == data) {
                return node;
            }
        }
        return null;
    }

    Tree to_tree(int root_data) {
        TreeNode first_tree_node = new TreeNode(root_data);
        first_tree_node = this.completing_tree_node(first_tree_node);
        Tree t = new Tree(first_tree_node);
        return t;
    }

    TreeNode completing_tree_node(TreeNode tree_node) {
        int data = tree_node.data;
        GraphNode graph_node = this.get_node_by_data(data);
        ArrayList<GraphEdge> edges = this.get_edges_by_source_node(graph_node);
        for (int i = 0; i < edges.size(); i++) {
            GraphEdge edge = edges.get(i);
            if (edge.src == graph_node) {
                int new_data = edge.dst.data;
                boolean should_add_new_data = true;
                TreeNode current_tree_node = tree_node;
                while (current_tree_node != null) {
                    if (current_tree_node.data == new_data) {
                        should_add_new_data = false;
                        break;
                    }
                    current_tree_node = current_tree_node.parent;
                }
                if (should_add_new_data) {
                    TreeNode new_tree_node = new TreeNode(new_data);
                    tree_node.add_child(new_tree_node,
                            edge.distance);
                    int last_index = tree_node.children.size() - 1;
                    tree_node.children.set(last_index,
                            this.completing_tree_node(new_tree_node));
                }
            }
        }
        return tree_node;
    }
}

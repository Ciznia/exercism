import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Graph {

    private Vector<Node> nodes = null;
    private Vector<Edge> edges = null;
    private Map<String, String> attributes = null;

    public Graph() {
        this.attributes = new HashMap<>();
        this.nodes = new Vector<>();
        this.edges = new Vector<>();
    }

    public Graph(Map<String, String> attributes) {
        this.attributes = attributes;
        this.nodes = new Vector<>();
        this.edges = new Vector<>();
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public Graph node(String name) {
        this.nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        this.nodes.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        this.edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        this.edges.add(new Edge(start, end, attributes));
        return this;
    }

}

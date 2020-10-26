import java.util.ArrayList;

public class AdjacencyListGraph {
    private ArrayList<Vertex> vertices;

    public AdjacencyListGraph() {
        vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void newEdge(Vertex from, Vertex to, Integer dist) {
        if ((!vertices.contains(from)) && (!vertices.contains(to))) {
            System.out.println(" Vertex not found");
            return;
        }
        Edge newEdge = new Edge(from, to, dist);
    }

    public void printGraph() {
        Vertex currentVertex;
        for (int i=0; i<vertices.size(); i++) {
            currentVertex=vertices.get(i);
            System.out.println(" Edges from Vertex: " + currentVertex.getName());
            for (int j=0; j<currentVertex.getOutEdges().size(); j++) {
                Edge currentedge = currentVertex.getOutEdges().get(j);
                System.out.println("To " + currentedge.getToVertex().getName() + " weight " + currentedge.getWeight());
            }
            System.out.println(" ");
        }
    }
}

class Vertex implements Comparable<Vertex> {

    private String name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id) {
        this.name=id;
        outEdges=new ArrayList<>();
    }
    public void addOutedge(Edge outEdge) {
        outEdges.add(outEdge);
    }

    public int compareTo(Vertex vertex) {
        if (this.distance<vertex.distance) {
            return -1;
        }
        if (this.distance>vertex.distance) {
            return 1;
        }
        return 0;
    }
}

class Edge {
    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;
    public Edge(Vertex from, Vertex to, Integer cost) {
        fromVertex=from;
        toVertex=to;
        weight=cost;
        from.addOutedge(this);
    }

}

import java.util.ArrayList;

public class AdjacencyListGraph {
    private ArrayList<Vertex> vertices;

    public AdjacencyListGraph() {
        vertices = new ArrayList<>();
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
        for (Vertex vertex : vertices) {
            currentVertex = vertex;
            if (currentVertex.getOutEdges().size() > 0) {
                System.out.println("Edges from Vertex: " + currentVertex.getName().toUpperCase());
            }
            for (int j = 0; j < currentVertex.getOutEdges().size(); j++) {
                Edge currentedge = currentVertex.getOutEdges().get(j);
                System.out.println(" To " + currentedge.getToVertex().getName() + " distance " + currentedge.getWeight() + "km");
            }
            System.out.println();
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
        return this.distance.compareTo(vertex.distance);
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

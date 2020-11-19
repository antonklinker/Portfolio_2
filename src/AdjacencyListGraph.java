import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

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

    public void MSTPrims() {
        int[] distance = new int[vertices.size()];
        int[] predecessor = new int[vertices.size()];
        int[] visited = new int[vertices.size()];
        PriorityQueue<Vertex> Q = new PriorityQueue<>();
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(predecessor, -1);
        Arrays.fill(visited, 0);

        if (vertices.size()>0) {
            distance[0]=0;
            Q.offer(vertices.get(0));
        }
        int counter=0;
        int MST=0;

        while (!Q.isEmpty() && counter<vertices.size()) {
            Vertex u = Q.poll();
            System.out.println(Q.poll());

            if (visited[u.index]!=1) {
                for (int v=0; v<vertices.size(); v++) {
                    System.out.println(vertices.get(v).getName());
                }
            }
            System.out.println(u.getName());

        }

        /*for (Vertex vertex : vertices) {
            System.out.println(vertex.getName());

            for (int i=0; i<vertex.getOutEdges().size(); i++) {
                Edge currentedge = vertex.getOutEdges().get(i);
                System.out.println(currentedge.getWeight());
            }

        }*/

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
                System.out.println("    to " + currentedge.getToVertex().getName() + " distance " + currentedge.getWeight() + "km");
            }
            System.out.println();
        }
    }
}

class Vertex implements Comparable<Vertex> {

    private String name;
    private ArrayList<Edge> outEdges;
    Vertex prev = null;
    Integer distance = Integer.MAX_VALUE;
    Integer index;

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
        index=0;
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

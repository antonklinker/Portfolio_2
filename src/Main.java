public class Main {
    public static void main(String[] args) {
        AdjacencyListGraph adjgraph = new AdjacencyListGraph();

        Vertex Eskildstrup = new Vertex ("Eskildstrup");
        Vertex Haslev = new Vertex ("Haslev");
        Vertex Holbæk = new Vertex ("Holbæk");
        Vertex Jægerspris = new Vertex ("Jægerspris");
        Vertex Kalundborg = new Vertex ("Kalundborg");
        Vertex Korsør = new Vertex ("Korsør");
        Vertex Køge = new Vertex ("Køge");
        Vertex Maribo = new Vertex ("Maribo");
        Vertex Næstved = new Vertex ("Næstved");
        Vertex Ringsted = new Vertex ("Ringsted");
        Vertex Slagelse = new Vertex ("Slagelse");
        Vertex NykøbingF = new Vertex ("Nykøbing F");
        Vertex Vordingborg = new Vertex ("Vordingborg");
        Vertex Roskilde = new Vertex ("Roskilde");
        Vertex Sorø = new Vertex ("Sorø");
        Vertex Nakskov = new Vertex ("Nakskov");

        adjgraph.addVertex(Eskildstrup);
        adjgraph.addVertex(Haslev);
        adjgraph.addVertex(Holbæk);
        adjgraph.addVertex(Jægerspris);
        adjgraph.addVertex(Kalundborg);
        adjgraph.addVertex(Korsør);
        adjgraph.addVertex(Køge);
        adjgraph.addVertex(Maribo);
        adjgraph.addVertex(Næstved);
        adjgraph.addVertex(Ringsted);
        adjgraph.addVertex(Slagelse);
        adjgraph.addVertex(NykøbingF);
        adjgraph.addVertex(Vordingborg);
        adjgraph.addVertex(Roskilde);
        adjgraph.addVertex(Sorø);
        adjgraph.addVertex(Nakskov);



        /*
        Vertex A = new Vertex("0");
        adjgraph.addVertex(A);
        Vertex B = new Vertex("1");
        adjgraph.addVertex(B);
        Vertex C = new Vertex("2");
        adjgraph.addVertex(C);
        Vertex D = new Vertex("3");
        adjgraph.addVertex(D);
        Vertex E = new Vertex("4");
        Vertex F = new Vertex("5");
        Vertex G = new Vertex("6");
        adjgraph.addVertex(E);
        adjgraph.addVertex(F);
        adjgraph.addVertex(G);

        adjgraph.newEdge(A, B, 1);
        adjgraph.newEdge(A, C, 5);
        adjgraph.newEdge(A, E, 3);
        adjgraph.newEdge(B, E, 1);
        adjgraph.newEdge(B, F, 7);
        adjgraph.newEdge(C, D, 1);
        adjgraph.newEdge(D, E, 1);
        adjgraph.newEdge(D, G, 1);
        adjgraph.newEdge(E, C, 1);
        adjgraph.newEdge(E, D, 3);
        adjgraph.newEdge(E, F, 3);
        adjgraph.newEdge(E, G, 4);
        adjgraph.newEdge(F, G, 1);
        */
        //adjgraph.newEdge(new Vertex("Eskildstrup"), new Vertex("Maribo"), 28);

        adjgraph.newEdge(Eskildstrup, Maribo, 28);
        adjgraph.newEdge(Eskildstrup, NykøbingF, 13);
        adjgraph.newEdge(Eskildstrup, Vordingborg, 24);


        adjgraph.printGraph();


    }
}

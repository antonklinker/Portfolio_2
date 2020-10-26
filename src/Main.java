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
        adjgraph.newEdge(Haslev, Korsør, 60);
        adjgraph.newEdge(Haslev, Køge, 24);
        adjgraph.newEdge(Haslev, Næstved, 25);
        adjgraph.newEdge(Haslev, Ringsted, 19);
        adjgraph.newEdge(Haslev, Roskilde, 47);
        adjgraph.newEdge(Haslev, Slagelse, 48);
        adjgraph.newEdge(Haslev, Sorø, 34);
        adjgraph.newEdge(Haslev, Vordingborg, 40);
        adjgraph.newEdge(Holbæk, Jægerspris, 34);
        adjgraph.newEdge(Holbæk, Kalundborg, 44);
        adjgraph.newEdge(Holbæk, Korsør, 66);
        adjgraph.newEdge(Holbæk, Ringsted, 36);
        adjgraph.newEdge(Holbæk, Roskilde, 32);
        adjgraph.newEdge(Holbæk, Slagelse, 46);
        adjgraph.newEdge(Holbæk, Sorø, 34);
        adjgraph.newEdge(Jægerspris, Korsør, 95);
        adjgraph.newEdge(Jægerspris, Køge, 58);
        adjgraph.newEdge(Jægerspris, Ringsted, 56);
        adjgraph.newEdge(Jægerspris, Roskilde, 33);
        adjgraph.newEdge(Jægerspris, Slagelse, 74);
        adjgraph.newEdge(Jægerspris, Sorø, 63);
        adjgraph.newEdge(Kalundborg, Ringsted, 62);
        adjgraph.newEdge(Kalundborg, Roskilde, 70);
        adjgraph.newEdge(Kalundborg, Slagelse, 39);
        adjgraph.newEdge(Kalundborg, Sorø, 51);
        adjgraph.newEdge(Korsør, Næstved, 45);
        adjgraph.newEdge(Korsør, Slagelse, 20);
        adjgraph.newEdge(Køge, Næstved, 45);
        adjgraph.newEdge(Køge, Ringsted, 28);
        adjgraph.newEdge(Køge, Roskilde, 25);
        adjgraph.newEdge(Køge, Vordingborg, 60);
        adjgraph.newEdge(Maribo, Nakskov, 27);
        adjgraph.newEdge(Maribo, NykøbingF, 26);
        adjgraph.newEdge(Næstved, Roskilde, 57);
        adjgraph.newEdge(Næstved, Ringsted, 26);
        adjgraph.newEdge(Næstved, Slagelse, 37);
        adjgraph.newEdge(Næstved, Sorø, 32);
        adjgraph.newEdge(Næstved, Vordingborg, 28);
        adjgraph.newEdge(Ringsted, Roskilde, 31);
        adjgraph.newEdge(Ringsted, Sorø, 15);
        adjgraph.newEdge(Ringsted, Vordingborg, 58);
        adjgraph.newEdge(Slagelse, Sorø, 14);



        adjgraph.printGraph();


    }
}

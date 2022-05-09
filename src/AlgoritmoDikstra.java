/*
import java.util.*;

public class AlgoritmoDikstra {

    public static void printSolution(int dist[], int prev[]) {

        for (int b : prev) {
            System.out.print(" " + b);
        }

        System.out.println("");
        System.out.println("Vertex \t\t Distance from Source \t Path");

        for (int i = 0; i < dist.length; i++) {
            System.out.print(i + " \t\t " + dist[i]);
            int p = prev[i];
            System.out.print("\t\t\t");

            while (p != -1) {
                System.out.print(" -> " + p);
                p = prev[p];
            }
            System.out.print("\n");
        }

    }

    public static void dijkstra(Graph dg, int src) {
        // array with distances to all vertices
        int dist[] = new int[dg.V];
        // Set that include visited vertices
        Set<Integer> visited = new HashSet<Integer>();
        // Array that save the previous vertex of actual
        int prev[] = new int[dg.V];

        PriorityQueue<Edge> pq = new PriorityQueue<Edge>(dg.V, (e1, e2) -> e1.w - e2.w);

        for (int i = 0; i < dg.V; i++) {
            dist[i] = Integer.MAX_VALUE;
            prev[i] = -1;
        }
        pq.add(new Edge(src, 0));
        dist[src] = 0;

        while (visited.size() != dg.V || !pq.isEmpty()) {
            int u = pq.poll().u;

            visited.add(u);

            for (int i = 0; i < dg.adj.get(u).size(); i++) {
                if (!visited.contains(dg.adj.get(u).get(i).u)) {
                    if (dist[u] + dg.adj.get(u).get(i).w < dist[dg.adj.get(u).get(i).u]) {
                        System.out.println(u + " " + dist[u] + " " + dg.adj.get(u).get(i).w);
                        dist[dg.adj.get(u).get(i).u] = dist[u] + dg.adj.get(u).get(i).w;
                        prev[dg.adj.get(u).get(i).u] = u;
                    }
                    pq.add(new Edge(dg.adj.get(u).get(i).u, dist[dg.adj.get(u).get(i).u]));
                }
            }
        }

        printSolution(dist, prev);
    }

    public static class Edge {
        int u;
        int w;

        public Edge(int u, int w) {
            this.u = u;
            this.w = w;
        }
    }

    public static class Graph {
        public int V;
        public int E;
        public Vector<Vector<Edge>> adj;

        public Graph(int V) {
            this.V = V;
            this.E = 0;
            this.adj = new Vector<Vector<Edge>>();
            for (int i = 0; i < V; i++) this.adj.add(new Vector<Edge>());
        }

        public void addEdge(int u, int v, int w) {
            this.adj.get(u).add(new Edge(v, w));
            this.E++;
        }
    }

    public static void main(String[] args) {

        Graph dg = new Graph(9);
        // add edges
        // v = 0
        dg.addEdge(0, 1, 4);
        dg.addEdge(0, 7, 8);
        // v = 1
        dg.addEdge(1, 0, 4);
        dg.addEdge(1, 2, 8);
        dg.addEdge(1, 7, 11);
        // v = 2
        dg.addEdge(2, 1, 8);
        dg.addEdge(2, 3, 7);
        dg.addEdge(2, 5, 4);
        dg.addEdge(2, 8, 2);
        // v = 3
        dg.addEdge(3, 2, 7);
        dg.addEdge(3, 4, 9);
        dg.addEdge(3, 5, 14);
        // v = 4
        dg.addEdge(4, 3, 9);
        dg.addEdge(4, 5, 10);
        // v = 5
        dg.addEdge(5, 2, 4);
        dg.addEdge(5, 3, 14);
        dg.addEdge(5, 4, 10);
        dg.addEdge(5, 6, 2);
        // v = 6
        dg.addEdge(6, 5, 2);
        dg.addEdge(6, 7, 1);
        dg.addEdge(6, 8, 6);
        // v = 7
        dg.addEdge(7, 0, 8);
        dg.addEdge(7, 1, 11);
        dg.addEdge(7, 6, 1);
        dg.addEdge(7, 8, 7);
        // v = 8
        dg.addEdge(8, 2, 2);
        dg.addEdge(8, 6, 6);
        dg.addEdge(8, 7, 7);

        dijkstra(dg, 0);
    }
}

class Dijkstra {

    private static int minDistance(int dist[], boolean visited[]) {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < dist.length; v++)
            if (visited[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    public static void printSolution(int dist[], int prev[]) {

        for (int b : prev) {
            System.out.print(" " + b);
        }
        System.out.println("");
        System.out.println("Vertex \t\t Distance from Source \t Path");
        for (int i = 0; i < dist.length; i++) {
            System.out.print(i + " \t\t " + dist[i]);
            int p = prev[i];
            System.out.print("\t\t\t");
            while (p != -1) {
                System.out.print(" -> " + p);
                p = prev[p];
            }
            System.out.print("\n");
        }

    }

    public static void dijkstra(int graph[][], int src) {
        int dist[] = new int[graph.length];
        boolean visited[] = new boolean[graph.length];
        int prev[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
            prev[i] = -1;
        }

        dist[src] = 0;
        for (int count = 0; count < graph.length - 1; count++) {
            int u = minDistance(dist, visited);

            visited[u] = true;

            for (int v = 0; v < graph.length; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    prev[v] = u;
                }
            }
        }

        printSolution(dist, prev);
    }


    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}};

        dijkstra(graph, 0);
    }
};

 */
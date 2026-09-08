import java.util.*;

public class DijkstrasAlgorithm {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }





    static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int n, int d) {
            node = n;
            dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }



    

    public static void dijkstra(ArrayList<Edge> graph[], int src) {

        int V = graph.length;

        int dist[] = new int[V];

        // Initially all distances are infinity
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Distance from source to itself = 0
        dist[src] = 0;

        boolean visited[] = new boolean[V];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.remove();

            int u = current.node;

            // If node is already processed, skip it
            if (visited[u]) {
                continue;
            }

            visited[u] = true;

            // Explore all neighbours
            for (int i = 0; i < graph[u].size(); i++) {

                Edge e = graph[u].get(i);

                int v = e.dest;

                // Relaxation
                if (dist[u] + e.wt < dist[v]) {

                    dist[v] = dist[u] + e.wt;

                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        // Print shortest distances
        for (int i = 0; i < V; i++) {
            System.out.println(
                "Shortest distance from " + src + " to " + i + " = " + dist[i]
            );
        }
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        int src = 0;

        dijkstra(graph, src);
    }
}
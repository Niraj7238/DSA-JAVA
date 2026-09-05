
import java.util.Comparator;
import java.util.PriorityQueue;


public class basic{
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }








    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 1));

        

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-->"+ pq.peek().rank); // O(1)
            pq.remove(); // O(logn)
        }
    }
}





import java.util.ArrayList;

public class CreateAGraph{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    
    public static void main(String[] args) {
        
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];  // null--> empty arrayList

        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        // define  array list of graphs
        //  0 -vertex
        graph[0].add(new Edge(0, 1, 5));
        //  1 -vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 - vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        // 3 - vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 - vertex
        graph[4].add(new Edge(4, 2, 2));


        //  2 `s neighbores
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
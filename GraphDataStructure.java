import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class GraphDataStructure{
    static class Edge{
    int source; 
    int destination;
    public  Edge(int s,int d){
        this.source=s;
        this.destination=d;}
}public static void CreateGraph(ArrayList<Edge>graph[]) {
    for (int i = 0; i < graph.length; i++) {
        graph[i]=new ArrayList<Edge>();
   }graph[0].add(new Edge(0, 1));
   graph[0].add(new Edge(0, 2));
   graph[0].add(new Edge(0, 3));
   graph[1].add(new Edge(1, 0));
   graph[1].add(new Edge(1, 2));
   graph[2].add(new Edge(2, 0));
   graph[2].add(new Edge(2, 1));
   graph[3].add(new Edge(3, 0));
   graph[3].add(new Edge(3, 4));
   graph[4].add(new Edge(4, 3));
}//Tarjans algorithm(articulation points)
public static void dfs
(ArrayList<Edge>graph[],int current,int parent,int dt[],int ldt[]
,boolean visited[],int time,boolean ArticulationPoint[]) {
    visited[current]=true;
    dt[current]=ldt[current]=++time;
    int children=0;
    for (int i = 0; i < graph[current].size(); i++) {
        Edge e=graph[current].get(i);
        int neighbour=e.destination;
        if (parent==neighbour) {
            continue;
        }else if(visited[neighbour]){
            ldt[current]=Math.min(ldt[current], dt[neighbour]);
        }else{
            dfs(graph, neighbour,current, dt, ldt, visited, time, ArticulationPoint);
            ldt[current]=Math.min(ldt[current], dt[neighbour]);
            if(dt[current]<=ldt[neighbour]&&parent!=-1){
            ArticulationPoint[current]=true;
            }children ++;}
    }if (parent==-1&&children>1) {
        ArticulationPoint[current]=true;}
}public static void getArticulationPoint(ArrayList<Edge>graph[],int vertex) {
    int dt[]=new int[vertex];//discovery time
    int ldt[]=new int[vertex];//lowest discovery time
    int time=0;
    boolean visited[]=new boolean[vertex];
    boolean ArticulationPoint[]=new boolean[vertex];
    for (int i = 0; i < vertex; i++) {
        if (!visited[i]) {
          dfs(graph, i, -1, dt, ldt, visited, time, ArticulationPoint);}
    }for (int i = 0; i < vertex; i++) {
        if (ArticulationPoint[i]) {
            System.out.println("Articulation Point is ="+i);}}
}public static void main(String[] args) {
        int vertex=5;
        ArrayList<Edge>graph[]=new ArrayList[vertex];
        CreateGraph(graph);
    getArticulationPoint(graph, vertex);}}


    


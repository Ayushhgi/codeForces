import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {
    static class Edge {
		int src;
		int des;
		int wet;
		public Edge(int src,int des,int wet) {
			this.src=src;
			this.des=des;
			this.wet=wet;
		}
	}
    public static ArrayList<Edge>[] createGraph() {
		int v=7;
		ArrayList<Edge>[] graph=new ArrayList[v]; 

		for(int i=0; i<graph.length; i++) {
			graph[i]=new ArrayList<>();
		}

		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,1));

		graph[1].add(new Edge(1,3,1));
		graph[1].add(new Edge(1,0,1));

		graph[2].add(new Edge(2,0,1));
		graph[2].add(new Edge(2,4,1));

		graph[3].add(new Edge(3,1,1));
		graph[3].add(new Edge(3,4,1));
		graph[3].add(new Edge(3,5,1));

		graph[4].add(new Edge(4,2,1));
		graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

		graph[5].add(new Edge(5,3,1));

		graph[5].add(new Edge(5,6,1));
		graph[5].add(new Edge(5,4,1));


		graph[6].add(new Edge(6,5,1));

		return graph;
	}
    public static void bfs(ArrayList<Edge> [] graph){
        ArrayList<Integer> ans=new ArrayList<>(); 
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(0);
        boolean []isVisited=new boolean[graph.length];
        isVisited[0]=true;
        while(!q.isEmpty()){
            int vertex=q.poll();
            ans.add(vertex);
            for(int i=0;i<graph[vertex].size();i++){
                Edge e=graph[vertex].get(i);
                if(!isVisited[e.des]){
                    isVisited[e.des]=true;
                    q.add(e.des);
                }
            }
        }
        System.out.println(ans);
    }
    public static void helper(ArrayList<Edge>[] graph,boolean [] isVisited,int vertex){
        System.out.print(vertex);
        // isVisited[vertex] = true;
        for(int i=0;i<graph[vertex].size();i++){
            if(!isVisited[graph[vertex].get(i).des]){
                isVisited[graph[vertex].get(i).des]=true;
                helper( graph,isVisited,graph[vertex].get(i).des);
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph ){
        boolean [] isVisited=new boolean[graph.length];
       
        for(int i=0;i<graph.length;i++){

            if(!isVisited[i]){
                 isVisited[i]=true; 
                helper(graph,isVisited,i);
            }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Edge>[] graph=createGraph();
        // bfs(graph);
        dfs(graph);


        
        sc.close();
    }
}

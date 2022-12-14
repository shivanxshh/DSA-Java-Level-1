package Graph;

import java.io.*;
import java.util.*;

public class GetConnectedComponents{
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        ArrayList<ArrayList<Integer>> comps = getConnectedComp(graph);

        // write your code here

        System.out.println(comps);
    }
    public static ArrayList<ArrayList<Integer>> getConnectedComp(ArrayList<Edge>[] graph){
        int nvtces=graph.length;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        boolean vis[]=new boolean[nvtces];
        for(int vtx =0; vtx<nvtces; vtx++){
            if(vis[vtx]==false){
                ArrayList<Integer> comp=new ArrayList<>();
                dfs(graph,vtx,vis,comp);
                ans.add(comp);

            }


        }
        return ans;
    }
    public static void dfs(ArrayList<Edge> [] graph,int vtx,boolean vis[],ArrayList<Integer> comp){
        vis[vtx]=true;
        comp.add(vtx);

        for(Edge e: graph[vtx]){
            if(vis[e.nbr]==false){
                dfs(graph,e.nbr,vis,comp);
            }
        }

    }

}

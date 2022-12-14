package Graph;

import java.io.*;
import java.util.*;

public class IsGraphBipartite {
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
    static class Pair{
        int src;
        int lvl;
        Pair(int src,int lvl){
            this.src=src;
            this.lvl=lvl;
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

        int vis[]=new int[vtces];
        for(int i=0;i<vtces;i++){
            if(vis[i]==0){
                boolean ans=isGraphBip(i,vis,graph);
                if(ans==false) {
                    System.out.println(false) ;
                    return;
                }
            }

        }
        System.out.println(true);
        // write your code here
    }

    public static boolean isGraphBip(int src, int[] vis, ArrayList<Edge> [] graph){
        Queue<Pair> q= new ArrayDeque<>();
        q.add(new Pair(src,1));
        while(q.size()>0){
            Pair rem=q.remove();
            if(vis[rem.src]!=0){
                //already visited
                if(vis[rem.src]!=rem.lvl) return false;
            }

            vis[rem.src]=rem.lvl;

            for(Edge e: graph[rem.src]){
                if(vis[e.nbr]==0){
                    q.add(new Pair(e.nbr,rem.lvl+1));
                }
            }


        }
        return true;
    }

}
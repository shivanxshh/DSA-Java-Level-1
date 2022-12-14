package Graph;

import java.io.*;
import java.util.*;

public class IsGraphCyclic {
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

        boolean [] vis=new boolean[vtces];
        for(int i=0;i<vtces;i++){
            if(vis[i]==false){
                boolean ans=isCycPres(i,vis,graph);
                if(ans==true){
                    System.out.println(ans);
                    return;
                }

            }

        }
        System.out.println(false);

        // write your code here
    }
    public static boolean isCycPres(int src,boolean [] vis, ArrayList<Edge>[] graph){
        Queue<Integer> q=new ArrayDeque<>();
        q.add(src);

        while(q.size()>0){

            //rem , //markc heck, // add
            int rem=q.remove();
            if(vis[rem]==true){
                return true;
            }
            vis[rem]=true;
            for(Edge e:graph[rem]){
                if(vis[e.nbr]==false){
                    q.add(e.nbr);
                }
            }
        }
        return false;
    }

}
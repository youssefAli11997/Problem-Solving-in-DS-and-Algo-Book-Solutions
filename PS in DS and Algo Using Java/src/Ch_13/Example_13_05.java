import java.util.ArrayList;
import java.util.Scanner;

public class Example_13_05 {
    
    public static boolean[] vis;
    public static boolean found;
    public static ArrayList<Integer>[] adjList;
    
    public static void DFS_Path(int node, int dest){
        vis[node] = true;
        if(node == dest){
            found = true;
            return;
        }
        for(int i = 0; i < adjList[node].size(); i++){
            int child = adjList[node].get(i);
            if(!vis[child])
                DFS_Path(child, dest);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of vertices : ");
        int n = in.nextInt();
        vis = new boolean[n];
        found = false;
        adjList = new ArrayList[n];
        for(int i = 0; i < n; i++)
            adjList[i] = new ArrayList<>();
        
        System.out.print("Number of edges : ");
        int from, to;
        int m = in.nextInt();
        for(int i = 0; i < m; i++){
            System.out.print("from to : ");
            from = in.nextInt();
            to = in.nextInt();
            adjList[from].add(to);
            adjList[to].add(from);
        }
        
        System.out.print("Search for path (from to) : ");
        from = in.nextInt();
        to = in.nextInt();
        
        DFS_Path(from, to);
        
        System.out.println(found ? "There IS a path" : "There IS NOT a path");
    }
    
}

// Problem: Find if Path Exists in Graph
// Platform: LeetCode
// Difficulty: Easy
// Pattern: Graph Traversal – DFS (Reachability)
// Time Complexity: O(V + E)
// Space Complexity: O(V + E) for adjacency list + O(V) for visited array + O(V) recursion stack worst case

class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, visited, adj);
    }

    public boolean dfs(int node, int destination, boolean[] visited, List<List<Integer>> adj){

        if(node == destination) return true;

        visited[node] = true;

        for(int neighbor : adj.get(node)){

            if(!visited[neighbor]){

                if(dfs(neighbor, destination, visited, adj)){
                    return true;
                }

            }

        }

        return false;
    }
}
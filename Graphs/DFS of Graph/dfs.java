import java.util.ArrayList;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    
    //Recursive DFS
    public void dfs(ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj, boolean visited[], int curr) {
        //marking curr as visited and adding it into ans list
        visited[curr] = true;
        ans.add(curr);
        // moving to neighbours of curr and peforming dfs
        for(int nbr : adj.get(curr)) {
            if(!visited[nbr]) {
                visited[nbr] = true;
                dfs(ans, adj, visited, nbr);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //for storing the dfs answer
        ArrayList<Integer> ans = new ArrayList<>();
        //visited array makes sure a node is not visited more than once
        boolean visited[] = new boolean[V];
        dfs(ans, adj,visited, 0);
        return ans;
    }
}
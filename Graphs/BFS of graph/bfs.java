
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        //List to store the answer
        ArrayList<Integer> ans = new ArrayList<>();
        // Queue to traverse breadth wise
        Queue<Integer> q = new LinkedList<>();
        //visited array to make sure not visiting a vertex more than once.
        boolean visited[] = new boolean[V];
        q.add(0);
        visited[0] = true;
        //BFS
        while (q.size() > 0) {
            int curr = q.remove();
            ans.add(curr);
            visited[curr] = true;
            for (int nbr : adj.get(curr)) {
                if(!visited[nbr]) {
                    q.add(nbr);
                    //mark as visited
                    visited[nbr] = true;
                }
            }
        }
        return ans;
    }
}
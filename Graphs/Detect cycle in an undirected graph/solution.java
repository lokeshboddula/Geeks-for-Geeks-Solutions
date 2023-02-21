
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        //BFS
        for(int i = 0; i < V; i++) {
            if(visited[i]) continue;
            q.add(i);
            while (q.size() > 0) {
				int curr = q.remove();
				//if we are on the node which is already visited we found a cycle
				//we see that the element is already in the queue from a diff path
				if(visited[curr]) return true;
				visited[curr] = true;
				for(int nbr : adj.get(curr)) {
					if(!visited[nbr]) {
						q.add(nbr);
					}
				}
			}
        }
        return false;
    }
}
class Solution {
    static void dfs (ArrayList<ArrayList<Integer>> graph, boolean visited[], int currNode) {
		//DFS
		visited[currNode] = true;
		List<Integer> curr = graph.get(currNode);
		for (int i : curr) {
			if(!visited[i]) dfs(graph, visited, i);
		}
	}
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        // creating adjList from adj matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
                
            }
        }
        //count will track each component when ever visited is false
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if(!visited[i]) {
                count++;
                dfs(adjList, visited, i);
            }
        }
        return count;
    }
};
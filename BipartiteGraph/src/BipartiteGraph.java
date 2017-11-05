import java.util.*;

public class BipartiteGraph {
	
	private int V;
	private int [][] adMatrix;
	public BipartiteGraph(int V) {
		this.V = V;
		adMatrix = new int[V+1][V+1];
	}
	 
	public void addEdge(int u, int v) {
		adMatrix[u][v] = 1;
		adMatrix[v][u] = 1;
	}
	 
	 boolean isBipartite(int src)
	    {
	        
	        int colorArr[] = new int[V+1];
	        for (int i=1; i<=V; ++i)
	            colorArr[i] = -1;
	 
	        colorArr[src] = 1;
	 
	        LinkedList<Integer>q = new LinkedList<Integer>();
	        q.add(src);
	 
	        while (q.size() != 0)
	        {
	            int u = q.poll();
	            if (adMatrix[u][u] == 1)
	                return false;  
	 
	            for (int v=1; v<=V; ++v)
	            {
	                if (adMatrix[u][v]==1 && colorArr[v]==-1)
	                {
	                    colorArr[v] = 1-colorArr[u];
	                    q.add(v);
	                }
	 
	                else if (adMatrix[u][v]==1 && colorArr[v]==colorArr[u])
	                    return false;
	            }
	        }
	       
	        return true;
	    }
	
	
	public static void main(String args[]) 
	{
//		BipartiteGraph g = new BipartiteGraph(5);
//		
//		g.addEdge(1, 2);
//		g.addEdge(1, 4);
//		g.addEdge(2, 3);
//		g.addEdge(3, 4);
//		g.addEdge(4, 5);
//		System.out.println(g.isBipartite(3)?"Bipartite":"Not Bipartite");

		BipartiteGraph g = new BipartiteGraph(5);
//		
//	    g.addEdge(1, 2);
//		g.addEdge(1, 4);
//		g.addEdge(1, 3);
//		g.addEdge(2, 3);
//		g.addEdge(4, 5);
//		g.addEdge(3, 4);
//		g.addEdge(2, 3);
//		System.out.println(g.isBipartite(3)?"Bipartite":"Not Bipartite");

			g.addEdge(1, 2);
			g.addEdge(2, 3);
			g.addEdge(4, 2);
			g.addEdge(4, 5);
			g.addEdge(3, 4);
			System.out.println(g.isBipartite(1)?"Bipartite":"Not Bipartite");

	
	
	}
}














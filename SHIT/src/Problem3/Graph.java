package Problem3;

public class Graph {

	int n;
	int a[][];
	boolean visited[];
	
	public Graph(int n)
	{
		a = new int[1000][1000];
		this.n = n;
		visited = new boolean[n+1];
	}
	
	
	public void add(int n1, int n2)
	{
		a[n1][n2] = 1;
		a[n2][n1] = 1;
	}
	
	public void print()
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new Graph(4);
		graph.add(1, 4);
		graph.add(4, 3);
		graph.add(1, 2);
		graph.print();
		System.out.println(graph.canYouGo(2, 3));

	}


	public boolean canYouGo(int n1, int n2) {
		return false;
		
	}
	
	public void dfs(int n)
	{
		
	}

}





















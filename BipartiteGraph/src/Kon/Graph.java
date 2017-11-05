package Kon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {

    int [][] arr;
    int V, U;
    boolean [][] bArr;
    int [][] dist;
    
    int [] row = {2,2,-2,-2,-1,-1,1,1};
    int [] col = {-1,1,1,-1,2,-2,2,-2};
    
    public Graph (int V){
        this.V = V;
        this.U = V;
        bArr = new boolean[V+2][U+2];
        dist = new int [V+2][V+2];
    }

  
    public boolean valid(int u, int v) {
    	return !(u<0 || v<0 || v>V || u>V);
    }
   
    public int BFS(int u, int v, int x , int y ) {
    	
    	
    	
    	 LinkedList<Integer> queue = new LinkedList<Integer>();
    	 
         queue.add(u);
         queue.add(v);
         dist[u][v] = 0;
         
         
         while (queue.size() != 0)
         {
            
        	 int s = queue.poll();
        	 int t = queue.poll();
        	 
       
           if(s==x && t == y) {
       		  return dist[s][t];
           }
           
          if(bArr[s][t]==false) {
        	  bArr[s][t] = true;
             for ( int i=0;i<8;i++) 
             {
            	 
            	     if(valid(s+col[i], t+row[i])) {
     
            		 dist[s+col[i]][t+row[i]] = dist[s][t]+1;
            		
            		 queue.add(s+col[i]);
            		 queue.add(t+row[i]);
            	 
  			 	}}}}
            
         
             
         
		return (int) 11111111;
         }
    
    
   
    
    public static void main(String args[]){

   
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.nextLine());
        Graph graph = new Graph(V);
        String sss = sc.nextLine();
         V = Integer.parseInt(sss.split(" ")[0]);
        int U = Integer.parseInt(sss.split(" ")[1]);
        sss = sc.nextLine();
        int x = Integer.parseInt(sss.split(" ")[0]);
        int y = Integer.parseInt(sss.split(" ")[1]);
       System.out.println(graph.BFS(V, U, x, y));
        
    }
}


























package Gryadki;

import java.util.Scanner;

public class Graph {

    int [][] arr;
    int V, U;
    boolean [][] bArr;

    
    public Graph (int V, int U){
        this.V = V;
        this.U = U;
        arr = new int[V+2][U+2];
        bArr = new boolean[V+2][U+2];
    }

    public void addEdge(int src, int dst){
        this.arr[src][dst] = 1;
    }
      public int getAllGryadkas() {
    	int cnt = 0;
    	for ( int i=1;i<=V;i++) {
     		for ( int j=1;j<=U;j++) 
     		{
     			if(arr[i][j]==1 && bArr[i][j]==false) 
     			{
     				DFS(i,j);
     				cnt++;
     			}
     		}}
    	return cnt;
     
    }
   
    public void DFS(int u, int v) {
    	
    	bArr[u][v]= true;
    	
//    	if(arr[u-1][v]==0||bArr[u-1][v]==true ) 
//    	{
//       	   if(arr[u+1][v]==0||bArr[u+1][v]==true) {
//    		  if (arr[u][v-1]==0||bArr[u][v-1]==true) 
//    		  {
//    			 if(arr[u][v+1]==0||bArr[u][v+1]==true) 
//    			 {
//    				 return;
//    			 }
//    		  }
//    	   }
//    	 }
    	 
    	
    	
    	
    	if(arr[u-1][v]==1 && bArr[u-1][v]==false) {
    		DFS(u-1, v);
    	}
    	 if(arr[u+1][v]==1 && bArr[u+1][v]==false) {
    		DFS(u+1, v);
    	}
    	 if(arr[u][v-1]==1 && bArr[u][v-1]==false) {
    		DFS(u, v-1);
    	}
    	 if(arr[u][v+1]==1 && bArr[u][v+1]==false) {
    		DFS(u, v+1);
    	}
    	
    	
    }
    
    
   
    
    public static void main(String args[]){

   
        Scanner sc = new Scanner(System.in);
//     	int V = sc.nextInt();
//     	int U = sc.nextInt();
        
        String sss = sc.nextLine();
        int V = Integer.parseInt(sss.split(" ")[0]);
        int U = Integer.parseInt(sss.split(" ")[1]);
        Graph adMatrix = new Graph(V, U);
        
      //  System.out.println(V+" "+U);
        for ( int i=0;i<V;i++) 
        {
        	String ss = sc.nextLine();
        	for ( int j=0;j<ss.length();j++) 
        	{
        	  if(ss.charAt(j)=='#')
        	  adMatrix.addEdge(i+1,j+1);	
        	}
        }
        
        
//        adMatrix.printAll();
       //	 adMatrix.printMat();
       
       System.out.println(adMatrix.getAllGryadkas());
       
       // adMatrix.printGryadka();
        
      // System.out.println(adMatrix.isTherePath(1,4)? "PORTOS":"ZOSOS");

    }
}



























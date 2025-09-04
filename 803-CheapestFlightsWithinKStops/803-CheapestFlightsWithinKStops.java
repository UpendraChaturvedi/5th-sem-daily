// Last updated: 9/4/2025, 12:03:17 PM
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        for(int i=0;i<=k;i++){
            int[] temp = Arrays.copyOf(dist, n);
            for(int []fl:flights){
                int u=fl[0];
                int v=fl[1];
                int pr=fl[2];
                if(dist[u]!=Integer.MAX_VALUE){
                    temp[v]=Math.min(temp[v],dist[u]+pr);
                }
            }
            dist=temp;
        }
        return dist[dst]==Integer.MAX_VALUE? -1:dist[dst];
    }
}
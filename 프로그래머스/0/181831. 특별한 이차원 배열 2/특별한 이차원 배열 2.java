class Solution {
    public int solution(int[][] arr) {
        boolean answer = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]!=arr[j][i]){
                    return 0;
                    //다른 쌍을 발견했을 때 바로 0을 반환
                }
            }
            
        }
        return 1; //모든 i,j 쌍 확인 통과하면 1 반환
        
    }
}
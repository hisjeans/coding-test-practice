class Solution {
    public int[] solution(int[] arr, int n) {
        
        if(arr.length%2!=0){//arr 길이=홀수
            for(int i=0;i<arr.length;i++){
                //짝수 인덱스 위치에 n을 더해야 하니 0도 포함되어야
                if(i%2==0){
                    arr[i]+=n;
                }
            }
        }
        else{//arr 길이=짝수
            for(int i=1;i<arr.length;i++){
                if(i%2!=0){
                    arr[i]+=n;
                }
            }
        }
        return arr;
    }
}
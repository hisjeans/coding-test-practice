import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean deleteV1=false;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){ deleteV1=true;
                break;
                                           //delete_list 내의 값과 겹치는 arr 원소는 삭제해야 하는 값으로 인식하고 넘어가자
                                          }
            }
            if(!deleteV1) list.add(arr[i]);
            //delete_list에 겹치는 값이 없다면 출력값에 추가되도록
        }
        int[] answer=new int[list.size()];
        for(int i=0;i<list.size();i++)
            answer[i]=list.get(i);
        //리스트를 int[]로 반환
        return answer;
    }
}
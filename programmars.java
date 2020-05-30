class Solution {
    public int[] solution(int[][] v) {
        int[] com = new int[3];
        int[] answer = new int[2];
        for(int i=0;i<3;i++){
            for(int k=0;k<3;k++){
                if(i!=k){
                    if(v[i][0]==v[k][0]) com[i] += 1;
                }
            }
             if(com[i]==0) answer[0] = v[i][0];
        }
        com[0] = 0; com[1]=0; com[2]=0;
        
        for(int i=0;i<3;i++){
            for(int k=0;k<3;k++){
                if(i!=k){
                    if(v[i][1]==v[k][1]) com[i] += 1;
                }
            }
            if(com[i]==0) answer[1] = v[i][1];
        }

        return answer;
    }
}

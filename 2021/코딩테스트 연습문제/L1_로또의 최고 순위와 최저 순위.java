class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int max = 0;
        int min = 0;
        for(int x=0; x<win_nums.length; x++) {
            for(int y=0; y<lottos.length; y++) {
                // 같은 수가 있으면 당첨 UP
                if(win_nums[x] == lottos[y]) {
                    max++;
                    min++;
                }
            }
            if(lottos[x] == 0) {
                // 0 이 있으면 당첨 UP
                max++;
            }
        }
        answer[0] = number(max);
        answer[1] = number(min);
        
        return answer;
    }
    
    // 6 => 1등
    // 5 => 2등
    // 4 => 3등
    // 3 => 4등
    // 2 => 5등
    // 1 => 6등
    public int number(int num) {
        int result = 0;
        switch(num) {
            case 6 :
                result = 1;
                break;
            case 5 :
                result = 2;
                break;
            case 4 :
                result = 3;
                break;
            case 3 :
                result = 4;
                break;
            case 2 :
                result = 5;
                break;
            case 1,0 :
                result = 6;
                break;
        }
        return result;
    }
}
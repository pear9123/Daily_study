class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int max = 0;
        int min = 0;
        for(int x=0; x<win_nums.length; x++) {
            for(int y=0; y<lottos.length; y++) {
                // ���� ���� ������ ��÷ UP
                if(win_nums[x] == lottos[y]) {
                    max++;
                    min++;
                }
            }
            if(lottos[x] == 0) {
                // 0 �� ������ ��÷ UP
                max++;
            }
        }
        answer[0] = number(max);
        answer[1] = number(min);
        
        return answer;
    }
    
    // 6 => 1��
    // 5 => 2��
    // 4 => 3��
    // 3 => 4��
    // 2 => 5��
    // 1 => 6��
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
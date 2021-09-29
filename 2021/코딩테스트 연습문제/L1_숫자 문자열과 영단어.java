// 내 풀이
class Solution {
    public int solution(String s) {
        int answer = 0;

        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");

        answer = Integer.parseInt(s);
        return answer;
    }
}

// 2차원 배열 풀이(다른사람 풀이)
// 이게 더 명확한 솔루션인듯
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}
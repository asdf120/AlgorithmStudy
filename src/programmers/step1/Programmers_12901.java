package programmers.step1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// https://programmers.co.kr/learn/courses/30/lessons/12901
// 연습문제 > 2016년
public class Programmers_12901 {
    public static void main(String[] args) throws ParseException {
        String answer = "";
        answer = solution(5, 24);
        System.out.println(answer);
    }

    static String solution(int a, int b) throws ParseException {
        String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        String startDate = "20160101";
        String month = String.valueOf(a);
        if (a < 10) {
            month = 0 + String.valueOf(a);
        }
        String day = String.valueOf(b);
        if (b < 10) {
            day = 0 + String.valueOf(b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("2016").append(month).append(day);
        Date start = new SimpleDateFormat("yyyyMMdd").parse(startDate);
        Date end = new SimpleDateFormat("yyyyMMdd").parse(sb.toString());

        long diffSecond = (end.getTime() - start.getTime()) / 1000;
        long diffDays = diffSecond / (24 * 60 * 60);

        int n = (int) diffDays % 7;
        answer = days[n];

        return answer;
    }
}

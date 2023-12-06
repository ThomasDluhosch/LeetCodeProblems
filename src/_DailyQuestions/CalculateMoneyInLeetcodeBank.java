package _DailyQuestions;

/*
    DailyProblem 06.12.23 - 1716
    Hercy wants to save money for his first car.
    He puts money in the Leetcode bank every day.
    He starts by putting in $1 on Monday, the first day.
    Every day from Tuesday to Sunday, he will put in $1
    more than the day before. On every subsequent Monday,
    he will put in $1 more than the previous Monday.
    Given n, return the total amount of money he will have
    in the Leetcode bank at the end of the n-th day.
 */

public class CalculateMoneyInLeetcodeBank {


    public static int totalMoney(int n) {

        int firstDay = 0;
        int totalMoney = 0;

        for (int i = 0; i < n; i++) {

            if (i % 7 == 0) {
                firstDay++;
            }
            totalMoney += firstDay + (i % 7);
        }
        return totalMoney;
    }
}

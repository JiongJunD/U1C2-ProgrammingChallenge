public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        int x = (int)Math.round(totalStock);
        return x;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int num = (int)(userDouble * 100);
        int erm = ((num) % 10 + 1) % 10;
        int what = ((num/10) % 10 + 1) % 10;
        int the = ((num/100) % 10 + 1) % 10;
        int sigma = ((num/1000) % 10 + 1) % 10;
        int questionMark = ((num/10000) % 10 + 1) % 10;
        double result = (erm + what * 10 + the * 100 + sigma * 1000 + questionMark * 10000)/100.0;
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.roundValueChange(-23.56));
        //231.01
    }

}

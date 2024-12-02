
// counting the digits present in a number
class CountDigit{
    public static int checkCount(int num){
        int count =0;
        while(num!=0){
           num= num/10;
           count++;
        }
        return count;
    }
    
    
    public static void main(String[] args) {
       int num = 834234;
       System.out.println(checkCount(num));
    }
}
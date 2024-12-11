class FilterPrime{
    
    public static boolean checkPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    
            
    
    public static void main(String[] args) {
        int[] a = {2,3,5,4,5,6,7,8,9,10,11};
        for(int i=0; i<a.length; i++){
            if(checkPrime(a[i])){
                System.out.println(a[i]);
            }
        }
    }
}
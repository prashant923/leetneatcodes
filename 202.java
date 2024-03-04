public class 202 {

        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;
    
           do{
               slow = findSquare(slow);
               fast = findSquare(findSquare(fast));
           }
           while(slow!=fast);
           if(slow==1){
               return true;
           }
           return false;
        }
        public int findSquare(int num){
            int res = 0;
            while(num>0){
                int rem = num%10;
                res+= rem*rem;
                num/=10;
            }
            return res;
        }
    
}

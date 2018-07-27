class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        
        else {
            int rev =0;
            int temp =x;
            while(temp!=0) {
                int pop = temp%10;
                temp /= 10;
                rev = rev*10 + pop;
            }
            if(rev==x) {
                return true;
            }
            else {
                 return false;
            }
               
        }
}
}

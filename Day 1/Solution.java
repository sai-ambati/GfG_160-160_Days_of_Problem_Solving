class Solution {
    public int getSecondLargest(int[] arr) {
        int firstLarge = -1;
        int secondLarge = -1;
        for(int x:arr){
            if(x>firstLarge){
                secondLarge = firstLarge;
                firstLarge = x;
            }
            else if (x>secondLarge && x<firstLarge){
                secondLarge = x;
            }
        }
        return secondLarge;
    }
}

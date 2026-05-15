class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)return nums[0];
        // int left=0;
        // int right=nums.length-1;
    
        // //find first sort array
        // while(left<right){

        // }
        // return math.min(nums[left],[right])
       
//     '''even 1 rotation ends up the first element becomes the greatest element
//     we have to find the first element lesser than the first element 
//     if no element found return the first element
//     the breaking point is first element lesser than the nums[0] element
//     if no return nums[0]  
//     //correction 
//     even 1 rotation ends in some elements lesser than the first element which is the second array
//     starting from the 2nd element jump by increasing the jump size exponentially log(n)
//     if hits the n-1 
//     now the old right becomes the start again do it by jumping exponentially
//     if we hit again we have to do it
//  instead of old right maintain left
//  old becomes right until found the lesser element is false
//  and if we found the lesser element we are in second array at some element
//  the minimum element must be between
//  left and right
//  now lets move the left  until we
//  if last jump is n-1 in left then return -1


//     log(n)
//     binary search is the only way to do it
//     jump length greater than the before
//     lets say 
//     length 1 2 4 8 16 32 
//     '''
        int left=1;
        int right=1;
        boolean found=false;
        while(!found){
            while(right<nums.length){
                if(nums[right]<nums[0]){
                    found=true;
                    break;
                }
                left=right;
                right+=right;
            }
            if(found==true){
                break;
            }
            else if(left==nums.length-1){
                return nums[0];
            }
            else{
                
                right=left+1;
            }
        }
        while(nums[right]<nums[0]){
            right--;
        }



         return nums[right+1];
    }
   
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = 0,l2 = 0;
        int k = 0 ;
        int t = 0;
        int n = nums1.length + nums2.length ;
        int prev=-1;
        while(l1 < nums1.length && l2 < nums2.length){
            if( t == n/2 + 1){
                if(n%2 == 0){
                    return (k + prev) / 2.0;
                }
                else return k;
            }
            if(nums1[l1] <= nums2[l2]){
                
                prev=k;
                k = nums1[l1];
                l1 ++;

            }
            else{
                
                prev=k;
                k = nums2[l2];
                l2 ++;

            }t++;
        
        }
        while(l1 < nums1.length) {
            if(t == n/2 + 1)  {if(n%2 == 0){
                    return (k + prev) / 2.0;
                }
                else return k;}
            prev = k;
            k = nums1[l1];
            l1++;
            t++;
        }
         while(l2 < nums2.length) {
            if( t == n/2 + 1) { if(n%2 == 0){
                    return (k + prev) / 2.0;
                }
                else return k;}
            prev = k;
            k = nums2[l2];
            l2++;
            t++;
        }
        if(n%2 == 0) return (k + prev) /2.0;
        return k;




        
    }
}
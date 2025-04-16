class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]=new int[m];
        int k=0,l1=0,l2=0;
        for(int j=0;j<m;j++){
            temp[j]=nums1[j];
        }
        while(k<nums1.length){
            if(l1<m && (l2>=n ||temp[l1]<=nums2[l2])){
                nums1[k]=temp[l1];
                k++;
                l1++;
            }
            else{
                nums1[k]=nums2[l2];
                k++;
                l2++;
            }
        }
        
    }
}
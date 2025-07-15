int removeDuplicates(int* nums, int numsSize) {
    int* slow=nums;
    int* fast=nums;
    int i=0;
    int c=1;
    while(i <  numsSize){
        if(*fast == *slow){
            fast++;
        }
        else{
            *(slow+1)=*fast;
            slow=slow+1;
            fast=fast+1;
            c++;
        }
        i++;
    }
    return c;
    
}
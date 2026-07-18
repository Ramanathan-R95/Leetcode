int totalFruit(int* fruits, int fruitsSize) {
    int result = 0;
    int l = 0,r,t1=-1,t2=-1;
    for(r = 0; r < fruitsSize; r++){

        if(t1 == -1)
            t1 = fruits[r];
        else if(t2 == -1 && fruits[r] != t1)
            t2 = fruits[r];
        else{
            if(t1 != fruits[r] && t2 != fruits[r]){
                l = r - 1;
                while(l > 0 && fruits[l] == fruits[l-1]) l--;
                    t1 = fruits[l];
                    t2 = fruits[r];
            }
        }
        result = (result > r - l + 1) ? result : r - l + 1;
        



    }
    return result;
    
}
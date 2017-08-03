package com.kodilla.codewars;

/**
 * Created by RJanus on 01.08.2017.
 */
public class Sum {
        public static int getSum(int a,int b) {
            int max = 0;
            int min = 0;

            if(a>b){
                max = a;
                min = b;
            }
            else {
                max = b;
                min = a;
            }

            for(int i = min+1; i <= max; i++) {
                min = min + i;
            }
            return min;
        }

}

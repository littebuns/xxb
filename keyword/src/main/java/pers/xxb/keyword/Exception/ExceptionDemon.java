package pers.xxb.keyword.Exception;

import java.text.SimpleDateFormat;

/**
 * 异常处理的两种方式
 * 1.
 */
public class ExceptionDemon {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int[] arr = null;
        int element = getElement(arr, 0);

    }

    private static int getElement(int[] arr, int index) {
        //对传入的数组进行判空
        if (null == arr){
            throw new NullPointerException("传入的数组为空");
        }
        return arr[index];
    }
}

package pers.xxb.keyword.Enum;

import lombok.extern.slf4j.Slf4j;

/** dfs
 * sdfa
 * @author HP
 */

@Slf4j
public enum WeekDay {

    /**
     *
     */
    SUNDAY,

    MONDAY,

    Tuesday,

    WEDNESDAY,

    THURSDAY,

    FRIDAY,

    SATURDAY;



    public static void main(String[] args) {
        if (null != WeekDay.SUNDAY){
            System.out.println(WeekDay.SUNDAY);
            System.out.println(WeekDay.SUNDAY.ordinal());
        }

    }

}

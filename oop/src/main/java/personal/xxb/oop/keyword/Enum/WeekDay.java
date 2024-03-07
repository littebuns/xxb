package personal.xxb.oop.keyword.Enum;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 *
 * @author HP
 */

@Slf4j
public enum WeekDay {

    /**
     *
     */
    SUNDAY("礼拜天",7),

    MONDAY("礼拜一", 1),

    Tuesday("礼拜二", 2),

    WEDNESDAY("礼拜三",3),

    THURSDAY("礼拜四", 4),

    FRIDAY("礼拜五",5),

    SATURDAY("礼拜六",6);

    @Getter
    private final String name;
    @Getter
    private final int code;

    WeekDay(String name, int code){
        this.name = name;
        this.code = code;
    }




    public static void main(String[] args) {
        System.out.println(Arrays.toString(WeekDay.values()));
        System.out.println(WeekDay.SUNDAY.ordinal());
        System.out.println(WeekDay.SUNDAY.getName());
        System.out.println(WeekDay.SUNDAY.name);
    }

}

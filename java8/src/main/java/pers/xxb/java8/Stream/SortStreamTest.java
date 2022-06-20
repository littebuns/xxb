package pers.xxb.java8.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * 排序
 */
public class SortStreamTest {

    /**
     * 自然排序 该元素必须实现 comparable 接口
     */
    @Test
    public void t1(){
        Stream<String> stream = Stream.of("aaa", "ccc", "bbb");
        stream.sorted().forEach(System.out::println);
    }

    /**
     * 定制排序
     */
    @Test
    public void t2(){
        Stream<StreamEmploy> data = Stream.of(new StreamEmploy(12, "ddd"), new StreamEmploy(8, "aaa"), new StreamEmploy(12,"ccc"));
        data.sorted((e1, e2) ->{
           if (e1.getAge() == e2.getAge()){
               return e1.getName().compareTo(e2.getName());
           }else {
               return e1.getAge() - e2.getAge();
           }
        }).forEach(System.out::println);
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class StreamEmploy{
    private int age;
    private String name;
}
package pers.xxb.java8.Lambda.Stream;


import java.util.stream.Stream;

public class StreamCreate {

    public static void main(String[] args) {
        Stream<String> stream =  Stream.of("A","B");
        stream.forEach(System.out::print);
    }


}

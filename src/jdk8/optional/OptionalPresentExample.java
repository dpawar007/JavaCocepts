package jdk8.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Hello Optional");

        //isPresent()
        System.out.println(stringOptional.isPresent());

        if(stringOptional.isPresent()) {
        	System.out.println(stringOptional.get());
        }
        
        //ifPresent()
        stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
        stringOptional.ifPresent((System.out::println));
    }
}

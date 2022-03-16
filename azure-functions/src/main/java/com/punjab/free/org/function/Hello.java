package com.punjab.free.org.function;

import com.punjab.free.org.function.model.Greeting;
import com.punjab.free.org.function.model.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class Hello implements Function<Mono<User>, Mono<Greeting>> {

    public Mono<Greeting> apply(Mono<User> mono) {
        return mono.map(user -> new Greeting("Hello, " + user.getName() + "!\n"));
    }
}

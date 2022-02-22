package com.example;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Value;

import java.util.Optional;

@Value
@Serdeable
public class Pojo {
    String   name;
    //@Nullable
    Optional<String> surname;
}

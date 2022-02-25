package com.example;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public final class Pojo {
    private final String name;
    @Nullable
    @jakarta.persistence.GeneratedValue // <- N.B.
    private final String surname;

    public Pojo(String name, @Nullable String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getSurname() {
        return this.surname;
    }
}

package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.serde.ObjectMapper;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

@MicronautTest
class MicronautSerialization134Test {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }


    @Test
    void someTest(ObjectMapper mapper) throws Exception {
        assertThat(
            mapper.readValue(
                // language=JSON
                "{" +
                    "\"name\": \"somename\"" +
                "}",
            Pojo.class
        )).isNotNull();
    }

}

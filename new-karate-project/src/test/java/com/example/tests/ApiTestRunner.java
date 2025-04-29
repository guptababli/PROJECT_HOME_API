package com.example.tests;

import com.intuit.karate.junit5.Karate;

class ApiTestRunner {
    
    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:features/api/api-test.feature").relativeTo(getClass());
    }
}

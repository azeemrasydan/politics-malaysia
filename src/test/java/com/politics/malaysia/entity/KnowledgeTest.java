package com.politics.malaysia.entity;

import static  org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class KnowledgeTest {

    @Test
    void testGetKnownAs(){
        Knowledge knowledge = new Knowledge();
        knowledge.setKnownAs("PT3 Mathematics Level");
        assertEquals("PT3 Mathematics Level", knowledge.getKnownAs());
    }
}

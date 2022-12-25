package com.politics.malaysia.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SkillTest {
    @Test
    public void testSetKnownAs() {
        // Create a new Skill object and set its knownAs field
        Skill skill = new Skill();
        skill.setKnownAs("Java");

        // Assert that the knownAs field is set to the expected value
        assertEquals("Java", skill.getKnownAs());
    }

}

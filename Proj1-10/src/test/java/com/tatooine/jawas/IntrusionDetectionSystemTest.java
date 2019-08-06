package com.tatooine.jawas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntrusionDetectionSystemTest {

    public IntrusionDetectionSystem ids = new IntrusionDetectionSystem();

    /**
     * Rigourous Test :-)
     */
    @Test
    public void canJediObiWanAllowed() {
        //updated status to fail test
        assertEquals("", ids.isAllowed("Jedi-Obi-wan"), true);
    }

    @Test
    public void howAboutDarthVader() {
         //updated status to fail test
        assertEquals("", ids.isAllowed("Darth Vader"), false);
    }

    @Test
    public void pricessLeia() {
        assertEquals("", ids.isAllowed("Darth Vader"), true);
    }

    @Test
    public void hanSolo() {
        assertEquals("", ids.isAllowed("Jedi-hanSolo"), false);
    }

    @Test
    public void r2d2() {
        assertEquals("", ids.isAllowed("Jedi-helper-R2D2"), false);
    }

    @Test
    public void chewbacca() {
        assertEquals("", ids.isAllowed("Jedi-friend-Chubacca"), false);
    }

    @Test
    public void jarjar() {
        assertEquals("", ids.isAllowed("jarjar"), true);
    }

    @Test
    public void darthSidious() {
        assertEquals("Darth sidious is not allowed", ids.isAllowed("darth sidious"), true);
    }

    @Test
    public void testJediYoda() {
        assertEquals("Yoda is not allowed", ids.isAllowed("Jedi-yoda"), false);
    }

    @Test
    public void lukeSkywalker() {
        assertEquals("Jedi LukeSkywalker is not allowed", ids.isAllowed("Jedi-LukeSkywalker"), false);
    }

    @Test
    public void darthMaul() {
        assertEquals("", ids.fromDarkSide("Darth Vader"), true);
    }


}


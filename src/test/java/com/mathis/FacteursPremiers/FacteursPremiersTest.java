package com.mathis.FacteursPremiers;

import com.sun.source.doctree.SeeTree;
import org.junit.jupiter.api.Test;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FacteursPremiersTest {

    FacteursPremiers facteursPremiers = new FacteursPremiers();

    @Test
    public void Test1(){
        Set<Integer> set = facteursPremiers.generate(1);
        assertEquals(set,Set.of());

    }

    @Test
    public void Test2(){
        Set<Integer> set = facteursPremiers.generate(2);
        assertEquals(set,Set.of(2));

    }

}
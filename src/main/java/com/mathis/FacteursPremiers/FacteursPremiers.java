package com.mathis.FacteursPremiers;

import java.util.HashSet;
import java.util.Set;

public class FacteursPremiers {

    public Set<Integer> generate(int n){
        Set<Integer> facteursPremiers = new HashSet<>();

        if (n == 2){
            facteursPremiers.add(2);
        }

            return facteursPremiers;
    }
}

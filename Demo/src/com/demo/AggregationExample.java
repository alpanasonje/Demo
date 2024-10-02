package com.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class AggregationExample {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "pear", "apple", "banana");
        Map<Integer, Set<String>> result = words.stream()
            .collect(Collectors.groupingBy(String::length, 
                    Collectors.mapping(String::toUpperCase, 
                    Collectors.toSet())));
        result.forEach((length, set) -> {
            System.out.print(length + ": " + set+", ");
        });
    } }

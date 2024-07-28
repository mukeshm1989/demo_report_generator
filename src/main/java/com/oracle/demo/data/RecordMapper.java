package com.oracle.demo.data;

@FunctionalInterface
public interface RecordMapper<T> {
    T map(String[] columns);
}

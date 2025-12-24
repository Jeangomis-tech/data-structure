package com.jc;

public class Paire<K, V> {
    private K key;
    private V value;

    public Paire(K key, V value){
        this.key = key;
        this.value = value;
    }
}

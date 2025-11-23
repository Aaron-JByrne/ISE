package Generics;

class Pair<K,V>{
    public Pair(K key, V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){ return key;}
    public V getValue() { return value;}
    public void setKey(K key) {this.key=key;}
    public void setValue(V value) {this.value=value;}
    private K key;
    private V value;
}


public class Generics {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Hello", 123);
        Pair<Integer,Integer> pair2 = new Pair<>(9, 456);
        //Pair<String, Pair<String, Pair<String, Pair<String, String>>>> pair3 = new Pair<>("test", new Pair<>("test2", new Pair<>("test3", new Pair<>("test4", "test5"))));
    }
}

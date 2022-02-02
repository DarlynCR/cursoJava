package generics;

//Clase que recibe dos parámetros de tipo e implementa la interfaz que a su vez recibe 2 parámetros
public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //Métodos que retornan un generico
    public K getKey()    { return key; }
    public V getValue() { return value; }
}
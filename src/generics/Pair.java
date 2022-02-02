package generics;

// Los genéricos tambien se pueden aplicar a las interfaces
// Esta interfaz recibe dos parametros de tipo
public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}



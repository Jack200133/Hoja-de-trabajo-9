/**
 * @author unclepete-20 y Jack200133
 * Carnet 20188 y 20593
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 * Hoja de trabajo 9
 */

public interface Mapas<K,V> {

    void add(K key,V Valor);
    V get(K key);
    boolean contains(K key);
}

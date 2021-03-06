/**
 * @author unclepete-20 y Jack200133
 * Carnet 20188 y 20593
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 * Hoja de trabajo 9
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class HashMapa<K,V> implements Map,Mapas<K,V> {

    public HashMap<Object,Object> Mapita;

    public HashMapa(){
        Mapita = new HashMap<Object,Object>();
    }

    public int size(){
        return Mapita.size();
    }

    @Override
    public boolean isEmpty() {
        return Mapita.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return Mapita.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return Mapita.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return Mapita.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return Mapita.put(key,value);
    }

    @Override
    public Object remove(Object key) {
        return Mapita.remove(key);
    }

    @Override
    public void putAll(Map m) {
        Mapita.putAll(m);
    }

    @Override
    public void clear() {
        Mapita.clear();
    }

    @Override
    public Set keySet() {
        return Mapita.keySet();
    }

    @Override
    public Collection values() {
        return Mapita.values();
    }

    @Override
    public Set<Entry<Object,Object>> entrySet() {
        return Mapita.entrySet();
    }

    @Override
    public void add(K key, V Valor) {
        Mapita.put(key,Valor);
    }

    @Override
    public boolean contains(Object value) {
        return Mapita.containsKey(value);
    }
}

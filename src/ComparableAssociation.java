// asociacion que implementa comparable para la comparacion de datos (basada ern la viste en clase)
public class ComparableAssociation<K extends Comparable<K>,V>
        extends Association<K,V>
        implements Comparable<ComparableAssociation<K,V>> {


    public ComparableAssociation(K key)
    {
        this(key,null);
    }

    public ComparableAssociation(K key, V value)
    {
        super(key,value);
    }


    public int compareTo(ComparableAssociation<K,V> that)
    {
        return this.getKey().compareTo(that.getKey());
    }


    public String toString()
    {
        return "<" + getKey() + "=" + getValue() + ">";
    }
}

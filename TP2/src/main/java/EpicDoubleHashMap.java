import java.util.HashMap;
import java.util.Map;

public class EpicDoubleHashMap <K extends Number, V, T> {
    HashMap<K, V> map1;
    HashMap<K, T> map2;

    public EpicDoubleHashMap(){
        map1= new HashMap<>();
        map2= new HashMap<>();
    }

    public void addFirstType(K key, V value){
        map1.put(key, value);
    }

    public void addSecondType(K key, T value){
        map2.put(key, value);
    }

    public void addTwo(K key, V value, T value2){
        map1.put(key,value);
        map2.put(key,value2);
    }

    

}

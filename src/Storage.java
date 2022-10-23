import java.util.HashMap;
import java.util.Map;

public class Storage {
    HashMap<String, Integer> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public HashMap<String, Integer> getStorage() {
        return storage;
    }

    public void addSMTH(String key, Integer value) throws ExistedValueForKeyException {
        if (storage.put(key, value) == value){
            throw new ExistedValueForKeyException("уже есть такая пара ключ-значение");
        }
    }
    public void printMap() {
        for (Map.Entry<String, Integer> entry : storage.entrySet()) {
            System.out.println("Ключ " + entry.getKey() + " значение " + entry.getValue());
        }
    }

}

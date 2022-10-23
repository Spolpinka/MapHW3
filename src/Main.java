import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Storage first = new Storage();
        int numb = 20;//количество элементов в мапе
        String exist = "";
        String existKey = "";
        Integer existValue = 0;
        for (int i = 0; i < numb; i++) {
            int x = random.nextInt(100);
            try {
                first.addSMTH("ключ" + i, x);
                if (i == 5) {
                    exist = "ключ" + i;
                }
                if (i == 6) {
                    existKey = "ключ" + i;
                    existValue = x;
                }
            } catch (ExistedValueForKeyException e) {
                System.out.println(e);
            }
        }
        first.printMap();
        try {
            System.out.println("добавляем новое значение ключу " + exist);
            first.addSMTH(exist, 298347);
        } catch (ExistedValueForKeyException e) {
            System.out.println(e);
        }
        first.printMap();
        try {
            System.out.println("добавляем к тому же ключу " + existKey + " тоже значение " + existValue);
            first.addSMTH(existKey, existValue);
        } catch (ExistedValueForKeyException e) {
            System.out.println(e);
        }
    }

}
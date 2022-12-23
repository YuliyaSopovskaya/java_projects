// Урок 5. Хранение и обработка данных ч2: множество коллекций Map
// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
// Изменить значения сделав пол большой буквой.
// Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
// *Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.

// + 5 семинар 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class js_hw5 {
    // public static void main(String[] args) {
    //     HashMap<Integer, String> map = new HashMap();

    //     map.put(0, "Zero");  //0 - ключ/зеро - значение/ просто положить
    //     map.put(null, "null");
    //     map.put(1, "null"); //null это объект

    //     map.forEach((k, v) -> System.out.println(k+"="+v));

    //     String tmp = map.get(1); //значение по ключу
    //     tmp = map.getOrDefault(1,"default");


    //     Set<Integer> kset4 = map.keySet();
    //     Set<Map.Entry<Integer, String>> eset = map.entrySet(); //если нужно все вытащить из мапа

    //     map.remove(1); //уничтожение по ключу

    //     if(map.containsKey(1)) map.remove(1);
    //     if(map.containsValue("One")) System.out.println("True");

    //     map.size();
    //     map.isEmpty();

    //     map.putIfAbsent(1, "One"); //защита от перезаписи
    //     map.replace(1, "newOne");
    //     map.clear();

    //     map.put(0, "Zero");  //0 - ключ/зеро - значение/ просто положить
    //     map.put(1, "One");
    //     map.put(2, "Two"); //null это объект
    //     map.compute(1, (k, v) -> v +="!");  // разворачивает сразу
    //     map.computeIfPresent(1, (k,v) -> v=v.toUpperCase());
    //     map.computeIfAbsent(3, v -> "!");

    //     System.out.println(map);

    // }

    static Map fillingStr(Map<Integer, String> human){
        human.put(1,"Иванов Иван Иванович 18 м");
        human.put(2,"Петров Петр Петрович 25 м");
        human.put(3,"Сидоров Сидр Сидорович 55 м");
        human.put(4,"Козлова Анастасия Игоревна 46 ж");
        human.put(5,"Чехов Антон Палыч 58 м");
        return human;
    }
    static void printEntry(Map<Integer, String> people){
        for (Map.Entry entry: people.entrySet()) {
            System.out.println(entry);
        }
    }
    static void printKeys(Map<Integer,String> people){
        Set<Integer> keys = people.keySet();
        System.out.println("Список ключей   "+keys);
    }

    static void toUp(Map<Integer, String> people){
        Set<Integer> keys = people.keySet();
        for (Integer key: keys){
            String str = people.get(key);
            int ind = str.length()-1; //gender index
            str =str.substring(0,ind) + Character.toUpperCase(str.charAt(ind));
            System.out.println(str);
            people.put(key, str);
        }
    }
    static void fio(Map<Integer, String> people){
        Set<Integer> keys = people.keySet();
        for (Integer key: keys){
            String[] str = people.get(key).split(" ");
            String name = Character.toUpperCase(str[1].charAt(0))+".";
            String thirdName = Character.toUpperCase(str[2].charAt(0))+".";
            people.put(key, str[0]+" "+name+thirdName+" "+str[3]+" "+str[4]);
        }
        toUp(people);
    }
    static void finSort(Map<Integer, String> people){
        Set<Integer> keys = people.keySet();
        LinkedList<String>list = new LinkedList<>();
        for (Integer key: keys){
            list.add(people.get(key));
        }
        for (int i = 0; i < list.size(); i++) {
            int max = Integer.parseInt(list.get(i).split(" ")[2]);
            for (int j = 0; j < list.size(); j++) {
                int curAge = Integer.parseInt(list.get(j).split(" ")[2]);
                if (max < curAge){
                    max = curAge;
                    String str = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, str);
                }
            }
        }
        System.out.println("\nСортировка по возрасту:");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people = fillingStr(people);
        printKeys(people);
        System.out.println("\nСписок значений (Key = Value)\n");
        printEntry(people);
        System.out.println("\nЗаменим маленькие буквы значения ПОЛ на большие:\n");
        toUp(people);
        System.out.println("\nСократим Имя и Отчество до инициалов:\n");
        fio(people);
        finSort(people);

    }

}


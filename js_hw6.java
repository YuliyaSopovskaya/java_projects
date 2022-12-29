import java.util.*;

// 6. Хранение и обработка данных ч3: множество коллекций Set
//  1 Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
//  2 Добавить пять элементов в множество.
//  3 Отсортировать значения используя итератор.
//  4 Отсортированный результат сохранить в LinkedHashSet
//  5 Создать TreeSet с компаратором.
//  6 Скопировать содержимое первого множества (HashSet) в TreeSet.
//  7 *Скорректировать компаратор так, чтобы поля хранились в обратном порядке.


public class js_hw6 {
    static HashSet putTo(HashSet<String> set, String element){    //Задание 2 вызывается в цикле в main
        set.add(element);
        return set;
    }
    static void printSet(HashSet<String>set){
        System.out.println(set);
    }
    static LinkedHashSet sort(HashSet<String> set){
        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        Iterator<String> iterator= set.iterator(); {
        }
        String str = "";
        while (iterator.hasNext()){        //Задание 3 список итераторов
            str+= iterator.next()+" ";
        }
        String [] arr = str.substring(0,str.length()-1).split(" ");  //сортировка
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (maxStr(arr[i],arr[j])){
                    String tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            lSet.add(arr[i]);   //Задание 4 Отсортированный элемент идет в LinkedHashSet 
        }
        System.out.println("This is LinkedHashSet "+lSet);
        return lSet;
    }
    //сравнение строк
    static boolean maxStr(String s1, String s2){
        int len = 0;
        boolean flag = false;
        if (s1.length()>s2.length()){len = s2.length();}
        else len = s1.length();
        for (int i = 0; i < len ; i++) {
            char ch1 = s1.charAt(i);       //сравнение строк
            char ch2 = s2.charAt(i);      
            if (ch1 > ch2){flag = true; break;}
            else if (ch1 < ch2){flag = false; break;}   //меняя вывод false и true местами можем получить обратную сортировку
        }
        return flag;
    }

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();   //1 задание
        LinkedHashSet<String> myLinkedSet = new LinkedHashSet<>();
        Random rand = new Random(100);      
        int numberOfElement = 5;                   //количество элементов мн-ва
        String str = "a";                          //добавим букву, чтобы по первой букве не отсортировывались
        for (int i = 0; i < numberOfElement; i++) {
            putTo(mySet, str+"R"+(rand.nextInt(100)) );   //и вторую букву с цифрами
        }
        printSet(mySet);
        myLinkedSet = sort(mySet);

        // TreeSet с компаратором
        TreeSet<String> myTreeSet = new TreeSet<>(new Comparator<String>() {   //Задание 5
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2)>0) {return 1;}
                else return -1;
            }
        });
        myTreeSet.addAll(mySet);            //задание 6 Comparator за нас все делает
        System.out.println("\n"+mySet);
        System.out.println("This is TreeSet with Comparator "+myTreeSet);

    
        TreeSet<String> myTreeSet1 = new TreeSet<>(new Comparator<String>() {  //делаем treeSet с компаратором в обратном порядке
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2)>0) {return -1;}        //меняем значения(1 на -1) после <  >  получим обратную сортировку
                else return 1;
            }
        });
        myTreeSet1.addAll(mySet);
        System.out.println("\n"+mySet);
        System.out.println("This is TreeSet with Comparator Reversed "+myTreeSet1);   //Задание 7
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

// 1 Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// 2 Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3 Вставить элемент в список в первой позиции.
// 4 Извлечь элемент (по указанному индексу) из заданного списка.
// 5 Обновить определенный элемент списка по заданному индексу.
// 6 Удалить третий элемент из списка.
// 7 Поиска элемента в списке по строке.
// 8 Создать новый список и добавить в него несколько елементов первого списка.
// 9 Удалить из первого списка все элементы отсутствующие во втором списке.

// public class js_hw3 {
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,23));
//         System.out.println(list);

public class js_hw3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Gold");
        colors.add("Pink");
        System.out.print(colors);
        for (int i = 0; i < colors.size(); i++) {
            colors.set(i,colors.get(i)+"!" );// 2
        }
        System.out.print("\n"+colors);
        colors.add(0,"Black");// 3
        System.out.print("\n"+colors);
        System.out.println("\n"+colors.get(3));// 4
        colors.set(4, "White");
        System.out.print("\n"+colors);// 5
        colors.remove(3);
        System.out.print("\n"+colors);// 6
        if (colors.contains("White")){
            System.out.println("\nWhite содержится в списке по индексу - "+ colors.indexOf("White"));
        }
        else System.out.println("\nТакого нет");// 7

        // новый список
        ArrayList<String> newColors = new ArrayList<String>();
        newColors.addAll(0, colors.subList(2,5));// 8
        System.out.println(newColors);
        colors = newColors;// 9
        System.out.println(colors);

    }
}

// Урок 2. Почему вы не можете не использовать API



// 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
unction isSubstring(str1, str2) {
// Проверяем, что строка str1 содержит все символы str2
  for (let i = 0; i < str2.length; i++) {
    if (!str1.includes(str2[i])) {
      return false;
    }
  }
  return true;
}
// Примеры использования
console.log(isSubstring("привет", "иве")); // вернет true
console.log(isSubstring("привет", "ивз")); // вернет false



// 2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// Функция для проверки, является ли строка str1 вращением строки str2
function isRotation(str1, str2) {
// Если длины строк не совпадают, значит они не являются вращением друг друга
  if (str1.length !== str2.length) {
    return false;
  }
// Создаем двустороннюю строку, состоящую из двух копий строки str1
  var doubleStr = str1 + str1;
// Используем метод String.prototype.includes() для проверки,является ли str2 подстрокой str
  return str.includes(str2);
}
// Чтобы проверить, являются ли строки str1 и str2 вращением друг друга, вы можете вызвать эту функцию следующим образом:
is_rotation('hello', 'ohell')  # True, т.к. 'ohell' - это вращение 'hello'
is_rotation('hello', 'hello')  # False, т.к. строки совпадают, но не являются вращением 



// 3 *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
public class js_hw2 {
    
    public static void main(String[] args) {
        function reverseString(str){
         if (str == "") {
             return ""; 
        } 
         else { 
            returnreverseString(str.substr(1)) + str.charAt(0); 
        }
        } 
        console.log(reverseString("Hello World!")); // "!dlroW olleH"
        //  В этом коде функция reverseString() вызывает саму себя с укораченной строкой, 
        // каждый раз добавляя к ней первый символ исходной строки. 
        // Когда строка станет пустой, функция вернет пустую строку, 
        // и рекурсивные вызовы будут возвращаться обратно, добавляя к каждой укороченной строке первый символ
    }
}



// 4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
int a = 3;
int b = 56;
StringBuilder sb = new StringBuilder();
sb.append(a + "+" + b + "=" + (a + b));
sb.append(a + "-" + b + "=" + (a - b));
sb.append(a + "*" + b + "=" + (a * b));
// Выводим содержимое StringBuilder на экран
System.out.println(sb.toString());



// 5 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
int index = sb.indexOf("=");
if (index >= 0) {
sb.deleteCharAt(index);
sb.insert(index, "равно");
}
System.out.println(sb);
// В результате выполнения этого кода в переменной sb будет храниться строка 
// Заменим символ «=» на слово «равно». 
// Обратите внимание, что метод indexOf() 
// возвращает индекс первого вхождения указанного символа в строку

//2 способ
StringBuilder sb = new StringBuilder("x = y");
// Найдем индекс символа '='

int index = sb.indexOf("=");
// Удалим символ '='

sb.deleteCharAt(index);
// Вставим слово "равно" на место удаленного символа

sb.insert(index, "равно");
// Получим обновленную строку

String updatedString = sb.toString();
  

// Хранение и обработка данных ч1: приоритетные коллекции

// 1 Написать приложение для ввода ФИО, возраста и пола пользователей. Данные хранить в разных списках.
// 2 Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.
// 3 *Добавить возможность одновременной сортировки по двум параметрам.
// 4 **Добавить возможность одновременной сортировки по трём параметрам.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class js_hw4 {
    
// создаем три списка для хранения ФИО, возраста и пола пользователей
let names = [];
let ages = [];
let genders = [];

// функция для добавления нового пользователя
function addUser() {
  // запрашиваем у пользователя ФИО, возраст и пол
  let name = prompt("Введите ФИО:");
  let age = prompt("Введите возраст:");
  let gender = prompt("Введите пол (мужской или женский):");

  // добавляем введенные данные в списки
  names.push(name);
  ages.push(age);
  genders.push(gender);
}

// функция для вывода списка пользователей
function showUsers() {
  // выводим заголовок таблицы
  console.log("ФИО\tВозраст\tПол");

  // в цикле перебираем всех пользователей и выводим их данные
  for (let i = 0; i < names.length; i++) {
    console.log(`${names[i]}\t${ages[i]}\t${genders[i]}`);
  }
}

// добавляем несколько пользователей
addUser();
addUser();
addUser();

// выводим список пользовател


// функция для сортировки пользователей по возрасту
function sortByAge() {
    // сортируем списки с ФИО и полом согласно списку с возрастами
    names.sort((a, b) => ages[a] - ages[b]);
    genders.sort((a, b) => ages[a] - ages[b]);
  }
  
  // функция для сортировки пользователей по полу
  function sortByGender() {
    // сортируем списки с ФИО и возрастами согласно списку с полом
    names.sort((a, b) => genders[a].localeCompare(genders[b]));
    ages.sort((a, b) => genders[a].localeCompare(genders[b]));
  }
  
  // функция для сортировки пользователей по первой букве фамилии
  function sortByLastName() {
    // разбиваем ФИО каждого пользователя на три части: имя, фамилия и отчество
    let namesSplit = names.map(name => name.split(' '));
  
    // сортируем списки с возрастами и полом согласно списку с ФИО
    names.sort((a, b) => namesSplit[a][1].localeCompare(namesSplit[b][1]));
    ages.sort((a, b) => namesSplit[a][1].localeCompare(namesSplit[b][1]));


}

// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k); //это кидалка случайных чисел!) 

console.log(Math.floor(Math.random() * 2000) + 1); //1 пункт

function getMostSignificantBit(num) { //2 пункт
    let mostSignificantBit = 0;
  
    while (num > 0) {
      num = num >> 1;
      mostSignificantBit++;
    }
  
    return mostSignificantBit;
  }
  
  const n = getMostSignificantBit(someNumber);

  function findMultiple(n, i) {  //3 пункт
    let m1 = [];
    let current = i;
    while (current <= Short.MAX_VALUE) {
      if (current % n === 0) {
        m1.push(current);
      }
      current++;
    }
    return m1;
  }

  function findNonMultiple(n, i) { //4 пункт
    let m2 = [];
    let current = Short.MIN_VALUE;
    while (current <= i) {
      if (current % n !== 0) {
        m2.push(current);
      }
      current++;
    }
    return m2;
  }

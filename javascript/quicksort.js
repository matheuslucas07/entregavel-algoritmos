function quicksort(arr) {
  if (arr.length <= 1) return arr;
  const pivo = arr[Math.floor(arr.length / 2)];
  const menores = arr.filter(x => x < pivo);
  const iguais = arr.filter(x => x === pivo);
  const maiores = arr.filter(x => x > pivo);
  return [...quicksort(menores), ...iguais, ...quicksort(maiores)];
}

console.log("--- Quicksort ---");
console.log(`Ordenado: ${quicksort([5, 3, 8, 1, 9, 2])}`);

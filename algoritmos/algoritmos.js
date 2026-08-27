// 1. Número é primo
function ehPrimo(n) {
  if (n < 2) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}

// 2. Somatório
function somatorio(numeros) {
  let soma = 0;
  for (let i = 0; i < numeros.length; i++) {
    soma += numeros[i];
  }
  return soma;
}

// 3. Fibonacci
function fibonacci(n) {
  if (n === 0) return 0;
  if (n === 1) return 1;
  let anterior = 0, atual = 1;
  for (let i = 2; i <= n; i++) {
    const proximo = anterior + atual;
    anterior = atual;
    atual = proximo;
  }
  return atual;
}

// 4. Máximo divisor comum
function mdc(a, b) {
  while (b !== 0) {
    const resto = a % b;
    a = b;
    b = resto;
  }
  return a;
}

// 5. Ordenação (Quicksort)
function quicksort(arr) {
  if (arr.length <= 1) return arr;
  const pivo = arr[Math.floor(arr.length / 2)];
  const menores = arr.filter(x => x < pivo);
  const iguais = arr.filter(x => x === pivo);
  const maiores = arr.filter(x => x > pivo);
  return [...quicksort(menores), ...iguais, ...quicksort(maiores)];
}

// 6. Contagem
function contagem(primeiro, n) {
  let contador = 0;
  for (let i = primeiro; i <= n; i++) {
    contador++;
  }
  return contador;
}

// ---- Testes ----
console.log("--- Número primo ---");
console.log(`17 é primo? ${ehPrimo(17)}`);

console.log("--- Somatório ---");
console.log(`Somatório de [1,2,3,4,5] = ${somatorio([1, 2, 3, 4, 5])}`);

console.log("--- Fibonacci ---");
for (let i = 0; i <= 10; i++) {
  console.log(`Fibonacci(${i}) = ${fibonacci(i)}`);
}

console.log("--- MDC ---");
console.log(`MDC(48, 18) = ${mdc(48, 18)}`);

console.log("--- Quicksort ---");
console.log(`Ordenado: ${quicksort([5, 3, 8, 1, 9, 2])}`);

console.log("--- Contagem ---");
console.log(`Quantidade de inteiros entre 1 e 10: ${contagem(1, 10)}`);
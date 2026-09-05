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

console.log("--- Fibonacci ---");
for (let i = 0; i <= 10; i++) {
  console.log(`Fibonacci(${i}) = ${fibonacci(i)}`);
}

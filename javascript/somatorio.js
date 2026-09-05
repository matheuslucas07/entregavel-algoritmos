function somatorio(numeros) {
  let soma = 0;
  for (let i = 0; i < numeros.length; i++) {
    soma += numeros[i];
  }
  return soma;
}

console.log("--- Somatório ---");
console.log(`Somatório de [1,2,3,4,5] = ${somatorio([1, 2, 3, 4, 5])}`);

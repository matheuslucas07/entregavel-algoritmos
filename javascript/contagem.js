function contagem(primeiro, n) {
  let contador = 0;
  for (let i = primeiro; i <= n; i++) {
    contador++;
  }
  return contador;
}

console.log("--- Contagem ---");
console.log(`Quantidade de inteiros entre 1 e 10: ${contagem(1, 10)}`);

function mdc(a, b) {
  while (b !== 0) {
    const resto = a % b;
    a = b;
    b = resto;
  }
  return a;
}

console.log("--- MDC ---");
console.log(`MDC(48, 18) = ${mdc(48, 18)}`);

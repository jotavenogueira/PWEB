function maiorNumero(a, b, c) {
    return Math.max(a, b, c);
}

function ordenarCrescente(a, b, c) {
    return [a, b, c].sort((x, y) => x - y);
}

function verificarPalindromo(texto) {
    let limpo = texto.toLowerCase().replace(/\s+/g, '');
    let reverso = limpo.split('').reverse().join('');
    return limpo === reverso;
}

function verificarSubconjunto(p1, p2) {
    if (!p1 || !p2) return "erro";
    return p1.includes(p2) ? "É um subconjunto" : "Não é um subconjunto";
}

function obterDiaSemana(dataString) {
    let dias = ["Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"];
    let data = new Date(dataString);
    data.setMinutes(data.getMinutes() + data.getTimezoneOffset()); 
    return dias[data.getDay()];
}
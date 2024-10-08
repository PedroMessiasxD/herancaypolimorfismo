# Projeto de Herança e Polimorfismo

Este projeto é uma implementação prática dos conceitos de herança e polimorfismo em Java, abordando a criação e manipulação de uma hierarquia de classes que representam animais e funcionários em uma empresa. O projeto é dividido em uma série de exercícios que exploram diferentes aspectos desses conceitos.

## Exercício 01

Criação de uma hierarquia de classes para representar três tipos de animais:

- **Animal** (Classe base):
  - Atributos: `nome`, `idade`
  - Métodos: `emitirSom()`

- **Cachorro** (Herda de Animal):
  - Métodos: `emitirSom()` + `correr()`

- **Cavalo** (Herda de Animal):
  - Métodos: `emitirSom()` + `correr()`

- **Preguiça** (Herda de Animal):
  - Métodos: `emitirSom()` + `subirEmArvore()`

## Exercício 02

Implemente um programa que cria instâncias das classes `Cachorro`, `Cavalo` e `Preguiça`, e chama o método `emitirSom()` de cada um de forma polimórfica. O objetivo é demonstrar como o polimorfismo permite tratar diferentes tipos de animais de forma uniforme.

## Exercício 03

Criação da classe `Veterinario` com um método `examinar(Animal animal)`, que faz o animal emitir um som. O programa deve passar instâncias dos três tipos de animais como parâmetro para o método `examinar()` e verificar a execução correta.

## Exercício 04

Implementação da classe `Zoologico` que contém um array de 10 jaulas, cada uma contendo um animal diferente. O programa deve percorrer cada jaula, emitir o som dos animais e, se o animal possuir o comportamento de correr, o programa deve simular esse comportamento.

## Exercício 05

Criação de um modelo para registro da vida acadêmica dos funcionários:

- **Funcionario**:
  - Atributos: `nome`, `codigoFuncional`

- **FuncionarioEnsinoBasico** (Herda de Funcionario):
  - Atributos adicionais: `escola`

- **FuncionarioEnsinoMedio** (Herda de FuncionarioEnsinoBasico):
  - Atributos adicionais: `escola`

- **FuncionarioGraduacao** (Herda de FuncionarioEnsinoMedio):
  - Atributos adicionais: `universidade`

## Exercício 06

Estensão do modelo com cálculo da renda dos funcionários baseado na escolaridade:

- Renda básica: R$1000,00
- Ensino Básico: 10% adicional
- Ensino Médio: 50% adicional
- Graduação: 100% adicional

## Exercício 07

Simulação de uma empresa com 10 funcionários, distribuídos da seguinte forma:

- 40% Ensino Básico
- 40% Ensino Médio
- 20% Nível Superior

O programa calcula os custos da empresa com salários totais e por nível de escolaridade.

## Exercício 08

Criação de uma hierarquia de comissões para funcionários:

- **Gerente**: R$1500,00 de adicional
- **Supervisor**: R$600,00 de adicional
- **Vendedor**: R$250,00 de adicional

## Exercício 09

Modificação da classe `Funcionario` para incluir um atributo referente às comissões, e ajuste do cálculo da renda total para incluir o adicional da comissão.

## Exercício 10

Revisão do exercício 7 para considerar a seguinte distribuição de cargos:

- 10% Gerentes
- 20% Supervisores
- 70% Vendedores

## Exercício 11

Sobreescrever o método `toString` na classe `Funcionario` para imprimir o nome do funcionário, a comissão e o salário total. O programa deve imprimir todos os funcionários da empresa criada no exercício 7.

---

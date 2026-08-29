# Chess System

> Sistema de jogo de xadrez completo desenvolvido em Java, executado via terminal. Projeto com foco na aplicação dos pilares da Programação Orientada a Objetos.

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?logo=openjdk&logoColor=white)](https://www.oracle.com/java/technologies/downloads/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

---

## Índice

1. [Visão geral](#visão-geral)
2. [Stack técnica](#stack-técnica)
3. [Arquitetura](#arquitetura)
4. [Conceitos aplicados](#conceitos-aplicados)
5. [Como rodar localmente](#como-rodar-localmente)
6. [Preview](#preview)
7. [Licença](#licença)
8. [Autor](#autor)

---

## Visão geral

Este projeto implementa as regras completas do xadrez em Java puro, sem frameworks externos. O objetivo foi praticar modelagem de domínio, herança, polimorfismo e encapsulamento em um cenário real e complexo.

Funcionalidades principais:

- Tabuleiro 8x8 renderizado no terminal com cores ANSI
- Todas as peças implementadas: Rei, Rainha, Torre, Bispo, Cavalo e Peão
- Movimentos especiais: roque, en passant e promoção de peão
- Controle de turnos (brancas e pretas)
- Validação de movimentos legais
- Detecção de xeque e xeque-mate
- Exibição de peças capturadas

---

## Stack técnica

| Camada | Tecnologia |
|---|---|
| Linguagem | Java 17+ |
| Paradigma | Programação Orientada a Objetos (POO) |
| Versionamento | Git e GitHub |

---

## Arquitetura

```
src/
├── application/        # Ponto de entrada (main)
├── boardgame/          # Camada genérica de tabuleiro (Board, Piece, Position)
└── chess/              # Camada de xadrez
    ├── pieces/         # Implementação de cada peça
    ├── ChessMatch.java # Lógica central da partida
    ├── ChessPiece.java # Abstração de peça de xadrez
    └── ChessPosition.java
```

---

## Conceitos aplicados

- **Herança** — ChessPiece extends Piece, cada peça estende ChessPiece
- **Polimorfismo** — método `possibleMoves()` sobrescrito em cada peça
- **Encapsulamento** — atributos privados com acesso controlado
- **Tratamento de exceções** — ChessException e BoardException customizadas
- **Coleções** — listas para peças ativas e capturadas

---

## Como rodar localmente

### Pré-requisitos

- JDK 17+
- Terminal Git Bash ou Linux (recomendado, para renderização correta das cores ANSI)

### Passos

```bash
git clone https://github.com/EndriwEngSoft/chess-system.git
cd chess-system

javac -d bin src/application/Program.java
java -cp bin application.Program
```

---

## Preview

```
8 R N B Q K B N R
7 P P P P P P P P
6 - - - - - - - -
5 - - - - - - - -
4 - - - - - - - -
3 - - - - - - - -
2 P P P P P P P P
1 R N B Q K B N R
  a b c d e f g h
```

---

## Licença

Distribuído sob a licença MIT. Veja [LICENSE](LICENSE) para o texto completo.

---

## Autor

**Endriw Colvara Bento**  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://linkedin.com/in/endriw-bento)
[![Portfólio](https://img.shields.io/badge/Portf%C3%B3lio-000?style=flat&logo=vercel&logoColor=white)](https://endriwdev.vercel.app/)

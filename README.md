# ♟️ Chess System

Sistema de jogo de xadrez completo desenvolvido em Java, executado via terminal. Projeto com foco na aplicação dos pilares da Programação Orientada a Objetos.

## 📌 Sobre o Projeto

Este projeto implementa as regras completas do xadrez em Java puro, sem frameworks externos. O objetivo foi praticar modelagem de domínio, herança, polimorfismo e encapsulamento em um cenário real e complexo.

## ✨ Funcionalidades

- Tabuleiro 8x8 renderizado no terminal com cores ANSI
- Todas as peças implementadas: Rei, Rainha, Torre, Bispo, Cavalo e Peão
- Movimentos especiais: roque, en passant e promoção de peão
- Controle de turnos (brancas e pretas)
- Validação de movimentos legais
- Detecção de xeque e xeque-mate
- Exibição de peças capturadas

## 🛠️ Tecnologias

- Java 17+
- Programação Orientada a Objetos (POO)
- Git e GitHub

## 🏗️ Arquitetura

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

## 🧠 Conceitos Aplicados

- **Herança** — ChessPiece extends Piece, cada peça estende ChessPiece
- **Polimorfismo** — método `possibleMoves()` sobrescrito em cada peça
- **Encapsulamento** — atributos privados com acesso controlado
- **Tratamento de exceções** — ChessException e BoardException customizadas
- **Coleções** — listas para peças ativas e capturadas

## ▶️ Como Executar

```bash
# Clone o repositório
git clone https://github.com/EndriwEngSoft/chess-system.git

# Entre na pasta
cd chess-system

# Compile
javac -d bin src/application/Program.java

# Execute
java -cp bin application.Program
```

> **Recomendado:** Execute no terminal Git Bash ou Linux para renderização correta das cores ANSI.

## 📷 Preview

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

## 👨‍💻 Autor

**Endriw Colvara Bento**  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://linkedin.com/in/endriw-bento)
[![Portfólio](https://img.shields.io/badge/Portf%C3%B3lio-000?style=flat&logo=vercel&logoColor=white)](https://portfolio-endriw.vercel.app)

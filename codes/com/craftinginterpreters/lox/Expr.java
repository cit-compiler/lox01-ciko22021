package com.craftinginterpreters.lox;
 static class Binary extends Expr {
    Binary(Expr left, Token operator, Expr right) {
      this.left = left;
      this.operator = operator;
      this.right = right;
    }

   final Expr left;
    final Token operator;
    final Expr right;
}
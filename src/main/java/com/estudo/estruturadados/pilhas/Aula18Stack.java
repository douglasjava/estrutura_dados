package com.estudo.estruturadados.pilhas;

import java.util.Stack;

public class Aula18Stack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		System.out.println(stack.isEmpty());

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.size());
		System.out.println(stack);

		System.out.println(stack.peek()); // Vai imprimir o último

		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
	}

}

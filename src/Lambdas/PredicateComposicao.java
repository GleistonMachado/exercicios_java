package Lambdas;

import java.util.function.Predicate;

public class PredicateComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = numero -> numero %2 == 0;
		Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;
		
		// Primeiro exemplo veirfica se é par somete.
		System.out.println(isPar.test(22)); // true
		
		
		// Segundo exemplo verifica se é par e tem tres digitos.
		System.out.println(isPar.and(isTresDigitos).test(123));  // false porque não é par
		
		
		// Terceiro verifica se é par e tem tres digitos.
		System.out.println(isPar.and(isTresDigitos).test(122)); // true
		
		
		// Quarto exemplo verifica se é par e tem tres digitos e inverte o resultado final.
		System.out.println(isPar.and(isTresDigitos).negate().test(123)); 
		
		// negate() Inverte o valor final, se for true vira false e se fro false vira true
		
		
		// Quinto exemplo verifica se é par ou tem tres digitos.
		System.out.println(isPar.or(isTresDigitos).test(123));  // true porque tem tres digitos
		
		
	}
}

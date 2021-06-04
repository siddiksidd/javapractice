package com.vm.java.training.newfeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class InBuiltFunctional {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (var1)->var1>2;
		System.out.println(predicate.test(3));
		
		Predicate<String> predicate2 = (v1)->v1.startsWith("a");
		System.out.println(predicate2.test("asam"));
		
		Function<String, String> f1=(var)->var.concat(" Hello Welcome");
		System.out.println(f1.apply("Siddik"));
		
		Function<String, Integer> f2=(var)->var.length();
		System.out.println(f2.apply("Siddik"));

	}

}

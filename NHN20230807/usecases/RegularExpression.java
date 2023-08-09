package NHN20230807.usecases;

import NHN20230801.practice_01.BinaryOperation;
import NHN20230807.regular.*;

public class RegularExpression {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or( a.then( b ) );
        Expression ba_a0n = b.then( a ).or( Expression.EPSILON.or( a.star() ) );

//        BinaryOperation e = new Or(a, b);

//        System.out.println(a_ab); // (a|(ab))
        System.out.println(PrintableForm.of(a_ab));
        System.out.println(Literals.of(a_ab)); // aab

//        System.out.println(ba_a0n); // ((ba)|(ε|(a)*))
        System.out.println(PrintableForm.of(ba_a0n));
        System.out.println(Literals.of(ba_a0n)); // baa

    }
}
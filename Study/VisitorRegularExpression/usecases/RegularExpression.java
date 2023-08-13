package Study.VisitorRegularExpression.usecases;

import Study.VisitorRegularExpression.regular.Expression;
import Study.VisitorRegularExpression.regular.Literal;

public class RegularExpression {

    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or( a.then( b ));
        Expression ba_a0n = b.then( a ).or (Expression.EPSILON.or( a.star() ));

        System.out.println(PrintableForm.of(a_ab));     // (a|(ab))
        System.out.println(Literals.of(a_ab));          // aab

        System.out.println(PrintableForm.of(ba_a0n));   // ((ba)|(ε|(a)*))
        System.out.println(Literals.of(ba_a0n));        // baa
    }
}

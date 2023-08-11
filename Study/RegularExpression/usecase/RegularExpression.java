package RegularExpression.usecase;

import RegularExpression.regular.Expression;
import RegularExpression.regular.Literal;

public class RegularExpression {

    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or( a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.EPSILON.or(a.start()));

        System.out.println(a_ab);
        System.out.println(ba_a0n);
    }
}

package Study.VisitorRegularExpression.usecases;

import Study.VisitorRegularExpression.regular.Visitor;
import Study.VisitorRegularExpression.regular.*;

public class PrintableForm implements Visitor {

    private StringBuilder printableFormStringBuilder = new StringBuilder();
    @Override
    public void visit(Epsilon e) {
        printableFormStringBuilder.append("\u03B5");
    }

    @Override
    public void visit(Literal e) {
        printableFormStringBuilder.append(e.getCharacter());
    }

    @Override
    public void visit(Then e) {
        printableFormStringBuilder.append("(");
        e.getLeft().accept(this);
        printableFormStringBuilder.append("");
        e.getRight().accept(this);
        printableFormStringBuilder.append(")");
    }

    @Override
    public void visit(Or e) {
        printableFormStringBuilder.append("(");
        e.getLeft().accept(this);
        printableFormStringBuilder.append("|");
        e.getRight().accept(this);
        printableFormStringBuilder.append(")");
    }

    @Override
    public void visit(Star e) {
        printableFormStringBuilder.append("(");
        e.getExpression().accept(this);
        printableFormStringBuilder.append(")");
        printableFormStringBuilder.append("*");
    }

    public String getPrintableForm() {
        return this.printableFormStringBuilder.toString();
    }
    public static String of(Expression e) {
        PrintableForm printableForm = new PrintableForm();
        e.accept(printableForm);
        return printableForm.getPrintableForm();
    }

}

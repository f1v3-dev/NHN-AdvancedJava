package NHN20230808.DynamicDispatch;

import NHN20230807.regular.*;

public interface Visitor {

    public void visit(Left left);
    public void visit(Right right);
}

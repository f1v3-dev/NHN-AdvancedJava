package NHN20230808.subtyping;

abstract class 동물 {
    public final String type() {
        return this.getClass().getSimpleName();
    }

    public boolean 날수있니() {
        return false;
    }
}

class 새 extends 동물 {
    @Override
    public boolean 날수있니() {
        return true;
    }
}


class 박쥐 extends 새 {
}

class 참새 extends 새 {
}


class 펭귄 extends 새 {
    @Override
    public boolean 날수있니() {
        return false;
    }
}


public class Typing {
    public static void 날수있니(동물 x) {
        System.out.println(x.type() + (x.날수있니() ? "는(은) 날 수 있어." : "는(은) 못 날아."));
    }

    public static void main(String[] args) {

        // static type => 동물
        // 변수의 actual type에 따라 다름
        동물[] 동물들 = {new 박쥐(), new 참새(), new 펭귄()};

        // Override의 예시 -> RTTI를 감춘 것
        for (동물 한마리 : 동물들) {
            Typing.날수있니(한마리);
        }

    }
}

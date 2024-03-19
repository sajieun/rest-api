package Part5.ch04;

import Part5.ch04.model.CC;
// BB는 노출을 시키지 않는다 (BB.class)(BB.java : X)
public class BB implements CC {
    @Override
    public void x() {
        System.out.println("x동작이 실행된다.");
    }

    @Override
    public void y() {
        System.out.println("y동작이 실행된다.");
    }

    @Override
    public void z() {
        System.out.println("z동작이 실행된다.");
    }
}

package controller.mock;

import contract.IDoor;

public class DoorMock extends ElementMock implements IDoor {

    boolean unl;

    public DoorMock(int x, int y) {
        super(x, y, true);
        this.unl = false;
    }

    public boolean isUnlocked() {
        return unl;
    }

    public void setUnlocked(boolean unlocked) {
        unl = unlocked;
    }
}

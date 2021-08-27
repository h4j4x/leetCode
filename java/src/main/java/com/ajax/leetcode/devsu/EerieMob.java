package com.ajax.leetcode.devsu;

public class EerieMob {
    public static final String COMPLETE_GUY = "(-_-)";
    public static final String NO_GUY = "(O_o)";
    public static final String[] FINAL_GUYS = new String[]{"(-", "-)"};
    public static final String[] PARTIAL_GUYS = new String[]{"(-_-", "-_-)"};
    public static final String[] SIDE_GUYS = new String[]{"(-_", "_-)"};

    private final int guys;

    public EerieMob(int guys) {
        this.guys = guys;
    }

    @Override
    public String toString() {
        if (guys < 1 || guys > 255) {
            return NO_GUY;
        }
        String str = COMPLETE_GUY;
        int added = 1;
        int partialFactor = 3;
        while (added < guys) {
            String guy;
            boolean left = added % 2 != 0;
            added++;
            int diff = guys - added;
            if (diff < 2 && guys > 7) {
                guy = FINAL_GUYS[left ? 0 : 1];
            } else if (added > partialFactor) {
                int middle = added / 2;
                if (added % 2 != 0) {
                    middle++;
                }
                diff = added - middle;
                guy = (diff % partialFactor == 0)
                    ? PARTIAL_GUYS[left ? 0 : 1]
                    : SIDE_GUYS[left ? 0 : 1];
            } else {
                guy = SIDE_GUYS[left ? 0 : 1];
            }
            if (left) {
                str = guy + str;
            } else {
                str += guy;
            }
        }
        return str;
    }
}

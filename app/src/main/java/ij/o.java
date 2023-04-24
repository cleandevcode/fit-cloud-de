package ij;

import yi.c;

/* loaded from: classes2.dex */
public final class o extends gm.m implements fm.l<Integer, Integer> {

    /* renamed from: b */
    public static final o f17068b = new o();

    public o() {
        super(1);
    }

    @Override // fm.l
    public final Integer k(Integer num) {
        Integer num2 = num;
        if (num2 != null && num2.intValue() == 0) {
            return Integer.valueOf(num2.intValue());
        }
        if (num2 == null || num2.intValue() != 1) {
            throw c.a.c(yi.c.f31771d, Integer.MAX_VALUE, null, 6);
        }
        throw c.a.c(yi.c.f31771d, 2, null, 6);
    }
}

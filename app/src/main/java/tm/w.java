package tm;

import sm.f1;
import sm.w0;

/* loaded from: classes2.dex */
public final class w extends w0<Integer> implements f1<Integer> {
    public w(int i10) {
        super(1, Integer.MAX_VALUE, rm.f.DROP_OLDEST);
        d(Integer.valueOf(i10));
    }

    @Override // sm.f1
    public final Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f27324h;
            gm.l.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f27325i + ((int) ((q() + this.f27327k) - this.f27325i))) - 1))]).intValue());
        }
        return valueOf;
    }
}

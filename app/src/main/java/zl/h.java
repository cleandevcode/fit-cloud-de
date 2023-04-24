package zl;

import gm.b0;
import gm.c0;
import gm.l;

/* loaded from: classes2.dex */
public abstract class h extends g implements gm.g<Object> {

    /* renamed from: b */
    public final int f32516b;

    public h(xl.d dVar) {
        super(dVar);
        this.f32516b = 2;
    }

    @Override // gm.g
    public final int h() {
        return this.f32516b;
    }

    @Override // zl.a
    public final String toString() {
        if (this.f32507a == null) {
            b0.f15488a.getClass();
            String a10 = c0.a(this);
            l.e(a10, "renderLambdaToString(this)");
            return a10;
        }
        return super.toString();
    }
}

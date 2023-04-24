package zl;

import gm.b0;
import gm.c0;
import gm.l;

/* loaded from: classes2.dex */
public abstract class i extends c implements gm.g<Object> {

    /* renamed from: d */
    public final int f32517d;

    public i(int i10, xl.d<Object> dVar) {
        super(dVar);
        this.f32517d = i10;
    }

    @Override // gm.g
    public final int h() {
        return this.f32517d;
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

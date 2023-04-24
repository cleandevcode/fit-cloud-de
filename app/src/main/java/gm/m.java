package gm;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class m<R> implements g<R>, Serializable {

    /* renamed from: a */
    public final int f15504a;

    public m(int i10) {
        this.f15504a = i10;
    }

    @Override // gm.g
    public final int h() {
        return this.f15504a;
    }

    public final String toString() {
        b0.f15488a.getClass();
        String a10 = c0.a(this);
        l.e(a10, "renderLambdaToString(this)");
        return a10;
    }
}

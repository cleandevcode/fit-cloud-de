package y3;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u0 extends gm.m implements fm.l<Object, Object> {

    /* renamed from: b */
    public final /* synthetic */ Bundle f31084b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Bundle bundle) {
        super(1);
        this.f31084b = bundle;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        b0 b0Var = (b0) obj;
        gm.l.f(b0Var, "state");
        return tb.a.n(this.f31084b, b0Var, false);
    }
}

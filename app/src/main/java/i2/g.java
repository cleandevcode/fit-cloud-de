package i2;

import android.os.Bundle;
import bi.m0;
import i2.f;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g<Args extends f> implements tl.d<Args> {

    /* renamed from: a */
    public final mm.b<Args> f16278a;

    /* renamed from: b */
    public final fm.a<Bundle> f16279b;

    /* renamed from: c */
    public Args f16280c;

    public g(gm.e eVar, fm.a aVar) {
        this.f16278a = eVar;
        this.f16279b = aVar;
    }

    @Override // tl.d
    /* renamed from: a */
    public final Args getValue() {
        Args args = this.f16280c;
        if (args == null) {
            Bundle m10 = this.f16279b.m();
            o0.b<mm.b<? extends f>, Method> bVar = h.f16283b;
            Method orDefault = bVar.getOrDefault(this.f16278a, null);
            if (orDefault == null) {
                orDefault = m0.p(this.f16278a).getMethod("fromBundle", (Class[]) Arrays.copyOf(h.f16282a, 1));
                bVar.put(this.f16278a, orDefault);
                gm.l.e(orDefault, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke = orDefault.invoke(null, m10);
            if (invoke != null) {
                Args args2 = (Args) invoke;
                this.f16280c = args2;
                return args2;
            }
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        return args;
    }
}

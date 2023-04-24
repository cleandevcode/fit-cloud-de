package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import q2.a;

/* loaded from: classes.dex */
public final class n0 implements a.b {

    /* renamed from: a */
    public final q2.a f2755a;

    /* renamed from: b */
    public boolean f2756b;

    /* renamed from: c */
    public Bundle f2757c;

    /* renamed from: d */
    public final tl.i f2758d;

    /* loaded from: classes.dex */
    public static final class a extends gm.m implements fm.a<o0> {

        /* renamed from: b */
        public final /* synthetic */ y0 f2759b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0 y0Var) {
            super(0);
            this.f2759b = y0Var;
        }

        @Override // fm.a
        public final o0 m() {
            return m0.c(this.f2759b);
        }
    }

    public n0(q2.a aVar, y0 y0Var) {
        gm.l.f(aVar, "savedStateRegistry");
        gm.l.f(y0Var, "viewModelStoreOwner");
        this.f2755a = aVar;
        this.f2758d = new tl.i(new a(y0Var));
    }

    @Override // q2.a.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2757c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((o0) this.f2758d.getValue()).f2763d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((l0) entry.getValue()).f2743e.a();
            if (!gm.l.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f2756b = false;
        return bundle;
    }
}

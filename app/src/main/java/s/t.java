package s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class t implements a0.z {

    /* renamed from: a */
    public final a0.e0 f26187a;

    /* renamed from: c */
    public final t.d0 f26189c;

    /* renamed from: d */
    public final ArrayList f26190d;

    /* renamed from: e */
    public final t1 f26191e;

    /* renamed from: f */
    public final HashMap f26192f = new HashMap();

    /* renamed from: b */
    public final a0.d0 f26188b = new a0.d0();

    /* JADX WARN: Removed duplicated region for block: B:162:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(android.content.Context r6, a0.c r7, y.p r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.t.<init>(android.content.Context, a0.c, y.p):void");
    }

    @Override // a0.z
    public final LinkedHashSet a() {
        return new LinkedHashSet(this.f26190d);
    }

    @Override // a0.z
    public final t.d0 b() {
        return this.f26189c;
    }

    @Override // a0.z
    public final a0 c(String str) {
        if (this.f26190d.contains(str)) {
            return new a0(this.f26189c, str, d(str), this.f26188b, this.f26187a.a(), this.f26187a.b(), this.f26191e);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final e0 d(String str) {
        try {
            e0 e0Var = (e0) this.f26192f.get(str);
            if (e0Var == null) {
                e0 e0Var2 = new e0(str, this.f26189c);
                this.f26192f.put(str, e0Var2);
                return e0Var2;
            }
            return e0Var;
        } catch (t.f e10) {
            throw h1.l(e10);
        }
    }
}

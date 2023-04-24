package yb;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: b */
    public static o0 f31363b;

    /* renamed from: a */
    public Context f31364a;

    /* loaded from: classes.dex */
    public static class a extends y {

        /* renamed from: c */
        public String f31365c;

        /* renamed from: d */
        public String f31366d;

        public a(String str, String str2) {
            this.f31365c = str;
            this.f31366d = str2;
        }

        public final String C() {
            if (y.i(this.f31365c, this.f31366d) != null) {
                return null;
            }
            return "";
        }

        public final String D() {
            if (y.i(this.f31365c, this.f31366d) != null) {
                return null;
            }
            return "";
        }

        public final String E() {
            if (y.i(this.f31365c, this.f31366d) != null) {
                return null;
            }
            return "";
        }

        public final int F() {
            boolean z10;
            int i10;
            boolean z11;
            int i11;
            t i12 = y.i(this.f31365c, this.f31366d);
            int i13 = 1;
            if (i12 != null && i12.f31391c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            int i14 = i10 | 0;
            t i15 = y.i(this.f31365c, this.f31366d);
            if (i15 != null && i15.f31389a) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            int i16 = i14 | i11;
            t i17 = y.i(this.f31365c, this.f31366d);
            return i16 | ((i17 == null || !i17.f31390b) ? 0 : 0);
        }
    }

    public static o0 b() {
        o0 o0Var;
        synchronized (o0.class) {
            if (f31363b == null) {
                f31363b = new o0();
            }
            o0Var = f31363b;
        }
        return o0Var;
    }

    public final String a(boolean z10) {
        if (!z10) {
            return "";
        }
        String str = r.a().f31380a.f31425f;
        if (TextUtils.isEmpty(str)) {
            str = l.b(this.f31364a, "global_v2", "uuid");
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString().replace("-", "");
                l.e(this.f31364a, "global_v2", "uuid", str);
            }
            r.a().f31380a.f31425f = str;
        }
        return str;
    }
}

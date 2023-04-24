package oc;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g1 implements wk.f, m7.f {

    /* renamed from: a */
    public static y3.g1 f22980a = new qi.h();

    /* renamed from: b */
    public static y3.n0 f22981b;

    @Override // m7.f
    public String a(int i10, int i11) {
        Locale locale = bi.m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i11)}, 1, locale, "%02d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }

    @Override // wk.f
    public boolean test(Object obj) {
        return ((List) obj).size() > 0;
    }
}

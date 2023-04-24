package ph;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class a1 extends u7.c {
    @Override // u7.c
    public final String a(float f10) {
        boolean z10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        int i10 = (int) f10;
        Locale locale = bi.m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }
}

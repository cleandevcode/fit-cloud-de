package w5;

import gm.l;
import y5.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f29748a = new a();

    /* renamed from: b */
    public static boolean f29749b;

    /* renamed from: c */
    public static boolean f29750c;

    public final boolean a(String str) {
        String str2;
        if (i6.a.b(this)) {
            return false;
        }
        try {
            String str3 = null;
            if (!i6.a.b(this)) {
                float[] fArr = new float[30];
                for (int i10 = 0; i10 < 30; i10++) {
                    fArr[i10] = 0.0f;
                }
                d dVar = d.f31147a;
                String[] f10 = d.f(d.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                if (f10 != null && (str2 = f10[0]) != null) {
                    str3 = str2;
                }
                str3 = "none";
            }
            return !l.a("none", str3);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }
}

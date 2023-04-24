package a1;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import z0.f;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final n f221a;

    /* renamed from: b */
    public static final o0.f<String, Typeface> f222b;

    /* loaded from: classes.dex */
    public static class a extends bk.m {

        /* renamed from: c */
        public f.e f223c;

        public a(f.e eVar) {
            this.f223c = eVar;
        }
    }

    static {
        n hVar;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            hVar = new l();
        } else if (i10 >= 28) {
            hVar = new k();
        } else if (i10 >= 26) {
            hVar = new j();
        } else {
            if (i10 >= 24) {
                Method method = i.f231c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    hVar = new i();
                }
            }
            hVar = new h();
        }
        f221a = hVar;
        f222b = new o0.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r7, z0.d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, z0.f.e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g.a(android.content.Context, z0.d$b, android.content.res.Resources, int, java.lang.String, int, int, z0.f$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}

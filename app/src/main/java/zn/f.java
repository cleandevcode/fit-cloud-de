package zn;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public final HashSet f32771a;

    /* renamed from: b */
    public final d f32772b;

    /* renamed from: c */
    public final c f32773c;

    public f() {
        g gVar = new g();
        a aVar = new a();
        this.f32771a = new HashSet();
        this.f32772b = gVar;
        this.f32773c = aVar;
    }

    public static void d(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public final File a(Context context, String str, String str2) {
        boolean z10;
        String a10 = ((g) this.f32772b).a(str);
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new File(context.getDir("lib", 0), a10);
        }
        return new File(context.getDir("lib", 0), android.support.v4.media.a.a(a10, ".", str2));
    }

    public final void b(Context context) {
        boolean z10;
        if (context != null) {
            if ("pl_droidsonroids_gif".length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                d("Beginning load of %s...", "pl_droidsonroids_gif");
                c(context, "pl_droidsonroids_gif", null);
                return;
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0130, code lost:
        if (r2 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0163, code lost:
        if (r2 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0165, code lost:
        r2.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.f.c(android.content.Context, java.lang.String, java.lang.String):void");
    }
}

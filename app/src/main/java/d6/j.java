package d6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import d6.e0;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public interface a {
        Bundle a();

        Bundle b();
    }

    public static final boolean a(h hVar) {
        return b(hVar).f12676b != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final d6.e0.f b(d6.h r7) {
        /*
            java.lang.String r0 = o5.v.b()
            java.lang.String r1 = r7.c()
            java.lang.String r2 = r7.name()
            java.lang.String r3 = "actionName"
            gm.l.f(r1, r3)
            java.lang.String r3 = "featureName"
            gm.l.f(r2, r3)
            int r3 = r1.length()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r6 = 0
            if (r3 != 0) goto L49
            int r3 = r2.length()
            if (r3 != 0) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            if (r3 == 0) goto L30
            goto L49
        L30:
            d6.v r0 = d6.w.b(r0)
            if (r0 != 0) goto L38
            r0 = r6
            goto L40
        L38:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, d6.v$a>> r0 = r0.f12798d
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
        L40:
            if (r0 == 0) goto L49
            java.lang.Object r0 = r0.get(r2)
            d6.v$a r0 = (d6.v.a) r0
            goto L4a
        L49:
            r0 = r6
        L4a:
            if (r0 != 0) goto L4e
            r0 = r6
            goto L50
        L4e:
            int[] r0 = r0.f12810c
        L50:
            if (r0 != 0) goto L5a
            int[] r0 = new int[r5]
            int r7 = r7.a()
            r0[r4] = r7
        L5a:
            d6.e0 r7 = d6.e0.f12668a
            java.lang.Class<d6.e0> r7 = d6.e0.class
            boolean r2 = i6.a.b(r7)
            if (r2 == 0) goto L65
            goto L7c
        L65:
            java.util.HashMap r2 = d6.e0.f12671d     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L78
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L71
            ul.s r1 = ul.s.f28879a     // Catch: java.lang.Throwable -> L78
        L71:
            d6.e0 r2 = d6.e0.f12668a     // Catch: java.lang.Throwable -> L78
            d6.e0$f r6 = r2.k(r1, r0)     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r0 = move-exception
            i6.a.a(r7, r0)
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.j.b(d6.h):d6.e0$f");
    }

    public static final void c(d6.a aVar, a aVar2, h hVar) {
        Bundle b10;
        Intent r10;
        Context a10 = o5.v.a();
        String c10 = hVar.c();
        e0.f b11 = b(hVar);
        int i10 = b11.f12676b;
        if (i10 != -1) {
            if (e0.o(i10)) {
                b10 = aVar2.a();
            } else {
                b10 = aVar2.b();
            }
            if (b10 == null) {
                b10 = new Bundle();
            }
            String uuid = aVar.a().toString();
            Intent intent = null;
            if (!i6.a.b(e0.class)) {
                try {
                    e0.e eVar = b11.f12675a;
                    if (eVar != null && (r10 = e0.r(a10, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVar.c()).addCategory("android.intent.category.DEFAULT"))) != null) {
                        e0.p(r10, uuid, c10, b11.f12676b, b10);
                        intent = r10;
                    }
                } catch (Throwable th2) {
                    i6.a.a(e0.class, th2);
                }
            }
            if (intent != null) {
                if (!i6.a.b(aVar)) {
                    try {
                        aVar.f12629c = intent;
                        return;
                    } catch (Throwable th3) {
                        i6.a.a(aVar, th3);
                        return;
                    }
                }
                return;
            }
            throw new o5.p("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new o5.p("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    public static final void d(d6.a aVar, o5.p pVar) {
        gm.l.f(aVar, "appCall");
        String str = n0.f12718a;
        n0.b(o5.v.a(), true);
        Intent intent = new Intent();
        intent.setClass(o5.v.a(), FacebookActivity.class);
        intent.setAction("PassThrough");
        e0 e0Var = e0.f12668a;
        e0.p(intent, aVar.a().toString(), null, e0.l(), e0.c(pVar));
        if (!i6.a.b(aVar)) {
            try {
                aVar.f12629c = intent;
            } catch (Throwable th2) {
                i6.a.a(aVar, th2);
            }
        }
    }

    public static final void e(d6.a aVar, String str, Bundle bundle) {
        String str2 = n0.f12718a;
        n0.b(o5.v.a(), true);
        n0.c(o5.v.a(), true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        e0 e0Var = e0.f12668a;
        e0.p(intent, aVar.a().toString(), str, e0.l(), bundle2);
        intent.setClass(o5.v.a(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        if (!i6.a.b(aVar)) {
            try {
                aVar.f12629c = intent;
            } catch (Throwable th2) {
                i6.a.a(aVar, th2);
            }
        }
    }
}

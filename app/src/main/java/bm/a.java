package bm;

import gm.l;

/* loaded from: classes2.dex */
public class a extends am.a {

    /* renamed from: bm.a$a */
    /* loaded from: classes2.dex */
    public static final class C0061a {

        /* renamed from: a */
        public static final Integer f4483a;

        /* JADX WARN: Removed duplicated region for block: B:30:0x001c  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L19
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
            L19:
                r1 = r0
            L1a:
                if (r1 == 0) goto L28
                int r2 = r1.intValue()
                if (r2 <= 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                if (r2 == 0) goto L28
                r0 = r1
            L28:
                bm.a.C0061a.f4483a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bm.a.C0061a.<clinit>():void");
        }
    }

    @Override // am.a
    public final void a(Throwable th2, Throwable th3) {
        boolean z10;
        l.f(th2, "cause");
        l.f(th3, "exception");
        Integer num = C0061a.f4483a;
        if (num != null && num.intValue() < 19) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }
}
package pm;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a */
    public static final um.x f24356a = new um.x("RESUME_TOKEN");

    public static void a(y3.k0 k0Var, androidx.fragment.app.r rVar, fm.p pVar) {
        y3.z0 z0Var = y3.z0.f31104a;
        gm.l.f(k0Var, "<this>");
        gm.l.f(z0Var, "deliveryMode");
        k0Var.b(k0Var.f30971c.f31078c.a(), rVar, z0Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z1 b(y3.k0 k0Var, androidx.lifecycle.u uVar, mm.f fVar, y3.i iVar, fm.p pVar) {
        gm.l.f(k0Var, "<this>");
        gm.l.f(fVar, "prop1");
        gm.l.f(iVar, "deliveryMode");
        gm.l.f(pVar, "action");
        return k0Var.b(bi.r.t(new y3.o0(k0Var.f30971c.f31078c.a(), fVar)), uVar, iVar.a(fVar), new y3.p0(pVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r9, android.graphics.Bitmap r10) {
        /*
            java.lang.String r0 = "context"
            gm.l.f(r9, r0)
            java.lang.Object r0 = y0.a.f30807a
            java.io.File[] r0 = y0.a.b.a(r9)
            java.lang.String r1 = "getExternalCacheDirs(context)"
            gm.l.e(r0, r1)
            java.lang.Object r0 = ul.i.B(r0)
            java.io.File r0 = (java.io.File) r0
            r1 = 0
            if (r0 != 0) goto L1a
            goto L26
        L1a:
            boolean r2 = r0.exists()
            if (r2 != 0) goto L27
            boolean r2 = r0.mkdirs()
            if (r2 != 0) goto L27
        L26:
            r0 = r1
        L27:
            if (r0 != 0) goto L2b
            r2 = r1
            goto L5c
        L2b:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r8 = "_yyyyMMdd_HHmmssSSS"
            r6.<init>(r8, r7)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r4)
            java.lang.String r4 = r6.format(r7)
            java.lang.String r5 = "SimpleDateFormat(\"_yyyyM…le.US).format(Date(time))"
            gm.l.e(r4, r5)
            r3.append(r4)
            java.lang.String r4 = ".jpg"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r0, r3)
        L5c:
            if (r2 != 0) goto L5f
            goto L7c
        L5f:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L76
            r0.<init>(r2)     // Catch: java.lang.Exception -> L76
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L6f
            r4 = 100
            r10.compress(r3, r4, r0)     // Catch: java.lang.Throwable -> L6f
            mf.a0.d(r0, r1)     // Catch: java.lang.Exception -> L76
            goto L7d
        L6f:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L71
        L71:
            r2 = move-exception
            mf.a0.d(r0, r10)     // Catch: java.lang.Exception -> L76
            throw r2     // Catch: java.lang.Exception -> L76
        L76:
            r10 = move-exception
            do.a$b r0 = p000do.a.f13275a
            r0.q(r10)
        L7c:
            r2 = r1
        L7d:
            if (r2 != 0) goto L80
            return
        L80:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.SEND"
            r10.<init>(r0)
            java.lang.String r0 = "image/*"
            r10.setType(r0)
            android.net.Uri r0 = androidx.core.content.FileProvider.b(r9, r2)
            java.lang.String r2 = "android.intent.extra.STREAM"
            r10.putExtra(r2, r0)
            r0 = 268435457(0x10000001, float:2.5243552E-29)
            r10.addFlags(r0)
            android.content.Intent r10 = android.content.Intent.createChooser(r10, r1)
            r9.startActivity(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.k.c(android.content.Context, android.graphics.Bitmap):void");
    }
}

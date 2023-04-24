package a5;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class c implements r4.k<Bitmap> {

    /* renamed from: b */
    public static final r4.g<Integer> f266b = r4.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c */
    public static final r4.g<Bitmap.CompressFormat> f267c = new r4.g<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, r4.g.f25213e);

    /* renamed from: a */
    public final u4.b f268a;

    public c(u4.b bVar) {
        this.f268a = bVar;
    }

    @Override // r4.k
    public final r4.c b(r4.h hVar) {
        return r4.c.TRANSFORMED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x006a, code lost:
        if (r6 != null) goto L20;
     */
    @Override // r4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.Object r9, java.io.File r10, r4.h r11) {
        /*
            r8 = this;
            t4.x r9 = (t4.x) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            r4.g<android.graphics.Bitmap$CompressFormat> r1 = a5.c.f267c
            java.lang.Object r1 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L15
            goto L20
        L15:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r2 = m5.h.f20372b     // Catch: java.lang.Throwable -> Lc4
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lc4
            r4.g<java.lang.Integer> r4 = a5.c.f266b     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r4 = r11.c(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc4
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc4
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            u4.b r10 = r8.f268a     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L58
            if (r10 == 0) goto L4f
            com.bumptech.glide.load.data.c r10 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L58
            u4.b r6 = r8.f268a     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L58
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L58
            r6 = r10
            goto L50
        L4c:
            r9 = move-exception
            goto Lbe
        L4f:
            r6 = r7
        L50:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r6.close()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r5 = 1
            goto L6c
        L58:
            r10 = move-exception
            r6 = r7
            goto L5e
        L5b:
            r9 = move-exception
            goto Lbd
        L5d:
            r10 = move-exception
        L5e:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L6a
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L5b
        L6a:
            if (r6 == 0) goto L6f
        L6c:
            r6.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> Lc4
        L6f:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc4
            if (r10 == 0) goto Lbc
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r10.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc4
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc4
            int r1 = m5.l.c(r9)     // Catch: java.lang.Throwable -> Lc4
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc4
            double r1 = m5.h.a(r2)     // Catch: java.lang.Throwable -> Lc4
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc4
            r4.g<android.graphics.Bitmap$CompressFormat> r1 = a5.c.f267c     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r11 = r11.c(r1)     // Catch: java.lang.Throwable -> Lc4
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc4
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc4
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc4
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc4
        Lbc:
            return r5
        Lbd:
            r7 = r6
        Lbe:
            if (r7 == 0) goto Lc3
            r7.close()     // Catch: java.io.IOException -> Lc3 java.lang.Throwable -> Lc4
        Lc3:
            throw r9     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.c.e(java.lang.Object, java.io.File, r4.h):boolean");
    }
}

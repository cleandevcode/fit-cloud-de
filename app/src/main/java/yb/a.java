package yb;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: yb.a$a */
    /* loaded from: classes.dex */
    public static class C0577a extends Exception {
        public C0577a() {
            super("No ssl socket factory set");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.HttpURLConnection a(int r4, java.lang.String r5, java.util.HashMap r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            java.lang.String r2 = "hmsSdk"
            if (r0 == 0) goto Lf
            java.lang.String r4 = "CreateConnection: invalid urlPath."
            m2.f.a(r2, r4)
            return r1
        Lf:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r5)
            java.net.URLConnection r5 = r0.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            boolean r0 = r5 instanceof javax.net.ssl.HttpsURLConnection
            if (r0 == 0) goto L4f
            r0 = r5
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
            android.content.Context r3 = yb.y.s()     // Catch: java.lang.IllegalAccessException -> L2a java.io.IOException -> L2d java.security.GeneralSecurityException -> L30 java.security.KeyStoreException -> L33 java.security.NoSuchAlgorithmException -> L36
            dc.b r1 = dc.b.b(r3)     // Catch: java.lang.IllegalAccessException -> L2a java.io.IOException -> L2d java.security.GeneralSecurityException -> L30 java.security.KeyStoreException -> L33 java.security.NoSuchAlgorithmException -> L36
            goto L3b
        L2a:
            java.lang.String r3 = "getSocketFactory(): Illegal Access Exception "
            goto L38
        L2d:
            java.lang.String r3 = "getSocketFactory(): IO Exception!"
            goto L38
        L30:
            java.lang.String r3 = "getSocketFactory(): General Security Exception"
            goto L38
        L33:
            java.lang.String r3 = "getSocketFactory(): Key Store exception"
            goto L38
        L36:
            java.lang.String r3 = "getSocketFactory(): Algorithm Exception!"
        L38:
            m2.f.h(r2, r3)
        L3b:
            if (r1 == 0) goto L49
            r0.setSSLSocketFactory(r1)
            ec.a r1 = new ec.a
            r1.<init>()
            r0.setHostnameVerifier(r1)
            goto L4f
        L49:
            yb.a$a r4 = new yb.a$a
            r4.<init>()
            throw r4
        L4f:
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)
            r0 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r0)
            r5.setReadTimeout(r0)
            r0 = 1
            r5.setDoOutput(r0)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json; charset=UTF-8"
            r5.setRequestProperty(r1, r2)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Content-Length"
            r5.setRequestProperty(r1, r4)
            java.lang.String r4 = "Connection"
            java.lang.String r1 = "close"
            r5.setRequestProperty(r4, r1)
            int r4 = r6.size()
            if (r4 >= r0) goto L7e
            goto Lab
        L7e:
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L86:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lab
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L86
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto La1
            goto L86
        La1:
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r5.setRequestProperty(r0, r6)
            goto L86
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.a.a(int, java.lang.String, java.util.HashMap):java.net.HttpURLConnection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x00a4, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00ba, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00d0, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00e5, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00fa, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x010f, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0124, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yb.b b(java.lang.String r6, byte[] r7, java.util.HashMap r8) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.a.b(java.lang.String, byte[], java.util.HashMap):yb.b");
    }

    public static String c(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                return gm.j.a(inputStream);
            } catch (IOException unused) {
                int responseCode = httpURLConnection.getResponseCode();
                m2.f.h("hmsSdk", "When Response Content From Connection inputStream operation exception! " + responseCode);
                gm.j.c(inputStream);
                return "";
            }
        } finally {
            gm.j.c(inputStream);
        }
    }
}

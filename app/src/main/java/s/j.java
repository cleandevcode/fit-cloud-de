package s;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26000a;

    public /* synthetic */ j(int i10) {
        this.f26000a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x007a, code lost:
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0085 A[Catch: all -> 0x00a5, Exception -> 0x00a9, TryCatch #5 {Exception -> 0x00a9, all -> 0x00a5, blocks: (B:88:0x0018, B:90:0x002a, B:96:0x0036, B:98:0x0041, B:100:0x0051, B:102:0x0057, B:120:0x009c, B:116:0x007c, B:119:0x0085, B:97:0x003c, B:108:0x0068), top: B:149:0x0018 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.f26000a
            r1 = 1
            switch(r0) {
                case 0: goto Lbf;
                case 1: goto Laa;
                case 2: goto L8;
                default: goto L6;
            }
        L6:
            goto Lc0
        L8:
            y5.d r0 = y5.d.f31147a
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r2 = "models"
            java.lang.Class<y5.d> r3 = y5.d.class
            boolean r4 = i6.a.b(r3)
            if (r4 == 0) goto L18
            goto La9
        L18:
            android.content.Context r4 = o5.v.a()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            java.lang.String r5 = "com.facebook.internal.MODEL_STORE"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            r5 = 0
            java.lang.String r5 = r4.getString(r2, r5)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            if (r5 == 0) goto L3c
            int r7 = r5.length()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            if (r7 != 0) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            if (r7 == 0) goto L36
            goto L3c
        L36:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            r7.<init>(r5)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            goto L41
        L3c:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            r7.<init>()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
        L41:
            r8 = 0
            long r10 = r4.getLong(r0, r8)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            d6.s r5 = d6.s.f12755a     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            d6.s$b r5 = d6.s.b.ModelRequest     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            boolean r5 = d6.s.c(r5)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            if (r5 == 0) goto L7c
            int r5 = r7.length()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            if (r5 == 0) goto L7c
            y5.d r5 = y5.d.f31147a     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            r5.getClass()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            boolean r12 = i6.a.b(r5)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            if (r12 == 0) goto L63
            goto L79
        L63:
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto L68
            goto L79
        L68:
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75
            long r8 = r8 - r10
            r10 = 259200000(0xf731400, double:1.280618154E-315)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L79
            goto L7a
        L75:
            r1 = move-exception
            i6.a.a(r5, r1)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
        L79:
            r1 = 0
        L7a:
            if (r1 != 0) goto L9c
        L7c:
            y5.d r1 = y5.d.f31147a     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            org.json.JSONObject r7 = r1.c()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            if (r7 != 0) goto L85
            goto La9
        L85:
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r4)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r4)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            r0.apply()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
        L9c:
            y5.d r0 = y5.d.f31147a     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            r0.a(r7)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            r0.b()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La9
            goto La9
        La5:
            r0 = move-exception
            i6.a.a(r3, r0)
        La9:
            return
        Laa:
            v5.d r0 = v5.d.f29075a
            java.lang.Class<v5.d> r0 = v5.d.class
            boolean r1 = i6.a.b(r0)
            if (r1 == 0) goto Lb5
            goto Lbf
        Lb5:
            v5.d r1 = v5.d.f29075a     // Catch: java.lang.Throwable -> Lbb
            r1.a()     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r1 = move-exception
            i6.a.a(r0, r1)
        Lbf:
            return
        Lc0:
            b6.d r0 = b6.d.f4011a
            java.lang.Class<b6.d> r0 = b6.d.class
            boolean r2 = i6.a.b(r0)
            if (r2 == 0) goto Lcb
            goto Le1
        Lcb:
            java.util.concurrent.atomic.AtomicBoolean r2 = b6.d.f4012b     // Catch: java.lang.Throwable -> Ldd
            boolean r3 = r2.get()     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Ld4
            goto Le1
        Ld4:
            r2.set(r1)     // Catch: java.lang.Throwable -> Ldd
            b6.d r1 = b6.d.f4011a     // Catch: java.lang.Throwable -> Ldd
            r1.a()     // Catch: java.lang.Throwable -> Ldd
            goto Le1
        Ldd:
            r1 = move-exception
            i6.a.a(r0, r1)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.run():void");
    }
}

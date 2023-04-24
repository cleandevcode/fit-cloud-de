package i8;

/* loaded from: classes.dex */
public abstract class n0 extends w8.b {
    public n0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
        if (r7.f16704a >= r5.f16704a) goto L19;
     */
    @Override // w8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r10, android.os.Parcel r11, android.os.Parcel r12) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = 1
            if (r10 == r2) goto L91
            r3 = 2
            if (r10 == r3) goto L76
            r3 = 3
            if (r10 == r3) goto Ld
            r10 = 0
            return r10
        Ld:
            int r10 = r11.readInt()
            android.os.IBinder r3 = r11.readStrongBinder()
            android.os.Parcelable$Creator<i8.x0> r4 = i8.x0.CREATOR
            android.os.Parcelable r4 = w8.c.a(r11, r4)
            i8.x0 r4 = (i8.x0) r4
            w8.c.b(r11)
            r11 = r9
            i8.t0 r11 = (i8.t0) r11
            i8.b r5 = r11.f16717a
            java.lang.String r6 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            i8.p.g(r5, r6)
            i8.p.f(r4)
            r5.f16597u = r4
            boolean r5 = r5.z()
            if (r5 == 0) goto L58
            i8.e r5 = r4.f16729d
            i8.q r6 = i8.q.a()
            if (r5 != 0) goto L3f
            r5 = r1
            goto L41
        L3f:
            i8.r r5 = r5.f16630a
        L41:
            monitor-enter(r6)
            if (r5 != 0) goto L47
            i8.r r5 = i8.q.f16702c     // Catch: java.lang.Throwable -> L55
            goto L51
        L47:
            i8.r r7 = r6.f16703a     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L51
            int r7 = r7.f16704a     // Catch: java.lang.Throwable -> L55
            int r8 = r5.f16704a     // Catch: java.lang.Throwable -> L55
            if (r7 >= r8) goto L53
        L51:
            r6.f16703a = r5     // Catch: java.lang.Throwable -> L55
        L53:
            monitor-exit(r6)
            goto L58
        L55:
            r10 = move-exception
            monitor-exit(r6)
            throw r10
        L58:
            android.os.Bundle r4 = r4.f16726a
            i8.b r5 = r11.f16717a
            java.lang.String r6 = "onPostInitComplete can be called only once per call to getRemoteService"
            i8.p.g(r5, r6)
            i8.b r5 = r11.f16717a
            int r6 = r11.f16718b
            i8.r0 r7 = r5.f16581e
            i8.v0 r8 = new i8.v0
            r8.<init>(r5, r10, r3, r4)
            android.os.Message r10 = r7.obtainMessage(r2, r6, r0, r8)
            r7.sendMessage(r10)
            r11.f16717a = r1
            goto Lc2
        L76:
            r11.readInt()
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = w8.c.a(r11, r10)
            android.os.Bundle r10 = (android.os.Bundle) r10
            w8.c.b(r11)
            java.lang.Exception r10 = new java.lang.Exception
            r10.<init>()
            java.lang.String r11 = "GmsClient"
            java.lang.String r0 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r11, r0, r10)
            goto Lc2
        L91:
            int r10 = r11.readInt()
            android.os.IBinder r3 = r11.readStrongBinder()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = w8.c.a(r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            w8.c.b(r11)
            r11 = r9
            i8.t0 r11 = (i8.t0) r11
            i8.b r5 = r11.f16717a
            java.lang.String r6 = "onPostInitComplete can be called only once per call to getRemoteService"
            i8.p.g(r5, r6)
            i8.b r5 = r11.f16717a
            int r6 = r11.f16718b
            i8.r0 r7 = r5.f16581e
            i8.v0 r8 = new i8.v0
            r8.<init>(r5, r10, r3, r4)
            android.os.Message r10 = r7.obtainMessage(r2, r6, r0, r8)
            r7.sendMessage(r10)
            r11.f16717a = r1
        Lc2:
            r12.writeNoException()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.n0.k(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}

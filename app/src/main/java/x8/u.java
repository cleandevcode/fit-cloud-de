package x8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h8.h;

/* loaded from: classes.dex */
public final class u extends i8.g {
    public final o0.h A;
    public final o0.h B;
    public final o0.h C;

    public u(Context context, Looper looper, i8.d dVar, h8.c cVar, h8.j jVar) {
        super(context, looper, 23, dVar, cVar, jVar);
        this.A = new o0.h();
        this.B = new o0.h();
        this.C = new o0.h();
    }

    public final void C(h.a aVar, boolean z10, g9.h hVar) {
        synchronized (this.B) {
            s sVar = (s) this.B.remove(aVar);
            if (sVar == null) {
                hVar.a(Boolean.FALSE);
                return;
            }
            h8.h c10 = sVar.f30433c.c();
            c10.f15957b = null;
            c10.f15958c = null;
            if (z10) {
                if (D(a9.h.f432c)) {
                    ((q0) u()).c(new v(2, null, sVar, null, null, null), new k(Boolean.TRUE, hVar));
                } else {
                    ((q0) u()).R(new z(2, null, null, sVar, null, new m(Boolean.TRUE, hVar), null));
                }
            } else {
                hVar.a(Boolean.TRUE);
            }
        }
    }

    public final boolean D(f8.c cVar) {
        f8.c cVar2;
        f8.c[] j10 = j();
        if (j10 == null) {
            return false;
        }
        int length = j10.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                cVar2 = j10[i10];
                if (cVar.f14176a.equals(cVar2.f14176a)) {
                    break;
                }
                i10++;
            } else {
                cVar2 = null;
                break;
            }
        }
        if (cVar2 == null || cVar2.e() < cVar.e()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0059 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:33:0x0018, B:37:0x0026, B:39:0x003b, B:41:0x0059, B:45:0x0066, B:52:0x00be, B:48:0x007c, B:50:0x008d, B:51:0x008f, B:38:0x002e), top: B:56:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:33:0x0018, B:37:0x0026, B:39:0x003b, B:41:0x0059, B:45:0x0066, B:52:0x00be, B:48:0x007c, B:50:0x008d, B:51:0x008f, B:38:0x002e), top: B:56:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(x8.o r29, com.google.android.gms.location.LocationRequest r30, g9.h r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r30
            r2 = r31
            h8.h r3 = r29.c()
            h8.h$a r4 = r3.f15958c
            r4.getClass()
            f8.c r5 = a9.h.f432c
            boolean r5 = r1.D(r5)
            o0.h r6 = r1.B
            monitor-enter(r6)
            o0.h r7 = r1.B     // Catch: java.lang.Throwable -> L7a
            r8 = 0
            java.lang.Object r7 = r7.getOrDefault(r4, r8)     // Catch: java.lang.Throwable -> L7a
            x8.s r7 = (x8.s) r7     // Catch: java.lang.Throwable -> L7a
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L26
            goto L2e
        L26:
            x8.o r9 = r7.f30433c     // Catch: java.lang.Throwable -> L7a
            r9.b(r3)     // Catch: java.lang.Throwable -> L7a
            r13 = r7
            r7 = r8
            goto L3b
        L2e:
            x8.s r3 = new x8.s     // Catch: java.lang.Throwable -> L7a
            r9 = r29
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L7a
            o0.h r9 = r1.B     // Catch: java.lang.Throwable -> L7a
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L7a
            r13 = r3
        L3b:
            java.lang.String r3 = r4.f15960b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r4 = r4.f15959a     // Catch: java.lang.Throwable -> L7a
            int r4 = java.lang.System.identityHashCode(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r9.<init>()     // Catch: java.lang.Throwable -> L7a
            r9.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "@"
            r9.append(r3)     // Catch: java.lang.Throwable -> L7a
            r9.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r16 = r9.toString()     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L7c
            android.os.IInterface r3 = r28.u()     // Catch: java.lang.Throwable -> L7a
            x8.q0 r3 = (x8.q0) r3     // Catch: java.lang.Throwable -> L7a
            x8.v r4 = new x8.v     // Catch: java.lang.Throwable -> L7a
            if (r7 != 0) goto L65
            r11 = r8
            goto L66
        L65:
            r11 = r7
        L66:
            r10 = 2
            r5 = 0
            r14 = 0
            r9 = r4
            r12 = r13
            r13 = r5
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L7a
            x8.k r5 = new x8.k     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r8, r2)     // Catch: java.lang.Throwable -> L7a
            r3.G(r4, r0, r5)     // Catch: java.lang.Throwable -> L7a
            goto Lbe
        L7a:
            r0 = move-exception
            goto Lc0
        L7c:
            android.os.IInterface r3 = r28.u()     // Catch: java.lang.Throwable -> L7a
            x8.q0 r3 = (x8.q0) r3     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.location.LocationRequest$a r4 = new com.google.android.gms.location.LocationRequest$a     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7a
            r5 = 30
            if (r0 >= r5) goto L8f
            r4.f6124l = r8     // Catch: java.lang.Throwable -> L7a
        L8f:
            com.google.android.gms.location.LocationRequest r18 = r4.a()     // Catch: java.lang.Throwable -> L7a
            x8.x r11 = new x8.x     // Catch: java.lang.Throwable -> L7a
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L7a
            x8.n r15 = new x8.n     // Catch: java.lang.Throwable -> L7a
            r15.<init>(r2, r13)     // Catch: java.lang.Throwable -> L7a
            x8.z r0 = new x8.z     // Catch: java.lang.Throwable -> L7a
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L7a
            r3.R(r0)     // Catch: java.lang.Throwable -> L7a
        Lbe:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
            return
        Lc0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.u.E(x8.o, com.google.android.gms.location.LocationRequest, g9.h):void");
    }

    @Override // i8.b, g8.a.e
    public final int i() {
        return 11717000;
    }

    @Override // i8.b
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new p0(iBinder);
    }

    @Override // i8.b
    public final f8.c[] q() {
        return a9.h.f433d;
    }

    @Override // i8.b
    public final String v() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // i8.b
    public final String w() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // i8.b
    public final void y() {
        System.currentTimeMillis();
        synchronized (this.A) {
            this.A.clear();
        }
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
    }

    @Override // i8.b
    public final boolean z() {
        return true;
    }
}

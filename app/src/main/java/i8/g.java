package i8;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.Scope;
import g8.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g<T extends IInterface> extends b<T> implements a.e {

    /* renamed from: x */
    public final d f16663x;

    /* renamed from: y */
    public final Set f16664y;

    /* renamed from: z */
    public final Account f16665z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.content.Context r10, android.os.Looper r11, int r12, i8.d r13, h8.c r14, h8.j r15) {
        /*
            r9 = this;
            java.lang.Object r0 = i8.h.f16667a
            monitor-enter(r0)
            i8.f1 r1 = i8.h.f16668b     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L16
            i8.f1 r1 = new i8.f1     // Catch: java.lang.Throwable -> L5e
            android.content.Context r2 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L5e
            android.os.Looper r3 = r10.getMainLooper()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5e
            i8.h.f16668b = r1     // Catch: java.lang.Throwable -> L5e
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            i8.f1 r4 = i8.h.f16668b
            java.lang.Object r0 = f8.d.f14179c
            i8.p.f(r14)
            i8.p.f(r15)
            i8.b0 r6 = new i8.b0
            r6.<init>(r14)
            i8.c0 r7 = new i8.c0
            r7.<init>(r15)
            java.lang.String r8 = r13.f16614g
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.f16663x = r13
            android.accounts.Account r10 = r13.f16608a
            r9.f16665z = r10
            java.util.Set r10 = r13.f16610c
            java.util.Iterator r11 = r10.iterator()
        L40:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L5b
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L53
            goto L40
        L53:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L5b:
            r9.f16664y = r10
            return
        L5e:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.g.<init>(android.content.Context, android.os.Looper, int, i8.d, h8.c, h8.j):void");
    }

    @Override // g8.a.e
    public final Set<Scope> a() {
        return l() ? this.f16664y : Collections.emptySet();
    }

    @Override // i8.b
    public final Account p() {
        return this.f16665z;
    }

    @Override // i8.b
    public final void r() {
    }

    @Override // i8.b
    public final Set<Scope> t() {
        return this.f16664y;
    }
}

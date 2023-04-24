package pm;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class m0<T> extends wm.g {

    /* renamed from: c */
    public int f24369c;

    public m0(int i10) {
        this.f24369c = i10;
    }

    public void b(Object obj, CancellationException cancellationException) {
    }

    public abstract xl.d<T> c();

    public Throwable d(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f24396a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(Object obj) {
        return obj;
    }

    public final void j(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            ih.v.b(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        gm.l.c(th2);
        ih.v.g(c().e(), new f0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object k();

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0039, code lost:
        r6 = (pm.g1) r6.b(pm.g1.b.f24341a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            wm.h r0 = r12.f30049b
            xl.d r1 = r12.c()     // Catch: java.lang.Throwable -> L93
            um.g r1 = (um.g) r1     // Catch: java.lang.Throwable -> L93
            xl.d<T> r2 = r1.f28904e     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r1.f28906g     // Catch: java.lang.Throwable -> L93
            xl.f r3 = r2.e()     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = um.z.c(r3, r1)     // Catch: java.lang.Throwable -> L93
            um.x r4 = um.z.f28944a     // Catch: java.lang.Throwable -> L93
            r5 = 0
            if (r1 == r4) goto L1e
            pm.g2 r4 = pm.z.b(r2, r3, r1)     // Catch: java.lang.Throwable -> L93
            goto L1f
        L1e:
            r4 = r5
        L1f:
            xl.f r6 = r2.e()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r12.k()     // Catch: java.lang.Throwable -> L57
            java.lang.Throwable r8 = r12.d(r7)     // Catch: java.lang.Throwable -> L57
            if (r8 != 0) goto L42
            int r9 = r12.f24369c     // Catch: java.lang.Throwable -> L57
            r10 = 1
            if (r9 == r10) goto L37
            r11 = 2
            if (r9 != r11) goto L36
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 == 0) goto L42
            pm.g1$b r9 = pm.g1.b.f24341a     // Catch: java.lang.Throwable -> L57
            xl.f$b r6 = r6.b(r9)     // Catch: java.lang.Throwable -> L57
            pm.g1 r6 = (pm.g1) r6     // Catch: java.lang.Throwable -> L57
            goto L43
        L42:
            r6 = r5
        L43:
            if (r6 == 0) goto L59
            boolean r9 = r6.a()     // Catch: java.lang.Throwable -> L57
            if (r9 != 0) goto L59
            java.util.concurrent.CancellationException r6 = r6.v()     // Catch: java.lang.Throwable -> L57
            r12.b(r7, r6)     // Catch: java.lang.Throwable -> L57
            tl.g$a r6 = mf.a0.f(r6)     // Catch: java.lang.Throwable -> L57
            goto L64
        L57:
            r2 = move-exception
            goto L87
        L59:
            if (r8 == 0) goto L60
            tl.g$a r6 = mf.a0.f(r8)     // Catch: java.lang.Throwable -> L57
            goto L64
        L60:
            java.lang.Object r6 = r12.h(r7)     // Catch: java.lang.Throwable -> L57
        L64:
            r2.l(r6)     // Catch: java.lang.Throwable -> L57
            tl.l r2 = tl.l.f28297a     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L71
            boolean r2 = r4.B0()     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L74
        L71:
            um.z.a(r3, r1)     // Catch: java.lang.Throwable -> L93
        L74:
            r0.a()     // Catch: java.lang.Throwable -> L7a
            tl.l r0 = tl.l.f28297a     // Catch: java.lang.Throwable -> L7a
            goto L7f
        L7a:
            r0 = move-exception
            tl.g$a r0 = mf.a0.f(r0)
        L7f:
            java.lang.Throwable r0 = tl.g.a(r0)
            r12.j(r5, r0)
            goto La6
        L87:
            if (r4 == 0) goto L8f
            boolean r4 = r4.B0()     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L92
        L8f:
            um.z.a(r3, r1)     // Catch: java.lang.Throwable -> L93
        L92:
            throw r2     // Catch: java.lang.Throwable -> L93
        L93:
            r1 = move-exception
            r0.a()     // Catch: java.lang.Throwable -> L9a
            tl.l r0 = tl.l.f28297a     // Catch: java.lang.Throwable -> L9a
            goto L9f
        L9a:
            r0 = move-exception
            tl.g$a r0 = mf.a0.f(r0)
        L9f:
            java.lang.Throwable r0 = tl.g.a(r0)
            r12.j(r1, r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.m0.run():void");
    }
}

package l2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.a;
import l2.n0;

/* loaded from: classes.dex */
public final class o2<Key, Value> implements r2<Key, Value> {

    /* renamed from: a */
    public final pm.e0 f19168a;

    /* renamed from: b */
    public final n2<Key, Value> f19169b;

    /* renamed from: c */
    public final j4.j f19170c = new j4.j();

    /* renamed from: d */
    public final d3 f19171d = new d3(false);

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19172a;

        static {
            int[] iArr = new int[r0.values().length];
            iArr[0] = 1;
            f19172a = iArr;
        }
    }

    @zl.e(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", l = {397}, m = "initialize")
    /* loaded from: classes.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public o2 f19173d;

        /* renamed from: e */
        public /* synthetic */ Object f19174e;

        /* renamed from: f */
        public final /* synthetic */ o2<Key, Value> f19175f;

        /* renamed from: g */
        public int f19176g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o2<Key, Value> o2Var, xl.d<? super b> dVar) {
            super(dVar);
            this.f19175f = o2Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19174e = obj;
            this.f19176g |= Integer.MIN_VALUE;
            return this.f19175f.a(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.l<l2.a<Key, Value>, tl.l> {

        /* renamed from: b */
        public static final c f19177b = new c();

        public c() {
            super(1);
        }

        @Override // fm.l
        public final tl.l k(Object obj) {
            l2.a aVar = (l2.a) obj;
            gm.l.f(aVar, "it");
            aVar.d(r0.APPEND, 3);
            aVar.d(r0.PREPEND, 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends gm.m implements fm.l<l2.a<Key, Value>, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ r0 f19178b;

        /* renamed from: c */
        public final /* synthetic */ m2<Key, Value> f19179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r0 r0Var, m2<Key, Value> m2Var) {
            super(1);
            this.f19178b = r0Var;
            this.f19179c = m2Var;
        }

        @Override // fm.l
        public final Boolean k(Object obj) {
            boolean z10;
            a.C0324a<Key, Value> c0324a;
            boolean z11;
            l2.a aVar = (l2.a) obj;
            gm.l.f(aVar, "it");
            r0 r0Var = this.f19178b;
            m2<Key, Value> m2Var = this.f19179c;
            r0 r0Var2 = r0.REFRESH;
            gm.l.f(r0Var, "loadType");
            gm.l.f(m2Var, "pagingState");
            Iterator<a.C0324a<Key, Value>> it = aVar.f18691c.iterator();
            while (true) {
                z10 = false;
                if (it.hasNext()) {
                    c0324a = it.next();
                    if (c0324a.f18692a == r0Var) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    c0324a = null;
                    break;
                }
            }
            a.C0324a<Key, Value> c0324a2 = c0324a;
            if (c0324a2 != null) {
                c0324a2.f18693b = m2Var;
            } else {
                int i10 = aVar.f18689a[r0Var.ordinal()];
                if (i10 == 3 && r0Var != r0Var2) {
                    aVar.f18691c.addLast(new a.C0324a<>(r0Var, m2Var));
                } else if (i10 == 1 || r0Var == r0Var2) {
                    if (r0Var == r0Var2) {
                        aVar.e(r0Var2, null);
                    }
                    if (aVar.f18690b[r0Var.ordinal()] == null) {
                        aVar.f18691c.addLast(new a.C0324a<>(r0Var, m2Var));
                        z10 = true;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends gm.m implements fm.l<l2.a<Key, Value>, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ List<r0> f19180b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ArrayList arrayList) {
            super(1);
            this.f19180b = arrayList;
        }

        @Override // fm.l
        public final tl.l k(Object obj) {
            r0 r0Var = r0.REFRESH;
            l2.a aVar = (l2.a) obj;
            r0 r0Var2 = r0.PREPEND;
            r0 r0Var3 = r0.APPEND;
            gm.l.f(aVar, "accessorState");
            q0 q0Var = new q0(aVar.b(r0Var), aVar.b(r0Var2), aVar.b(r0Var3));
            boolean z10 = q0Var.f19200a instanceof n0.a;
            int length = aVar.f18690b.length - 1;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    aVar.f18690b[i10] = null;
                    if (i11 > length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (z10) {
                this.f19180b.add(r0Var);
                aVar.d(r0Var, 1);
            }
            if (q0Var.f19202c instanceof n0.a) {
                if (!z10) {
                    this.f19180b.add(r0Var3);
                }
                aVar.a(r0Var3);
            }
            if (q0Var.f19201b instanceof n0.a) {
                if (!z10) {
                    this.f19180b.add(r0Var2);
                }
                aVar.a(r0Var2);
            }
            return tl.l.f28297a;
        }
    }

    public o2(z2 z2Var, n2 n2Var) {
        this.f19168a = z2Var;
        this.f19169b = n2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    @Override // l2.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xl.d<? super l2.n2.a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof l2.o2.b
            if (r0 == 0) goto L13
            r0 = r5
            l2.o2$b r0 = (l2.o2.b) r0
            int r1 = r0.f19176g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19176g = r1
            goto L18
        L13:
            l2.o2$b r0 = new l2.o2$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19174e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f19176g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            l2.o2 r0 = r0.f19173d
            mf.a0.k(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            mf.a0.k(r5)
            l2.n2<Key, Value> r5 = r4.f19169b
            r0.f19173d = r4
            r0.f19176g = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            r1 = r5
            l2.n2$a r1 = (l2.n2.a) r1
            l2.n2$a r2 = l2.n2.a.LAUNCH_INITIAL_REFRESH
            if (r1 != r2) goto L50
            j4.j r0 = r0.f19170c
            l2.o2$c r1 = l2.o2.c.f19177b
            r0.a(r1)
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.o2.a(xl.d):java.lang.Object");
    }

    @Override // l2.s2
    public final void b(r0 r0Var, m2<Key, Value> m2Var) {
        gm.l.f(r0Var, "loadType");
        if (((Boolean) this.f19170c.a(new d(r0Var, m2Var))).booleanValue()) {
            if (a.f19172a[r0Var.ordinal()] == 1) {
                bi.z0.g(this.f19168a, null, 0, new q2(this, null), 3);
            } else {
                bi.z0.g(this.f19168a, null, 0, new p2(this, null), 3);
            }
        }
    }

    @Override // l2.s2
    public final void c(m2<Key, Value> m2Var) {
        ArrayList arrayList = new ArrayList();
        this.f19170c.a(new e(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b((r0) it.next(), m2Var);
        }
    }

    @Override // l2.r2
    public final sm.r0 getState() {
        return (sm.r0) this.f19170c.f17417d;
    }
}

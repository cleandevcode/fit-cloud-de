package l2;

import l2.h0;
import l2.j3;

/* loaded from: classes.dex */
public final class c1<Key, Value> {

    /* renamed from: a */
    public final fm.l<xl.d<? super l2<Key, Value>>, Object> f18772a;

    /* renamed from: b */
    public final Key f18773b;

    /* renamed from: c */
    public final a2 f18774c;

    /* renamed from: d */
    public final w.c f18775d = new w.c();

    /* renamed from: e */
    public final w.c f18776e = new w.c();

    /* renamed from: f */
    public final sm.f<b2<Value>> f18777f;

    /* loaded from: classes.dex */
    public static final class a<Key, Value> {

        /* renamed from: a */
        public final i1<Key, Value> f18778a;

        /* renamed from: b */
        public final m2<Key, Value> f18779b;

        /* renamed from: c */
        public final pm.g1 f18780c;

        public a(i1 i1Var, m2 m2Var, pm.j1 j1Var) {
            this.f18778a = i1Var;
            this.f18779b = m2Var;
            this.f18780c = j1Var;
        }
    }

    /* loaded from: classes.dex */
    public final class b<Key, Value> implements h3 {

        /* renamed from: a */
        public final i1<Key, Value> f18781a;

        /* renamed from: b */
        public final w.c f18782b;

        /* renamed from: c */
        public final /* synthetic */ c1<Key, Value> f18783c;

        public b(c1 c1Var, i1<Key, Value> i1Var, w.c cVar) {
            gm.l.f(c1Var, "this$0");
            gm.l.f(i1Var, "pageFetcherSnapshot");
            gm.l.f(cVar, "retryEventBus");
            this.f18783c = c1Var;
            this.f18781a = i1Var;
            this.f18782b = cVar;
        }

        @Override // l2.h3
        public final void a() {
            this.f18782b.b(tl.l.f28297a);
        }

        @Override // l2.h3
        public final void b(j3 j3Var) {
            j3.a aVar;
            i1<Key, Value> i1Var = this.f18781a;
            i1Var.getClass();
            h0 h0Var = i1Var.f18982i;
            h0Var.getClass();
            h0.b bVar = h0Var.f18915a;
            if (j3Var instanceof j3.a) {
                aVar = (j3.a) j3Var;
            } else {
                aVar = null;
            }
            bVar.a(aVar, new j0(j3Var));
        }

        @Override // l2.h3
        public final void c() {
            this.f18783c.f18775d.b(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c1(fm.l lVar, Object obj, a2 a2Var, lg.i0 i0Var) {
        this.f18772a = lVar;
        this.f18773b = obj;
        this.f18774c = a2Var;
        this.f18777f = y2.a(new d1(i0Var, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00cb, code lost:
        if (r4 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0045, code lost:
        if (r7 == r2) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0050  */
    /* JADX WARN: Type inference failed for: r2v0, types: [yl.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l2.l2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(l2.c1 r5, l2.l2 r6, xl.d r7) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.c1.a(l2.c1, l2.l2, xl.d):java.lang.Object");
    }
}

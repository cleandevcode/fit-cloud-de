package l2;

import java.util.Collection;
import java.util.Iterator;
import l2.n0;

/* loaded from: classes.dex */
public final class a<Key, Value> {

    /* renamed from: a */
    public final int[] f18689a;

    /* renamed from: b */
    public final n0.a[] f18690b;

    /* renamed from: c */
    public final ul.g<C0324a<Key, Value>> f18691c;

    /* renamed from: l2.a$a */
    /* loaded from: classes.dex */
    public static final class C0324a<Key, Value> {

        /* renamed from: a */
        public final r0 f18692a;

        /* renamed from: b */
        public m2<Key, Value> f18693b;

        public C0324a(r0 r0Var, m2<Key, Value> m2Var) {
            this.f18692a = r0Var;
            this.f18693b = m2Var;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18694a;

        static {
            int[] iArr = new int[s.c0.c(3).length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[0] = 3;
            int[] iArr2 = new int[r0.values().length];
            iArr2[0] = 1;
            f18694a = iArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.l<C0324a<Key, Value>, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ r0 f18695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0 r0Var) {
            super(1);
            this.f18695b = r0Var;
        }

        @Override // fm.l
        public final Boolean k(Object obj) {
            boolean z10;
            C0324a c0324a = (C0324a) obj;
            gm.l.f(c0324a, "it");
            if (c0324a.f18692a == this.f18695b) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public a() {
        int length = r0.values().length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = 1;
        }
        this.f18689a = iArr;
        int length2 = r0.values().length;
        n0.a[] aVarArr = new n0.a[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            aVarArr[i11] = null;
        }
        this.f18690b = aVarArr;
        this.f18691c = new ul.g<>();
    }

    public final void a(r0 r0Var) {
        gm.l.f(r0Var, "loadType");
        ul.n.E(this.f18691c, new c(r0Var));
    }

    public final n0 b(r0 r0Var) {
        boolean z10;
        int i10 = this.f18689a[r0Var.ordinal()];
        ul.g<C0324a<Key, Value>> gVar = this.f18691c;
        boolean z11 = false;
        if (!(gVar instanceof Collection) || !gVar.isEmpty()) {
            Iterator<C0324a<Key, Value>> it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().f18692a == r0Var) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11 && i10 != 3) {
            return n0.b.f19107b;
        }
        n0.a aVar = this.f18690b[r0Var.ordinal()];
        if (aVar == null) {
            int b10 = s.c0.b(i10);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw new qa.p();
                    }
                } else if (b.f18694a[r0Var.ordinal()] != 1) {
                    return n0.c.f19108b;
                }
            }
            return n0.c.f19109c;
        }
        return aVar;
    }

    public final tl.f<r0, m2<Key, Value>> c() {
        C0324a<Key, Value> c0324a;
        Iterator<C0324a<Key, Value>> it = this.f18691c.iterator();
        while (true) {
            if (it.hasNext()) {
                c0324a = it.next();
                r0 r0Var = c0324a.f18692a;
                boolean z10 = true;
                if (r0Var == r0.REFRESH || this.f18689a[r0Var.ordinal()] != 1) {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                c0324a = null;
                break;
            }
        }
        C0324a<Key, Value> c0324a2 = c0324a;
        if (c0324a2 == null) {
            return null;
        }
        return new tl.f<>(c0324a2.f18692a, c0324a2.f18693b);
    }

    public final void d(r0 r0Var, int i10) {
        gm.l.f(r0Var, "loadType");
        gm.k.b(i10, "state");
        this.f18689a[r0Var.ordinal()] = i10;
    }

    public final void e(r0 r0Var, n0.a aVar) {
        gm.l.f(r0Var, "loadType");
        this.f18690b[r0Var.ordinal()] = aVar;
    }
}

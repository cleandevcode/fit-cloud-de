package pm;

import xl.f;

/* loaded from: classes2.dex */
public final class z {

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.p<xl.f, f.b, xl.f> {

        /* renamed from: b */
        public static final a f24417b = new a();

        public a() {
            super(2);
        }

        @Override // fm.p
        public final xl.f A(xl.f fVar, f.b bVar) {
            xl.f fVar2 = fVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof y) {
                bVar2 = ((y) bVar2).F();
            }
            return fVar2.s(bVar2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.p<xl.f, f.b, xl.f> {

        /* renamed from: b */
        public final /* synthetic */ gm.a0<xl.f> f24418b;

        /* renamed from: c */
        public final /* synthetic */ boolean f24419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gm.a0<xl.f> a0Var, boolean z10) {
            super(2);
            this.f24418b = a0Var;
            this.f24419c = z10;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [xl.f, T] */
        @Override // fm.p
        public final xl.f A(xl.f fVar, f.b bVar) {
            xl.f fVar2 = fVar;
            f.b bVar2 = bVar;
            boolean z10 = bVar2 instanceof y;
            y yVar = bVar2;
            if (z10) {
                if (this.f24418b.f15485a.b(bVar2.getKey()) == null) {
                    y yVar2 = (y) bVar2;
                    yVar = yVar2;
                    if (this.f24419c) {
                        yVar = yVar2.F();
                    }
                } else {
                    gm.a0<xl.f> a0Var = this.f24418b;
                    a0Var.f15485a = a0Var.f15485a.y(bVar2.getKey());
                    yVar = ((y) bVar2).e0();
                }
            }
            return fVar2.s(yVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final xl.f a(xl.f fVar, xl.f fVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        a0 a0Var = a0.f24321b;
        boolean booleanValue = ((Boolean) fVar.Z(bool, a0Var)).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar2.Z(bool, a0Var)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fVar.s(fVar2);
        }
        gm.a0 a0Var2 = new gm.a0();
        a0Var2.f15485a = fVar2;
        xl.g gVar = xl.g.f30632a;
        xl.f fVar3 = (xl.f) fVar.Z(gVar, new b(a0Var2, z10));
        if (booleanValue2) {
            a0Var2.f15485a = ((xl.f) a0Var2.f15485a).Z(gVar, a.f24417b);
        }
        return fVar3.s((xl.f) a0Var2.f15485a);
    }

    public static final g2<?> b(xl.d<?> dVar, xl.f fVar, Object obj) {
        boolean z10;
        g2<?> g2Var = null;
        if (!(dVar instanceof zl.d)) {
            return null;
        }
        if (fVar.b(h2.f24346a) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        zl.d dVar2 = (zl.d) dVar;
        while (true) {
            if (!(dVar2 instanceof l0) && (dVar2 = dVar2.g()) != null) {
                if (dVar2 instanceof g2) {
                    g2Var = (g2) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (g2Var != null) {
            g2Var.f24342d.set(new tl.f<>(fVar, obj));
        }
        return g2Var;
    }
}

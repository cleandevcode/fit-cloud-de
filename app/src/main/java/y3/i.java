package y3;

/* loaded from: classes.dex */
public abstract class i {

    /* loaded from: classes.dex */
    public static final class a extends gm.m implements fm.l<mm.f<?, ?>, CharSequence> {

        /* renamed from: b */
        public static final a f30959b = new a();

        public a() {
            super(1);
        }

        @Override // fm.l
        public final CharSequence k(mm.f<?, ?> fVar) {
            mm.f<?, ?> fVar2 = fVar;
            gm.l.f(fVar2, "it");
            return fVar2.getName();
        }
    }

    public final i a(mm.f<?, ?>... fVarArr) {
        if (this instanceof z0) {
            return z0.f31104a;
        }
        if (this instanceof e1) {
            return new e1(ul.i.C(fVarArr, ",", b() + '_', a.f30959b, 28));
        }
        throw new qa.p();
    }

    public abstract String b();
}

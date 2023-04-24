package u6;

/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    public static final class a extends gm.m implements fm.l<mm.f<?, ?>, CharSequence> {

        /* renamed from: b */
        public static final a f28542b = new a();

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

    public final f a(mm.f<?, ?>... fVarArr) {
        if (this instanceof z) {
            return z.f28636a;
        }
        if (this instanceof c0) {
            return new c0(ul.i.C(fVarArr, ",", b() + '_', a.f28542b, 28));
        }
        throw new qa.p();
    }

    public abstract String b();
}

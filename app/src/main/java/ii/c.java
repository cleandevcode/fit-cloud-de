package ii;

import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.f1;

/* loaded from: classes2.dex */
public final class c extends y3.k0<nh.d<tl.l>> {

    /* renamed from: f */
    public dk.a<fh.a> f16899f;

    /* loaded from: classes2.dex */
    public static final class a implements y3.r0<c, nh.d<tl.l>> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<c, nh.d<tl.l>> f16900a = new qf.d<>(c.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public c create(f1 f1Var, nh.d<tl.l> dVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(dVar, "state");
            return this.f16900a.create(f1Var, dVar);
        }

        /* renamed from: initialState */
        public nh.d<tl.l> m6initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f16900a.initialState(f1Var);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nh.d<tl.l> dVar) {
        super(dVar, null, 2, null);
        gm.l.f(dVar, "initState");
    }
}

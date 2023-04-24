package ii;

import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.f1;

/* loaded from: classes2.dex */
public final class j0 extends y3.k0<nh.d<tl.l>> {

    /* renamed from: f */
    public dk.a<fh.b> f16953f;

    /* loaded from: classes2.dex */
    public static final class a implements y3.r0<j0, nh.d<tl.l>> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<j0, nh.d<tl.l>> f16954a = new qf.d<>(j0.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public j0 create(f1 f1Var, nh.d<tl.l> dVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(dVar, "state");
            return this.f16954a.create(f1Var, dVar);
        }

        /* renamed from: initialState */
        public nh.d<tl.l> m8initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f16954a.initialState(f1Var);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(nh.d<tl.l> dVar) {
        super(dVar, null, 2, null);
        gm.l.f(dVar, "initState");
    }
}

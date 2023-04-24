package jh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import pm.z1;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class z extends k0<y> {

    /* renamed from: m */
    public static final /* synthetic */ int f17834m = 0;

    /* renamed from: f */
    public jg.a f17835f;

    /* renamed from: g */
    public dk.a<eh.d> f17836g;

    /* renamed from: h */
    public dk.a<eh.h> f17837h;

    /* renamed from: i */
    public dk.a<eh.i> f17838i;

    /* renamed from: j */
    public dk.a<q> f17839j;

    /* renamed from: k */
    public dk.a<eh.j> f17840k;

    /* renamed from: l */
    public z1 f17841l;

    /* loaded from: classes2.dex */
    public static final class a implements r0<z, y> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<z, y> f17842a = new qf.d<>(z.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public z create(f1 f1Var, y yVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(yVar, "state");
            return this.f17842a.create(f1Var, yVar);
        }

        /* renamed from: initialState */
        public y m13initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f17842a.initialState(f1Var);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar) {
        super(yVar, null, 2, null);
        gm.l.f(yVar, "initState");
    }
}

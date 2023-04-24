package jh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class h0 extends k0<g0> {

    /* renamed from: f */
    public dk.a<eh.k> f17789f;

    /* loaded from: classes2.dex */
    public static final class a implements r0<h0, g0> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<h0, g0> f17790a = new qf.d<>(h0.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public h0 create(f1 f1Var, g0 g0Var) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(g0Var, "state");
            return this.f17790a.create(f1Var, g0Var);
        }

        /* renamed from: initialState */
        public g0 m10initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f17790a.initialState(f1Var);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var) {
        super(g0Var, null, 2, null);
        gm.l.f(g0Var, "initState");
    }
}

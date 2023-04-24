package jh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class i extends k0<h> {

    /* renamed from: f */
    public dk.a<eh.b> f17791f;

    /* loaded from: classes2.dex */
    public static final class a implements r0<i, h> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<i, h> f17792a = new qf.d<>(i.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public i create(f1 f1Var, h hVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(hVar, "state");
            return this.f17792a.create(f1Var, hVar);
        }

        /* renamed from: initialState */
        public h m11initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f17792a.initialState(f1Var);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(hVar, null, 2, null);
        gm.l.f(hVar, "initState");
    }
}

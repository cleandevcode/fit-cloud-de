package jh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class s extends k0<nh.d<tl.l>> {

    /* renamed from: f */
    public dk.a<eh.f> f17820f;

    /* loaded from: classes2.dex */
    public static final class a implements r0<s, nh.d<tl.l>> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<s, nh.d<tl.l>> f17821a = new qf.d<>(s.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public s create(f1 f1Var, nh.d<tl.l> dVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(dVar, "state");
            return this.f17821a.create(f1Var, dVar);
        }

        /* renamed from: initialState */
        public nh.d<tl.l> m12initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f17821a.initialState(f1Var);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nh.d<tl.l> dVar) {
        super(dVar, null, 2, null);
        gm.l.f(dVar, "initState");
    }
}

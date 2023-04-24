package tm;

import mf.a0;
import um.z;

/* loaded from: classes2.dex */
public final class x<T> implements sm.g<T> {

    /* renamed from: a */
    public final xl.f f28374a;

    /* renamed from: b */
    public final Object f28375b;

    /* renamed from: c */
    public final a f28376c;

    @zl.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<T, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f28377e;

        /* renamed from: f */
        public /* synthetic */ Object f28378f;

        /* renamed from: g */
        public final /* synthetic */ sm.g<T> f28379g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(sm.g<? super T> gVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f28379g = gVar;
        }

        @Override // fm.p
        public final Object A(Object obj, xl.d<? super tl.l> dVar) {
            return ((a) p(obj, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f28379g, dVar);
            aVar.f28378f = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28377e;
            if (i10 == 0) {
                a0.k(obj);
                Object obj2 = this.f28378f;
                this.f28377e = 1;
                if (this.f28379g.n(obj2, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    public x(sm.g<? super T> gVar, xl.f fVar) {
        this.f28374a = fVar;
        this.f28375b = z.b(fVar);
        this.f28376c = new a(gVar, null);
    }

    @Override // sm.g
    public final Object n(T t10, xl.d<? super tl.l> dVar) {
        Object P = bi.r.P(this.f28374a, t10, this.f28375b, this.f28376c, dVar);
        return P == yl.a.COROUTINE_SUSPENDED ? P : tl.l.f28297a;
    }
}

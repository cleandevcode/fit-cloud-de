package yl;

import fm.p;
import gm.e0;
import gm.l;
import mf.a0;
import xl.d;
import xl.f;

/* loaded from: classes2.dex */
public final class c extends zl.c {

    /* renamed from: d */
    public int f31801d;

    /* renamed from: e */
    public final /* synthetic */ p f31802e;

    /* renamed from: f */
    public final /* synthetic */ Object f31803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.f31802e = pVar;
        this.f31803f = obj;
        l.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10 = this.f31801d;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f31801d = 2;
                a0.k(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f31801d = 1;
        a0.k(obj);
        l.d(this.f31802e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        p pVar = this.f31802e;
        e0.c(2, pVar);
        return pVar.A(this.f31803f, this);
    }
}

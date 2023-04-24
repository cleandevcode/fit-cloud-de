package yl;

import fm.p;
import gm.e0;
import gm.l;
import mf.a0;
import xl.d;
import zl.g;

/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: b */
    public int f31798b;

    /* renamed from: c */
    public final /* synthetic */ p f31799c;

    /* renamed from: d */
    public final /* synthetic */ Object f31800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, d dVar, p pVar) {
        super(dVar);
        this.f31799c = pVar;
        this.f31800d = obj;
        l.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10 = this.f31798b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f31798b = 2;
                a0.k(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f31798b = 1;
        a0.k(obj);
        l.d(this.f31799c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        p pVar = this.f31799c;
        e0.c(2, pVar);
        return pVar.A(this.f31800d, this);
    }
}

package yg;

import bi.z0;
import java.io.IOException;
import p000do.a;
import pm.e0;

/* loaded from: classes2.dex */
public final class l {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.InternalStorageKt$queryAuthTokenInfo$authInfo$1", f = "InternalStorage.kt", l = {109}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super pg.a>, Object> {

        /* renamed from: e */
        public int f31587e;

        /* renamed from: f */
        public final /* synthetic */ j f31588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f31588f = jVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super pg.a> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f31588f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31587e;
            if (i10 == 0) {
                mf.a0.k(obj);
                j jVar = this.f31588f;
                this.f31587e = 1;
                obj = jVar.w(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return obj;
        }
    }

    public static final Long a(j jVar) {
        gm.l.f(jVar, "<this>");
        Long value = jVar.h().getValue();
        if (value == null || hh.b.f(value.longValue())) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Auth");
            bVar.p("userId is %s", value);
            return null;
        }
        return value;
    }

    public static final Long b(j jVar) {
        gm.l.f(jVar, "<this>");
        Long value = jVar.h().getValue();
        if (value == null) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Auth");
            bVar.p("userId is null", new Object[0]);
        }
        return value;
    }

    public static final pg.a c(j jVar, long j10) {
        boolean z10;
        boolean z11;
        gm.l.f(jVar, "<this>");
        if (j10 != Long.MAX_VALUE) {
            pg.a aVar = (pg.a) z0.n(new a(jVar, null));
            boolean z12 = true;
            if (aVar != null && aVar.f24014a == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String str = aVar.f24016c;
                if (str != null && str.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    String str2 = aVar.f24017d;
                    if (str2 != null && str2.length() != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        return aVar;
                    }
                }
                throw new ig.a(0);
            }
            throw new ig.b();
        }
        throw new IOException(new IllegalStateException("fake user don't have token"));
    }

    public static final long d(j jVar, long j10) {
        gm.l.f(jVar, "<this>");
        return c(jVar, j10).f24015b;
    }
}

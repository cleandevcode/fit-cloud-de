package nh;

import android.os.Bundle;
import android.view.View;
import bi.z0;
import fm.p;
import kotlin.Metadata;
import lh.i;
import mf.a0;
import nh.c;
import pm.e0;
import qi.h;
import sm.g;
import sm.t0;
import tl.l;

@Metadata
/* loaded from: classes2.dex */
public abstract class a<T> extends i {

    /* renamed from: o0 */
    public static final /* synthetic */ int f22362o0 = 0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncActionFragment$onViewCreated$1", f = "AsyncActionFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nh.a$a */
    /* loaded from: classes2.dex */
    public static final class C0393a extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f22363e;

        /* renamed from: f */
        public final /* synthetic */ a<T> f22364f;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncActionFragment$onViewCreated$1$1", f = "AsyncActionFragment.kt", l = {27}, m = "invokeSuspend")
        /* renamed from: nh.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C0394a extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f22365e;

            /* renamed from: f */
            public final /* synthetic */ a<T> f22366f;

            /* renamed from: nh.a$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0395a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ a<T> f22367a;

                public C0395a(a<T> aVar) {
                    this.f22367a = aVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    if (((d) obj).f22382a instanceof y3.p) {
                        a<T> aVar = this.f22367a;
                        int i10 = a.f22362o0;
                        d7.e.g(aVar.e1());
                    } else {
                        a<T> aVar2 = this.f22367a;
                        int i11 = a.f22362o0;
                        aVar2.e1().a();
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0394a(a<T> aVar, xl.d<? super C0394a> dVar) {
                super(2, dVar);
                this.f22366f = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0394a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0394a(this.f22366f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f22365e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t0 t0Var = this.f22366f.g1().f22394e;
                    C0395a c0395a = new C0395a(this.f22366f);
                    this.f22365e = 1;
                    if (t0Var.a(c0395a, this) == aVar) {
                        return aVar;
                    }
                }
                return l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncActionFragment$onViewCreated$1$2", f = "AsyncActionFragment.kt", l = {36}, m = "invokeSuspend")
        /* renamed from: nh.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f22368e;

            /* renamed from: f */
            public final /* synthetic */ a<T> f22369f;

            /* renamed from: nh.a$a$b$a */
            /* loaded from: classes2.dex */
            public static final class C0396a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ a<T> f22370a;

                public C0396a(a<T> aVar) {
                    this.f22370a = aVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    c cVar = (c) obj;
                    if (cVar instanceof c.a) {
                        a<T> aVar = this.f22370a;
                        int i10 = a.f22362o0;
                        qi.p.f(aVar.f1(), ((c.a) cVar).f22380a);
                    } else if (cVar instanceof c.b) {
                        this.f22370a.h1(((c.b) cVar).f22381a);
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a<T> aVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f22369f = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((b) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f22369f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f22368e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.c cVar = this.f22369f.g1().f22396g;
                    C0396a c0396a = new C0396a(this.f22369f);
                    this.f22368e = 1;
                    if (cVar.a(c0396a, this) == aVar) {
                        return aVar;
                    }
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0393a(a<T> aVar, xl.d<? super C0393a> dVar) {
            super(2, dVar);
            this.f22364f = aVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((C0393a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            C0393a c0393a = new C0393a(this.f22364f, dVar);
            c0393a.f22363e = obj;
            return c0393a;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f22363e;
            z0.g(e0Var, null, 0, new C0394a(this.f22364f, null), 3);
            z0.g(e0Var, null, 0, new b(this.f22364f, null), 3);
            return l.f28297a;
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    @Override // lh.c, androidx.fragment.app.r
    public void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        h.k(h.i(this), new C0393a(this, null));
    }

    public abstract e<T> g1();

    public void h1(T t10) {
    }
}

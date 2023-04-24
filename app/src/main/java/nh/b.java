package nh;

import android.os.Bundle;
import android.view.View;
import bi.z0;
import fm.p;
import kotlin.Metadata;
import lh.h;
import mf.a0;
import nh.c;
import pm.e0;
import sm.g;
import sm.t0;
import tl.l;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public abstract class b<T> extends h {

    /* renamed from: v0 */
    public static final /* synthetic */ int f22371v0 = 0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncActionGetPhotoFragment$onViewCreated$1", f = "AsyncActionFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f22372e;

        /* renamed from: f */
        public final /* synthetic */ b<T> f22373f;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncActionGetPhotoFragment$onViewCreated$1$1", f = "AsyncActionFragment.kt", l = {65}, m = "invokeSuspend")
        /* renamed from: nh.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C0397a extends i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f22374e;

            /* renamed from: f */
            public final /* synthetic */ b<T> f22375f;

            /* renamed from: nh.b$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0398a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ b<T> f22376a;

                public C0398a(b<T> bVar) {
                    this.f22376a = bVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    if (((d) obj).f22382a instanceof y3.p) {
                        b<T> bVar = this.f22376a;
                        int i10 = b.f22371v0;
                        d7.e.g(bVar.e1());
                    } else {
                        b<T> bVar2 = this.f22376a;
                        int i11 = b.f22371v0;
                        bVar2.e1().a();
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0397a(b<T> bVar, xl.d<? super C0397a> dVar) {
                super(2, dVar);
                this.f22375f = bVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0397a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0397a(this.f22375f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f22374e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t0 t0Var = this.f22375f.r1().f22394e;
                    C0398a c0398a = new C0398a(this.f22375f);
                    this.f22374e = 1;
                    if (t0Var.a(c0398a, this) == aVar) {
                        return aVar;
                    }
                }
                return l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncActionGetPhotoFragment$onViewCreated$1$2", f = "AsyncActionFragment.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: nh.b$a$b */
        /* loaded from: classes2.dex */
        public static final class C0399b extends i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f22377e;

            /* renamed from: f */
            public final /* synthetic */ b<T> f22378f;

            /* renamed from: nh.b$a$b$a */
            /* loaded from: classes2.dex */
            public static final class C0400a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ b<T> f22379a;

                public C0400a(b<T> bVar) {
                    this.f22379a = bVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    c cVar = (c) obj;
                    if (cVar instanceof c.a) {
                        b<T> bVar = this.f22379a;
                        int i10 = b.f22371v0;
                        qi.p.f(bVar.f1(), ((c.a) cVar).f22380a);
                    } else if (cVar instanceof c.b) {
                        this.f22379a.s1(((c.b) cVar).f22381a);
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0399b(b<T> bVar, xl.d<? super C0399b> dVar) {
                super(2, dVar);
                this.f22378f = bVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0399b) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0399b(this.f22378f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f22377e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.c cVar = this.f22378f.r1().f22396g;
                    C0400a c0400a = new C0400a(this.f22378f);
                    this.f22377e = 1;
                    if (cVar.a(c0400a, this) == aVar) {
                        return aVar;
                    }
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f22373f = bVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f22373f, dVar);
            aVar.f22372e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f22372e;
            z0.g(e0Var, null, 0, new C0397a(this.f22373f, null), 3);
            z0.g(e0Var, null, 0, new C0399b(this.f22373f, null), 3);
            return l.f28297a;
        }
    }

    public b() {
    }

    public b(int i10) {
        super(i10);
    }

    @Override // lh.c, androidx.fragment.app.r
    public void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new a(this, null));
    }

    public abstract e<T> r1();

    public void s1(T t10) {
    }
}

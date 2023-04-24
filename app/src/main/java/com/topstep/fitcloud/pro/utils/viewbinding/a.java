package com.topstep.fitcloud.pro.utils.viewbinding;

import a3.a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.a1;
import androidx.fragment.app.r;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import bi.z0;
import fm.p;
import gm.m;
import java.lang.reflect.Method;
import mf.a0;
import mm.h;
import pm.e0;
import s.e2;
import tl.d;
import tl.l;
import zl.e;
import zl.i;

/* loaded from: classes2.dex */
public final class a<T extends a3.a> {

    /* renamed from: a */
    public final r f12485a;

    /* renamed from: b */
    public final d f12486b;

    /* renamed from: c */
    public T f12487c;

    /* renamed from: d */
    public final Method f12488d;

    @e(c = "com.topstep.fitcloud.pro.utils.viewbinding.FragmentViewBindingDelegate$1", f = "FragmentViewBindingDelegate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.topstep.fitcloud.pro.utils.viewbinding.a$a */
    /* loaded from: classes2.dex */
    public static final class C0210a extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ a<T> f12489e;

        /* renamed from: com.topstep.fitcloud.pro.utils.viewbinding.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C0211a extends m implements fm.l<u, l> {

            /* renamed from: b */
            public final /* synthetic */ a<T> f12490b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0211a(a<T> aVar) {
                super(1);
                this.f12490b = aVar;
            }

            @Override // fm.l
            public final l k(u uVar) {
                v a02 = uVar.a0();
                final a<T> aVar = this.f12490b;
                a02.a(new g() { // from class: com.topstep.fitcloud.pro.utils.viewbinding.FragmentViewBindingDelegate$1$1$1
                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void c(u uVar2) {
                    }

                    @Override // androidx.lifecycle.g
                    public final void onDestroy(u uVar2) {
                        ((Handler) aVar.f12486b.getValue()).post(new e2(4, aVar));
                    }

                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void onPause(u uVar2) {
                    }

                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void onResume(u uVar2) {
                    }

                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void onStart(u uVar2) {
                    }

                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void onStop(u uVar2) {
                    }
                });
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0210a(a<T> aVar, xl.d<? super C0210a> dVar) {
            super(2, dVar);
            this.f12489e = aVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((C0210a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new C0210a(this.f12489e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            a<T> aVar = this.f12489e;
            r rVar = aVar.f12485a;
            rVar.f2513d0.e(rVar, new mi.e0(1, new C0211a(aVar)));
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<Handler> {

        /* renamed from: b */
        public static final b f12491b = new b();

        public b() {
            super(0);
        }

        @Override // fm.a
        public final Handler m() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public a(Class<T> cls, r rVar) {
        gm.l.f(rVar, "fragment");
        this.f12485a = rVar;
        this.f12486b = fb.e.a(b.f12491b);
        this.f12488d = cls.getMethod("bind", View.class);
        z0.g(rm.l.g(rVar), null, 0, new C0210a(this, null), 3);
    }

    public final T a(r rVar, h<?> hVar) {
        gm.l.f(rVar, "thisRef");
        gm.l.f(hVar, "property");
        T t10 = this.f12487c;
        if (t10 != null && t10.getRoot() != rVar.H) {
            this.f12487c = null;
        }
        T t11 = this.f12487c;
        if (t11 != null) {
            return t11;
        }
        a1 q02 = this.f12485a.q0();
        q02.d();
        v vVar = q02.f2313d;
        gm.l.e(vVar, "fragment.viewLifecycleOwner.lifecycle");
        if (vVar.f2790c.a(k.c.INITIALIZED)) {
            Object invoke = this.f12488d.invoke(null, rVar.X0());
            gm.l.d(invoke, "null cannot be cast to non-null type T of com.topstep.fitcloud.pro.utils.viewbinding.FragmentViewBindingDelegate");
            T t12 = (T) invoke;
            this.f12487c = t12;
            return t12;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Cannot access view bindings. View lifecycle is ");
        a10.append(vVar.f2790c);
        a10.append('!');
        throw new IllegalStateException(a10.toString().toString());
    }
}

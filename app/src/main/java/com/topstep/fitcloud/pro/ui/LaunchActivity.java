package com.topstep.fitcloud.pro.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import com.topstep.fitcloud.pro.function.DeviceService;
import fm.p;
import gm.b0;
import gm.j;
import gm.m;
import ih.l;
import ih.u;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class LaunchActivity extends l {

    /* renamed from: w */
    public final t0 f10227w = new t0(b0.a(LaunchNavigationViewMode.class), new c(this), new b(this), new d(this));

    /* renamed from: x */
    public u f10228x;

    @e(c = "com.topstep.fitcloud.pro.ui.LaunchActivity$onCreate$1", f = "LaunchActivity.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public LaunchActivity f10229e;

        /* renamed from: f */
        public int f10230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            LaunchActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            LaunchActivity launchActivity;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10230f;
            if (i10 != 0) {
                if (i10 == 1) {
                    launchActivity = this.f10229e;
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                LaunchActivity launchActivity2 = LaunchActivity.this;
                this.f10229e = launchActivity2;
                this.f10230f = 1;
                Object f10 = ((LaunchNavigationViewMode) launchActivity2.f10227w.getValue()).f(this);
                if (f10 == aVar) {
                    return aVar;
                }
                launchActivity = launchActivity2;
                obj = f10;
            }
            launchActivity.f10228x = (u) obj;
            LaunchActivity launchActivity3 = LaunchActivity.this;
            j.n(launchActivity3.f10228x, launchActivity3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f10232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f10232b = componentActivity;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f10232b.r();
            gm.l.e(r10, "defaultViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f10233b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f10233b = componentActivity;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f10233b.z();
            gm.l.e(z10, "viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f10234b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f10234b = componentActivity;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f10234b.s();
        }
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h1.b bVar;
        super.onCreate(bundle);
        startService(new Intent(this, DeviceService.class));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (i10 >= 31) {
                bVar = new h1.a(this);
            } else {
                bVar = new h1.b(this);
            }
            bVar.a();
        }
        rm.l.g(this).e(new a(null));
    }
}

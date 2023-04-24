package com.topstep.fitcloud.pro.ui.device.bind;

import androidx.lifecycle.l0;
import com.topstep.fitcloud.pro.model.device.DeviceShellSpecify;
import fm.l;
import fm.p;
import gm.m;
import gm.t;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import og.n1;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceSpecifyViewModel extends v6.b<ei.a<List<? extends DeviceShellSpecify>>> {

    /* renamed from: j */
    public final n1 f10848j;

    @e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyViewModel$request$1", f = "DeviceSpecifyFragment.kt", l = {227}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements l<d<? super List<? extends DeviceShellSpecify>>, Object> {

        /* renamed from: e */
        public int f10849e;

        /* renamed from: g */
        public final /* synthetic */ boolean f10851g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, d<? super a> dVar) {
            super(1, dVar);
            DeviceSpecifyViewModel.this = r1;
            this.f10851g = z10;
        }

        @Override // fm.l
        public final Object k(d<? super List<? extends DeviceShellSpecify>> dVar) {
            return new a(this.f10851g, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10849e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                n1 n1Var = DeviceSpecifyViewModel.this.f10848j;
                boolean z10 = this.f10851g;
                this.f10849e = 1;
                obj = n1Var.b("com.topstep.fitcloudpro", z10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements p<ei.a<List<? extends DeviceShellSpecify>>, u6.a<? extends List<? extends DeviceShellSpecify>>, ei.a<List<? extends DeviceShellSpecify>>> {

        /* renamed from: b */
        public static final c f10853b = new c();

        public c() {
            super(2);
        }

        @Override // fm.p
        public final ei.a<List<? extends DeviceShellSpecify>> A(ei.a<List<? extends DeviceShellSpecify>> aVar, u6.a<? extends List<? extends DeviceShellSpecify>> aVar2) {
            u6.a<? extends List<? extends DeviceShellSpecify>> aVar3 = aVar2;
            gm.l.f(aVar, "$this$execute");
            gm.l.f(aVar3, "it");
            return ei.a.a(aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSpecifyViewModel(l0 l0Var, n1 n1Var) {
        super(new ei.a(null, 1, null), l0Var);
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(n1Var, "shellRepository");
        this.f10848j = n1Var;
        j(false);
    }

    public final void j(boolean z10) {
        v6.b.f(this, new a(z10, null), new t() { // from class: com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyViewModel.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, c.f10853b, 1);
    }
}

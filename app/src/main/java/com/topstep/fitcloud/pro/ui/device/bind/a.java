package com.topstep.fitcloud.pro.ui.device.bind;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.github.kilnn.tool.widget.bottomsheet.RatioBottomSheetLayout;
import com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper;
import com.topstep.fitcloudpro.R;
import fm.p;
import mf.a0;
import mm.h;
import pm.e0;
import si.f;
import tl.l;
import uh.b0;
import uh.c0;
import xl.d;
import zl.e;
import zl.i;

/* loaded from: classes2.dex */
public final class a implements ScannerHelper.a {

    /* renamed from: a */
    public final /* synthetic */ DeviceBindFragment f10873a;

    @e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment$scannerHelper$2$1$scanErrorDelayAlert$1", f = "DeviceBindFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.topstep.fitcloud.pro.ui.device.bind.a$a */
    /* loaded from: classes2.dex */
    public static final class C0159a extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ DeviceBindFragment f10874e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0159a(DeviceBindFragment deviceBindFragment, d<? super C0159a> dVar) {
            super(2, dVar);
            this.f10874e = deviceBindFragment;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((C0159a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new C0159a(this.f10874e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            new b0().h1(this.f10874e.h0(), null);
            return l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment$scannerHelper$2$1$scanErrorRestartAlert$1", f = "DeviceBindFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ DeviceBindFragment f10875e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeviceBindFragment deviceBindFragment, d<? super b> dVar) {
            super(2, dVar);
            this.f10875e = deviceBindFragment;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new b(this.f10875e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            new c0().h1(this.f10875e.h0(), null);
            return l.f28297a;
        }
    }

    public a(DeviceBindFragment deviceBindFragment) {
        this.f10873a = deviceBindFragment;
    }

    @Override // com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.a
    public final void a() {
        DeviceBindFragment deviceBindFragment = this.f10873a;
        if (!deviceBindFragment.f10801x0) {
            deviceBindFragment.f10801x0 = true;
            f.f27071a.f(deviceBindFragment, new uh.d(deviceBindFragment));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0087  */
    @Override // com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(dj.a r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.bind.a.b(dj.a):void");
    }

    @Override // com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.a
    public final void c() {
        Animatable animatable;
        DeviceBindFragment deviceBindFragment = this.f10873a;
        h<Object>[] hVarArr = DeviceBindFragment.E0;
        Drawable drawable = deviceBindFragment.k1().fabScan.getDrawable();
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        this.f10873a.k1().fabScan.setImageResource(R.drawable.ic_baseline_search_24);
        this.f10873a.k1().refreshLayout.setRefreshing(false);
    }

    @Override // com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.a
    public final void d() {
        qi.h.j(this.f10873a).e(new b(this.f10873a, null));
    }

    @Override // com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.a
    public final void e() {
        qi.h.j(this.f10873a).e(new C0159a(this.f10873a, null));
    }

    @Override // com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.a
    public final void f() {
        Animatable animatable;
        DeviceBindFragment deviceBindFragment = this.f10873a;
        h<Object>[] hVarArr = DeviceBindFragment.E0;
        RatioBottomSheetLayout ratioBottomSheetLayout = deviceBindFragment.k1().bottomSheetLayout;
        gm.l.e(ratioBottomSheetLayout, "viewBind.bottomSheetLayout");
        if (DeviceBindFragment.j1(ratioBottomSheetLayout).J == 3) {
            DeviceBindFragment.h1(this.f10873a, true);
        }
        this.f10873a.k1().fabScan.setImageResource(R.drawable.ic_animated_search);
        Drawable drawable = this.f10873a.k1().fabScan.getDrawable();
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        this.f10873a.k1().refreshLayout.setRefreshing(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0113 A[Catch: all -> 0x0149, TryCatch #0 {, blocks: (B:131:0x00e7, B:133:0x00ed, B:158:0x0145, B:134:0x00fc, B:137:0x0102, B:145:0x0113, B:147:0x011f, B:149:0x0123, B:152:0x012b, B:154:0x0131, B:156:0x013f, B:157:0x0143, B:146:0x0118), top: B:168:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0118 A[Catch: all -> 0x0149, TryCatch #0 {, blocks: (B:131:0x00e7, B:133:0x00ed, B:158:0x0145, B:134:0x00fc, B:137:0x0102, B:145:0x0113, B:147:0x011f, B:149:0x0123, B:152:0x012b, B:154:0x0131, B:156:0x013f, B:157:0x0143, B:146:0x0118), top: B:168:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0131 A[Catch: all -> 0x0149, TryCatch #0 {, blocks: (B:131:0x00e7, B:133:0x00ed, B:158:0x0145, B:134:0x00fc, B:137:0x0102, B:145:0x0113, B:147:0x011f, B:149:0x0123, B:152:0x012b, B:154:0x0131, B:156:0x013f, B:157:0x0143, B:146:0x0118), top: B:168:0x00e7 }] */
    @Override // com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.bind.a.g(boolean):void");
    }
}

package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.databinding.DialogVersionUpdateBinding;
import com.topstep.fitcloud.pro.model.version.AppUpgradeInfo;
import com.topstep.fitcloudpro.R;
import fm.p;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import th.y;
import tl.l;
import yg.m;

@Metadata
/* loaded from: classes2.dex */
public final class a extends g {
    public static final /* synthetic */ int I0 = 0;
    public DialogVersionUpdateBinding G0;
    public m H0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.dialog.AppUpgradeDialogFragment$onCreateDialog$2$1", f = "AppUpgradeDialogFragment.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.topstep.fitcloud.pro.ui.dialog.a$a */
    /* loaded from: classes2.dex */
    public static final class C0196a extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f11444e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0196a(xl.d<? super C0196a> dVar) {
            super(2, dVar);
            a.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((C0196a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new C0196a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11444e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                m mVar = a.this.H0;
                if (mVar != null) {
                    this.f11444e = 1;
                    if (mVar.x(this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("publicStorage");
                    throw null;
                }
            }
            return l.f28297a;
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.G0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Parcelable parcelable;
        Bundle U0 = U0();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) U0.getParcelable("parcelArgs", AppUpgradeInfo.class);
        } else {
            parcelable = U0.getParcelable("parcelArgs");
        }
        AppUpgradeInfo appUpgradeInfo = (AppUpgradeInfo) parcelable;
        if (appUpgradeInfo == null) {
            return super.d1(bundle);
        }
        DialogVersionUpdateBinding inflate = DialogVersionUpdateBinding.inflate(k0());
        this.G0 = inflate;
        gm.l.c(inflate);
        inflate.tvVersion.setText(appUpgradeInfo.getVersion());
        DialogVersionUpdateBinding dialogVersionUpdateBinding = this.G0;
        gm.l.c(dialogVersionUpdateBinding);
        dialogVersionUpdateBinding.tvContent.setText(appUpgradeInfo.getRemark());
        v9.b bVar = new v9.b(V0());
        bVar.k(R.string.version_app_update);
        bVar.f(null);
        bVar.h(R.string.version_upgrade, new vh.l(this, 2));
        bVar.g(R.string.version_skip, new y(this, 1));
        DialogVersionUpdateBinding dialogVersionUpdateBinding2 = this.G0;
        gm.l.c(dialogVersionUpdateBinding2);
        bVar.m(dialogVersionUpdateBinding2.getRoot());
        return bVar.a();
    }
}

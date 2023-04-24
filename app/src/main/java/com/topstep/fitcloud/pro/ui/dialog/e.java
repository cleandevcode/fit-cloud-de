package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.databinding.DialogVersionUpdateBinding;
import com.topstep.fitcloud.pro.model.version.HardwareUpgradeInfo;
import com.topstep.fitcloudpro.R;
import fm.p;
import ih.v;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import tl.l;
import yg.m;

@Metadata
/* loaded from: classes2.dex */
public final class e extends h {
    public static final /* synthetic */ int I0 = 0;
    public DialogVersionUpdateBinding G0;
    public m H0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.dialog.HardwareUpgradeDialogFragment$onCreateDialog$1$1", f = "HardwareUpgradeDialogFragment.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f11450e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11450e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                m mVar = e.this.H0;
                if (mVar != null) {
                    this.f11450e = 1;
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
            parcelable = (Parcelable) U0.getParcelable("parcelArgs", HardwareUpgradeInfo.class);
        } else {
            parcelable = U0.getParcelable("parcelArgs");
        }
        final HardwareUpgradeInfo hardwareUpgradeInfo = (HardwareUpgradeInfo) parcelable;
        if (hardwareUpgradeInfo == null) {
            return super.d1(bundle);
        }
        DialogVersionUpdateBinding inflate = DialogVersionUpdateBinding.inflate(k0());
        this.G0 = inflate;
        gm.l.c(inflate);
        inflate.tvVersion.setText(gm.j.k(hardwareUpgradeInfo.getHardwareInfo()));
        DialogVersionUpdateBinding dialogVersionUpdateBinding = this.G0;
        gm.l.c(dialogVersionUpdateBinding);
        dialogVersionUpdateBinding.tvContent.setText(hardwareUpgradeInfo.getRemark());
        v9.b bVar = new v9.b(V0());
        bVar.k(R.string.version_hardware_update);
        bVar.h(R.string.version_upgrade, new DialogInterface.OnClickListener() { // from class: com.topstep.fitcloud.pro.ui.dialog.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                e eVar = e.this;
                HardwareUpgradeInfo hardwareUpgradeInfo2 = hardwareUpgradeInfo;
                int i11 = e.I0;
                gm.l.f(eVar, "this$0");
                gm.l.f(hardwareUpgradeInfo2, "$info");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("parcelArgs", hardwareUpgradeInfo2);
                tb.a.f(eVar).l(R.id.hardwareUpgradeFragment, bundle2, v.d().a());
            }
        });
        DialogVersionUpdateBinding dialogVersionUpdateBinding2 = this.G0;
        gm.l.c(dialogVersionUpdateBinding2);
        bVar.m(dialogVersionUpdateBinding2.getRoot());
        if (hardwareUpgradeInfo.isForce()) {
            f1(false);
        } else {
            bVar.f(null);
            bVar.g(R.string.version_skip, new vh.l(this, 3));
        }
        return bVar.a();
    }
}

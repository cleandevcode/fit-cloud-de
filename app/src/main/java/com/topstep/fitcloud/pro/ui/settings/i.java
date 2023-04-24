package com.topstep.fitcloud.pro.ui.settings;

import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import fm.p;
import mf.a0;
import pm.e0;
import tl.l;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onViewCreated$1$2$1$1", f = "SettingsFragment.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public Object[] f12023e;

    /* renamed from: f */
    public TextView f12024f;

    /* renamed from: g */
    public SettingsFragment f12025g;

    /* renamed from: h */
    public Object[] f12026h;

    /* renamed from: i */
    public int f12027i;

    /* renamed from: j */
    public int f12028j;

    /* renamed from: k */
    public final /* synthetic */ SettingsFragment f12029k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SettingsFragment settingsFragment, xl.d<? super i> dVar) {
        super(2, dVar);
        this.f12029k = settingsFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((i) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new i(this.f12029k, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        TextView textView;
        Object[] objArr;
        Object[] objArr2;
        int i10;
        SettingsFragment settingsFragment;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i11 = this.f12028j;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.f12027i;
                objArr2 = this.f12026h;
                settingsFragment = this.f12025g;
                textView = this.f12024f;
                objArr = this.f12023e;
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            SettingsFragment settingsFragment2 = this.f12029k;
            mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
            textView = settingsFragment2.h1().tvNewDataCount;
            SettingsFragment settingsFragment3 = this.f12029k;
            objArr = new Object[1];
            SettingsViewModel i12 = settingsFragment3.i1();
            this.f12023e = objArr;
            this.f12024f = textView;
            this.f12025g = settingsFragment3;
            this.f12026h = objArr;
            this.f12027i = R.string.cloud_sync_new_data_count;
            this.f12028j = 1;
            Object h10 = i12.f11915l.h(i12.f11913j, this);
            if (h10 == aVar) {
                return aVar;
            }
            objArr2 = objArr;
            i10 = R.string.cloud_sync_new_data_count;
            settingsFragment = settingsFragment3;
            obj = h10;
        }
        objArr2[0] = obj;
        textView.setText(settingsFragment.p0(i10, objArr));
        return l.f28297a;
    }
}

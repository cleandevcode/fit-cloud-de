package com.topstep.fitcloud.pro.ui.settings;

import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.topstep.fitcloudpro.R;
import fm.l;
import gm.m;
import ih.v;

/* loaded from: classes2.dex */
public final class g extends m implements l<PreferenceTextView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ AccountManageFragment f12021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AccountManageFragment accountManageFragment) {
        super(1);
        this.f12021b = accountManageFragment;
    }

    @Override // fm.l
    public final tl.l k(PreferenceTextView preferenceTextView) {
        gm.l.f(preferenceTextView, "it");
        v.l(tb.a.f(this.f12021b), new i2.a(R.id.toModifyPwd));
        return tl.l.f28297a;
    }
}

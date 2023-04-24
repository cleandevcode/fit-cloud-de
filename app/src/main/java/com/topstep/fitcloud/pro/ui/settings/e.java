package com.topstep.fitcloud.pro.ui.settings;

import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import fm.l;
import gm.m;
import ih.v;

/* loaded from: classes2.dex */
public final class e extends m implements l<PreferenceItem, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ AccountManageFragment f12017b;

    /* renamed from: c */
    public final /* synthetic */ UserInfo f12018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AccountManageFragment accountManageFragment, UserInfo userInfo) {
        super(1);
        this.f12017b = accountManageFragment;
        this.f12018c = userInfo;
    }

    @Override // fm.l
    public final tl.l k(PreferenceItem preferenceItem) {
        boolean z10;
        AccountBindType accountBindType;
        gm.l.f(preferenceItem, "it");
        i2.m f10 = tb.a.f(this.f12017b);
        String phone = this.f12018c.getPhone();
        if (phone != null && phone.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            accountBindType = AccountBindType.BIND_PHONE;
        } else {
            accountBindType = AccountBindType.MODIFY_PHONE;
        }
        gm.l.f(accountBindType, "bindType");
        v.l(f10, new ii.m(accountBindType, true ^ this.f12018c.getHasPassword()));
        return tl.l.f28297a;
    }
}

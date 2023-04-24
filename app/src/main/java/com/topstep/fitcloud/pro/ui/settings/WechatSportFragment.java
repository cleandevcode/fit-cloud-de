package com.topstep.fitcloud.pro.ui.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.topstep.fitcloudpro.R;
import fm.l;
import gm.m;
import ii.h0;
import kotlin.Metadata;
import og.t;

@Metadata
/* loaded from: classes2.dex */
public final class WechatSportFragment extends h0 {

    /* renamed from: r0 */
    public t f11943r0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            WechatSportFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            t tVar;
            try {
                WechatSportFragment wechatSportFragment = WechatSportFragment.this;
                wechatSportFragment.b1(wechatSportFragment.V0().getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
                tVar = WechatSportFragment.this.f11943r0;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (tVar != null) {
                tVar.c();
                return tl.l.f28297a;
            }
            gm.l.l("deviceManager");
            throw null;
        }
    }

    public WechatSportFragment() {
        super(R.layout.fragment_wechat_sport);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        p.b.g(view.findViewById(R.id.btn_start), new a());
    }
}

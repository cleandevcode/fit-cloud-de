package com.topstep.fitcloud.pro.ui.policy;

import android.os.Bundle;
import androidx.fragment.app.FragmentContainerView;
import com.topstep.fitcloud.pro.databinding.ActivityAskPolicyBinding;
import gm.l;
import hi.e;
import k1.l2;
import kotlin.Metadata;
import lh.b;

@Metadata
/* loaded from: classes2.dex */
public final class AskPolicyActivity extends e {

    /* renamed from: x */
    public static final /* synthetic */ int f11701x = 0;

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2.a(getWindow(), false);
        ActivityAskPolicyBinding inflate = ActivityAskPolicyBinding.inflate(getLayoutInflater());
        l.e(inflate, "inflate(layoutInflater)");
        setContentView(inflate.getRoot());
        FragmentContainerView fragmentContainerView = inflate.navHost;
        l.e(fragmentContainerView, "viewBind.navHost");
        b.a(fragmentContainerView);
    }
}

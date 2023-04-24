package com.topstep.fitcloud.pro.ui.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentContainerView;
import com.topstep.fitcloud.pro.databinding.ActivityAuthBinding;
import gm.l;
import jh.m;
import k1.l2;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class AuthActivity extends m {

    /* renamed from: x */
    public static final /* synthetic */ int f10303x = 0;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context) {
            l.f(context, "context");
            context.startActivity(new Intent(context, AuthActivity.class));
        }
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2.a(getWindow(), false);
        ActivityAuthBinding inflate = ActivityAuthBinding.inflate(getLayoutInflater());
        l.e(inflate, "inflate(layoutInflater)");
        setContentView(inflate.getRoot());
        FragmentContainerView fragmentContainerView = inflate.navHost;
        l.e(fragmentContainerView, "viewBind.navHost");
        lh.b.a(fragmentContainerView);
    }
}

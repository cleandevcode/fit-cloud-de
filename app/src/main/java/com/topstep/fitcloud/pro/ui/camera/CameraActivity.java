package com.topstep.fitcloud.pro.ui.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.b;
import com.topstep.fitcloud.pro.databinding.ActivityCameraBinding;
import gm.l;
import kotlin.Metadata;
import oh.k;

@Metadata
/* loaded from: classes2.dex */
public final class CameraActivity extends k {

    /* renamed from: y */
    public static final /* synthetic */ int f10412y = 0;

    /* renamed from: x */
    public ActivityCameraBinding f10413x;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context, boolean z10) {
            l.f(context, "context");
            Intent intent = new Intent(context, CameraActivity.class);
            if (z10) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
            } catch (Exception e10) {
                p000do.a.f13275a.q(e10);
            }
        }
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityCameraBinding inflate = ActivityCameraBinding.inflate(getLayoutInflater());
        l.e(inflate, "inflate(layoutInflater)");
        this.f10413x = inflate;
        setContentView(inflate.getRoot());
        sendBroadcast(new Intent("com.topstep.fitcloudpro.action.CameraLaunch"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        sendBroadcast(new Intent("com.topstep.fitcloudpro.action.CameraLaunch"));
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onResume() {
        super.onResume();
        ActivityCameraBinding activityCameraBinding = this.f10413x;
        if (activityCameraBinding != null) {
            activityCameraBinding.fragmentContainer.postDelayed(new b(9, this), 500L);
        } else {
            l.l("viewBind");
            throw null;
        }
    }
}

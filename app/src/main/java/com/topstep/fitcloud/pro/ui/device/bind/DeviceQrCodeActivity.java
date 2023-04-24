package com.topstep.fitcloud.pro.ui.device.bind;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.github.kilnn.tool.widget.ScanCodeLayout;
import com.huawei.hms.hmsscankit.RemoteView;
import com.topstep.fitcloud.pro.databinding.ActivityDeviceQrCodeBinding;
import gm.l;
import java.util.regex.Pattern;
import jh.w;
import kotlin.Metadata;
import s.m1;
import s.r0;
import uh.v;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceQrCodeActivity extends v {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x */
    public ActivityDeviceQrCodeBinding f10819x;

    /* renamed from: y */
    public RemoteView f10820y;

    /* renamed from: z */
    public final Pattern f10821z = Pattern.compile("([A-Fa-f0-9]{2}:){5}[A-Fa-f0-9]{2}");

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityDeviceQrCodeBinding inflate = ActivityDeviceQrCodeBinding.inflate(getLayoutInflater());
        l.e(inflate, "inflate(layoutInflater)");
        this.f10819x = inflate;
        setContentView(inflate.getRoot());
        Point point = new Point();
        point.x = getResources().getDisplayMetrics().widthPixels;
        point.y = getResources().getDisplayMetrics().heightPixels;
        int a10 = g7.a.a(this, 240.0f);
        Rect rect = new Rect();
        int i10 = point.x;
        int i11 = a10 / 2;
        rect.left = (i10 / 2) - i11;
        rect.right = (i10 / 2) + i11;
        int i12 = point.y;
        rect.top = (i12 / 2) - i11;
        rect.bottom = (i12 / 2) + i11;
        RemoteView build = new RemoteView.Builder().setContext(this).setBoundingBox(rect).setFormat(0, new int[0]).build();
        l.e(build, "Builder().setContext(thi…an.ALL_SCAN_TYPE).build()");
        this.f10820y = build;
        build.setOnLightVisibleCallback(new r0(12, this));
        RemoteView remoteView = this.f10820y;
        if (remoteView != null) {
            remoteView.setOnResultCallback(new m1(10, this));
            RemoteView remoteView2 = this.f10820y;
            if (remoteView2 != null) {
                remoteView2.onCreate(bundle);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding = this.f10819x;
                if (activityDeviceQrCodeBinding != null) {
                    FrameLayout frameLayout = activityDeviceQrCodeBinding.rim;
                    RemoteView remoteView3 = this.f10820y;
                    if (remoteView3 != null) {
                        frameLayout.addView(remoteView3, layoutParams);
                        ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding2 = this.f10819x;
                        if (activityDeviceQrCodeBinding2 != null) {
                            activityDeviceQrCodeBinding2.btnFlush.setOnClickListener(new w(4, this));
                            ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding3 = this.f10819x;
                            if (activityDeviceQrCodeBinding3 != null) {
                                activityDeviceQrCodeBinding3.tvTips.getPaint().setFlags(8);
                                ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding4 = this.f10819x;
                                if (activityDeviceQrCodeBinding4 != null) {
                                    activityDeviceQrCodeBinding4.tvTips.setOnClickListener(new th.l(3, this));
                                    return;
                                } else {
                                    l.l("viewBind");
                                    throw null;
                                }
                            }
                            l.l("viewBind");
                            throw null;
                        }
                        l.l("viewBind");
                        throw null;
                    }
                    l.l("remoteView");
                    throw null;
                }
                l.l("viewBind");
                throw null;
            }
            l.l("remoteView");
            throw null;
        }
        l.l("remoteView");
        throw null;
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.x, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        RemoteView remoteView = this.f10820y;
        if (remoteView != null) {
            remoteView.onDestroy();
        } else {
            l.l("remoteView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onPause() {
        super.onPause();
        RemoteView remoteView = this.f10820y;
        if (remoteView != null) {
            remoteView.onPause();
            ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding = this.f10819x;
            if (activityDeviceQrCodeBinding != null) {
                ScanCodeLayout scanCodeLayout = activityDeviceQrCodeBinding.scanCodeLayout;
                scanCodeLayout.f5924i = false;
                scanCodeLayout.invalidate();
                return;
            }
            l.l("viewBind");
            throw null;
        }
        l.l("remoteView");
        throw null;
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onResume() {
        super.onResume();
        RemoteView remoteView = this.f10820y;
        if (remoteView != null) {
            remoteView.onResume();
            ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding = this.f10819x;
            if (activityDeviceQrCodeBinding != null) {
                ScanCodeLayout scanCodeLayout = activityDeviceQrCodeBinding.scanCodeLayout;
                scanCodeLayout.f5924i = true;
                scanCodeLayout.f5925j = 0.0f;
                scanCodeLayout.invalidate();
                return;
            }
            l.l("viewBind");
            throw null;
        }
        l.l("remoteView");
        throw null;
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.x, android.app.Activity
    public final void onStart() {
        super.onStart();
        RemoteView remoteView = this.f10820y;
        if (remoteView != null) {
            remoteView.onStart();
        } else {
            l.l("remoteView");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.x, android.app.Activity
    public final void onStop() {
        super.onStop();
        RemoteView remoteView = this.f10820y;
        if (remoteView != null) {
            remoteView.onStop();
        } else {
            l.l("remoteView");
            throw null;
        }
    }
}

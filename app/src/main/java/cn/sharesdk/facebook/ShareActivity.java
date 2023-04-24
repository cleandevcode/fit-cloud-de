package cn.sharesdk.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.DH;

/* loaded from: classes.dex */
public class ShareActivity extends FakeActivity {
    private String applicationId;
    private PlatformActionListener listener;
    private Platform.ShareParams params;
    private Platform platform;

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Bundle bundle;
        PlatformActionListener platformActionListener;
        PlatformActionListener platformActionListener2;
        finish();
        try {
            if (this.listener != null) {
                if (intent != null) {
                    bundle = intent.getBundleExtra("com.facebook.platform.protocol.RESULT_ARGS");
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    String string = bundle.getString("completionGesture");
                    boolean z10 = bundle.getBoolean("didComplete");
                    if (!TextUtils.isEmpty(string)) {
                        if (string.equalsIgnoreCase("cancel")) {
                            platformActionListener = this.listener;
                        } else if (string.equalsIgnoreCase("post")) {
                            platformActionListener2 = this.listener;
                            platformActionListener2.onComplete(this.platform, 9, null);
                            return;
                        } else {
                            return;
                        }
                    } else if (z10) {
                        platformActionListener2 = this.listener;
                        platformActionListener2.onComplete(this.platform, 9, null);
                        return;
                    } else {
                        platformActionListener = this.listener;
                    }
                } else if (i10 == 64206 && i11 == 0) {
                    platformActionListener = this.listener;
                } else {
                    this.listener.onError(this.platform, 9, new Throwable("share error!"));
                    return;
                }
                platformActionListener.onCancel(this.platform, 9);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("Facebook onActivityResult error:", th2), new Object[0]);
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        super.onCreate();
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
            startShareIntent();
        } catch (Throwable th2) {
            finish();
            this.listener.onError(this.platform, 9, th2);
        }
    }

    public void setPlatformActionListener(PlatformActionListener platformActionListener, Platform platform, Platform.ShareParams shareParams, String str) {
        this.listener = platformActionListener;
        this.platform = platform;
        this.params = shareParams;
        this.applicationId = str;
    }

    public void startShareIntent() {
        DH.requester(MobSDK.getContext()).getNetworkTypeForStatic().getAppName().getDeviceKey().getScreenSize().getCarrier().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.facebook.ShareActivity.1
            /* JADX WARN: Removed duplicated region for block: B:125:0x0283 A[Catch: all -> 0x02c3, TryCatch #2 {all -> 0x02c3, blocks: (B:74:0x0002, B:77:0x006c, B:79:0x0096, B:80:0x00a5, B:82:0x00b5, B:83:0x00bf, B:123:0x0262, B:125:0x0283, B:127:0x028b, B:128:0x0290, B:84:0x00c4, B:87:0x00d9, B:90:0x00f0, B:91:0x011d, B:93:0x014a, B:94:0x0156, B:96:0x0162, B:120:0x023e, B:122:0x0256, B:98:0x016f, B:102:0x0194, B:103:0x0198, B:105:0x019e, B:107:0x01af, B:109:0x01b5, B:110:0x01df, B:111:0x01e3, B:112:0x01ec, B:113:0x01f6, B:115:0x0206, B:116:0x0213, B:101:0x0186), top: B:133:0x0002 }] */
            @Override // com.mob.tools.utils.DH.DHResponder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onResponse(com.mob.tools.utils.DH.DHResponse r15) {
                /*
                    Method dump skipped, instructions count: 716
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.facebook.ShareActivity.AnonymousClass1.onResponse(com.mob.tools.utils.DH$DHResponse):void");
            }
        });
    }
}

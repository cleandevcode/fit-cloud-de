package com.huawei.hms.scankit.p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.huawei.hms.mlkit.common.ha.HianalyticsLog;
import com.huawei.hms.mlkit.common.ha.HianalyticsLogProvider;
import com.topstep.fitcloudpro.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.huawei.hms.scankit.p.o */
/* loaded from: classes.dex */
public final class C0697o extends Thread {

    /* renamed from: a */
    private WeakReference<Context> f8009a;

    /* renamed from: b */
    public Handler f8010b;

    /* renamed from: com.huawei.hms.scankit.p.o$a */
    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: b */
        private WeakReference<Context> f8012b;

        /* renamed from: a */
        private boolean f8011a = true;

        /* renamed from: c */
        private HashMap<String, HianalyticsLog> f8013c = new HashMap<>();

        public a(WeakReference<Context> weakReference) {
            this.f8012b = weakReference;
        }

        private HianalyticsLog a(String str) {
            if (HianalyticsLogProvider.getInstance().sdkForbiddenHiLog(this.f8012b.get())) {
                return null;
            }
            return HianalyticsLogProvider.getInstance().logBegin(this.f8012b.get(), new C0673i(this.f8012b.get()).a()).setModuleName(str).setApiName(str).setApkVersion("1.0.2.300");
        }

        private static void a(HianalyticsLog hianalyticsLog) {
            if (hianalyticsLog != null) {
                HianalyticsLogProvider.getInstance().logEnd(hianalyticsLog);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f8011a) {
                int i10 = message.what;
                if (i10 == R.integer.config_navAnimTime) {
                    this.f8013c.put("preview", a((String) message.obj));
                } else if (i10 == R.integer.config_tooltipAnimTime) {
                    a(this.f8013c.get("preview"));
                    this.f8013c.put("preview", null);
                } else if (i10 == R.integer.bottom_sheet_slide_duration) {
                    this.f8013c.put("picture", a((String) message.obj));
                } else if (i10 == R.integer.cancel_button_image_alpha) {
                    a(this.f8013c.get("picture"));
                    this.f8013c.put("picture", null);
                } else if (i10 != R.integer.app_bar_elevation_anim_duration) {
                    Log.w("CameraManager", "HiAnalyticsThread::handleMessage unknown message");
                } else {
                    this.f8011a = false;
                    Looper.myLooper().quit();
                }
            }
        }
    }

    public C0697o(Context context) {
        this.f8009a = new WeakReference<>(context);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.f8010b = new a(this.f8009a);
        Looper.loop();
    }
}

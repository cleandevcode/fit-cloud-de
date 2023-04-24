package ij;

import android.app.ActivityManager;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.sdk.v2.dfu.Dfu6621Service;
import fl.g;
import ij.w;
import java.io.File;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuProgressListenerAdapter;
import no.nordicsemi.android.dfu.DfuServiceController;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import no.nordicsemi.android.dfu.DfuServiceListenerHelper;
import p000do.a;
import yi.c;

/* loaded from: classes2.dex */
public final class w implements b0 {

    /* renamed from: b */
    public static boolean f17085b;

    /* renamed from: a */
    public final Context f17086a;

    /* loaded from: classes2.dex */
    public static final class a extends DfuProgressListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ tk.j<gj.g<Boolean>> f17087a;

        /* renamed from: b */
        public final /* synthetic */ gm.z f17088b;

        public a(g.a aVar, gm.z zVar) {
            this.f17087a = aVar;
            this.f17088b = zVar;
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onDeviceConnecting(String str) {
            gm.l.f(str, "deviceAddress");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onDeviceConnecting:%s", str);
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onDeviceDisconnecting(String str) {
            gm.l.f(str, "deviceAddress");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onDeviceDisconnecting:%s", str);
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onDfuAborted(String str) {
            gm.l.f(str, "deviceAddress");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onDfuAborted:%s", str);
            ((g.a) this.f17087a).f(c.a.d(yi.c.f31771d, 2147483644, 6));
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onDfuCompleted(String str) {
            gm.l.f(str, "deviceAddress");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onDfuCompleted:%s", str);
            ((g.a) this.f17087a).d(new gj.g(100, Boolean.TRUE));
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onDfuProcessStarting(String str) {
            gm.l.f(str, "deviceAddress");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onDfuProcessStarting:%s", str);
            ((g.a) this.f17087a).d(new gj.g(0, null));
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onEnablingDfuMode(String str) {
            gm.l.f(str, "deviceAddress");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onEnablingDfuMode:%s", str);
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onError(String str, int i10, int i11, String str2) {
            gm.l.f(str, "deviceAddress");
            gm.l.f(str2, CrashHianalyticsData.MESSAGE);
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onError:%s error:%d errorType:%d message:%s", str, Integer.valueOf(i10), Integer.valueOf(i11), str2);
            ((g.a) this.f17087a).f(c.a.d(yi.c.f31771d, i10, 6));
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onFirmwareValidating(String str) {
            gm.l.f(str, "deviceAddress");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onFirmwareValidating:%s", str);
        }

        @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
        public final void onProgressChanged(String str, int i10, float f10, float f11, int i11, int i12) {
            gm.l.f(str, "deviceAddress");
            if (this.f17088b.f15508a == i10) {
                return;
            }
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#DfuProcess6621");
            bVar.h("onProgressChanged:%s", Integer.valueOf(i10));
            this.f17088b.f15508a = i10;
            ((g.a) this.f17087a).d(new gj.g(i10, null));
        }
    }

    public w(Application application, boolean z10) {
        gm.l.f(application, "context");
        this.f17086a = application;
        f17085b = z10;
    }

    @Override // ij.b0
    public final tk.i<gj.g<Boolean>> a(final File file, final BluetoothDevice bluetoothDevice, boolean z10) {
        gm.l.f(file, "file");
        gm.l.f(bluetoothDevice, "device");
        return new fl.g(new tk.k() { // from class: ij.u
            @Override // tk.k
            public final void a(g.a aVar) {
                boolean z11;
                boolean z12;
                final w wVar = w.this;
                BluetoothDevice bluetoothDevice2 = bluetoothDevice;
                File file2 = file;
                gm.l.f(wVar, "this$0");
                gm.l.f(bluetoothDevice2, "$device");
                gm.l.f(file2, "$file");
                String name = Dfu6621Service.class.getName();
                Object systemService = wVar.f17086a.getSystemService(InnerShareParams.ACTIVITY);
                gm.l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    z11 = false;
                    if (it.hasNext()) {
                        if (gm.l.a(name, it.next().service.getClassName())) {
                            z12 = true;
                            break;
                        }
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (z12) {
                    aVar.f(c.a.d(yi.c.f31771d, 2147483646, 6));
                    return;
                }
                final w.a aVar2 = new w.a(aVar, new gm.z());
                DfuServiceListenerHelper.registerProgressListener(wVar.f17086a, aVar2);
                DfuServiceInitiator forceDfu = new DfuServiceInitiator(bluetoothDevice2.getAddress()).setDeviceName(bluetoothDevice2.getName()).setKeepBond(false).setForceDfu(false);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 23) {
                    z11 = true;
                }
                DfuServiceInitiator unsafeExperimentalButtonlessServiceInSecureDfuEnabled = forceDfu.setPacketsReceiptNotificationsEnabled(z11).setPacketsReceiptNotificationsValue(12).setPrepareDataObjectDelay(400L).setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(true);
                unsafeExperimentalButtonlessServiceInSecureDfuEnabled.setZip(null, file2.getAbsolutePath());
                if (i10 >= 26) {
                    DfuServiceInitiator.createDfuNotificationChannel(wVar.f17086a);
                    unsafeExperimentalButtonlessServiceInSecureDfuEnabled.setForeground(true);
                }
                unsafeExperimentalButtonlessServiceInSecureDfuEnabled.setDisableNotification(true);
                final DfuServiceController start = unsafeExperimentalButtonlessServiceInSecureDfuEnabled.start(wVar.f17086a, Dfu6621Service.class);
                aVar.e(new wk.c() { // from class: ij.v
                    @Override // wk.c
                    public final void cancel() {
                        w wVar2 = w.this;
                        w.a aVar3 = aVar2;
                        DfuServiceController dfuServiceController = start;
                        gm.l.f(wVar2, "this$0");
                        gm.l.f(aVar3, "$listener");
                        DfuServiceListenerHelper.unregisterProgressListener(wVar2.f17086a, aVar3);
                        dfuServiceController.abort();
                    }
                });
            }
        });
    }

    @Override // ij.b0
    public final void release() {
    }
}

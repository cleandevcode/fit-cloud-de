package com.topstep.fitcloud.pro.function;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.f0;
import androidx.lifecycle.k;
import androidx.lifecycle.u;
import bi.z0;
import com.topstep.fitcloud.pro.ui.LaunchActivity;
import com.topstep.fitcloudpro.R;
import fm.p;
import kotlin.Metadata;
import mf.a0;
import og.t;
import p000do.a;
import pm.e0;
import sf.o;
import sm.f1;
import sm.g;
import tl.l;
import wf.b;
import x0.s;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceService extends o {

    /* renamed from: e */
    public NotificationManager f9549e;

    /* renamed from: f */
    public t f9550f;

    /* renamed from: g */
    public boolean f9551g;

    @e(c = "com.topstep.fitcloud.pro.function.DeviceService$onCreate$1", f = "DeviceService.kt", l = {37}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public int f9552e;

        /* renamed from: com.topstep.fitcloud.pro.function.DeviceService$a$a */
        /* loaded from: classes2.dex */
        public static final class C0122a<T> implements g {

            /* renamed from: a */
            public final /* synthetic */ DeviceService f9554a;

            public C0122a(DeviceService deviceService) {
                this.f9554a = deviceService;
            }

            @Override // sm.g
            public final Object n(Object obj, d dVar) {
                DeviceService.c(this.f9554a, (b) obj);
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(2, dVar);
            DeviceService.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            ((a) p(e0Var, dVar)).t(l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f9552e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                t tVar = DeviceService.this.f9550f;
                if (tVar != null) {
                    f1<b> J = tVar.J();
                    C0122a c0122a = new C0122a(DeviceService.this);
                    this.f9552e = 1;
                    if (J.a(c0122a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("deviceManager");
                    throw null;
                }
            }
            throw new u2.b();
        }
    }

    public static final void c(DeviceService deviceService, b bVar) {
        String string;
        String str;
        int i10;
        String str2;
        t tVar = deviceService.f9550f;
        if (tVar != null) {
            wf.a value = tVar.x().getValue();
            if (value == null || (string = value.f29803b) == null) {
                string = deviceService.getString(R.string.device_state_no_device);
                gm.l.e(string, "getString(R.string.device_state_no_device)");
            }
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                str = deviceService.getString(R.string.device_state_connected);
                                str2 = "getString(R.string.device_state_connected)";
                            } else {
                                throw new qa.p();
                            }
                        } else {
                            str = deviceService.getString(R.string.device_state_connecting);
                            str2 = "getString(R.string.device_state_connecting)";
                        }
                    } else {
                        str = deviceService.getString(R.string.device_state_disconnected);
                        str2 = "getString(R.string.device_state_disconnected)";
                    }
                } else {
                    str = deviceService.getString(R.string.device_state_bt_disabled);
                    str2 = "getString(R.string.device_state_bt_disabled)";
                }
                gm.l.e(str, str2);
            } else {
                str = "";
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(new ComponentName(deviceService, LaunchActivity.class));
            intent.setFlags(270532608);
            if (Build.VERSION.SDK_INT >= 31) {
                i10 = 201326592;
            } else {
                i10 = 134217728;
            }
            PendingIntent activity = PendingIntent.getActivity(deviceService, 0, intent, i10);
            s sVar = new s(deviceService, "Device");
            sVar.d(string);
            sVar.c(str);
            sVar.f30158t.icon = R.mipmap.ic_launcher;
            sVar.f30145g = activity;
            sVar.e(16, false);
            sVar.f30158t.when = System.currentTimeMillis();
            sVar.e(8, true);
            sVar.e(2, true);
            sVar.f30147i = 1;
            Notification a10 = sVar.a();
            gm.l.e(a10, "NotificationHelper.notif…IGH)\n            .build()");
            if (!deviceService.f9551g && f0.f2713i.f2719f.f2790c.a(k.c.STARTED)) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("DeviceService");
                bVar2.h("state foreground:" + bVar, new Object[0]);
                try {
                    a10.flags = a10.flags | 32 | 64;
                    l lVar = l.f28297a;
                    deviceService.startForeground(10002, a10);
                    deviceService.f9551g = true;
                    return;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    return;
                }
            }
            a.b bVar3 = p000do.a.f13275a;
            bVar3.t("DeviceService");
            bVar3.h("state notify:" + bVar, new Object[0]);
            NotificationManager notificationManager = deviceService.f9549e;
            if (notificationManager != null) {
                notificationManager.notify(10002, a10);
                return;
            } else {
                gm.l.l("notificationManager");
                throw null;
            }
        }
        gm.l.l("deviceManager");
        throw null;
    }

    @Override // sf.o, androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a.b bVar = p000do.a.f13275a;
        bVar.t("DeviceService");
        bVar.h("onCreate", new Object[0]);
        Object systemService = getSystemService("notification");
        gm.l.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f9549e = notificationManager;
        qi.l.b(this, notificationManager);
        z0.g(rm.l.g(this), null, 0, new a(null), 3);
        f0.f2713i.f2719f.a(new androidx.lifecycle.g() { // from class: com.topstep.fitcloud.pro.function.DeviceService$onCreate$2
            @Override // androidx.lifecycle.g
            public final /* synthetic */ void c(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onDestroy(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onPause(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onResume(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final void onStart(u uVar) {
                DeviceService deviceService = DeviceService.this;
                if (!deviceService.f9551g) {
                    t tVar = deviceService.f9550f;
                    if (tVar != null) {
                        DeviceService.c(deviceService, tVar.J().getValue());
                    } else {
                        gm.l.l("deviceManager");
                        throw null;
                    }
                }
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onStop(u uVar) {
            }
        });
    }
}

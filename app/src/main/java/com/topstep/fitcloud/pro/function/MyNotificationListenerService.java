package com.topstep.fitcloud.pro.function;

import android.content.Context;
import android.os.PowerManager;
import android.service.notification.StatusBarNotification;
import android.support.v4.media.d;
import bi.m0;
import bi.z0;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import java.util.HashMap;
import kotlin.Metadata;
import l2.o0;
import mf.a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import of.o;
import og.j1;
import p000do.a;
import pm.e0;
import sf.p;
import tl.l;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class MyNotificationListenerService extends p {

    /* renamed from: f */
    public final HashMap<String, a> f9556f = new HashMap<>();

    /* renamed from: g */
    public dk.a<j1> f9557g;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final int f9558a;

        /* renamed from: b */
        public final int f9559b;

        /* renamed from: c */
        public final boolean f9560c;

        public a(int i10, int i11, boolean z10) {
            this.f9558a = i10;
            this.f9559b = i11;
            this.f9560c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f9558a == aVar.f9558a && this.f9559b == aVar.f9559b && this.f9560c == aVar.f9560c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i10 = ((this.f9558a * 31) + this.f9559b) * 31;
            boolean z10 = this.f9560c;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            return i10 + i11;
        }

        public final String toString() {
            StringBuilder a10 = d.a("PackageConfig(flag=");
            a10.append(this.f9558a);
            a10.append(", type=");
            a10.append(this.f9559b);
            a10.append(", isCommon=");
            return o0.a(a10, this.f9560c, ')');
        }
    }

    @e(c = "com.topstep.fitcloud.pro.function.MyNotificationListenerService$getNotificationType$isSupport$1", f = "MyNotificationListenerService.kt", l = {141}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements fm.p<e0, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public int f9561e;

        /* renamed from: g */
        public final /* synthetic */ String f9563g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, xl.d<? super b> dVar) {
            super(2, dVar);
            MyNotificationListenerService.this = r1;
            this.f9563g = str;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super Boolean> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f9563g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f9561e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                dk.a<j1> aVar2 = MyNotificationListenerService.this.f9557g;
                if (aVar2 != null) {
                    String str = this.f9563g;
                    gm.l.e(str, MLApplicationSetting.BundleKeyConstants.AppInfo.packageName);
                    this.f9561e = 1;
                    obj = aVar2.get().e(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("notificationRepository");
                    throw null;
                }
            }
            return obj;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.function.MyNotificationListenerService$getNotificationType$isSupport$2", f = "MyNotificationListenerService.kt", l = {154}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements fm.p<e0, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public int f9564e;

        /* renamed from: g */
        public final /* synthetic */ String f9566g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, xl.d<? super c> dVar) {
            super(2, dVar);
            MyNotificationListenerService.this = r1;
            this.f9566g = str;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super Boolean> dVar) {
            return ((c) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new c(this.f9566g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f9564e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                dk.a<j1> aVar2 = MyNotificationListenerService.this.f9557g;
                if (aVar2 != null) {
                    String str = this.f9566g;
                    gm.l.e(str, MLApplicationSetting.BundleKeyConstants.AppInfo.packageName);
                    this.f9564e = 1;
                    obj = aVar2.get().e(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("notificationRepository");
                    throw null;
                }
            }
            return obj;
        }
    }

    @Override // bk.a
    public final hj.b a(Context context) {
        gm.l.f(context, "context");
        return o.a(context);
    }

    @Override // bk.a
    public final Integer b(Context context, StatusBarNotification statusBarNotification) {
        boolean booleanValue;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i10;
        boolean g10;
        gm.l.f(context, "context");
        gm.l.f(statusBarNotification, "sbn");
        statusBarNotification.getNotification();
        String packageName = statusBarNotification.getPackageName();
        dk.a<j1> aVar = this.f9557g;
        if (aVar != null) {
            boolean z19 = false;
            if (aVar.get().b()) {
                Object systemService = getSystemService("power");
                gm.l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                if (((PowerManager) systemService).isInteractive()) {
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("Fc#NLS");
                    bVar.b("Skip ScreenOff", new Object[0]);
                    return null;
                }
            }
            a aVar2 = this.f9556f.get(packageName);
            nj.c cVar = o.a(this).a().o().f17930d;
            int i11 = 255;
            if (aVar2 != null) {
                boolean z20 = true;
                if (aVar2.f9560c) {
                    dk.a<j1> aVar3 = this.f9557g;
                    if (aVar3 != null) {
                        booleanValue = m0.w(aVar3.get().d(), 1 << aVar2.f9558a);
                    } else {
                        gm.l.l("notificationRepository");
                        throw null;
                    }
                } else {
                    booleanValue = ((Boolean) z0.n(new b(packageName, null))).booleanValue();
                }
                if (!booleanValue) {
                    return null;
                }
                int i12 = aVar2.f9558a;
                cVar.getClass();
                if (i12 >= 0 && i12 < 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || i12 == 8) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || i12 == 9) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 || i12 == 10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 || i12 == 12) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 || i12 == 31) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    z19 = true;
                } else if (i12 == 14) {
                    g10 = cVar.g(262);
                    if (!g10) {
                        i10 = 257;
                        z19 = cVar.g(i10);
                    }
                    z19 = g10;
                } else {
                    if (i12 == 15 || i12 == 16) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        g10 = cVar.g(262);
                        if (!g10) {
                            i10 = 258;
                        }
                        z19 = g10;
                    } else {
                        if (i12 != 11 && i12 != 13 && i12 != 5 && i12 != 6 && i12 != 7 && i12 != 18) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            z19 = cVar.g(262);
                        } else {
                            if (i12 == 19 || i12 == 20) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                i10 = DfuBaseService.NOTIFICATION_ID;
                            } else {
                                if (i12 != 21 && i12 != 22 && i12 != 23) {
                                    z20 = false;
                                }
                                if (z20) {
                                    i10 = 288;
                                }
                            }
                        }
                    }
                    z19 = cVar.g(i10);
                }
                if (z19) {
                    i11 = aVar2.f9559b;
                }
            } else if (!((Boolean) z0.n(new c(packageName, null))).booleanValue()) {
                return null;
            }
            return Integer.valueOf(i11);
        }
        gm.l.l("notificationRepository");
        throw null;
    }

    @Override // sf.p, bk.a, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f9556f.put("com.tencent.mobileqq", new a(2, 5, true));
        this.f9556f.put("com.tencent.mm", new a(3, 6, true));
        this.f9556f.put("com.facebook.katana", new a(4, 7, true));
        this.f9556f.put("com.twitter.android", new a(5, 8, true));
        this.f9556f.put("com.linkedin.android", new a(6, 9, false));
        this.f9556f.put("com.instagram.android", new a(7, 10, true));
        this.f9556f.put("com.pinterest", new a(8, 11, false));
        this.f9556f.put("com.whatsapp", new a(9, 12, true));
        this.f9556f.put("jp.naver.line.android", new a(10, 13, false));
        this.f9556f.put("com.facebook.orca", new a(11, 14, false));
        this.f9556f.put("com.kakao.talk", new a(12, 15, false));
        a aVar = new a(13, 16, true);
        this.f9556f.put("com.skype.raider", aVar);
        this.f9556f.put("com.skype.rover", aVar);
        a aVar2 = new a(14, 17, true);
        for (String str : h7.a.q("com.google.android.gm", "com.tencent.androidqqmail", "com.netease.mail", "com.netease.mobimail", "com.yahoo.mobile.client.android.mail", "com.microsoft.office.outlook", "com.my.mail", "com.mailbox.email", "com.appple.app.email", "com.tohsoft.mail.email.emailclient", "ru.mail.mailapp", "me.bluemail.mail", "net.daum.android.solmail", "ch.protonmail.android", "park.outlook.sign.in.clint", "park.yahoo.sign.in.app", "com.google.android.apps.inbox", "com.android.email", "com.google.android.gm.lite")) {
            this.f9556f.put(str, aVar2);
        }
        this.f9556f.put("org.telegram.messenger", new a(15, 18, false));
        this.f9556f.put("com.viber.voip", new a(16, 19, false));
        this.f9556f.put("com.snapchat.android", new a(18, 21, false));
        this.f9556f.put("com.bsb.hike", new a(19, 33, false));
        this.f9556f.put("com.google.android.youtube", new a(20, 34, false));
        this.f9556f.put("us.zoom.videomeetings", new a(22, 36, false));
        this.f9556f.put("com.ss.android.ugc.trill", new a(23, 37, false));
    }
}

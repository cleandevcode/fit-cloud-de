package ki;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.topstep.fitcloudpro.R;
import gm.l;
import gm.m;
import java.util.List;
import p000do.a;
import tl.i;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final Context f18591a;

    /* renamed from: b */
    public final f7.c f18592b;

    /* renamed from: c */
    public final String f18593c;

    /* renamed from: d */
    public final i f18594d;

    /* renamed from: e */
    public final i f18595e;

    /* renamed from: f */
    public final i f18596f;

    /* renamed from: ki.a$a */
    /* loaded from: classes2.dex */
    public static final class C0321a {

        /* renamed from: a */
        public final int f18597a;

        /* renamed from: b */
        public final int f18598b;

        public C0321a(int i10, int i11) {
            this.f18597a = i10;
            this.f18598b = i11;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final int f18599a;

        /* renamed from: b */
        public final int f18600b;

        public b(int i10, int i11) {
            this.f18599a = i10;
            this.f18600b = i11;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<Intent> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            a.this = r1;
        }

        @Override // fm.a
        public final Intent m() {
            a aVar = a.this;
            if (Build.VERSION.SDK_INT < 23) {
                aVar.getClass();
            } else {
                Context context = aVar.f18591a;
                l.e(context, "context");
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"), 65536);
                l.e(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
                if (!queryIntentActivities.isEmpty()) {
                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    Context context2 = aVar.f18591a;
                    l.e(context2, "context");
                    intent.setData(hh.c.f(context2));
                    return intent;
                }
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<Intent> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            a.this = r1;
        }

        @Override // fm.a
        public final Intent m() {
            ComponentName componentName;
            a aVar = a.this;
            if (aVar.f18592b != f7.c.MIUI || Build.VERSION.SDK_INT < 23) {
                return null;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"));
            intent.putExtra("package_name", aVar.f18591a.getPackageName());
            intent.putExtra("package_label", aVar.f18591a.getString(R.string.app_name));
            Intent b10 = aVar.b();
            if (b10 != null) {
                componentName = b10.resolveActivity(aVar.f18591a.getPackageManager());
            } else {
                componentName = null;
            }
            if (l.a(componentName, intent.getComponent())) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("BgRunSettings");
                bVar.p("miuiCustomIntent same as ignoreBatteryOptimizationIntent", new Object[0]);
                return null;
            }
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<Intent> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            a.this = r1;
        }

        @Override // fm.a
        public final Intent m() {
            a aVar = a.this;
            if (aVar.f18592b != f7.c.FUNTOUCH_OS) {
                return null;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.vivo.abe", "com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity"));
            Context context = aVar.f18591a;
            l.e(context, "context");
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            l.e(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
            if (!(!queryIntentActivities.isEmpty())) {
                return aVar.f18591a.getPackageManager().getLaunchIntentForPackage("com.iqoo.secure");
            }
            return intent;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x032a A[PHI: r2 
      PHI: (r2v8 java.lang.String) = (r2v3 java.lang.String), (r2v14 java.lang.String) binds: [B:511:0x02e2, B:521:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent a() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.a.a():android.content.Intent");
    }

    public final Intent b() {
        return (Intent) this.f18594d.getValue();
    }

    public final String c(Intent intent) {
        if (intent == null) {
            return "null";
        }
        Context context = this.f18591a;
        l.e(context, "context");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        l.e(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
        if (!(!queryIntentActivities.isEmpty())) {
            return "unusable->" + intent;
        }
        String intent2 = intent.toString();
        l.e(intent2, "{\n            intent.toString()\n        }");
        return intent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent d() {
        /*
            r9 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            f7.c r1 = r9.f18592b
            int r1 = r1.ordinal()
            java.lang.String r2 = "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)"
            r3 = 65536(0x10000, float:9.1835E-41)
            r4 = 1
            java.lang.String r5 = "context"
            if (r1 == 0) goto La9
            if (r1 == r4) goto L9c
            r6 = 3
            if (r1 == r6) goto L44
            r6 = 4
            if (r1 == r6) goto L3a
            r6 = 5
            if (r1 == r6) goto L30
            r6 = 10
            if (r1 == r6) goto L25
            goto Lb3
        L25:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r6 = "com.android.settings"
            java.lang.String r7 = "com.android.settings.fuelgauge.PowerSaveModeActivity"
            r1.<init>(r6, r7)
            goto La5
        L30:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r6 = "com.iqoo.powersaving"
            java.lang.String r7 = "com.iqoo.powersaving.PowerSavingManagerActivity"
            r1.<init>(r6, r7)
            goto La5
        L3a:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r6 = "com.coloros.oppoguardelf"
            java.lang.String r7 = "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"
            r1.<init>(r6, r7)
            goto La5
        L44:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            java.lang.String r7 = "com.samsung.android.sm"
            java.lang.String r8 = "com.samsung.android.sm_cn"
            if (r1 < r6) goto L75
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r6 = "com.samsung.android.sm.battery.ui.BatteryActivity"
            r1.<init>(r8, r6)
            r0.setComponent(r1)
            android.content.Context r1 = r9.f18591a
            gm.l.e(r1, r5)
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r0, r3)
            gm.l.e(r1, r2)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r4
            if (r1 != 0) goto Lb3
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r7, r6)
            goto La5
        L75:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r6 = "com.samsung.android.sm.ui.battery.BatteryActivity"
            r1.<init>(r8, r6)
            r0.setComponent(r1)
            android.content.Context r1 = r9.f18591a
            gm.l.e(r1, r5)
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r0, r3)
            gm.l.e(r1, r2)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r4
            if (r1 != 0) goto Lb3
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r7, r6)
            goto La5
        L9c:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r6 = "com.huawei.systemmanager"
            java.lang.String r7 = "com.huawei.systemmanager.power.ui.HwPowerManagerActivity"
            r1.<init>(r6, r7)
        La5:
            r0.setComponent(r1)
            goto Lb3
        La9:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r6 = "com.miui.securitycenter"
            java.lang.String r7 = "com.miui.powercenter.savemode.PowerSaveActivity"
            r1.<init>(r6, r7)
            goto La5
        Lb3:
            android.content.ComponentName r1 = r0.getComponent()
            if (r1 == 0) goto Ld0
            android.content.Context r1 = r9.f18591a
            gm.l.e(r1, r5)
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r0, r3)
            gm.l.e(r1, r2)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r4
            if (r1 != 0) goto Ld7
        Ld0:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.a.d():android.content.Intent");
    }

    public final boolean e() {
        boolean isIgnoringBatteryOptimizations;
        if (Build.VERSION.SDK_INT < 23 || b() == null) {
            return true;
        }
        Object systemService = this.f18591a.getSystemService("power");
        l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        isIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(this.f18591a.getPackageName());
        return isIgnoringBatteryOptimizations;
    }

    public final String toString() {
        String str;
        StringBuilder a10 = android.support.v4.media.d.a("romType:");
        a10.append(this.f18592b);
        a10.append("\nromVersion:");
        a10.append(this.f18593c);
        a10.append("\npowerSaveMode:");
        boolean z10 = false;
        String str2 = null;
        try {
            if (this.f18592b == f7.c.MIUI) {
                if (Settings.System.getInt(this.f18591a.getContentResolver(), "POWER_SAVE_MODE_OPEN") > 0) {
                    z10 = true;
                }
                str2 = "miui:POWER_SAVE_MODE_OPEN";
            }
        } catch (Exception e10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("BgRunSettings");
            bVar.q(e10);
        }
        if (str2 != null) {
            str = str2 + "->" + z10;
        } else {
            Object systemService = this.f18591a.getSystemService("power");
            l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            str = "standard->" + ((PowerManager) systemService).isPowerSaveMode();
        }
        a10.append(str);
        a10.append("\npowerSaveModeIntent:");
        a10.append(c(d()));
        a10.append("\nignoreBatteryOptimizationIntent:");
        a10.append(b());
        a10.append("\nisIgnoreBatteryOptimization:");
        a10.append(e());
        a10.append("\nmiuiCustomIntent:");
        a10.append(c((Intent) this.f18595e.getValue()));
        a10.append("\nvivoCustomIntent:");
        a10.append(c((Intent) this.f18596f.getValue()));
        a10.append("\nautostartPermissionIntent:");
        a10.append(c(a()));
        a10.append('\n');
        return a10.toString();
    }
}

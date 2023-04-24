package d6;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public static final s f12755a = new s();

    /* renamed from: b */
    public static final HashMap f12756b = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        void c(boolean z10);
    }

    /* loaded from: classes.dex */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        /* JADX INFO: Fake field, exist only in values array */
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        /* JADX INFO: Fake field, exist only in values array */
        Share(33554432);
        

        /* renamed from: a */
        public final int f12782a;

        /* loaded from: classes.dex */
        public static final class a {
        }

        static {
            new a();
        }

        b(int i10) {
            this.f12782a = i10;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            return (b[]) Arrays.copyOf(values(), 29);
        }

        @Override // java.lang.Enum
        public final String toString() {
            switch (ordinal()) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "AppEventsCloudbridge";
                case 5:
                    return "RestrictiveDataFiltering";
                case 6:
                    return "AAM";
                case 7:
                    return "PrivacyProtection";
                case 8:
                    return "SuggestedEvents";
                case 9:
                    return "IntelligentIntegrity";
                case 10:
                    return "ModelRequest";
                case 11:
                    return "EventDeactivation";
                case 12:
                    return "OnDeviceEventProcessing";
                case 13:
                    return "OnDevicePostInstallEventProcessing";
                case 14:
                    return "IAPLogging";
                case 15:
                    return "IAPLoggingLib2";
                case 16:
                    return "Instrument";
                case 17:
                    return "CrashReport";
                case 18:
                    return "CrashShield";
                case 19:
                    return "ThreadCheck";
                case 20:
                    return "ErrorReport";
                case 21:
                    return "AnrReport";
                case 22:
                    return "Monitoring";
                case 23:
                    return "ServiceUpdateCompliance";
                case 24:
                    return "LoginKit";
                case 25:
                    return "ChromeCustomTabsPrefetching";
                case 26:
                    return "IgnoreAppSwitchToLoggedOut";
                case 27:
                    return "BypassAppSwitch";
                case 28:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    public static final void a(a aVar, b bVar) {
        u.c(new t(aVar, bVar));
    }

    public static boolean b(b bVar) {
        boolean z10;
        switch (bVar.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
                z10 = false;
                break;
            case 23:
            case 24:
            default:
                z10 = true;
                break;
        }
        u uVar = u.f12789a;
        return u.b(gm.l.k(bVar, "FBSDKFeature"), o5.v.b(), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(d6.s.b r9) {
        /*
            d6.s$b r0 = d6.s.b.Unknown
            java.lang.String r1 = "feature"
            gm.l.f(r9, r1)
            r1 = 0
            if (r0 != r9) goto Lb
            return r1
        Lb:
            d6.s$b r2 = d6.s.b.Core
            r3 = 1
            if (r2 != r9) goto L11
            return r3
        L11:
            android.content.Context r2 = o5.v.a()
            java.lang.String r4 = "com.facebook.internal.FEATURE_MANAGER"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r1)
            java.lang.String r4 = "FBSDKFeature"
            java.lang.String r4 = gm.l.k(r9, r4)
            r5 = 0
            java.lang.String r2 = r2.getString(r4, r5)
            if (r2 == 0) goto L31
            java.lang.String r4 = "14.1.0"
            boolean r2 = gm.l.a(r2, r4)
            if (r2 == 0) goto L31
            return r1
        L31:
            int r2 = r9.f12782a
            r4 = r2 & 255(0xff, float:3.57E-43)
            if (r4 <= 0) goto L3a
            r2 = r2 & (-256(0xffffffffffffff00, float:NaN))
            goto L4b
        L3a:
            r4 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r2
            if (r4 <= 0) goto L43
            r4 = -65536(0xffffffffffff0000, float:NaN)
            goto L4a
        L43:
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r2
            if (r4 <= 0) goto L5d
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L4a:
            r2 = r2 & r4
        L4b:
            d6.s$b[] r4 = d6.s.b.valuesCustom()
            int r5 = r4.length
            r6 = 0
        L51:
            if (r6 >= r5) goto L6e
            r7 = r4[r6]
            int r6 = r6 + 1
            int r8 = r7.f12782a
            if (r8 != r2) goto L51
            r0 = r7
            goto L6e
        L5d:
            d6.s$b[] r2 = d6.s.b.valuesCustom()
            int r4 = r2.length
            r5 = 0
        L63:
            if (r5 >= r4) goto L6e
            r6 = r2[r5]
            int r5 = r5 + 1
            int r7 = r6.f12782a
            if (r7 != 0) goto L63
            r0 = r6
        L6e:
            if (r0 != r9) goto L75
            boolean r1 = b(r9)
            goto L82
        L75:
            boolean r0 = c(r0)
            if (r0 == 0) goto L82
            boolean r9 = b(r9)
            if (r9 == 0) goto L82
            r1 = 1
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.s.c(d6.s$b):boolean");
    }
}

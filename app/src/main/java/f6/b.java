package f6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import d6.m0;
import gm.l;
import java.io.File;
import java.util.Arrays;
import o5.v;
import om.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public String f14131a;

    /* renamed from: b */
    public a f14132b;

    /* renamed from: c */
    public JSONArray f14133c;

    /* renamed from: d */
    public String f14134d;

    /* renamed from: e */
    public String f14135e;

    /* renamed from: f */
    public String f14136f;

    /* renamed from: g */
    public Long f14137g;

    /* loaded from: classes.dex */
    public enum a {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 6);
        }

        @Override // java.lang.Enum
        public final String toString() {
            int ordinal = ordinal();
            return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* renamed from: f6.b$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0250b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14145a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
            iArr[5] = 5;
            f14145a = iArr;
        }
    }

    public b(File file) {
        a aVar;
        String name = file.getName();
        l.e(name, "file.name");
        this.f14131a = name;
        if (h.a0(name, "crash_log_", false)) {
            aVar = a.CrashReport;
        } else if (h.a0(name, "shield_log_", false)) {
            aVar = a.CrashShield;
        } else if (h.a0(name, "thread_check_log_", false)) {
            aVar = a.ThreadCheck;
        } else if (h.a0(name, "analysis_log_", false)) {
            aVar = a.Analysis;
        } else {
            aVar = h.a0(name, "anr_log_", false) ? a.AnrReport : a.Unknown;
        }
        this.f14132b = aVar;
        JSONObject d10 = f.d(this.f14131a);
        if (d10 != null) {
            this.f14137g = Long.valueOf(d10.optLong("timestamp", 0L));
            this.f14134d = d10.optString("app_version", null);
            this.f14135e = d10.optString("reason", null);
            this.f14136f = d10.optString("callstack", null);
            this.f14133c = d10.optJSONArray("feature_names");
        }
    }

    public final int a(b bVar) {
        l.f(bVar, "data");
        Long l10 = this.f14137g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = bVar.f14137g;
        if (l11 == null) {
            return 1;
        }
        int i10 = (l11.longValue() > longValue ? 1 : (l11.longValue() == longValue ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public final boolean b() {
        a aVar = this.f14132b;
        int i10 = aVar == null ? -1 : C0250b.f14145a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || this.f14136f == null || this.f14137g == null) {
                    return false;
                }
            } else if (this.f14136f == null || this.f14135e == null || this.f14137g == null) {
                return false;
            }
        } else if (this.f14133c == null || this.f14137g == null) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (b()) {
            f.f(this.f14131a, toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            f6.b$a r0 = r5.f14132b
            if (r0 != 0) goto L6
            r0 = -1
            goto Le
        L6:
            int[] r1 = f6.b.C0250b.f14145a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        Le:
            r1 = 1
            java.lang.String r2 = "timestamp"
            r3 = 0
            if (r0 == r1) goto L60
            r1 = 2
            if (r0 == r1) goto L21
            r1 = 3
            if (r0 == r1) goto L21
            r1 = 4
            if (r0 == r1) goto L21
            r1 = 5
            if (r0 == r1) goto L21
            goto L76
        L21:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "device_os_version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch: org.json.JSONException -> L76
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L76
            java.lang.String r1 = "device_model"
            java.lang.String r4 = android.os.Build.MODEL     // Catch: org.json.JSONException -> L76
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L76
            java.lang.String r1 = r5.f14134d     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L3d
            java.lang.String r4 = "app_version"
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L76
        L3d:
            java.lang.Long r1 = r5.f14137g     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L44
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L76
        L44:
            java.lang.String r1 = r5.f14135e     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L4d
            java.lang.String r2 = "reason"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L76
        L4d:
            java.lang.String r1 = r5.f14136f     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L56
            java.lang.String r2 = "callstack"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L76
        L56:
            f6.b$a r1 = r5.f14132b     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L75
            java.lang.String r2 = "type"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L76
            goto L75
        L60:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = r5.f14133c     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L6e
            java.lang.String r4 = "feature_names"
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L76
        L6e:
            java.lang.Long r1 = r5.f14137g     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L75
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L76
        L75:
            r3 = r0
        L76:
            if (r3 != 0) goto L87
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JSONObject().toString()"
        L83:
            gm.l.e(r0, r1)
            return r0
        L87:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "params.toString()"
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.b.toString():java.lang.String");
    }

    public b(String str, String str2) {
        this.f14132b = a.AnrReport;
        m0 m0Var = m0.f12709a;
        Context a10 = v.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f14134d = str3;
        this.f14135e = str;
        this.f14136f = str2;
        this.f14137g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f14137g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f14131a = stringBuffer2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a2  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(java.lang.Throwable r7, f6.b.a r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f14132b = r8
            d6.m0 r0 = d6.m0.f12709a
            android.content.Context r0 = o5.v.a()
            java.lang.String r1 = r0.getPackageName()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            if (r0 != 0) goto L1c
            goto L1f
        L1c:
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            goto L20
        L1f:
            r0 = r3
        L20:
            r6.f14134d = r0
            if (r7 != 0) goto L26
            r0 = r3
            goto L39
        L26:
            java.lang.Throwable r0 = r7.getCause()
            if (r0 != 0) goto L31
            java.lang.String r0 = r7.toString()
            goto L39
        L31:
            java.lang.Throwable r0 = r7.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L39:
            r6.f14135e = r0
            if (r7 != 0) goto L3e
            goto L6b
        L3e:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L43:
            if (r7 == 0) goto L67
            if (r7 == r3) goto L67
            java.lang.StackTraceElement[] r1 = r7.getStackTrace()
            java.lang.String r3 = "t.stackTrace"
            gm.l.e(r1, r3)
            int r3 = r1.length
            r4 = 0
        L52:
            if (r4 >= r3) goto L60
            r5 = r1[r4]
            int r4 = r4 + 1
            java.lang.String r5 = r5.toString()
            r0.put(r5)
            goto L52
        L60:
            java.lang.Throwable r1 = r7.getCause()
            r3 = r7
            r7 = r1
            goto L43
        L67:
            java.lang.String r3 = r0.toString()
        L6b:
            r6.f14136f = r3
            long r0 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r7
            long r0 = r0 / r2
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.f14137g = r7
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            int r8 = r8.ordinal()
            r0 = 1
            if (r8 == r0) goto La2
            r0 = 2
            if (r8 == r0) goto L9f
            r0 = 3
            if (r8 == r0) goto L9c
            r0 = 4
            if (r8 == r0) goto L99
            r0 = 5
            if (r8 == r0) goto L96
            java.lang.String r8 = "Unknown"
            goto La4
        L96:
            java.lang.String r8 = "thread_check_log_"
            goto La4
        L99:
            java.lang.String r8 = "shield_log_"
            goto La4
        L9c:
            java.lang.String r8 = "crash_log_"
            goto La4
        L9f:
            java.lang.String r8 = "anr_log_"
            goto La4
        La2:
            java.lang.String r8 = "analysis_log_"
        La4:
            r7.append(r8)
            java.lang.Long r8 = r6.f14137g
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ".json"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()"
            gm.l.e(r7, r8)
            r6.f14131a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.b.<init>(java.lang.Throwable, f6.b$a):void");
    }

    public b(JSONArray jSONArray) {
        this.f14132b = a.Analysis;
        this.f14137g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f14133c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f14137g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f14131a = stringBuffer2;
    }
}

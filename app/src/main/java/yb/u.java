package yb;

import android.content.Context;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u implements d0 {

    /* renamed from: a */
    public Context f31392a = y.s();

    /* renamed from: b */
    public String f31393b;

    /* renamed from: c */
    public String f31394c;

    /* renamed from: d */
    public String f31395d;

    public u(String str, String str2, String str3) {
        this.f31393b = str;
        this.f31394c = str2;
        this.f31395d = str3;
    }

    public final void a(String str, List<h0> list) {
        Pair pair;
        String str2;
        String str3;
        if (!"_default_config_tag".equals(str)) {
            String[] split = str.split("-");
            if (split.length > 2) {
                str3 = split[split.length - 1];
                str2 = str.substring(0, (str.length() - str3.length()) - 1);
            } else {
                str2 = split[0];
                str3 = split[1];
            }
            pair = new Pair(str2, str3);
        } else {
            pair = new Pair(str, "");
        }
        new b0((String) pair.first, (String) pair.second, this.f31395d, list).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        HashMap a10;
        m2.f.b("eventReportTask is running");
        if (System.currentTimeMillis() - l.a(this.f31392a, "flashKeyTime") > 43200000) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m2.f.b("workKey is refresh,begin report all data");
            this.f31394c = "alltype";
        }
        try {
            try {
                try {
                    a10 = l0.a(this.f31392a, this.f31393b, this.f31394c);
                } catch (Exception e10) {
                    m2.f.e("hmsSdk", "readEventRecords handData Exception:" + e10.getMessage());
                    if ("alltype".equals(this.f31394c)) {
                        l.c(this.f31392a, "stat_v2_1", new String[0]);
                        l.c(this.f31392a, "cached_v2_1", new String[0]);
                    } else {
                        String e11 = y.e(this.f31393b, this.f31394c);
                        l.c(this.f31392a, "stat_v2_1", e11);
                        l.c(this.f31392a, "cached_v2_1", e11);
                    }
                }
            } catch (IllegalArgumentException e12) {
                m2.f.e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e12.getMessage());
                if ("alltype".equals(this.f31394c)) {
                    l.c(this.f31392a, "stat_v2_1", new String[0]);
                    l.c(this.f31392a, "cached_v2_1", new String[0]);
                } else {
                    String e13 = y.e(this.f31393b, this.f31394c);
                    l.c(this.f31392a, "stat_v2_1", e13);
                    l.c(this.f31392a, "cached_v2_1", e13);
                }
            }
            if (a10.size() == 0) {
                m2.f.d(String.format("no have events to report: tag:%s : type:%s", this.f31393b, this.f31394c));
                if ("alltype".equals(this.f31394c)) {
                    l.c(this.f31392a, "stat_v2_1", new String[0]);
                    l.c(this.f31392a, "cached_v2_1", new String[0]);
                    return;
                }
                String e14 = y.e(this.f31393b, this.f31394c);
                l.c(this.f31392a, "stat_v2_1", e14);
                l.c(this.f31392a, "cached_v2_1", e14);
                return;
            }
            for (Map.Entry entry : a10.entrySet()) {
                a((String) entry.getKey(), (List) entry.getValue());
            }
            if ("alltype".equals(this.f31394c)) {
                l.c(this.f31392a, "stat_v2_1", new String[0]);
                l.c(this.f31392a, "cached_v2_1", new String[0]);
            } else {
                String e15 = y.e(this.f31393b, this.f31394c);
                l.c(this.f31392a, "stat_v2_1", e15);
                l.c(this.f31392a, "cached_v2_1", e15);
            }
            if (z10) {
                m2.f.b("refresh local key");
                c e16 = c.e();
                e16.getClass();
                String b10 = cc.b.b(16);
                if (c.c(e16.b(b10))) {
                    e16.f31283a = b10;
                }
            }
        } catch (Throwable th2) {
            if ("alltype".equals(this.f31394c)) {
                l.c(this.f31392a, "stat_v2_1", new String[0]);
                l.c(this.f31392a, "cached_v2_1", new String[0]);
            } else {
                String e17 = y.e(this.f31393b, this.f31394c);
                l.c(this.f31392a, "stat_v2_1", e17);
                l.c(this.f31392a, "cached_v2_1", e17);
            }
            throw th2;
        }
    }
}

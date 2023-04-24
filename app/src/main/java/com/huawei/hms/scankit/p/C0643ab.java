package com.huawei.hms.scankit.p;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

/* renamed from: com.huawei.hms.scankit.p.ab */
/* loaded from: classes.dex */
public class C0643ab {

    /* renamed from: a */
    private static final String f7811a = "ab";

    /* renamed from: b */
    private String f7812b = GrsBaseInfo.CountryCodeSource.UNKNOWN;

    /* renamed from: c */
    private String f7813c;

    public C0643ab(Context context, boolean z10) {
        this.f7813c = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        a(context, z10);
        this.f7813c = this.f7813c.toUpperCase(Locale.ENGLISH);
    }

    private void a(Context context, boolean z10) {
        if (context != null) {
            try {
                this.f7813c = GrsApp.getInstance().getIssueCountryCode(context);
                if (b()) {
                    Logger.i(f7811a, "getCountryCode unknown");
                }
            } catch (NullPointerException | Exception unused) {
                Logger.w(f7811a, "get CountryCode error");
            }
        }
    }

    private boolean b() {
        return !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.f7813c);
    }

    public String a() {
        return this.f7813c;
    }
}

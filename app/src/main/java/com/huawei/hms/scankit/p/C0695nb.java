package com.huawei.hms.scankit.p;

import android.os.Bundle;
import com.huawei.hms.feature.DynamicModuleInitializer;

/* renamed from: com.huawei.hms.scankit.p.nb */
/* loaded from: classes.dex */
public final class C0695nb extends AbstractC0699ob {
    public C0695nb() {
        super(null, DynamicModuleInitializer.getContext());
    }

    public void a(Bundle bundle) {
        String str;
        if (bundle == null || !a()) {
            return;
        }
        try {
            if (bundle.containsKey("scanType") && (bundle.get("scanType") instanceof Integer)) {
                bundle.putString("scanType", AbstractC0699ob.a(bundle.getInt("scanType")));
            }
            C0691mb c0691mb = new C0691mb(this);
            for (String str2 : bundle.keySet()) {
                c0691mb.put(str2, String.valueOf(bundle.get(str2)));
            }
            C0710rb.a().a("60002", c0691mb);
        } catch (RuntimeException unused) {
            str = "RuntimeException";
            com.huawei.hms.scankit.util.a.b("HaLog60002", str);
        } catch (Exception unused2) {
            str = "Exception";
            com.huawei.hms.scankit.util.a.b("HaLog60002", str);
        }
    }
}

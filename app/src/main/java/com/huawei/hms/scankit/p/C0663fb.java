package com.huawei.hms.scankit.p;

import android.os.Bundle;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.UUID;

/* renamed from: com.huawei.hms.scankit.p.fb */
/* loaded from: classes.dex */
public final class C0663fb extends AbstractC0699ob {

    /* renamed from: h */
    private int f7887h;

    /* renamed from: i */
    public String f7888i;

    /* renamed from: j */
    public String f7889j;

    public C0663fb(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext().getApplicationContext());
        this.f7887h = -1001;
        this.f7888i = AbstractC0699ob.f8019a;
        this.f7889j = AbstractC0699ob.f8020b;
        this.f8024f.put(WiseOpenHianalyticsData.UNION_CALLTIME, new C0655db(this, "yyyyMMddHHmmss.SSS").format(Long.valueOf(System.currentTimeMillis())));
        this.f8024f.put("transId", UUID.randomUUID().toString());
        this.f8024f.put(WiseOpenHianalyticsData.UNION_API_NAME, str);
    }

    private void g() {
        this.f7887h = -1001;
        this.f7888i = AbstractC0699ob.f8019a;
        this.f7889j = AbstractC0699ob.f8020b;
    }

    public void a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null) {
            this.f7887h = hmsScanArr.length;
            for (HmsScan hmsScan : hmsScanArr) {
                this.f7888i = AbstractC0699ob.a(hmsScan.scanType);
                this.f7889j = AbstractC0699ob.b(hmsScan.scanTypeForm);
            }
        }
    }

    public void b() {
        this.f8025g = System.currentTimeMillis();
    }

    public void c() {
        String str;
        try {
            if (a()) {
                C0659eb c0659eb = new C0659eb(this);
                c0659eb.put(WiseOpenHianalyticsData.UNION_RESULT, String.valueOf(this.f7887h));
                c0659eb.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(System.currentTimeMillis() - this.f8025g));
                c0659eb.put("scanType", this.f7888i);
                c0659eb.put("sceneType", this.f7889j);
                C0710rb.a().a(WiseOpenHianalyticsData.UNION_EVENT_ID, c0659eb);
                g();
            }
        } catch (NullPointerException unused) {
            str = "nullPoint";
            com.huawei.hms.scankit.util.a.b("HaLog60000", str);
        } catch (Exception unused2) {
            str = "logEnd Exception";
            com.huawei.hms.scankit.util.a.b("HaLog60000", str);
        }
    }

    public void c(int i10) {
        this.f7887h = i10;
    }
}

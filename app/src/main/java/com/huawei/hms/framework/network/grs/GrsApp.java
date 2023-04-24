package com.huawei.hms.framework.network.grs;

import a.b;
import android.content.Context;
import android.support.v4.media.d;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;

/* loaded from: classes.dex */
public class GrsApp {
    private static final String BRAND;
    private static final GrsApp INSTANCE = new GrsApp();
    private static final String TAG = "GrsApp";
    private String appConfigName;

    static {
        String str;
        String name = GrsApp.class.getPackage().getName();
        if ("com.huawei.hms.framework.network.grs".equals(name)) {
            str = "";
        } else {
            String[] split = name.split("\\.");
            StringBuilder a10 = d.a("current brand is:");
            a10.append(split[1]);
            Logger.v(TAG, a10.toString());
            str = split[1];
        }
        BRAND = str;
    }

    private GrsApp() {
    }

    public static GrsApp getInstance() {
        return INSTANCE;
    }

    public String getAppConfigName() {
        return this.appConfigName;
    }

    public String getBrand(String str) {
        String str2 = BRAND;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return b.b(str2, str);
    }

    public String getIssueCountryCode(Context context) {
        return new CountryCodeBean(context, false).getCountryCode();
    }

    public void setAppConfigName(String str) {
        this.appConfigName = str;
    }
}

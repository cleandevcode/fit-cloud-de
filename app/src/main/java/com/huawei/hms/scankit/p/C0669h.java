package com.huawei.hms.scankit.p;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

/* renamed from: com.huawei.hms.scankit.p.h */
/* loaded from: classes.dex */
public class C0669h {

    /* renamed from: a */
    private static final String f7908a = "h";

    /* renamed from: b */
    private String f7909b = GrsBaseInfo.CountryCodeSource.UNKNOWN;

    /* renamed from: c */
    private String f7910c;

    public C0669h(Context context, boolean z10) {
        this.f7910c = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        b(context, z10);
        this.f7910c = this.f7910c.toUpperCase(Locale.ENGLISH);
    }

    private static String a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Log.w(f7908a, "reflect class for method has exception.");
            return str4;
        }
        try {
            Class<?> cls = Class.forName(str3);
            return (String) cls.getMethod(str, String.class, String.class).invoke(cls, str2, str4);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            Log.e(f7908a, "getProperty catch exception: ", e11);
            return str4;
        }
    }

    private void a(Context context, boolean z10) {
        String str;
        StringBuilder sb2;
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            if (!z10 || telephonyManager.getPhoneType() == 2) {
                this.f7910c = telephonyManager.getSimCountryIso();
                this.f7909b = GrsBaseInfo.CountryCodeSource.SIM_COUNTRY;
                str = f7908a;
                sb2 = new StringBuilder("getSimCountryCode by not enableNetwork, countryCode=");
            } else {
                this.f7910c = telephonyManager.getNetworkCountryIso();
                this.f7909b = GrsBaseInfo.CountryCodeSource.NETWORK_COUNTRY;
                str = f7908a;
                sb2 = new StringBuilder("getSimCountryCode by enableNetwork, countryCode=");
            }
            sb2.append(this.f7910c);
            Log.e(str, sb2.toString());
        }
        b();
    }

    private void b() {
        String str = this.f7910c;
        if (str == null || str.length() != 2) {
            this.f7910c = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            this.f7909b = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    private void b(Context context, boolean z10) {
        if (context == null) {
            throw new NullPointerException("context must be not null.Please provide app's Context");
        }
        try {
            d();
            if (e()) {
                Log.d(f7908a, "getCountryCode get country code from {%s}VENDOR_COUNTRY");
                return;
            }
            a(context, z10);
            if (e()) {
                Log.d(f7908a, "getCountryCode get country code from {%s}SIM_COUNTRY");
                return;
            }
            c();
            if (e()) {
                Log.d(f7908a, "getCountryCode get country code from {%s}LOCALE_INFO");
            }
        } catch (Exception unused) {
            Log.w(f7908a, "get CountryCode error");
        }
    }

    private void c() {
        this.f7910c = a("get", "ro.product.locale.region", "android.os.SystemProperties", GrsBaseInfo.CountryCodeSource.UNKNOWN);
        this.f7909b = GrsBaseInfo.CountryCodeSource.LOCALE_INFO;
        String str = f7908a;
        Log.d(str, "getLocaleCountryCode=" + this.f7910c);
        if ("cn".equalsIgnoreCase(this.f7910c)) {
            return;
        }
        Log.e(str, "getLocaleCountryCode from system language is not reliable.");
        this.f7910c = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        this.f7909b = GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    private void d() {
        this.f7909b = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        this.f7910c = a("get", "ro.hw.country", "android.os.SystemProperties", GrsBaseInfo.CountryCodeSource.UNKNOWN);
        String str = f7908a;
        Log.e(str, "getVendorCountry=" + this.f7910c);
        if (!"eu".equalsIgnoreCase(this.f7910c) && !"la".equalsIgnoreCase(this.f7910c)) {
            b();
            return;
        }
        Log.e(str, "getVendorCountry equals eu or la ,not reliable");
        this.f7910c = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        this.f7909b = GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    private boolean e() {
        return !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.f7910c);
    }

    public String a() {
        return this.f7910c;
    }
}

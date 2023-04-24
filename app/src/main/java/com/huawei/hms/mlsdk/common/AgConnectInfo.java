package com.huawei.hms.mlsdk.common;

import a.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.huawei.hms.ml.common.utils.SmartLog;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lb.a;

/* loaded from: classes.dex */
public class AgConnectInfo {
    private String apiKey;
    private String applicationId;
    private String certFingerprint;
    private List<String> haCollectorUrls;
    private List<String> mlServiceUrls;
    private String packageName;
    private String region;

    /* loaded from: classes.dex */
    public static final class AgConnectKey {
        public static String ANALYTICS_COLLECTOR_URL = "service/analytics/collector_url";
        public static String API_KEY = "client/api_key";
        public static String APPLICATION_ID = "client/app_id";
        public static String ML_SERVICE_URL = "service/ml/mlservice_url";
        public static String PACKAGE_NAME = "client/package_name";
        public static String REGION = "region";

        private AgConnectKey() {
        }
    }

    public AgConnectInfo() {
        this(null);
    }

    public AgConnectInfo(Context context) {
        this.mlServiceUrls = new ArrayList();
        this.haCollectorUrls = new ArrayList();
        context = context == null ? a.f19423b.f19424a : context;
        if (context != null) {
            ib.a a10 = ib.a.a(context);
            SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + a10 + "context: " + context);
            this.region = a10.b(AgConnectKey.REGION);
            SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + a10 + "region: " + this.region);
            String b10 = a10.b(AgConnectKey.PACKAGE_NAME);
            this.packageName = b10;
            if (b10 == null) {
                this.packageName = context.getPackageName();
            } else {
                SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + a10 + "packageName: " + this.packageName);
            }
            String b11 = a10.b(AgConnectKey.APPLICATION_ID);
            this.applicationId = b11;
            if (b11 == null) {
                this.applicationId = this.packageName;
            } else {
                SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + a10 + "packageName: " + this.packageName);
            }
            String b12 = a10.b(AgConnectKey.API_KEY);
            this.apiKey = b12;
            if (b12 != null) {
                SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + a10 + "apiKey: apiKey is secret");
            }
            String rawSignature = getRawSignature(context);
            this.certFingerprint = rawSignature;
            if (rawSignature != null) {
                SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + a10 + "certFingerprint: certFingerprint is secret");
            }
            String b13 = a10.b(AgConnectKey.ML_SERVICE_URL);
            if (b13 != null) {
                for (String str : b13.split(",")) {
                    String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                    if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                        lowerCase = b.b("https://", lowerCase);
                    }
                    if (!lowerCase.endsWith("/")) {
                        lowerCase = b.b(lowerCase, "/");
                    }
                    this.mlServiceUrls.add(lowerCase);
                }
            }
            String b14 = a10.b(AgConnectKey.ANALYTICS_COLLECTOR_URL);
            if (b14 != null) {
                for (String str2 : b14.split(",")) {
                    String lowerCase2 = str2.trim().toLowerCase(Locale.ENGLISH);
                    if (!lowerCase2.startsWith("http://") && !lowerCase2.startsWith("https://")) {
                        lowerCase2 = b.b("https://", lowerCase2);
                    }
                    this.haCollectorUrls.add(lowerCase2);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Context not found.");
    }

    private String getRawSignature(Context context) {
        PackageInfo packageInfo;
        String str;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return "";
        }
        Signature signature = null;
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            str = "signature is null ";
        } else {
            signature = signatureArr[0];
            str = "signature is not null ";
        }
        SmartLog.i("AgConnectInfo", str);
        if (signature != null) {
            return getSignatureString(signature, "SHA256");
        }
        return "";
    }

    private final String getSignatureString(Signature signature, String str) {
        byte b10;
        try {
            byte[] byteArray = signature.toByteArray();
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.reset();
            messageDigest.update(byteArray);
            byte[] digest = messageDigest.digest();
            for (int i10 = 0; i10 < digest.length; i10++) {
                if (Integer.toHexString(digest[i10] & 255).length() == 1) {
                    stringBuffer.append("0");
                    b10 = digest[i10];
                } else {
                    b10 = digest[i10];
                }
                stringBuffer.append(Integer.toHexString(b10 & 255));
                if (i10 != digest.length - 1) {
                    stringBuffer.append(":");
                }
            }
            return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getCertFingerprint() {
        return this.certFingerprint;
    }

    public List<String> getHaCollectorUrls() {
        return this.haCollectorUrls;
    }

    public List<String> getMLServiceUrls() {
        return this.mlServiceUrls;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getRegion() {
        return this.region;
    }
}

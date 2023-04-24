package yb;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    public w f31285a;

    /* renamed from: b */
    public w f31286b;

    public final w a(String str) {
        if (str.equals("oper")) {
            return this.f31286b;
        }
        if (str.equals("maint")) {
            return this.f31285a;
        }
        if (str.equals("diffprivacy") || str.equals("preins")) {
            return null;
        }
        m2.f.h("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }
}

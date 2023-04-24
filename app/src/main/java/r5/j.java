package r5;

import cn.sharesdk.framework.InnerShareParams;
import java.util.Arrays;

/* loaded from: classes.dex */
public enum j {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO(InnerShareParams.EXT_INFO),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");
    

    /* renamed from: a */
    public final String f25326a;

    j(String str) {
        this.f25326a = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static j[] valuesCustom() {
        return (j[]) Arrays.copyOf(values(), 17);
    }
}

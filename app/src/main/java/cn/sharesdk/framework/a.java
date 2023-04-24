package cn.sharesdk.framework;

import android.text.TextUtils;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.j;
import com.mob.MobSDK;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static volatile boolean f5086a = false;

    /* renamed from: b */
    public static String f5087b;

    public static boolean a() {
        String appkey = MobSDK.getAppkey();
        if (f5086a || TextUtils.isEmpty(appkey)) {
            return false;
        }
        if (!TextUtils.isEmpty(f5087b)) {
            SSDKLog.b().a("CheckAppKeyDetermine whether successAppKey is equal to mobsdk.getappkey", new Object[0]);
            return appkey.equals(f5087b);
        }
        SSDKLog.b().a("CheckAppKeyAsynchronously verify the appkey", new Object[0]);
        j.a(new j.a() { // from class: cn.sharesdk.framework.a.1
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                b.a().b();
            }
        });
        return true;
    }
}

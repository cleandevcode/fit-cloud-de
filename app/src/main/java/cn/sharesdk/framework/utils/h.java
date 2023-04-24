package cn.sharesdk.framework.utils;

import android.util.Log;
import cn.sharesdk.framework.utils.j;
import com.mob.tools.utils.DH;

/* loaded from: classes.dex */
public class h {
    public static void a() {
        j.a(new j.a() { // from class: cn.sharesdk.framework.utils.h.1
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                try {
                    DH.SyncMtd.getBrand();
                } catch (Throwable unused) {
                    SSDKLog.b().a("DH F", new Object[0]);
                    Log.e("ShareSDK", "ShareSDK 3.10.7 进行了架构升级优化，为保证正常使用SDK，请确保相关架包升级到了最新版本，或者可至官网联系技术支持");
                }
            }
        });
    }
}

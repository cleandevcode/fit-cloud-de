package cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public String f5545a;

    /* renamed from: b */
    public int f5546b = -1;

    public void a(Bundle bundle) {
        bundle.putString("_wxapi_sendauth_options_callback_classname", this.f5545a);
        bundle.putInt("_wxapi_sendauth_options_callback_flags", this.f5546b);
    }

    public void b(Bundle bundle) {
        this.f5545a = n.a(bundle, "_wxapi_sendauth_options_callback_classname");
        this.f5546b = n.a(bundle, "_wxapi_sendauth_options_callback_flags", -1);
    }
}

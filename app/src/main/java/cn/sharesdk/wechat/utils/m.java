package cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: e */
    public String f5641e;

    /* renamed from: f */
    public String f5642f;

    public abstract int a();

    public void a(Bundle bundle) {
        this.f5641e = n.a(bundle, "_wxapi_basereq_transaction");
        this.f5642f = n.a(bundle, "_wxapi_basereq_openid");
    }

    public void b(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", a());
        bundle.putString("_wxapi_basereq_transaction", this.f5641e);
        bundle.putString("_wxapi_basereq_openid", this.f5642f);
    }

    public abstract boolean b();
}

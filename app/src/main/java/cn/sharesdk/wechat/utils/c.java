package cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends WechatResp {

    /* renamed from: a */
    public String f5551a;

    /* renamed from: b */
    public String f5552b;

    /* renamed from: c */
    public String f5553c;

    /* renamed from: d */
    public String f5554d;

    /* renamed from: e */
    public String f5555e;

    /* renamed from: f */
    public boolean f5556f = false;

    public c(Bundle bundle) {
        a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    public int a() {
        return 1;
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f5551a = bundle.getString("_wxapi_sendauth_resp_token");
        this.f5552b = bundle.getString("_wxapi_sendauth_resp_state");
        this.f5553c = bundle.getString("_wxapi_sendauth_resp_url");
        this.f5554d = bundle.getString("_wxapi_sendauth_resp_lang");
        this.f5555e = bundle.getString("_wxapi_sendauth_resp_country");
        this.f5556f = bundle.getBoolean("_wxapi_sendauth_resp_auth_result");
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putString("_wxapi_sendauth_resp_token", this.f5551a);
        bundle.putString("_wxapi_sendauth_resp_state", this.f5552b);
        bundle.putString("_wxapi_sendauth_resp_url", this.f5553c);
        bundle.putString("_wxapi_sendauth_resp_lang", this.f5554d);
        bundle.putString("_wxapi_sendauth_resp_country", this.f5555e);
        bundle.putBoolean("_wxapi_sendauth_resp_auth_result", this.f5556f);
    }
}

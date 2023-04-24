package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;

/* loaded from: classes.dex */
public class b extends m {

    /* renamed from: a */
    public String f5547a;

    /* renamed from: b */
    public String f5548b;

    /* renamed from: c */
    public String f5549c;

    /* renamed from: d */
    public a f5550d;

    @Override // cn.sharesdk.wechat.utils.m
    public int a() {
        return 1;
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f5547a = bundle.getString("_wxapi_sendauth_req_scope");
        this.f5548b = bundle.getString("_wxapi_sendauth_req_state");
        this.f5549c = bundle.getString("_wxapi_sendauth_req_ext_data");
        a aVar = new a();
        this.f5550d = aVar;
        aVar.b(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putString("_wxapi_sendauth_req_scope", this.f5547a);
        bundle.putString("_wxapi_sendauth_req_state", this.f5548b);
        bundle.putString("_wxapi_sendauth_req_ext_data", this.f5549c);
        a aVar = this.f5550d;
        if (aVar != null) {
            aVar.a(bundle);
        }
    }

    @Override // cn.sharesdk.wechat.utils.m
    public boolean b() {
        String str = this.f5547a;
        if (str == null || str.length() == 0 || this.f5547a.length() > 1024) {
            SSDKLog.b().a("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, scope is invalid");
            return false;
        }
        String str2 = this.f5548b;
        if (str2 == null || str2.length() <= 1024) {
            return true;
        }
        SSDKLog.b().a("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, state is invalid");
        return false;
    }
}

package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.WXMediaMessage;

/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: a */
    public WXMediaMessage f5558a;

    /* renamed from: b */
    public String f5559b;

    /* renamed from: c */
    public String f5560c;

    public f(Bundle bundle) {
        a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public int a() {
        return 4;
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f5559b = bundle.getString("_wxapi_showmessage_req_lang");
        this.f5560c = bundle.getString("_wxapi_showmessage_req_country");
        this.f5558a = WXMediaMessage.a.a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void b(Bundle bundle) {
        Bundle a10 = WXMediaMessage.a.a(this.f5558a);
        super.b(a10);
        bundle.putString("_wxapi_showmessage_req_lang", this.f5559b);
        bundle.putString("_wxapi_showmessage_req_country", this.f5560c);
        bundle.putAll(a10);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public boolean b() {
        WXMediaMessage wXMediaMessage = this.f5558a;
        if (wXMediaMessage == null) {
            SSDKLog.b().a("checkArgs fail, message is null", new Object[0]);
            return false;
        }
        return wXMediaMessage.a();
    }
}

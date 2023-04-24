package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;

/* loaded from: classes.dex */
public class g extends m {

    /* renamed from: a */
    public int f5561a;

    /* renamed from: b */
    public String f5562b;

    /* renamed from: c */
    public String f5563c;

    @Override // cn.sharesdk.wechat.utils.m
    public int a() {
        return 18;
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f5561a = bundle.getInt("_wxapi_subscribemessage_req_scene");
        this.f5562b = bundle.getString("_wxapi_subscribemessage_req_templateid");
        this.f5563c = bundle.getString("_wxapi_subscribemessage_req_reserved");
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putInt("_wxapi_subscribemessage_req_scene", this.f5561a);
        bundle.putString("_wxapi_subscribemessage_req_templateid", this.f5562b);
        bundle.putString("_wxapi_subscribemessage_req_reserved", this.f5563c);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public boolean b() {
        String str = this.f5562b;
        if (str == null || str.length() == 0) {
            SSDKLog.b().d("ShareSDK", "MicroMsg.SDK.SubscribeMessage.ReqcheckArgs fail, templateID is null");
            return false;
        } else if (this.f5562b.length() > 1024) {
            SSDKLog.b().d("ShareSDK", "MicroMsg.SDK.SubscribeMessage.ReqcheckArgs fail, templateID is too long");
            return false;
        } else {
            String str2 = this.f5563c;
            if (str2 == null || str2.length() <= 1024) {
                return true;
            }
            SSDKLog.b().d("ShareSDK", "MicroMsg.SDK.SubscribeMessage.ReqcheckArgs fail, reserved is too long");
            return false;
        }
    }
}

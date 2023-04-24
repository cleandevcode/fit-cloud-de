package cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class WechatResp {

    /* renamed from: g */
    public int f5541g;

    /* renamed from: h */
    public String f5542h;

    /* renamed from: i */
    public String f5543i;

    /* renamed from: j */
    public String f5544j;

    /* loaded from: classes.dex */
    public interface ErrCode {
        public static final int ERR_AUTH_DENIED = -4;
        public static final int ERR_BAN = -6;
        public static final int ERR_COMM = -1;
        public static final int ERR_OK = 0;
        public static final int ERR_SENT_FAILED = -3;
        public static final int ERR_UNSUPPORT = -5;
        public static final int ERR_USER_CANCEL = -2;
    }

    public abstract int a();

    public void a(Bundle bundle) {
        this.f5541g = bundle.getInt("_wxapi_baseresp_errcode");
        this.f5542h = bundle.getString("_wxapi_baseresp_errstr");
        this.f5543i = bundle.getString("_wxapi_baseresp_transaction");
        this.f5544j = bundle.getString("_wxapi_baseresp_openId");
    }

    public void b(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", a());
        bundle.putInt("_wxapi_baseresp_errcode", this.f5541g);
        bundle.putString("_wxapi_baseresp_errstr", this.f5542h);
        bundle.putString("_wxapi_baseresp_transaction", this.f5543i);
        bundle.putString("_wxapi_baseresp_openId", this.f5544j);
    }
}

package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public class WXWebpageObject implements WXMediaMessage.IMediaObject {
    public String canvasPageXml;
    public String extInfo;
    public String webpageUrl;
    public boolean isSecretMessage = false;
    public HashMap<String, String> extraInfoMap = null;

    public WXWebpageObject() {
    }

    public WXWebpageObject(String str) {
        this.webpageUrl = str;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str = this.webpageUrl;
        if (str == null || str.length() == 0 || this.webpageUrl.length() > 10240) {
            SSDKLog.b().a("checkArgs fail, webpageUrl is invalid", new Object[0]);
            return false;
        }
        return true;
    }

    public String getExtra(String str, String str2) {
        HashMap<String, String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            String str3 = hashMap.get(str);
            return str3 == null ? str2 : str3;
        }
        return null;
    }

    public void putExtra(String str, String str2) {
        if (this.extraInfoMap == null) {
            this.extraInfoMap = new HashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.extraInfoMap.put(str, str2);
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
        bundle.putString("_wxwebpageobject_extInfo", this.extInfo);
        bundle.putString("_wxwebpageobject_canvaspagexml", this.canvasPageXml);
        bundle.putBoolean("_wxwebpageobject_issecretmsg", this.isSecretMessage);
        HashMap<String, String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            bundle.putSerializable("_wxwebpageobject_extrainfo", hashMap);
        }
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public int type() {
        return 5;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.webpageUrl = bundle.getString("_wxwebpageobject_webpageUrl");
        this.extInfo = bundle.getString("_wxwebpageobject_extInfo");
        this.canvasPageXml = bundle.getString("_wxwebpageobject_canvaspagexml");
        this.isSecretMessage = bundle.getBoolean("_wxwebpageobject_issecretmsg");
        Serializable serializable = bundle.getSerializable("_wxwebpageobject_extrainfo");
        if (serializable != null) {
            this.extraInfoMap = (HashMap) serializable;
        }
    }
}
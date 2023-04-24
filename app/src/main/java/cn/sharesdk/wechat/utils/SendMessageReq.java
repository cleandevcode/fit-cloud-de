package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.WXMediaMessage;

/* loaded from: classes.dex */
public class SendMessageReq extends m {

    /* renamed from: a */
    public WXMediaMessage f5537a;

    /* renamed from: b */
    public int f5538b;

    /* renamed from: c */
    public String f5539c;

    /* renamed from: d */
    public IWXSceneDataObject f5540d;

    /* loaded from: classes.dex */
    public interface IWXSceneDataObject {
        boolean checkArgs();

        int getJumpType();

        void serialize(Bundle bundle);

        void unserialize(Bundle bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public int a() {
        return 2;
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f5537a = WXMediaMessage.a.a(bundle);
        this.f5538b = bundle.getInt("_wxapi_sendmessagetowx_req_scene");
        this.f5539c = bundle.getString("_wxapi_sendmessagetowx_req_use_open_id");
        if (bundle.getString("_scene_data_object_identifie") != null) {
            try {
                IWXSceneDataObject iWXSceneDataObject = (IWXSceneDataObject) Class.forName(bundle.getString("_scene_data_object_identifie")).newInstance();
                this.f5540d = iWXSceneDataObject;
                iWXSceneDataObject.unserialize(bundle);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putAll(WXMediaMessage.a.a(this.f5537a));
        bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.f5538b);
        bundle.putInt("_wxapi_sendmessagetowx_req_media_type", this.f5537a.getType());
        bundle.putString("_wxapi_sendmessagetowx_req_use_open_id", this.f5539c);
        IWXSceneDataObject iWXSceneDataObject = this.f5540d;
        if (iWXSceneDataObject != null) {
            bundle.putString("_scene_data_object_identifier", iWXSceneDataObject.getClass().getName());
            this.f5540d.serialize(bundle);
        }
    }

    @Override // cn.sharesdk.wechat.utils.m
    public boolean b() {
        int type = this.f5537a.getType();
        WXMediaMessage wXMediaMessage = this.f5537a;
        if (wXMediaMessage == null) {
            SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
            return false;
        }
        if (type == 6 && this.f5538b == 2) {
            ((WXFileObject) wXMediaMessage.mediaObject).setContentLengthLimit(26214400);
        }
        int i10 = this.f5538b;
        if (i10 == 3 && this.f5539c == null) {
            SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "Send specifiedContact userOpenId can not be null.");
            return false;
        } else if (i10 == 3 && this.f5642f == null) {
            SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "Send specifiedContact openid can not be null.");
            return false;
        } else if (i10 != 4) {
            return this.f5537a.a();
        } else {
            if (this.f5540d != null) {
                return this.f5537a.getType() == 1 ? this.f5540d.checkArgs() : this.f5537a.a() && this.f5540d.checkArgs();
            }
            SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail, sceneDataObject is null");
            return false;
        }
    }
}

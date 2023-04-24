package cn.sharesdk.wechat.utils;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.utils.SSDKLog;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class WXMediaMessage {
    public static final String ACTION_WXAPPMESSAGE = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE";
    public static final int MESSAGE_ACTION_LENGTH_LIMIT = 2048;
    public static final int MESSAGE_EXT_LENGTH_LIMIT = 2048;
    public String description;
    public IMediaObject mediaObject;
    public String mediaTagName;
    public String messageAction;
    public String messageExt;
    public String openId;
    public int sdkVer;
    public byte[] thumbData;
    public String title;
    public String wxminiprogram_ext_msg;

    /* loaded from: classes.dex */
    public interface IMediaObject {
        public static final int TYPE_APPBRAND = 33;
        public static final int TYPE_APPDATA = 7;
        public static final int TYPE_BUSINESS_CARD = 45;
        public static final int TYPE_CARD_SHARE = 16;
        public static final int TYPE_DESIGNER_SHARED = 25;
        public static final int TYPE_DEVICE_ACCESS = 12;
        public static final int TYPE_EMOJI = 8;
        public static final int TYPE_EMOJILIST_SHARED = 27;
        public static final int TYPE_EMOTICON_GIFT = 11;
        public static final int TYPE_EMOTICON_SHARED = 15;
        public static final int TYPE_EMOTIONLIST_SHARED = 26;
        public static final int TYPE_FILE = 6;
        public static final int TYPE_GAME_LIVE = 70;
        public static final int TYPE_GAME_VIDEO_FILE = 39;
        public static final int TYPE_GIFTCARD = 34;
        public static final int TYPE_IMAGE = 2;
        public static final int TYPE_LOCATION = 30;
        public static final int TYPE_LOCATION_SHARE = 17;
        public static final int TYPE_MALL_PRODUCT = 13;
        public static final int TYPE_MUSIC = 3;
        public static final int TYPE_MUSIC_VIDEO = 76;
        public static final int TYPE_NOTE = 24;
        public static final int TYPE_OLD_TV = 14;
        public static final int TYPE_OPENSDK_APPBRAND = 36;
        public static final int TYPE_OPENSDK_APPBRAND_WEISHIVIDEO = 46;
        public static final int TYPE_OPENSDK_LITEAPP = 68;
        public static final int TYPE_OPENSDK_WEWORK_OBJECT = 49;
        public static final int TYPE_PRODUCT = 10;
        public static final int TYPE_RECORD = 19;
        public static final int TYPE_TEXT = 1;
        public static final int TYPE_TV = 20;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_URL = 5;
        public static final int TYPE_VIDEO = 4;
        public static final int TYPE_VIDEO_FILE = 38;

        boolean checkArgs();

        void serialize(Bundle bundle);

        int type();

        void unserialize(Bundle bundle);
    }

    public WXMediaMessage() {
        this(null);
    }

    public WXMediaMessage(IMediaObject iMediaObject) {
        this.mediaObject = iMediaObject;
    }

    public final boolean a() {
        byte[] bArr;
        if (getType() == 8 && ((bArr = this.thumbData) == null || bArr.length == 0)) {
            SSDKLog.b().a("checkArgs fail, thumbData should not be null when send emoji", new Object[0]);
            return false;
        }
        byte[] bArr2 = this.thumbData;
        if (bArr2 != null && bArr2.length > 131072) {
            SSDKLog.b().a("checkArgs fail, thumbData should not be null or exceed 128kb", new Object[0]);
            return false;
        }
        String str = this.title;
        if (str != null && str.length() > 512) {
            SSDKLog.b().a("checkArgs fail, title is invalid", new Object[0]);
            return false;
        }
        String str2 = this.description;
        if (str2 != null && str2.length() > 1024) {
            this.description = this.description.substring(0, 1021) + "...";
        }
        if (this.mediaObject == null) {
            SSDKLog.b().a("checkArgs fail, mediaObject is null", new Object[0]);
            return false;
        }
        String str3 = this.mediaTagName;
        if (str3 != null && str3.length() > 64) {
            SSDKLog.b().a("checkArgs fail, mediaTagName is too long", new Object[0]);
            return false;
        }
        String str4 = this.messageAction;
        if (str4 != null && str4.length() > 2048) {
            SSDKLog.b().a("checkArgs fail, messageAction is too long", new Object[0]);
            return false;
        }
        String str5 = this.messageExt;
        if (str5 == null || str5.length() <= 2048) {
            return this.mediaObject.checkArgs();
        }
        SSDKLog.b().a("checkArgs fail, messageExt is too long", new Object[0]);
        return false;
    }

    public final int getType() {
        IMediaObject iMediaObject = this.mediaObject;
        if (iMediaObject == null) {
            return 0;
        }
        return iMediaObject.type();
    }

    public final void setThumbImage(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.thumbData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
            SSDKLog.b().a("put thumb failed", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static Bundle a(WXMediaMessage wXMediaMessage) {
            Bundle bundle = new Bundle();
            bundle.putInt("_wxobject_sdkVer", wXMediaMessage.sdkVer);
            bundle.putString("_wxobject_title", wXMediaMessage.title);
            bundle.putString("_wxobject_description", wXMediaMessage.description);
            bundle.putByteArray("_wxobject_thumbdata", wXMediaMessage.thumbData);
            IMediaObject iMediaObject = wXMediaMessage.mediaObject;
            if (iMediaObject != null) {
                String name = iMediaObject.getClass().getName();
                if (name.length() != 0) {
                    name = name.replace("com.tencent.mm.opensdk.modelmsg", "com.tencent.mm.sdk.openapi");
                }
                bundle.putString("_wxobject_identifier_", name);
                wXMediaMessage.mediaObject.serialize(bundle);
            }
            bundle.putString("_wxobject_mediatagname", wXMediaMessage.mediaTagName);
            bundle.putString("_wxobject_message_action", wXMediaMessage.messageAction);
            bundle.putString("_wxobject_message_ext", wXMediaMessage.messageExt);
            if (TextUtils.isEmpty(wXMediaMessage.wxminiprogram_ext_msg)) {
                SSDKLog.b().a("WechatResp toBundle that _launch_wxminiprogram_ext_msg is null", new Object[0]);
            } else {
                bundle.putString("_launch_wxminiprogram_ext_msg", wXMediaMessage.wxminiprogram_ext_msg);
            }
            return bundle;
        }

        public static WXMediaMessage a(Bundle bundle) {
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.sdkVer = bundle.getInt("_wxobject_sdkVer");
            wXMediaMessage.title = bundle.getString("_wxobject_title");
            wXMediaMessage.description = bundle.getString("_wxobject_description");
            wXMediaMessage.thumbData = bundle.getByteArray("_wxobject_thumbdata");
            wXMediaMessage.mediaTagName = bundle.getString("_wxobject_mediatagname");
            wXMediaMessage.messageAction = bundle.getString("_wxobject_message_action");
            wXMediaMessage.messageExt = bundle.getString("_wxobject_message_ext");
            String a10 = a(bundle.getString("_wxobject_identifier_"));
            if (a10 != null && a10.length() > 0) {
                if (!TextUtils.isEmpty(wXMediaMessage.wxminiprogram_ext_msg)) {
                    try {
                        wXMediaMessage.wxminiprogram_ext_msg = bundle.getString("_launch_wxminiprogram_ext_msg");
                    } catch (Throwable th2) {
                        SSDKLog.b().a(cn.sharesdk.facebook.e.a(" WechatResp get _launch_wxminiprogram_ext_msg error ", th2), new Object[0]);
                    }
                }
                try {
                    IMediaObject iMediaObject = (IMediaObject) Class.forName(a10).newInstance();
                    wXMediaMessage.mediaObject = iMediaObject;
                    iMediaObject.unserialize(bundle);
                    return wXMediaMessage;
                } catch (Exception e10) {
                    SSDKLog b10 = SSDKLog.b();
                    StringBuilder a11 = androidx.activity.result.d.a("get media object from bundle failed: unknown ident ", a10, ", ex = ");
                    a11.append(e10.getMessage());
                    b10.a(a11.toString(), new Object[0]);
                }
            }
            return wXMediaMessage;
        }

        private static String a(String str) {
            if (str == null || str.length() == 0) {
                SSDKLog.b().a("pathOldToNew fail, oldPath is null", new Object[0]);
                return str;
            }
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                StringBuilder a10 = android.support.v4.media.d.a("cn.sharesdk.wechat.utils");
                a10.append(str.substring(lastIndexOf));
                return a10.toString();
            }
            SSDKLog.b().a(a.b.b("pathOldToNew fail, invalid pos, oldPath = ", str), new Object[0]);
            return str;
        }
    }
}

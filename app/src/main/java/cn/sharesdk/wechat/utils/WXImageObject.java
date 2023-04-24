package cn.sharesdk.wechat.utils;

import android.graphics.Bitmap;
import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class WXImageObject implements WXMediaMessage.IMediaObject {
    public byte[] imageData;
    public String imagePath;
    public String imageUrl;

    public WXImageObject() {
    }

    public WXImageObject(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
        }
    }

    public WXImageObject(byte[] bArr) {
        this.imageData = bArr;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        String str2;
        byte[] bArr = this.imageData;
        if ((bArr != null && bArr.length != 0) || (((str = this.imagePath) != null && str.length() != 0) || ((str2 = this.imageUrl) != null && str2.length() != 0))) {
            byte[] bArr2 = this.imageData;
            if (bArr2 != null && bArr2.length > 26214400) {
                SSDKLog.b().a("checkArgs fail, content is too large", new Object[0]);
                return false;
            }
            String str3 = this.imagePath;
            if (str3 != null && str3.length() > 10240) {
                SSDKLog.b().a("checkArgs fail, path is invalid", new Object[0]);
                return false;
            }
            if (this.imagePath != null) {
                try {
                    if (n.a().a(this.imagePath) > 26214400) {
                        SSDKLog.b().a("checkArgs fail, image content is too large", new Object[0]);
                        return false;
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a("ShareSDK", cn.sharesdk.facebook.e.a(" WXImageObject catch don't worry will betwo style ", th2));
                    int a10 = n.a().a(this.imagePath);
                    if (a10 != 0 && a10 > 10485760) {
                        return false;
                    }
                }
            }
            String str4 = this.imageUrl;
            if (str4 == null || str4.length() <= 10240) {
                return true;
            }
            SSDKLog.b().a("checkArgs fail, url is invalid", new Object[0]);
            return false;
        }
        SSDKLog.b().a("checkArgs fail, all arguments are null", new Object[0]);
        return false;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wximageobject_imageData", this.imageData);
        bundle.putString("_wximageobject_imagePath", this.imagePath);
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public int type() {
        return 2;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.imageData = bundle.getByteArray("_wximageobject_imageData");
        this.imagePath = bundle.getString("_wximageobject_imagePath");
    }
}

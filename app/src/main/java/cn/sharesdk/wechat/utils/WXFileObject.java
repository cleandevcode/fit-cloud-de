package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.WXMediaMessage;

/* loaded from: classes.dex */
public class WXFileObject implements WXMediaMessage.IMediaObject {
    private int contentLengthLimit;
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
        this.contentLengthLimit = 1920991232;
        this.fileData = null;
        this.filePath = null;
    }

    public WXFileObject(String str) {
        this.contentLengthLimit = 1920991232;
        this.filePath = str;
    }

    public WXFileObject(byte[] bArr) {
        this.contentLengthLimit = 1920991232;
        this.fileData = bArr;
    }

    private int getFileSize(String str) {
        return n.a().a(str);
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        byte[] bArr = this.fileData;
        if ((bArr != null && bArr.length != 0) || ((str = this.filePath) != null && str.length() != 0)) {
            byte[] bArr2 = this.fileData;
            if (bArr2 != null && bArr2.length > this.contentLengthLimit) {
                SSDKLog.b().a("checkArgs fail, fileData is too large", new Object[0]);
                return false;
            }
            String str2 = this.filePath;
            if (str2 != null) {
                try {
                    if (getFileSize(str2) > this.contentLengthLimit) {
                        SSDKLog.b().a("checkArgs fail, fileSize is too large", new Object[0]);
                        return false;
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a("ShareSDK", cn.sharesdk.facebook.e.a(" WXAppExendObject catch don't worry will be two style ", th2));
                    int a10 = n.a().a(this.filePath);
                    if (a10 != 0 && a10 > this.contentLengthLimit) {
                        return false;
                    }
                }
            }
            return true;
        }
        SSDKLog.b().a("checkArgs fail, both arguments is null", new Object[0]);
        return false;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.fileData);
        bundle.putString("_wxfileobject_filePath", this.filePath);
    }

    public void setContentLengthLimit(int i10) {
        this.contentLengthLimit = i10;
    }

    public void setFileData(byte[] bArr) {
        this.fileData = bArr;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public int type() {
        return 6;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.fileData = bundle.getByteArray("_wxfileobject_fileData");
        this.filePath = bundle.getString("_wxfileobject_filePath");
    }
}

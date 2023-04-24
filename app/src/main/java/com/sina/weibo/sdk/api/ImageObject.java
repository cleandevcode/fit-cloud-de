package com.sina.weibo.sdk.api;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.b.c;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* loaded from: classes.dex */
public class ImageObject extends MediaObject {
    private static final int CONTENT_LENGTH_LIMIT = 1048576;
    public static final Parcelable.Creator<ImageObject> CREATOR = new Parcelable.Creator<ImageObject>() { // from class: com.sina.weibo.sdk.api.ImageObject.1
        @Override // android.os.Parcelable.Creator
        public final ImageObject createFromParcel(Parcel parcel) {
            return new ImageObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageObject[] newArray(int i10) {
            return new ImageObject[i10];
        }
    };
    private static final int PATH_LENGTH_LIMIT = 512;
    private static final String TAG = "ImageObject";
    private static final long serialVersionUID = 8760548583231081050L;
    public byte[] imageData;
    public String imagePath;

    public ImageObject() {
    }

    public ImageObject(Parcel parcel) {
        this.imageData = parcel.createByteArray();
        this.imagePath = parcel.readString();
    }

    private int getFileSize(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        return 0;
    }

    public boolean checkArgs() {
        String str;
        String str2;
        byte[] bArr = this.imageData;
        if ((bArr == null || bArr.length == 0) && ((str = this.imagePath) == null || str.length() == 0)) {
            str2 = "checkArgs fail, all arguments are null";
        } else {
            byte[] bArr2 = this.imageData;
            if (bArr2 == null || bArr2.length <= CONTENT_LENGTH_LIMIT) {
                String str3 = this.imagePath;
                if (str3 == null || str3.length() <= 512) {
                    String str4 = this.imagePath;
                    if (str4 == null || getFileSize(str4) <= CONTENT_LENGTH_LIMIT) {
                        return true;
                    }
                    str2 = "checkArgs fail, image content is too large";
                } else {
                    str2 = "checkArgs fail, path is invalid";
                }
            } else {
                str2 = "checkArgs fail, content is too large";
            }
        }
        c.b(TAG, str2);
        return false;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setImageData(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            c.b(TAG, "ImageObject :" + e10.getMessage());
        }
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.imageData);
        parcel.writeString(this.imagePath);
    }
}

package com.sina.weibo.sdk.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.io.Serializable;

/* loaded from: classes.dex */
public class WebData implements Parcelable, Serializable {
    public static final Parcelable.Creator<WebData> CREATOR = new Parcelable.Creator<WebData>() { // from class: com.sina.weibo.sdk.web.WebData.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WebData createFromParcel(Parcel parcel) {
            return new WebData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WebData[] newArray(int i10) {
            return new WebData[i10];
        }
    };
    private static final long serialVersionUID = -4038177938155795889L;
    public AuthInfo av;
    public String aw;

    /* renamed from: i */
    public String f9533i;
    public int type;

    public WebData(Parcel parcel) {
        this.av = (AuthInfo) parcel.readParcelable(AuthInfo.class.getClassLoader());
        this.type = parcel.readInt();
        this.f9533i = parcel.readString();
        this.aw = parcel.readString();
    }

    public WebData(AuthInfo authInfo, int i10, String str, String str2) {
        this.av = authInfo;
        this.type = i10;
        this.f9533i = str;
        this.aw = str2;
    }

    public final AuthInfo a() {
        return this.av;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.f9533i;
    }

    public final String r() {
        return this.aw;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.av, i10);
        parcel.writeInt(this.type);
        parcel.writeString(this.f9533i);
        parcel.writeString(this.aw);
    }
}

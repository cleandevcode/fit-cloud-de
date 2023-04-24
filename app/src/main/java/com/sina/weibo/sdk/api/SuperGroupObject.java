package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class SuperGroupObject extends MediaObject {
    public static final Parcelable.Creator<SuperGroupObject> CREATOR = new Parcelable.Creator<SuperGroupObject>() { // from class: com.sina.weibo.sdk.api.SuperGroupObject.1
        @Override // android.os.Parcelable.Creator
        public final SuperGroupObject createFromParcel(Parcel parcel) {
            return new SuperGroupObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperGroupObject[] newArray(int i10) {
            return new SuperGroupObject[i10];
        }
    };
    public String secName;
    public String sgExtParam;
    public String sgName;

    public SuperGroupObject() {
    }

    public SuperGroupObject(Parcel parcel) {
        this.sgName = parcel.readString();
        this.secName = parcel.readString();
        this.sgExtParam = parcel.readString();
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.sgName);
        parcel.writeString(this.secName);
        parcel.writeString(this.sgExtParam);
    }
}

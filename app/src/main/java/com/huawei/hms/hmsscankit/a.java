package com.huawei.hms.hmsscankit;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a implements Parcelable.Creator<DetailRect> {
    @Override // android.os.Parcelable.Creator
    public DetailRect createFromParcel(Parcel parcel) {
        return new DetailRect(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public DetailRect[] newArray(int i10) {
        return new DetailRect[i10];
    }
}

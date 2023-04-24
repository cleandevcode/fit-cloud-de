package com.huawei.hms.scankit.aiscan.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class w implements Parcelable.Creator<x> {
    @Override // android.os.Parcelable.Creator
    public x createFromParcel(Parcel parcel) {
        return new x(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public x[] newArray(int i10) {
        return new x[i10];
    }
}

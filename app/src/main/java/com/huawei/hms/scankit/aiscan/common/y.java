package com.huawei.hms.scankit.aiscan.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class y implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public z createFromParcel(Parcel parcel) {
        return new z(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public z[] newArray(int i10) {
        return new z[i10];
    }
}

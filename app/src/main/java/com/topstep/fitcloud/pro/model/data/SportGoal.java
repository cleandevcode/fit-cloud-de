package com.topstep.fitcloud.pro.model.data;

import a1.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportGoal implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a */
    public final int f9606a;

    /* renamed from: b */
    public final int f9607b;

    /* renamed from: c */
    public final float f9608c;

    /* renamed from: d */
    public final int f9609d;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<SportGoal> {
        @Override // android.os.Parcelable.Creator
        public final SportGoal createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new SportGoal(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final SportGoal[] newArray(int i10) {
            return new SportGoal[i10];
        }
    }

    public /* synthetic */ SportGoal(int i10, int i11, float f10, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 4) != 0 ? 0.0f : f10);
    }

    public SportGoal(int i10, int i11, int i12, float f10) {
        this.f9606a = i10;
        this.f9607b = i11;
        this.f9608c = f10;
        this.f9609d = i12;
    }

    public static SportGoal a(SportGoal sportGoal, int i10, float f10, int i11, int i12) {
        int i13 = (i12 & 1) != 0 ? sportGoal.f9606a : 0;
        if ((i12 & 2) != 0) {
            i10 = sportGoal.f9607b;
        }
        if ((i12 & 4) != 0) {
            f10 = sportGoal.f9608c;
        }
        if ((i12 & 8) != 0) {
            i11 = sportGoal.f9609d;
        }
        return new SportGoal(i13, i10, i11, f10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportGoal) {
            SportGoal sportGoal = (SportGoal) obj;
            return this.f9606a == sportGoal.f9606a && this.f9607b == sportGoal.f9607b && Float.compare(this.f9608c, sportGoal.f9608c) == 0 && this.f9609d == sportGoal.f9609d;
        }
        return false;
    }

    public final int hashCode() {
        return e.b(this.f9608c, ((this.f9606a * 31) + this.f9607b) * 31, 31) + this.f9609d;
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportGoal(sportType=");
        a10.append(this.f9606a);
        a10.append(", goalType=");
        a10.append(this.f9607b);
        a10.append(", goalDistance=");
        a10.append(this.f9608c);
        a10.append(", goalTime=");
        return b.a(a10, this.f9609d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.f9606a);
        parcel.writeInt(this.f9607b);
        parcel.writeFloat(this.f9608c);
        parcel.writeInt(this.f9609d);
    }
}

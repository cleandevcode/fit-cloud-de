package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a */
    public final Calendar f6512a;

    /* renamed from: b */
    public final int f6513b;

    /* renamed from: c */
    public final int f6514c;

    /* renamed from: d */
    public final int f6515d;

    /* renamed from: e */
    public final int f6516e;

    /* renamed from: f */
    public final long f6517f;

    /* renamed from: g */
    public String f6518g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            return u.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i10) {
            return new u[i10];
        }
    }

    public u(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = d0.b(calendar);
        this.f6512a = b10;
        this.f6513b = b10.get(2);
        this.f6514c = b10.get(1);
        this.f6515d = b10.getMaximum(7);
        this.f6516e = b10.getActualMaximum(5);
        this.f6517f = b10.getTimeInMillis();
    }

    public static u a(int i10, int i11) {
        Calendar d10 = d0.d(null);
        d10.set(1, i10);
        d10.set(2, i11);
        return new u(d10);
    }

    public static u d(long j10) {
        Calendar d10 = d0.d(null);
        d10.setTimeInMillis(j10);
        return new u(d10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(u uVar) {
        return this.f6512a.compareTo(uVar.f6512a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        int firstDayOfWeek = this.f6512a.get(7) - this.f6512a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f6515d : firstDayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f6513b == uVar.f6513b && this.f6514c == uVar.f6514c;
        }
        return false;
    }

    public final String f() {
        if (this.f6518g == null) {
            this.f6518g = DateUtils.formatDateTime(null, this.f6512a.getTimeInMillis(), 8228);
        }
        return this.f6518g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6513b), Integer.valueOf(this.f6514c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6514c);
        parcel.writeInt(this.f6513b);
    }
}

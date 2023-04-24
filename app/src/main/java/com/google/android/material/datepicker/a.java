package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0093a();

    /* renamed from: a */
    public final u f6436a;

    /* renamed from: b */
    public final u f6437b;

    /* renamed from: c */
    public final c f6438c;

    /* renamed from: d */
    public u f6439d;

    /* renamed from: e */
    public final int f6440e;

    /* renamed from: f */
    public final int f6441f;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes.dex */
    public class C0093a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        public static final long f6442e = d0.a(u.a(1900, 0).f6517f);

        /* renamed from: f */
        public static final long f6443f = d0.a(u.a(2100, 11).f6517f);

        /* renamed from: a */
        public long f6444a;

        /* renamed from: b */
        public long f6445b;

        /* renamed from: c */
        public Long f6446c;

        /* renamed from: d */
        public c f6447d;

        public b(a aVar) {
            this.f6444a = f6442e;
            this.f6445b = f6443f;
            this.f6447d = new f(Long.MIN_VALUE);
            this.f6444a = aVar.f6436a.f6517f;
            this.f6445b = aVar.f6437b.f6517f;
            this.f6446c = Long.valueOf(aVar.f6439d.f6517f);
            this.f6447d = aVar.f6438c;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean c(long j10);
    }

    public a(u uVar, u uVar2, c cVar, u uVar3) {
        this.f6436a = uVar;
        this.f6437b = uVar2;
        this.f6439d = uVar3;
        this.f6438c = cVar;
        if (uVar3 != null && uVar.f6512a.compareTo(uVar3.f6512a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (uVar3 != null && uVar3.f6512a.compareTo(uVar2.f6512a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (uVar.f6512a instanceof GregorianCalendar) {
            int i10 = uVar2.f6514c;
            int i11 = uVar.f6514c;
            this.f6441f = (uVar2.f6513b - uVar.f6513b) + ((i10 - i11) * 12) + 1;
            this.f6440e = (i10 - i11) + 1;
            return;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f6436a.equals(aVar.f6436a) && this.f6437b.equals(aVar.f6437b) && j1.b.a(this.f6439d, aVar.f6439d) && this.f6438c.equals(aVar.f6438c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6436a, this.f6437b, this.f6439d, this.f6438c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f6436a, 0);
        parcel.writeParcelable(this.f6437b, 0);
        parcel.writeParcelable(this.f6439d, 0);
        parcel.writeParcelable(this.f6438c, 0);
    }
}

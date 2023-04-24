package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g8.l;
import i8.p;
import j8.a;
import o8.b;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l();

    /* renamed from: a */
    public final int f6049a;

    /* renamed from: b */
    public final String f6050b;

    public Scope() {
        throw null;
    }

    public Scope(int i10, String str) {
        p.e("scopeUri must not be null or empty", str);
        this.f6049a = i10;
        this.f6050b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f6050b.equals(((Scope) obj).f6050b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6050b.hashCode();
    }

    public final String toString() {
        return this.f6050b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.z(parcel, 1, this.f6049a);
        b.C(parcel, 2, this.f6050b);
        b.J(parcel, F);
    }
}

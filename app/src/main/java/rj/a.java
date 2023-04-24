package rj;

import android.os.Parcel;
import android.os.Parcelable;
import gm.l;
import java.util.Calendar;
import jh.v;

/* loaded from: classes2.dex */
public final class a implements h, Cloneable, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0464a();

    /* renamed from: a */
    public int f25757a;

    /* renamed from: b */
    public int f25758b;

    /* renamed from: c */
    public int f25759c;

    /* renamed from: d */
    public int f25760d;

    /* renamed from: e */
    public int f25761e;

    /* renamed from: f */
    public int f25762f;

    /* renamed from: g */
    public int f25763g;

    /* renamed from: h */
    public boolean f25764h;

    /* renamed from: i */
    public String f25765i;

    /* renamed from: rj.a$a */
    /* loaded from: classes2.dex */
    public static final class C0464a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            boolean z10;
            l.f(parcel, "parcel");
            a aVar = new a(parcel.readInt());
            aVar.f25758b = parcel.readInt();
            aVar.f25759c = parcel.readInt();
            aVar.f25760d = parcel.readInt();
            aVar.f25761e = parcel.readInt();
            aVar.f25762f = parcel.readInt();
            aVar.f25763g = parcel.readInt();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.f25764h = z10;
            aVar.f25765i = parcel.readString();
            return aVar;
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10) {
        this.f25757a = i10;
    }

    public final void a() {
        Calendar calendar = Calendar.getInstance();
        if (this.f25763g == 0 && this.f25764h) {
            if ((this.f25761e * 60) + this.f25762f <= calendar.get(12) + (calendar.get(11) * 60)) {
                calendar.set(5, calendar.get(5) + 1);
            }
        }
        this.f25758b = calendar.get(1);
        this.f25759c = calendar.get(2);
        this.f25760d = calendar.get(5);
    }

    /* renamed from: b */
    public final a clone() {
        Object clone = super.clone();
        l.d(clone, "null cannot be cast to non-null type com.topstep.fitcloud.sdk.v2.model.settings.FcAlarm");
        return (a) clone;
    }

    public final boolean d() {
        if (this.f25763g == 0 && this.f25764h) {
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(this.f25758b, this.f25759c, this.f25760d, this.f25761e, this.f25762f, 0);
            if (timeInMillis > calendar.getTimeInMillis()) {
                this.f25764h = false;
            }
        }
        return this.f25764h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // rj.h
    public final int getId() {
        return this.f25757a;
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcAlarm{id:");
        c10.append(this.f25757a);
        c10.append(" year:");
        c10.append(this.f25758b);
        c10.append(" month:");
        c10.append(this.f25759c);
        c10.append(" day:");
        c10.append(this.f25760d);
        c10.append(" hour:");
        c10.append(this.f25761e);
        c10.append(" minute:");
        c10.append(this.f25762f);
        c10.append(" repeat:");
        c10.append(this.f25763g);
        c10.append(" label:");
        c10.append(this.f25765i);
        c10.append(" isEnabled:");
        c10.append(d());
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.f25757a);
        parcel.writeInt(this.f25758b);
        parcel.writeInt(this.f25759c);
        parcel.writeInt(this.f25760d);
        parcel.writeInt(this.f25761e);
        parcel.writeInt(this.f25762f);
        parcel.writeInt(this.f25763g);
        parcel.writeInt(this.f25764h ? 1 : 0);
        parcel.writeString(this.f25765i);
    }
}

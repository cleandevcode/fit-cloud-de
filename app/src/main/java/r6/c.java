package r6;

import android.os.Parcel;
import android.os.Parcelable;
import r6.a;
import r6.b;

/* loaded from: classes.dex */
public final class c extends d<c, Object> {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: g */
    public String f25350g;

    /* renamed from: h */
    public r6.a f25351h;

    /* renamed from: i */
    public b f25352i;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "parcel");
        this.f25350g = parcel.readString();
        a.C0460a c0460a = new a.C0460a();
        r6.a aVar = (r6.a) parcel.readParcelable(r6.a.class.getClassLoader());
        if (aVar != null) {
            c0460a.f25347a.putAll(aVar.f25346a);
        }
        this.f25351h = new r6.a(c0460a);
        b.a aVar2 = new b.a();
        b bVar = (b) parcel.readParcelable(b.class.getClassLoader());
        if (bVar != null) {
            aVar2.f25349a.putAll(bVar.f25348a);
        }
        this.f25352i = new b(aVar2);
    }

    @Override // r6.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f25350g);
        parcel.writeParcelable(this.f25351h, 0);
        parcel.writeParcelable(this.f25352i, 0);
    }
}

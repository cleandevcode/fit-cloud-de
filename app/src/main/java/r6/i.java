package r6;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import r6.g;

/* loaded from: classes.dex */
public final class i extends g<i, a> {
    public static final Parcelable.Creator<i> CREATOR = new b();

    /* renamed from: b */
    public final Bitmap f25375b;

    /* renamed from: c */
    public final Uri f25376c;

    /* renamed from: d */
    public final boolean f25377d;

    /* renamed from: e */
    public final String f25378e;

    /* renamed from: f */
    public final g.b f25379f;

    /* loaded from: classes.dex */
    public static final class a extends g.a<i, a> {

        /* renamed from: b */
        public Bitmap f25380b;

        /* renamed from: c */
        public Uri f25381c;

        /* renamed from: d */
        public boolean f25382d;

        /* renamed from: e */
        public String f25383e;

        public final a a(i iVar) {
            if (iVar != null) {
                Bundle bundle = iVar.f25369a;
                gm.l.f(bundle, "parameters");
                this.f25370a.putAll(bundle);
                this.f25380b = iVar.f25375b;
                this.f25381c = iVar.f25376c;
                this.f25382d = iVar.f25377d;
                this.f25383e = iVar.f25378e;
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "parcel");
        this.f25379f = g.b.PHOTO;
        this.f25375b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f25376c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f25377d = parcel.readByte() != 0;
        this.f25378e = parcel.readString();
    }

    public i(a aVar) {
        super(aVar);
        this.f25379f = g.b.PHOTO;
        this.f25375b = aVar.f25380b;
        this.f25376c = aVar.f25381c;
        this.f25377d = aVar.f25382d;
        this.f25378e = aVar.f25383e;
    }

    @Override // r6.g
    public final g.b a() {
        return this.f25379f;
    }

    @Override // r6.g, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.g, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f25375b, 0);
        parcel.writeParcelable(this.f25376c, 0);
        parcel.writeByte(this.f25377d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f25378e);
    }
}

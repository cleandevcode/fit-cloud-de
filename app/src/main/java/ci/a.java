package ci;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final C0074a CREATOR = new C0074a();

    /* renamed from: a */
    public final long f4705a;

    /* renamed from: b */
    public final Uri f4706b;

    /* renamed from: c */
    public final String f4707c;

    /* renamed from: d */
    public final String f4708d;

    /* renamed from: e */
    public final String f4709e;

    /* renamed from: f */
    public final long f4710f;

    /* renamed from: ci.a$a */
    /* loaded from: classes2.dex */
    public static final class C0074a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(long j10, Uri uri, String str, String str2, String str3, long j11) {
        this.f4705a = j10;
        this.f4706b = uri;
        this.f4707c = str;
        this.f4708d = str2;
        this.f4709e = str3;
        this.f4710f = j11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r11, r0)
            long r2 = r11.readLong()
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r1 < r4) goto L1e
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            java.lang.Object r0 = r11.readParcelable(r0, r1)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L22
        L1e:
            android.os.Parcelable r0 = r11.readParcelable(r0)
        L22:
            gm.l.c(r0)
            r4 = r0
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            java.lang.String r7 = r11.readString()
            long r8 = r11.readLong()
            r1 = r10
            r1.<init>(r2, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.a.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f4705a == aVar.f4705a && gm.l.a(this.f4706b, aVar.f4706b) && gm.l.a(this.f4707c, aVar.f4707c) && gm.l.a(this.f4708d, aVar.f4708d) && gm.l.a(this.f4709e, aVar.f4709e) && this.f4710f == aVar.f4710f;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4705a;
        int hashCode = (this.f4706b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31;
        String str = this.f4707c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4708d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4709e;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        long j11 = this.f4710f;
        return ((hashCode3 + hashCode4) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AudioInfo(id=");
        a10.append(this.f4705a);
        a10.append(", uri=");
        a10.append(this.f4706b);
        a10.append(", name=");
        a10.append(this.f4707c);
        a10.append(", artist=");
        a10.append(this.f4708d);
        a10.append(", directory=");
        a10.append(this.f4709e);
        a10.append(", size=");
        return d4.b.a(a10, this.f4710f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "parcel");
        parcel.writeLong(this.f4705a);
        parcel.writeParcelable(this.f4706b, i10);
        parcel.writeString(this.f4707c);
        parcel.writeString(this.f4708d);
        parcel.writeString(this.f4709e);
        parcel.writeLong(this.f4710f);
    }
}

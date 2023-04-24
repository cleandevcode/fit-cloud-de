package xf;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import d4.b;
import gm.l;
import i2.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final Uri f30536a;

    /* renamed from: b */
    public final List<C0558a> f30537b;

    /* renamed from: xf.a$a */
    /* loaded from: classes2.dex */
    public static final class C0558a implements Parcelable {
        public static final C0559a CREATOR = new C0559a();

        /* renamed from: a */
        public final Uri f30538a;

        /* renamed from: b */
        public final int f30539b;

        /* renamed from: c */
        public final String f30540c;

        /* renamed from: d */
        public final long f30541d;

        /* renamed from: xf.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C0559a implements Parcelable.Creator<C0558a> {
            @Override // android.os.Parcelable.Creator
            public final C0558a createFromParcel(Parcel parcel) {
                l.f(parcel, "parcel");
                return new C0558a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0558a[] newArray(int i10) {
                return new C0558a[i10];
            }
        }

        public C0558a(Uri uri, int i10, String str, long j10) {
            l.f(str, "binUrl");
            this.f30538a = uri;
            this.f30539b = i10;
            this.f30540c = str;
            this.f30541d = j10;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C0558a(android.os.Parcel r8) {
            /*
                r7 = this;
                java.lang.String r0 = "parcel"
                gm.l.f(r8, r0)
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 33
                if (r1 < r2) goto L1a
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Object r0 = r8.readParcelable(r0, r1)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                goto L1e
            L1a:
                android.os.Parcelable r0 = r8.readParcelable(r0)
            L1e:
                gm.l.c(r0)
                r2 = r0
                android.net.Uri r2 = (android.net.Uri) r2
                int r3 = r8.readInt()
                java.lang.String r4 = r8.readString()
                gm.l.c(r4)
                long r5 = r8.readLong()
                r1 = r7
                r1.<init>(r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xf.a.C0558a.<init>(android.os.Parcel):void");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0558a) {
                C0558a c0558a = (C0558a) obj;
                return l.a(this.f30538a, c0558a.f30538a) && this.f30539b == c0558a.f30539b && l.a(this.f30540c, c0558a.f30540c) && this.f30541d == c0558a.f30541d;
            }
            return false;
        }

        public final int hashCode() {
            int a10 = t.a(this.f30540c, ((this.f30538a.hashCode() * 31) + this.f30539b) * 31, 31);
            long j10 = this.f30541d;
            return a10 + ((int) (j10 ^ (j10 >>> 32)));
        }

        public final String toString() {
            StringBuilder a10 = d.a("Style(styleUri=");
            a10.append(this.f30538a);
            a10.append(", styleBaseOnWidth=");
            a10.append(this.f30539b);
            a10.append(", binUrl=");
            a10.append(this.f30540c);
            a10.append(", binSize=");
            return b.a(a10, this.f30541d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            l.f(parcel, "parcel");
            parcel.writeParcelable(this.f30538a, i10);
            parcel.writeInt(this.f30539b);
            parcel.writeString(this.f30540c);
            parcel.writeLong(this.f30541d);
        }
    }

    public a(Uri uri, ArrayList arrayList) {
        this.f30536a = uri;
        this.f30537b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f30536a, aVar.f30536a) && l.a(this.f30537b, aVar.f30537b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30537b.hashCode() + (this.f30536a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("DialCustomParams(defaultBackgroundUri=");
        a10.append(this.f30536a);
        a10.append(", styles=");
        return fb.b.a(a10, this.f30537b, ')');
    }
}

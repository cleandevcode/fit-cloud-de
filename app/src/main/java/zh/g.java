package zh;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.topstep.fitcloud.sdk.v2.utils.dial.a;
import xf.a;

/* loaded from: classes2.dex */
public final class g implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a */
    public final Uri f32450a;

    /* renamed from: b */
    public final a.C0558a f32451b;

    /* renamed from: c */
    public final a.EnumC0212a f32452c;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(Uri uri, a.C0558a c0558a, a.EnumC0212a enumC0212a) {
        gm.l.f(uri, "backgroundUri");
        gm.l.f(c0558a, "style");
        gm.l.f(enumC0212a, "position");
        this.f32450a = uri;
        this.f32451b = c0558a;
        this.f32452c = enumC0212a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r5, r0)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L1a
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            java.lang.Object r0 = r5.readParcelable(r0, r3)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L1e
        L1a:
            android.os.Parcelable r0 = r5.readParcelable(r0)
        L1e:
            gm.l.c(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Class<xf.a$a> r3 = xf.a.C0558a.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            if (r1 < r2) goto L34
            java.lang.Class<xf.a$a> r1 = xf.a.C0558a.class
            java.lang.Object r1 = r5.readParcelable(r3, r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L38
        L34:
            android.os.Parcelable r1 = r5.readParcelable(r3)
        L38:
            gm.l.c(r1)
            xf.a$a r1 = (xf.a.C0558a) r1
            int r5 = r5.readInt()
            com.topstep.fitcloud.sdk.v2.utils.dial.a$a r5 = com.topstep.fitcloud.sdk.v2.utils.dial.a.EnumC0212a.a(r5)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.g.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return gm.l.a(this.f32450a, gVar.f32450a) && gm.l.a(this.f32451b, gVar.f32451b) && this.f32452c == gVar.f32452c;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32451b.hashCode();
        return this.f32452c.hashCode() + ((hashCode + (this.f32450a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DialCustomGridItem(backgroundUri=");
        a10.append(this.f32450a);
        a10.append(", style=");
        a10.append(this.f32451b);
        a10.append(", position=");
        a10.append(this.f32452c);
        a10.append(')');
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "parcel");
        parcel.writeParcelable(this.f32450a, i10);
        parcel.writeParcelable(this.f32451b, i10);
        parcel.writeInt(this.f32452c.ordinal());
    }
}

package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s implements Parcelable {

    /* renamed from: a */
    public final int f22822a;

    /* renamed from: b */
    public final int f22823b;

    /* renamed from: c */
    public final int f22824c;

    /* renamed from: d */
    public final String f22825d;

    /* renamed from: e */
    public final String f22826e;

    /* renamed from: f */
    public final String f22827f;

    /* renamed from: g */
    public final Object f22828g;

    /* renamed from: h */
    public final String f22829h;

    /* renamed from: i */
    public p f22830i;

    /* renamed from: j */
    public static final c f22821j = new c();
    public static final Parcelable.Creator<s> CREATOR = new b();

    /* loaded from: classes.dex */
    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 3);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new s(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i10) {
            return new s[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00c1, code lost:
        if (r3.contains(java.lang.Integer.valueOf(r4)) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(int r2, int r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Object r9, o5.p r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.s.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, o5.p, boolean):void");
    }

    public s(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, false);
    }

    public s(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof p ? (p) exc : new p(exc), false);
    }

    public final String a() {
        String str = this.f22829h;
        if (str == null) {
            p pVar = this.f22830i;
            if (pVar == null) {
                return null;
            }
            return pVar.getLocalizedMessage();
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f22822a + ", errorCode: " + this.f22823b + ", subErrorCode: " + this.f22824c + ", errorType: " + this.f22825d + ", errorMessage: " + a() + "}";
        gm.l.e(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        parcel.writeInt(this.f22822a);
        parcel.writeInt(this.f22823b);
        parcel.writeInt(this.f22824c);
        parcel.writeString(this.f22825d);
        parcel.writeString(a());
        parcel.writeString(this.f22826e);
        parcel.writeString(this.f22827f);
    }
}

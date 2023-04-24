package ue;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import yb.y;

/* loaded from: classes.dex */
public final class a extends y implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0516a();

    /* renamed from: c */
    public int f28686c;

    /* renamed from: d */
    public int f28687d;

    /* renamed from: e */
    public int f28688e;

    /* renamed from: f */
    public int f28689f;

    /* renamed from: g */
    public int f28690g;

    /* renamed from: h */
    public int f28691h;

    /* renamed from: i */
    public int f28692i;

    /* renamed from: j */
    public int f28693j;

    /* renamed from: k */
    public int f28694k;

    /* renamed from: l */
    public int f28695l;

    /* renamed from: m */
    public int f28696m;

    /* renamed from: n */
    public int f28697n;

    /* renamed from: o */
    public int f28698o;

    /* renamed from: p */
    public int f28699p;

    /* renamed from: q */
    public int f28700q;

    /* renamed from: r */
    public String f28701r;

    /* renamed from: s */
    public String f28702s;

    /* renamed from: t */
    public String f28703t;

    /* renamed from: ue.a$a */
    /* loaded from: classes.dex */
    public class C0516a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0066, code lost:
        if (r23 != 15) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x006d, code lost:
        if (r23 != 15) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0077, code lost:
        if (r23 != 15) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0079, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x007b, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00d9, code lost:
        if (r21 != 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00e4, code lost:
        if (r1 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.a.<init>(int, int, int, int, int, int, int):void");
    }

    public a(Parcel parcel) {
        this.f28692i = 15;
        this.f28701r = "";
        this.f28702s = "";
        this.f28703t = "";
        this.f28686c = parcel.readInt();
        this.f28687d = parcel.readInt();
        this.f28688e = parcel.readInt();
        this.f28689f = parcel.readInt();
        this.f28690g = parcel.readInt();
        this.f28691h = parcel.readInt();
        this.f28692i = parcel.readInt();
        this.f28693j = parcel.readInt();
        this.f28694k = parcel.readInt();
        this.f28695l = parcel.readInt();
        this.f28696m = parcel.readInt();
        this.f28697n = parcel.readInt();
        this.f28698o = parcel.readInt();
        this.f28699p = parcel.readInt();
        this.f28700q = parcel.readInt();
        this.f28701r = parcel.readString();
        this.f28702s = parcel.readString();
        this.f28703t = parcel.readString();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0059 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            r0 = 5
            r1 = 3
            if (r3 > r1) goto L7
            r0 = 7
            goto L5e
        L7:
            if (r3 == r0) goto L5d
            r2 = 9
            if (r3 == r2) goto L5d
            r2 = 12
            if (r3 != r2) goto L12
            goto L5d
        L12:
            r2 = 10145(0x27a1, float:1.4216E-41)
            if (r6 == r2) goto L5b
            r2 = 10148(0x27a4, float:1.422E-41)
            if (r6 == r2) goto L5d
            switch(r6) {
                case 10128: goto L3b;
                case 10129: goto L5b;
                case 10130: goto L5b;
                case 10131: goto L5e;
                case 10132: goto L38;
                case 10133: goto L38;
                case 10134: goto L5d;
                case 10135: goto L21;
                default: goto L1d;
            }
        L1d:
            switch(r6) {
                case 10140: goto L5b;
                case 10141: goto L5b;
                case 10142: goto L5b;
                default: goto L20;
            }
        L20:
            goto L59
        L21:
            r4 = 11
            if (r3 == r4) goto L35
            r4 = 13
            if (r3 == r4) goto L35
            r4 = 10
            if (r3 == r4) goto L35
            r4 = 14
            if (r3 != r4) goto L32
            goto L35
        L32:
            r0 = 514(0x202, float:7.2E-43)
            goto L5e
        L35:
            r0 = 516(0x204, float:7.23E-43)
            goto L5e
        L38:
            r0 = 515(0x203, float:7.22E-43)
            goto L5e
        L3b:
            r3 = 20
            if (r4 == r3) goto L57
            r3 = 21
            if (r4 != r3) goto L44
            goto L57
        L44:
            r3 = 16
            if (r4 != r3) goto L4d
            if (r5 < r1) goto L5d
            if (r7 == 0) goto L5d
            goto L59
        L4d:
            r3 = 17
            if (r4 != r3) goto L5d
            r3 = 6
            if (r5 < r3) goto L5d
            if (r7 == 0) goto L5d
            goto L59
        L57:
            if (r7 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5b:
            r0 = 3
            goto L5e
        L5d:
            r0 = 2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.a.C(int, int, int, int, boolean):int");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "0x%04X(%s-%s), I%02XPT%04XSV%02X, imageVersion=[%08X], format=[%d]\nformatedVersion=(%d.%d.%d.%d)->[%s]", Integer.valueOf(this.f28691h), this.f28702s, this.f28703t, Integer.valueOf(this.f28688e), Integer.valueOf(this.f28686c), Integer.valueOf(this.f28687d), Integer.valueOf(this.f28689f), Integer.valueOf(this.f28696m), Integer.valueOf(this.f28697n), Integer.valueOf(this.f28698o), Integer.valueOf(this.f28699p), Integer.valueOf(this.f28700q), this.f28701r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28686c);
        parcel.writeInt(this.f28687d);
        parcel.writeInt(this.f28688e);
        parcel.writeInt(this.f28689f);
        parcel.writeInt(this.f28690g);
        parcel.writeInt(this.f28691h);
        parcel.writeInt(this.f28692i);
        parcel.writeInt(this.f28693j);
        parcel.writeInt(this.f28694k);
        parcel.writeInt(this.f28695l);
        parcel.writeInt(this.f28696m);
        parcel.writeInt(this.f28697n);
        parcel.writeInt(this.f28698o);
        parcel.writeInt(this.f28699p);
        parcel.writeInt(this.f28700q);
        parcel.writeString(this.f28701r);
        parcel.writeString(this.f28702s);
        parcel.writeString(this.f28703t);
    }
}

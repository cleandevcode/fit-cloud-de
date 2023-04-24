package j9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final a f17537a;

    /* renamed from: b */
    public final a f17538b;

    /* renamed from: c */
    public final float f17539c;

    /* renamed from: d */
    public final float f17540d;

    /* renamed from: e */
    public final float f17541e;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0307a();

        /* renamed from: a */
        public int f17542a;

        /* renamed from: b */
        public Integer f17543b;

        /* renamed from: c */
        public Integer f17544c;

        /* renamed from: d */
        public int f17545d;

        /* renamed from: e */
        public int f17546e;

        /* renamed from: f */
        public int f17547f;

        /* renamed from: g */
        public Locale f17548g;

        /* renamed from: h */
        public CharSequence f17549h;

        /* renamed from: i */
        public int f17550i;

        /* renamed from: j */
        public int f17551j;

        /* renamed from: k */
        public Integer f17552k;

        /* renamed from: l */
        public Boolean f17553l;

        /* renamed from: m */
        public Integer f17554m;

        /* renamed from: n */
        public Integer f17555n;

        /* renamed from: o */
        public Integer f17556o;

        /* renamed from: p */
        public Integer f17557p;

        /* renamed from: q */
        public Integer f17558q;

        /* renamed from: r */
        public Integer f17559r;

        /* renamed from: j9.b$a$a */
        /* loaded from: classes.dex */
        public class C0307a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f17545d = 255;
            this.f17546e = -2;
            this.f17547f = -2;
            this.f17553l = Boolean.TRUE;
        }

        public a(Parcel parcel) {
            this.f17545d = 255;
            this.f17546e = -2;
            this.f17547f = -2;
            this.f17553l = Boolean.TRUE;
            this.f17542a = parcel.readInt();
            this.f17543b = (Integer) parcel.readSerializable();
            this.f17544c = (Integer) parcel.readSerializable();
            this.f17545d = parcel.readInt();
            this.f17546e = parcel.readInt();
            this.f17547f = parcel.readInt();
            this.f17549h = parcel.readString();
            this.f17550i = parcel.readInt();
            this.f17552k = (Integer) parcel.readSerializable();
            this.f17554m = (Integer) parcel.readSerializable();
            this.f17555n = (Integer) parcel.readSerializable();
            this.f17556o = (Integer) parcel.readSerializable();
            this.f17557p = (Integer) parcel.readSerializable();
            this.f17558q = (Integer) parcel.readSerializable();
            this.f17559r = (Integer) parcel.readSerializable();
            this.f17553l = (Boolean) parcel.readSerializable();
            this.f17548g = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f17542a);
            parcel.writeSerializable(this.f17543b);
            parcel.writeSerializable(this.f17544c);
            parcel.writeInt(this.f17545d);
            parcel.writeInt(this.f17546e);
            parcel.writeInt(this.f17547f);
            CharSequence charSequence = this.f17549h;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f17550i);
            parcel.writeSerializable(this.f17552k);
            parcel.writeSerializable(this.f17554m);
            parcel.writeSerializable(this.f17555n);
            parcel.writeSerializable(this.f17556o);
            parcel.writeSerializable(this.f17557p);
            parcel.writeSerializable(this.f17558q);
            parcel.writeSerializable(this.f17559r);
            parcel.writeSerializable(this.f17553l);
            parcel.writeSerializable(this.f17548g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r10, j9.b.a r11) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.b.<init>(android.content.Context, j9.b$a):void");
    }
}

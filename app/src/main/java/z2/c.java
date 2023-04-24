package z2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.e;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d */
    public final SparseIntArray f31936d;

    /* renamed from: e */
    public final Parcel f31937e;

    /* renamed from: f */
    public final int f31938f;

    /* renamed from: g */
    public final int f31939g;

    /* renamed from: h */
    public final String f31940h;

    /* renamed from: i */
    public int f31941i;

    /* renamed from: j */
    public int f31942j;

    /* renamed from: k */
    public int f31943k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o0.b(), new o0.b(), new o0.b());
    }

    public c(Parcel parcel, int i10, int i11, String str, o0.b<String, Method> bVar, o0.b<String, Method> bVar2, o0.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f31936d = new SparseIntArray();
        this.f31941i = -1;
        this.f31943k = -1;
        this.f31937e = parcel;
        this.f31938f = i10;
        this.f31939g = i11;
        this.f31942j = i10;
        this.f31940h = str;
    }

    @Override // z2.b
    public final c a() {
        Parcel parcel = this.f31937e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f31942j;
        if (i10 == this.f31938f) {
            i10 = this.f31939g;
        }
        return new c(parcel, dataPosition, i10, e.b(new StringBuilder(), this.f31940h, "  "), this.f31933a, this.f31934b, this.f31935c);
    }

    @Override // z2.b
    public final boolean e() {
        return this.f31937e.readInt() != 0;
    }

    @Override // z2.b
    public final byte[] f() {
        int readInt = this.f31937e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f31937e.readByteArray(bArr);
        return bArr;
    }

    @Override // z2.b
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f31937e);
    }

    @Override // z2.b
    public final boolean h(int i10) {
        while (this.f31942j < this.f31939g) {
            int i11 = this.f31943k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f31937e.setDataPosition(this.f31942j);
            int readInt = this.f31937e.readInt();
            this.f31943k = this.f31937e.readInt();
            this.f31942j += readInt;
        }
        return this.f31943k == i10;
    }

    @Override // z2.b
    public final int i() {
        return this.f31937e.readInt();
    }

    @Override // z2.b
    public final <T extends Parcelable> T k() {
        return (T) this.f31937e.readParcelable(c.class.getClassLoader());
    }

    @Override // z2.b
    public final String m() {
        return this.f31937e.readString();
    }

    @Override // z2.b
    public final void o(int i10) {
        x();
        this.f31941i = i10;
        this.f31936d.put(i10, this.f31937e.dataPosition());
        s(0);
        s(i10);
    }

    @Override // z2.b
    public final void p(boolean z10) {
        this.f31937e.writeInt(z10 ? 1 : 0);
    }

    @Override // z2.b
    public final void q(byte[] bArr) {
        if (bArr == null) {
            this.f31937e.writeInt(-1);
            return;
        }
        this.f31937e.writeInt(bArr.length);
        this.f31937e.writeByteArray(bArr);
    }

    @Override // z2.b
    public final void r(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f31937e, 0);
    }

    @Override // z2.b
    public final void s(int i10) {
        this.f31937e.writeInt(i10);
    }

    @Override // z2.b
    public final void u(Parcelable parcelable) {
        this.f31937e.writeParcelable(parcelable, 0);
    }

    @Override // z2.b
    public final void v(String str) {
        this.f31937e.writeString(str);
    }

    public final void x() {
        int i10 = this.f31941i;
        if (i10 >= 0) {
            int i11 = this.f31936d.get(i10);
            int dataPosition = this.f31937e.dataPosition();
            this.f31937e.setDataPosition(i11);
            this.f31937e.writeInt(dataPosition - i11);
            this.f31937e.setDataPosition(dataPosition);
        }
    }
}

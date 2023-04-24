package nd;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a */
    public byte[] f22323a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f() {
        this.f22323a = new byte[4];
    }

    public f(Parcel parcel) {
        this.f22323a = new byte[4];
        if (Build.VERSION.SDK_INT >= 33) {
            this.f22323a = parcel.readBlob();
        } else {
            this.f22323a = parcel.createByteArray();
        }
    }

    public f(byte[] bArr) {
        this.f22323a = new byte[4];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        wrap.get();
        if (bArr.length >= 4) {
            wrap.get(this.f22323a);
        }
    }

    public final String a() {
        byte[] bArr = this.f22323a;
        return (bArr == null || bArr.length < 4) ? he.a.a(bArr) : String.format(Locale.US, "%d.%d.%d.%d", Byte.valueOf(bArr[0]), Byte.valueOf(this.f22323a[1]), Byte.valueOf(this.f22323a[2]), Byte.valueOf(this.f22323a[3]));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (Build.VERSION.SDK_INT >= 33) {
            parcel.writeBlob(this.f22323a);
        } else {
            parcel.writeByteArray(this.f22323a);
        }
    }
}

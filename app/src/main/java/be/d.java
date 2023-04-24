package be;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.huawei.hms.hmsscankit.ScanUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a */
    public int f4157a;

    /* renamed from: b */
    public int f4158b;

    /* renamed from: c */
    public String f4159c;

    /* renamed from: d */
    public boolean f4160d;

    /* renamed from: e */
    public boolean f4161e;

    /* renamed from: f */
    public String f4162f;

    /* renamed from: g */
    public int f4163g;

    /* renamed from: h */
    public long f4164h;

    /* renamed from: i */
    public boolean f4165i;

    /* renamed from: j */
    public long f4166j;

    /* renamed from: k */
    public boolean f4167k;

    /* renamed from: l */
    public int f4168l;

    /* renamed from: m */
    public boolean f4169m;

    /* renamed from: n */
    public int f4170n;

    /* renamed from: o */
    public ParcelUuid[] f4171o;

    /* renamed from: p */
    public List<ce.a> f4172p;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(int i10) {
        this.f4157a = 0;
        this.f4158b = 0;
        this.f4160d = false;
        this.f4161e = true;
        this.f4163g = ScanUtil.CAMERA_ININT_ERROR;
        this.f4164h = 10000L;
        this.f4166j = 6000L;
        this.f4167k = true;
        this.f4168l = 255;
        this.f4169m = true;
        this.f4172p = new ArrayList();
        this.f4157a = i10;
        this.f4164h = (i10 == 17 || i10 == 18) ? 60000L : 15000L;
        this.f4165i = false;
        this.f4158b = 0;
    }

    public d(Parcel parcel) {
        this.f4157a = 0;
        this.f4158b = 0;
        this.f4160d = false;
        this.f4161e = true;
        this.f4163g = ScanUtil.CAMERA_ININT_ERROR;
        this.f4164h = 10000L;
        this.f4166j = 6000L;
        this.f4167k = true;
        this.f4168l = 255;
        this.f4169m = true;
        this.f4172p = new ArrayList();
        this.f4157a = parcel.readInt();
        this.f4158b = parcel.readInt();
        this.f4159c = parcel.readString();
        this.f4160d = parcel.readByte() != 0;
        this.f4161e = parcel.readByte() != 0;
        this.f4162f = parcel.readString();
        this.f4163g = parcel.readInt();
        this.f4164h = parcel.readLong();
        this.f4165i = parcel.readByte() != 0;
        this.f4166j = parcel.readLong();
        this.f4167k = parcel.readByte() != 0;
        this.f4168l = parcel.readInt();
        this.f4169m = parcel.readByte() != 0;
        this.f4170n = parcel.readInt();
        this.f4171o = (ParcelUuid[]) parcel.createTypedArray(ParcelUuid.CREATOR);
        this.f4172p = parcel.createTypedArrayList(ce.a.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScannerParams{");
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "\n\tscanMode:%d,scanMechanism:%d,scanPeriod=%d", Integer.valueOf(this.f4157a), Integer.valueOf(this.f4158b), Long.valueOf(this.f4164h)));
        sb2.append(String.format(locale, "\n\tfilterProfile=%d", Integer.valueOf(this.f4170n)));
        sb2.append(String.format(locale, "\n\tnameFilter:%s,nameFuzzyMatchEnable=%b,nameNullable=%b", this.f4159c, Boolean.valueOf(this.f4160d), Boolean.valueOf(this.f4161e)));
        return f3.a.a(locale, "\n\tautoDiscovery:%b,autoScanDelay=%d", new Object[]{Boolean.valueOf(this.f4165i), Long.valueOf(this.f4166j)}, sb2, "\n}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4157a);
        parcel.writeInt(this.f4158b);
        parcel.writeString(this.f4159c);
        parcel.writeByte(this.f4160d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4161e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4162f);
        parcel.writeInt(this.f4163g);
        parcel.writeLong(this.f4164h);
        parcel.writeByte(this.f4165i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4166j);
        parcel.writeByte(this.f4167k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f4168l);
        parcel.writeByte(this.f4169m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f4170n);
        parcel.writeTypedArray(this.f4171o, i10);
        parcel.writeTypedList(this.f4172p);
    }
}

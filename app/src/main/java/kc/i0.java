package kc;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public final Integer f18335a;

    /* renamed from: b */
    public final Integer f18336b;

    /* renamed from: c */
    public final Integer f18337c;

    /* renamed from: d */
    public final Boolean f18338d;

    /* renamed from: e */
    public final Boolean f18339e;

    /* renamed from: f */
    public final a f18340f;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, String str, String str2);
    }

    public i0(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, a aVar) {
        this.f18335a = num;
        this.f18336b = num2;
        this.f18337c = num3;
        this.f18338d = bool;
        this.f18339e = bool2;
        this.f18340f = aVar;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("LogOptions{logLevel=");
        a10.append(this.f18335a);
        a10.append(", macAddressLogSetting=");
        a10.append(this.f18336b);
        a10.append(", uuidLogSetting=");
        a10.append(this.f18337c);
        a10.append(", shouldLogAttributeValues=");
        a10.append(this.f18338d);
        a10.append(", shouldLogScannedPeripherals=");
        a10.append(this.f18339e);
        a10.append(", logger=");
        a10.append(this.f18340f);
        a10.append('}');
        return a10.toString();
    }
}

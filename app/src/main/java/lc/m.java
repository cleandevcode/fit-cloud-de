package lc;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b */
    public static final m f19426b = new m("CONNECTION_STATE");

    /* renamed from: c */
    public static final m f19427c = new m("SERVICE_DISCOVERY");

    /* renamed from: d */
    public static final m f19428d = new m("CHARACTERISTIC_READ");

    /* renamed from: e */
    public static final m f19429e = new m("CHARACTERISTIC_WRITE");

    /* renamed from: f */
    public static final m f19430f = new m("CHARACTERISTIC_LONG_WRITE");

    /* renamed from: g */
    public static final m f19431g = new m("DESCRIPTOR_READ");

    /* renamed from: h */
    public static final m f19432h = new m("DESCRIPTOR_WRITE");

    /* renamed from: i */
    public static final m f19433i = new m("READ_RSSI");

    /* renamed from: j */
    public static final m f19434j = new m("ON_MTU_CHANGED");

    /* renamed from: k */
    public static final m f19435k = new m("CONNECTION_PRIORITY_CHANGE");

    /* renamed from: a */
    public final String f19436a;

    public m(String str) {
        this.f19436a = str;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("BleGattOperation{description='");
        a10.append(this.f19436a);
        a10.append('\'');
        a10.append('}');
        return a10.toString();
    }
}

package fe;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import be.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public final boolean f14238a;

    /* renamed from: b */
    public final boolean f14239b;

    /* renamed from: c */
    public final BluetoothAdapter f14240c;

    /* renamed from: d */
    public boolean f14241d;

    /* renamed from: e */
    public be.d f14242e;

    /* renamed from: f */
    public c.a f14243f;

    public a(Context context) {
        this.f14238a = false;
        this.f14239b = false;
        this.f14238a = rd.b.f25539b;
        this.f14239b = rd.b.f25540c;
        this.f14240c = sd.a.a(context);
    }

    public abstract boolean a();

    public abstract boolean b(be.d dVar);
}

package v8;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a */
    public final IBinder f29168a;

    /* renamed from: b */
    public final String f29169b;

    public a(String str, IBinder iBinder) {
        this.f29168a = iBinder;
        this.f29169b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29168a;
    }
}

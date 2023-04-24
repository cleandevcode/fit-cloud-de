package u8;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a */
    public final IBinder f28641a;

    /* renamed from: b */
    public final String f28642b;

    public a(String str, IBinder iBinder) {
        this.f28641a = iBinder;
        this.f28642b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28641a;
    }
}

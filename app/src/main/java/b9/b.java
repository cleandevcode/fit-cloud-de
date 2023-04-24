package b9;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import d9.k;

/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: a */
    public final h f4038a;

    public b(Context context) {
        super(context);
        this.f4038a = new h(this, context, null);
        setClickable(true);
    }

    public b(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f4038a = new h(this, context, googleMapOptions);
        setClickable(true);
    }

    public final void b(d dVar) {
        boolean z10;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (dVar != null) {
                h hVar = this.f4038a;
                g gVar = hVar.f23955a;
                if (gVar != null) {
                    try {
                        gVar.f4046b.m0(new f(dVar));
                        return;
                    } catch (RemoteException e10) {
                        throw new k(e10);
                    }
                }
                hVar.f4052i.add(dVar);
                return;
            }
            throw new NullPointerException("callback must not be null.");
        }
        throw new IllegalStateException("getMapAsync() must be called on the main thread");
    }
}

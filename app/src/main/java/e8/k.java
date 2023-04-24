package e8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import g8.a;
import h8.g0;

/* loaded from: classes.dex */
public final class k extends l {
    public k(g0 g0Var) {
        super(g0Var);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ g8.h b(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final void i(a.e eVar) {
        g gVar = (g) eVar;
        r rVar = (r) gVar.u();
        j jVar = new j(this);
        GoogleSignInOptions googleSignInOptions = gVar.A;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(rVar.f28642b);
        int i10 = u8.d.f28644a;
        obtain.writeStrongBinder(jVar);
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.f28641a.transact(103, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}

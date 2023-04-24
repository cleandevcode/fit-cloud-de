package e8;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import h8.g0;
import i8.f0;

/* loaded from: classes.dex */
public abstract class o extends u8.b {
    public o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // u8.b
    public final boolean k(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            s sVar = (s) this;
            sVar.a0();
            n.a(sVar.f13503a).b();
        } else {
            s sVar2 = (s) this;
            sVar2.a0();
            b a10 = b.a(sVar2.f13503a);
            GoogleSignInAccount b10 = a10.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f6016l;
            if (b10 != null) {
                googleSignInOptions = a10.c();
            }
            Context context = sVar2.f13503a;
            i8.p.f(googleSignInOptions);
            d8.a aVar = new d8.a(context, googleSignInOptions);
            if (b10 != null) {
                aVar.d();
            } else {
                g0 g0Var = aVar.f15024h;
                Context context2 = aVar.f15017a;
                if (aVar.e() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m.f13499a.a("Signing out", new Object[0]);
                m.b(context2);
                if (z10) {
                    Status status = Status.f6051f;
                    i8.p.g(status, "Result must not be null");
                    BasePendingResult nVar = new h8.n(g0Var);
                    nVar.e(status);
                    basePendingResult = nVar;
                } else {
                    i iVar = new i(g0Var);
                    g0Var.a(iVar);
                    basePendingResult = iVar;
                }
                basePendingResult.a(new f0(basePendingResult, new g9.h(), new i8.g0()));
            }
        }
        return true;
    }
}

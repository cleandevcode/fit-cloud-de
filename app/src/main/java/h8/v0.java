package h8;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import g8.d;
import java.util.Set;

/* loaded from: classes.dex */
public final class v0 extends f9.d implements d.a, d.b {

    /* renamed from: i */
    public static final e9.b f16026i = e9.e.f13506a;

    /* renamed from: b */
    public final Context f16027b;

    /* renamed from: c */
    public final Handler f16028c;

    /* renamed from: d */
    public final e9.b f16029d;

    /* renamed from: e */
    public final Set f16030e;

    /* renamed from: f */
    public final i8.d f16031f;

    /* renamed from: g */
    public e9.f f16032g;

    /* renamed from: h */
    public u0 f16033h;

    public v0(Context context, v8.j jVar, i8.d dVar) {
        e9.b bVar = f16026i;
        this.f16027b = context;
        this.f16028c = jVar;
        this.f16031f = dVar;
        this.f16030e = dVar.f16609b;
        this.f16029d = bVar;
    }

    @Override // h8.c
    public final void a0(int i10) {
        ((i8.b) this.f16032g).o();
    }

    @Override // h8.c
    public final void f0() {
        GoogleSignInAccount googleSignInAccount;
        f9.a aVar = (f9.a) this.f16032g;
        aVar.getClass();
        try {
            Account account = aVar.B.f16608a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = e8.b.a(aVar.f16579c).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = aVar.D;
            i8.p.f(num);
            i8.h0 h0Var = new i8.h0(2, account, num.intValue(), googleSignInAccount);
            f9.f fVar = (f9.f) aVar.u();
            f9.i iVar = new f9.i(1, h0Var);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(fVar.f29169b);
            int i10 = v8.c.f29171a;
            obtain.writeInt(1);
            iVar.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(this);
            Parcel obtain2 = Parcel.obtain();
            fVar.f29168a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f16028c.post(new t0(this, new f9.k(1, new f8.a(8, null), null), 0));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // h8.j
    public final void k(f8.a aVar) {
        ((f0) this.f16033h).b(aVar);
    }
}

package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.x;
import androidx.lifecycle.b0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import e2.a;
import e2.b;
import e8.f;
import e8.n;
import e8.u;
import g8.d;
import java.lang.reflect.Modifier;
import java.util.Set;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends x {

    /* renamed from: y */
    public static boolean f6037y = false;

    /* renamed from: t */
    public boolean f6038t = false;

    /* renamed from: u */
    public SignInConfiguration f6039u;

    /* renamed from: v */
    public boolean f6040v;

    /* renamed from: w */
    public int f6041w;

    /* renamed from: x */
    public Intent f6042x;

    public final void L() {
        b a10 = a.a(this);
        u uVar = new u(this);
        if (!a10.f13322b.f13333e) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                b.a aVar = (b.a) a10.f13322b.f13332d.d(0, null);
                if (aVar == null) {
                    try {
                        a10.f13322b.f13333e = true;
                        Set set = d.f15030a;
                        synchronized (set) {
                        }
                        f fVar = new f(this, set);
                        if (f.class.isMemberClass() && !Modifier.isStatic(f.class.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + fVar);
                        }
                        b.a aVar2 = new b.a(fVar);
                        a10.f13322b.f13332d.e(0, aVar2);
                        a10.f13322b.f13333e = false;
                        androidx.lifecycle.u uVar2 = a10.f13321a;
                        b.C0235b<D> c0235b = new b.C0235b<>(aVar2.f13325n, uVar);
                        aVar2.e(uVar2, c0235b);
                        b0 b0Var = aVar2.f13327p;
                        if (b0Var != null) {
                            aVar2.i(b0Var);
                        }
                        aVar2.f13326o = uVar2;
                        aVar2.f13327p = c0235b;
                    } catch (Throwable th2) {
                        a10.f13322b.f13333e = false;
                        throw th2;
                    }
                } else {
                    androidx.lifecycle.u uVar3 = a10.f13321a;
                    b.C0235b<D> c0235b2 = new b.C0235b<>(aVar.f13325n, uVar);
                    aVar.e(uVar3, c0235b2);
                    b0 b0Var2 = aVar.f13327p;
                    if (b0Var2 != null) {
                        aVar.i(b0Var2);
                    }
                    aVar.f13326o = uVar3;
                    aVar.f13327p = c0235b2;
                }
                f6037y = false;
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void M(int i10) {
        Status status = new Status(i10, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f6037y = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f6038t) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f6033b) != null) {
                n a10 = n.a(this);
                GoogleSignInOptions googleSignInOptions = this.f6039u.f6036b;
                googleSignInAccount.getClass();
                synchronized (a10) {
                    a10.f13501a.d(googleSignInAccount, googleSignInOptions);
                    a10.f13502b = googleSignInAccount;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f6040v = true;
                this.f6041w = i11;
                this.f6042x = intent;
                L();
                return;
            } else if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                M(intExtra);
                return;
            }
        }
        M(8);
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String packageName;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            M(12500);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f6039u = signInConfiguration;
            if (bundle == null) {
                if (f6037y) {
                    setResult(0);
                    M(12502);
                    return;
                }
                f6037y = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    packageName = "com.google.android.gms";
                } else {
                    packageName = getPackageName();
                }
                intent2.setPackage(packageName);
                intent2.putExtra("config", this.f6039u);
                try {
                    startActivityForResult(intent2, 40962);
                    return;
                } catch (ActivityNotFoundException unused) {
                    this.f6038t = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    M(17);
                    return;
                }
            }
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f6040v = z10;
            if (z10) {
                this.f6041w = bundle.getInt("signInResultCode");
                Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
                intent3.getClass();
                this.f6042x = intent3;
                L();
            }
        }
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f6037y = false;
    }

    @Override // androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f6040v);
        if (this.f6040v) {
            bundle.putInt("signInResultCode", this.f6041w);
            bundle.putParcelable("signInResultData", this.f6042x);
        }
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.j0;
import androidx.fragment.app.r;
import androidx.lifecycle.runtime.R;

/* loaded from: classes.dex */
public class o extends r implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: l0 */
    public Handler f2466l0;

    /* renamed from: u0 */
    public boolean f2475u0;

    /* renamed from: w0 */
    public Dialog f2477w0;

    /* renamed from: x0 */
    public boolean f2478x0;

    /* renamed from: y0 */
    public boolean f2479y0;

    /* renamed from: z0 */
    public boolean f2480z0;

    /* renamed from: m0 */
    public a f2467m0 = new a();

    /* renamed from: n0 */
    public b f2468n0 = new b();

    /* renamed from: o0 */
    public c f2469o0 = new c();

    /* renamed from: p0 */
    public int f2470p0 = 0;

    /* renamed from: q0 */
    public int f2471q0 = 0;

    /* renamed from: r0 */
    public boolean f2472r0 = true;

    /* renamed from: s0 */
    public boolean f2473s0 = true;

    /* renamed from: t0 */
    public int f2474t0 = -1;

    /* renamed from: v0 */
    public d f2476v0 = new d();
    public boolean A0 = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            o.this = r1;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            o oVar = o.this;
            oVar.f2469o0.onDismiss(oVar.f2477w0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
            o.this = r1;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            o oVar = o.this;
            Dialog dialog = oVar.f2477w0;
            if (dialog != null) {
                oVar.onCancel(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
            o.this = r1;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            o oVar = o.this;
            Dialog dialog = oVar.f2477w0;
            if (dialog != null) {
                oVar.onDismiss(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.b0<androidx.lifecycle.u> {
        public d() {
            o.this = r1;
        }

        @Override // androidx.lifecycle.b0
        @SuppressLint({"SyntheticAccessor"})
        public final void a(androidx.lifecycle.u uVar) {
            if (uVar != null) {
                o oVar = o.this;
                if (oVar.f2473s0) {
                    View X0 = oVar.X0();
                    if (X0.getParent() == null) {
                        if (o.this.f2477w0 != null) {
                            if (j0.J(3)) {
                                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + o.this.f2477w0);
                            }
                            o.this.f2477w0.setContentView(X0);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends a0 {

        /* renamed from: a */
        public final /* synthetic */ a0 f2485a;

        public e(r.b bVar) {
            o.this = r1;
            this.f2485a = bVar;
        }

        @Override // androidx.fragment.app.a0
        public final View u(int i10) {
            if (this.f2485a.x()) {
                return this.f2485a.u(i10);
            }
            Dialog dialog = o.this.f2477w0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // androidx.fragment.app.a0
        public final boolean x() {
            return this.f2485a.x() || o.this.A0;
        }
    }

    @Override // androidx.fragment.app.r
    public void A0(Context context) {
        super.A0(context);
        this.f2513d0.f(this.f2476v0);
        if (!this.f2480z0) {
            this.f2479y0 = false;
        }
    }

    @Override // androidx.fragment.app.r
    public void B0(Bundle bundle) {
        super.B0(bundle);
        this.f2466l0 = new Handler();
        this.f2473s0 = this.f2539x == 0;
        if (bundle != null) {
            this.f2470p0 = bundle.getInt("android:style", 0);
            this.f2471q0 = bundle.getInt("android:theme", 0);
            this.f2472r0 = bundle.getBoolean("android:cancelable", true);
            this.f2473s0 = bundle.getBoolean("android:showsDialog", this.f2473s0);
            this.f2474t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.r
    public void E0() {
        this.E = true;
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            this.f2478x0 = true;
            dialog.setOnDismissListener(null);
            this.f2477w0.dismiss();
            if (!this.f2479y0) {
                onDismiss(this.f2477w0);
            }
            this.f2477w0 = null;
            this.A0 = false;
        }
    }

    @Override // androidx.fragment.app.r
    public void F0() {
        this.E = true;
        if (!this.f2480z0 && !this.f2479y0) {
            this.f2479y0 = true;
        }
        this.f2513d0.i(this.f2476v0);
    }

    @Override // androidx.fragment.app.r
    public LayoutInflater G0(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater G0 = super.G0(bundle);
        boolean z10 = this.f2473s0;
        if (z10 && !this.f2475u0) {
            if (z10 && !this.A0) {
                try {
                    this.f2475u0 = true;
                    Dialog d12 = d1(bundle);
                    this.f2477w0 = d12;
                    if (this.f2473s0) {
                        g1(d12, this.f2470p0);
                        Context i02 = i0();
                        if (i02 instanceof Activity) {
                            this.f2477w0.setOwnerActivity((Activity) i02);
                        }
                        this.f2477w0.setCancelable(this.f2472r0);
                        this.f2477w0.setOnCancelListener(this.f2468n0);
                        this.f2477w0.setOnDismissListener(this.f2469o0);
                        this.A0 = true;
                    } else {
                        this.f2477w0 = null;
                    }
                } finally {
                    this.f2475u0 = false;
                }
            }
            if (j0.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2477w0;
            if (dialog != null) {
                return G0.cloneInContext(dialog.getContext());
            }
            return G0;
        }
        if (j0.J(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (!this.f2473s0) {
                sb2 = new StringBuilder();
                str = "mShowsDialog = false: ";
            } else {
                sb2 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            }
            sb2.append(str);
            sb2.append(str2);
            Log.d("FragmentManager", sb2.toString());
        }
        return G0;
    }

    @Override // androidx.fragment.app.r
    public void L0(Bundle bundle) {
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f2470p0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2471q0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2472r0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2473s0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2474t0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.r
    public void M0() {
        this.E = true;
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            this.f2478x0 = false;
            dialog.show();
            View decorView = this.f2477w0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.r
    public void N0() {
        this.E = true;
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.r
    public final void P0(Bundle bundle) {
        Bundle bundle2;
        this.E = true;
        if (this.f2477w0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2477w0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.r
    public final void Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Q0(layoutInflater, viewGroup, bundle);
        if (this.H != null || this.f2477w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2477w0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.r
    public final a0 c0() {
        return new e(new r.b());
    }

    public final void c1(boolean z10, boolean z11) {
        if (this.f2479y0) {
            return;
        }
        this.f2479y0 = true;
        this.f2480z0 = false;
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2477w0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f2466l0.getLooper()) {
                    onDismiss(this.f2477w0);
                } else {
                    this.f2466l0.post(this.f2467m0);
                }
            }
        }
        this.f2478x0 = true;
        if (this.f2474t0 >= 0) {
            j0 m02 = m0();
            int i10 = this.f2474t0;
            if (i10 >= 0) {
                m02.w(new j0.o(null, i10), z10);
                this.f2474t0 = -1;
                return;
            }
            throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("Bad id: ", i10));
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(m0());
        aVar.f2578p = true;
        aVar.i(this);
        if (z10) {
            aVar.e(true);
        } else {
            aVar.d();
        }
    }

    public Dialog d1(Bundle bundle) {
        if (j0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.j(V0(), this.f2471q0);
    }

    public final Dialog e1() {
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void f1(boolean z10) {
        this.f2472r0 = z10;
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void g1(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void h1(j0 j0Var, String str) {
        this.f2479y0 = false;
        this.f2480z0 = true;
        j0Var.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var);
        aVar.f2578p = true;
        aVar.g(0, this, str, 1);
        aVar.d();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2478x0) {
            return;
        }
        if (j0.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        c1(true, true);
    }

    @Override // androidx.fragment.app.r
    @Deprecated
    public final void x0() {
        this.E = true;
    }
}

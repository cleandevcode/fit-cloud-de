package n6;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.CustomTabMainActivity;
import com.facebook.common.R;
import kotlin.Metadata;
import n6.p;
import s.r0;

@Metadata
/* loaded from: classes.dex */
public class r extends androidx.fragment.app.r {

    /* renamed from: p0 */
    public static final /* synthetic */ int f22157p0 = 0;

    /* renamed from: l0 */
    public String f22158l0;

    /* renamed from: m0 */
    public p f22159m0;

    /* renamed from: n0 */
    public p.d f22160n0;

    /* renamed from: o0 */
    public View f22161o0;

    /* loaded from: classes.dex */
    public static final class a implements p.a {
        public a() {
            r.this = r1;
        }

        @Override // n6.p.a
        public final void a() {
            View view = r.this.f22161o0;
            if (view != null) {
                view.setVisibility(0);
            } else {
                gm.l.l("progressBar");
                throw null;
            }
        }

        @Override // n6.p.a
        public final void b() {
            View view = r.this.f22161o0;
            if (view != null) {
                view.setVisibility(8);
            } else {
                gm.l.l("progressBar");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        p pVar;
        Bundle bundleExtra;
        super.B0(bundle);
        if (bundle == null) {
            pVar = null;
        } else {
            pVar = (p) bundle.getParcelable("loginClient");
        }
        if (pVar != null) {
            if (pVar.f22113c == null) {
                pVar.f22113c = this;
            } else {
                throw new o5.p("Can't set fragment once it is already set.");
            }
        } else {
            pVar = new p(this);
        }
        this.f22159m0 = pVar;
        c1().f22114d = new r0(7, this);
        androidx.fragment.app.x f02 = f0();
        if (f02 == null) {
            return;
        }
        ComponentName callingActivity = f02.getCallingActivity();
        if (callingActivity != null) {
            this.f22158l0 = callingActivity.getPackageName();
        }
        Intent intent = f02.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f22160n0 = (p.d) bundleExtra.getParcelable("request");
        }
    }

    @Override // androidx.fragment.app.r
    public final View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gm.l.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        gm.l.e(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f22161o0 = findViewById;
        c1().f22115e = new a();
        return inflate;
    }

    @Override // androidx.fragment.app.r
    public final void D0() {
        w g10 = c1().g();
        if (g10 != null) {
            g10.b();
        }
        this.E = true;
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        View findViewById;
        this.E = true;
        View view = this.H;
        if (view == null) {
            findViewById = null;
        } else {
            findViewById = view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00bd  */
    @Override // androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0() {
        /*
            r8 = this;
            r0 = 1
            r8.E = r0
            java.lang.String r1 = r8.f22158l0
            if (r1 != 0) goto L19
            java.lang.String r0 = "LoginFragment"
            java.lang.String r1 = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance."
            android.util.Log.e(r0, r1)
            androidx.fragment.app.x r0 = r8.f0()
            if (r0 != 0) goto L15
            goto L18
        L15:
            r0.finish()
        L18:
            return
        L19:
            n6.p r1 = r8.c1()
            n6.p$d r2 = r8.f22160n0
            n6.p$d r3 = r1.f22117g
            r4 = 0
            if (r3 == 0) goto L2a
            int r5 = r1.f22112b
            if (r5 < 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 != 0) goto Lcd
            if (r2 != 0) goto L31
            goto Lcd
        L31:
            if (r3 != 0) goto Lc5
            java.util.Date r3 = o5.a.f22664l
            boolean r3 = o5.a.c.c()
            if (r3 == 0) goto L43
            boolean r3 = r1.b()
            if (r3 != 0) goto L43
            goto Lcd
        L43:
            r1.f22117g = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            n6.o r5 = r2.f22123a
            n6.y r6 = r2.f22134l
            n6.y r7 = n6.y.INSTAGRAM
            if (r6 != r7) goto L54
            r6 = 1
            goto L55
        L54:
            r6 = 0
        L55:
            if (r6 == 0) goto L65
            boolean r6 = o5.v.f22851o
            if (r6 != 0) goto L81
            boolean r6 = r5.f22110f
            if (r6 == 0) goto L81
            n6.m r6 = new n6.m
            r6.<init>(r1)
            goto L7e
        L65:
            boolean r6 = r5.f22105a
            if (r6 == 0) goto L71
            n6.k r6 = new n6.k
            r6.<init>(r1)
            r3.add(r6)
        L71:
            boolean r6 = o5.v.f22851o
            if (r6 != 0) goto L81
            boolean r6 = r5.f22106b
            if (r6 == 0) goto L81
            n6.n r6 = new n6.n
            r6.<init>(r1)
        L7e:
            r3.add(r6)
        L81:
            boolean r6 = r5.f22109e
            if (r6 == 0) goto L8d
            n6.b r6 = new n6.b
            r6.<init>(r1)
            r3.add(r6)
        L8d:
            boolean r6 = r5.f22107c
            if (r6 == 0) goto L99
            n6.c0 r6 = new n6.c0
            r6.<init>(r1)
            r3.add(r6)
        L99:
            n6.y r2 = r2.f22134l
            if (r2 != r7) goto L9e
            goto L9f
        L9e:
            r0 = 0
        L9f:
            if (r0 != 0) goto Lad
            boolean r0 = r5.f22108d
            if (r0 == 0) goto Lad
            n6.i r0 = new n6.i
            r0.<init>(r1)
            r3.add(r0)
        Lad:
            n6.w[] r0 = new n6.w[r4]
            java.lang.Object[] r0 = r3.toArray(r0)
            if (r0 == 0) goto Lbd
            n6.w[] r0 = (n6.w[]) r0
            r1.f22111a = r0
            r1.j()
            goto Lcd
        Lbd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        Lc5:
            o5.p r0 = new o5.p
            java.lang.String r1 = "Attempted to authorize while a request is pending."
            r0.<init>(r1)
            throw r0
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.r.K0():void");
    }

    @Override // androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        bundle.putParcelable("loginClient", c1());
    }

    public final p c1() {
        p pVar = this.f22159m0;
        if (pVar != null) {
            return pVar;
        }
        gm.l.l("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void y0(int i10, int i11, Intent intent) {
        super.y0(i10, i11, intent);
        p c12 = c1();
        c12.f22121k++;
        if (c12.f22117g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f5823i, false)) {
                c12.j();
                return;
            }
            w g10 = c12.g();
            if (g10 != null) {
                if (!(g10 instanceof n) || intent != null || c12.f22121k >= c12.f22122l) {
                    g10.i(i10, i11, intent);
                }
            }
        }
    }
}

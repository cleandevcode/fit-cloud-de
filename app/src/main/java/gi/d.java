package gi;

import android.accounts.Account;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.data.DataType;
import com.topstep.fitcloudpro.R;
import d7.d;
import e8.m;
import e8.n;
import f.q;
import g9.i;
import g9.s;
import g9.t;
import gm.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import qi.p;

@Metadata
/* loaded from: classes2.dex */
public final class d extends q implements d.a {
    public static final /* synthetic */ int E0 = 0;
    public Button B0;
    public ProgressBar C0;
    public final tl.d D0 = p.d(this);

    /* loaded from: classes2.dex */
    public interface a {
        void U();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Button button;
        int i10;
        View inflate = LayoutInflater.from(V0()).inflate(R.layout.dialog_google_fit, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.btn_action);
        l.e(findViewById, "view.findViewById(R.id.btn_action)");
        this.B0 = (Button) findViewById;
        View findViewById2 = inflate.findViewById(R.id.progress_bar);
        l.e(findViewById2, "view.findViewById(R.id.progress_bar)");
        this.C0 = (ProgressBar) findViewById2;
        final boolean d10 = hh.d.d(V0());
        if (d10) {
            inflate.findViewById(R.id.tv_tips2).setVisibility(8);
            button = this.B0;
            if (button != null) {
                i10 = R.string.google_fit_disconnect;
            } else {
                l.l("btnAction");
                throw null;
            }
        } else {
            button = this.B0;
            if (button != null) {
                i10 = R.string.google_fit_connect;
            } else {
                l.l("btnAction");
                throw null;
            }
        }
        button.setText(i10);
        Button button2 = this.B0;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: gi.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GoogleSignInAccount googleSignInAccount;
                    Account account;
                    Intent a10;
                    final d dVar = d.this;
                    boolean z10 = d10;
                    int i11 = d.E0;
                    l.f(dVar, "this$0");
                    dVar.f1(false);
                    boolean z11 = !z10;
                    Button button3 = dVar.B0;
                    if (button3 != null) {
                        button3.setVisibility(4);
                        ProgressBar progressBar = dVar.C0;
                        if (progressBar != null) {
                            progressBar.setVisibility(0);
                            if (z11) {
                                n a11 = n.a(dVar.V0());
                                synchronized (a11) {
                                    googleSignInAccount = a11.f13502b;
                                }
                                r8.a aVar = new r8.a();
                                aVar.a(DataType.f6085f);
                                aVar.a(DataType.f6086g);
                                aVar.a(DataType.f6084e);
                                aVar.a(DataType.f6087h);
                                aVar.a(DataType.f6088i);
                                ArrayList arrayList = new ArrayList(aVar.f25448a);
                                Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
                                i8.p.g(scopeArr, "Please provide at least one scope");
                                x f02 = dVar.f0();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                if (scopeArr.length > 0) {
                                    hashSet.add(scopeArr[0]);
                                    hashSet.addAll(Arrays.asList(scopeArr));
                                }
                                if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.f6006d)) {
                                    String str = googleSignInAccount.f6006d;
                                    i8.p.f(str);
                                    i8.p.d(str);
                                    account = new Account(str, "com.google");
                                } else {
                                    account = null;
                                }
                                if (hashSet.contains(GoogleSignInOptions.f6019o)) {
                                    Scope scope = GoogleSignInOptions.f6018n;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                d8.a aVar2 = new d8.a(f02, new GoogleSignInOptions(3, new ArrayList(hashSet), account, false, false, false, null, null, hashMap, null));
                                Context context = aVar2.f15017a;
                                int e10 = aVar2.e();
                                int i12 = e10 - 1;
                                if (e10 != 0) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            m.f13499a.a("getNoImplementationSignInIntent()", new Object[0]);
                                            a10 = m.a(context, (GoogleSignInOptions) aVar2.f15020d);
                                            a10.setAction("com.google.android.gms.auth.NO_IMPL");
                                        } else {
                                            a10 = m.a(context, (GoogleSignInOptions) aVar2.f15020d);
                                        }
                                    } else {
                                        m.f13499a.a("getFallbackSignInIntent()", new Object[0]);
                                        a10 = m.a(context, (GoogleSignInOptions) aVar2.f15020d);
                                        a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                                    }
                                    dVar.D(a10, 105);
                                    return;
                                }
                                throw null;
                            }
                            HashSet hashSet2 = new HashSet();
                            HashMap hashMap2 = new HashMap();
                            r8.a aVar3 = new r8.a();
                            aVar3.a(DataType.f6085f);
                            aVar3.a(DataType.f6086g);
                            aVar3.a(DataType.f6084e);
                            aVar3.a(DataType.f6087h);
                            aVar3.a(DataType.f6088i);
                            HashSet hashSet3 = aVar3.f25448a;
                            if (!hashMap2.containsKey(3)) {
                                hashSet2.addAll(new ArrayList(hashSet3));
                                hashMap2.put(3, new e8.a(1, 3, new Bundle()));
                                if (hashSet2.contains(GoogleSignInOptions.f6019o)) {
                                    Scope scope2 = GoogleSignInOptions.f6018n;
                                    if (hashSet2.contains(scope2)) {
                                        hashSet2.remove(scope2);
                                    }
                                }
                                t d11 = new d8.a(dVar.V0(), new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null)).d();
                                g9.d dVar2 = new g9.d() { // from class: gi.b
                                    @Override // g9.d
                                    public final void a(Exception exc) {
                                        d dVar3 = d.this;
                                        int i13 = d.E0;
                                        l.f(dVar3, "this$0");
                                        d7.e.d((d7.e) dVar3.D0.getValue(), R.string.tip_failed, null, 1, 14);
                                    }
                                };
                                d11.getClass();
                                s sVar = i.f15035a;
                                d11.f15058b.a(new g9.n(sVar, dVar2));
                                d11.e();
                                final e eVar = new e(dVar);
                                d11.f15058b.a(new g9.p(sVar, new g9.e() { // from class: gi.c
                                    @Override // g9.e
                                    public final void onSuccess(Object obj) {
                                        fm.l lVar = eVar;
                                        int i13 = d.E0;
                                        l.f(lVar, "$tmp0");
                                        lVar.k(obj);
                                    }
                                }));
                                d11.e();
                                return;
                            }
                            throw new IllegalStateException("Only one extension per type may be added");
                        }
                        l.l("progressBar");
                        throw null;
                    }
                    l.l("btnAction");
                    throw null;
                }
            });
            v9.b bVar = new v9.b(V0(), 0);
            bVar.m(inflate);
            return bVar.a();
        }
        l.l("btnAction");
        throw null;
    }

    @Override // d7.d.a
    public final void g(int i10) {
        c1(false, false);
    }

    @Override // androidx.fragment.app.r
    public final void y0(int i10, int i11, Intent intent) {
        super.y0(i10, i11, intent);
        if (i10 == 105) {
            a aVar = null;
            if (i11 == -1) {
                r rVar = this.f2537v;
                if (rVar instanceof a) {
                    aVar = (a) rVar;
                }
                if (aVar != null) {
                    aVar.U();
                }
                d7.e.h((d7.e) this.D0.getValue(), R.string.tip_success, false, 1, 14);
                return;
            }
            d7.e.d((d7.e) this.D0.getValue(), R.string.tip_failed, null, 1, 14);
        }
    }
}

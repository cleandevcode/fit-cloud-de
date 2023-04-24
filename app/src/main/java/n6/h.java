package n6;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import com.facebook.common.R;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import d6.m0;
import d6.n0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import n6.p;
import o5.f0;
import o5.y;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.o {
    public static final /* synthetic */ int M0 = 0;
    public View B0;
    public TextView C0;
    public TextView D0;
    public i E0;
    public final AtomicBoolean F0 = new AtomicBoolean();
    public volatile o5.c0 G0;
    public volatile ScheduledFuture<?> H0;
    public volatile c I0;
    public boolean J0;
    public boolean K0;
    public p.d L0;

    /* loaded from: classes.dex */
    public static final class a {
        public static final b a(JSONObject jSONObject) {
            boolean z10;
            String optString;
            int i10 = h.M0;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    String optString2 = optJSONObject.optString("permission");
                    gm.l.e(optString2, "permission");
                    if (optString2.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !gm.l.a(optString2, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(optString2);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(optString2);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(optString2);
                        }
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public List<String> f22083a;

        /* renamed from: b */
        public List<String> f22084b;

        /* renamed from: c */
        public List<String> f22085c;

        public b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f22083a = arrayList;
            this.f22084b = arrayList2;
            this.f22085c = arrayList3;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a */
        public String f22086a;

        /* renamed from: b */
        public String f22087b;

        /* renamed from: c */
        public String f22088c;

        /* renamed from: d */
        public long f22089d;

        /* renamed from: e */
        public long f22090e;

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                gm.l.f(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c() {
        }

        public c(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            this.f22086a = parcel.readString();
            this.f22087b = parcel.readString();
            this.f22088c = parcel.readString();
            this.f22089d = parcel.readLong();
            this.f22090e = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            gm.l.f(parcel, "dest");
            parcel.writeString(this.f22086a);
            parcel.writeString(this.f22087b);
            parcel.writeString(this.f22088c);
            parcel.writeLong(this.f22089d);
            parcel.writeLong(this.f22090e);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Dialog {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.x xVar, int i10) {
            super(xVar, i10);
            h.this = r1;
        }

        @Override // android.app.Dialog
        public final void onBackPressed() {
            h.this.getClass();
            super.onBackPressed();
        }
    }

    static {
        new a();
    }

    public static String j1() {
        StringBuilder sb2 = new StringBuilder();
        String str = n0.f12718a;
        sb2.append(o5.v.b());
        sb2.append('|');
        n0.g();
        String str2 = o5.v.f22842f;
        if (str2 != null) {
            sb2.append(str2);
            return sb2.toString();
        }
        throw new o5.p("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @Override // androidx.fragment.app.r
    public final View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        w g10;
        c cVar;
        gm.l.f(layoutInflater, "inflater");
        View C0 = super.C0(layoutInflater, viewGroup, bundle);
        r rVar = (r) ((FacebookActivity) T0()).f5828t;
        if (rVar == null) {
            g10 = null;
        } else {
            g10 = rVar.c1().g();
        }
        this.E0 = (i) g10;
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            q1(cVar);
        }
        return C0;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        this.J0 = true;
        this.F0.set(true);
        super.E0();
        o5.c0 c0Var = this.G0;
        if (c0Var != null) {
            c0Var.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.H0;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        if (this.I0 != null) {
            bundle.putParcelable("request_state", this.I0);
        }
    }

    @Override // androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        d dVar = new d(T0(), R.style.com_facebook_auth_dialog);
        dVar.setContentView(k1(c6.a.c() && !this.K0));
        return dVar;
    }

    public final void i1(String str, b bVar, String str2, Date date, Date date2) {
        i iVar = this.E0;
        if (iVar != null) {
            iVar.e().e(new p.e(iVar.e().f22117g, p.e.a.SUCCESS, new o5.a(str2, o5.v.b(), str, bVar.f22083a, bVar.f22084b, bVar.f22085c, o5.g.f22725f, date, null, date2), null, null));
        }
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View k1(boolean z10) {
        int i10;
        LayoutInflater layoutInflater = T0().getLayoutInflater();
        gm.l.e(layoutInflater, "requireActivity().layoutInflater");
        if (z10) {
            i10 = R.layout.com_facebook_smart_device_dialog_fragment;
        } else {
            i10 = R.layout.com_facebook_device_auth_dialog_fragment;
        }
        View inflate = layoutInflater.inflate(i10, (ViewGroup) null);
        gm.l.e(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        gm.l.e(findViewById, "view.findViewById(R.id.progress_bar)");
        this.B0 = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        if (findViewById2 != null) {
            this.C0 = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.cancel_button);
            if (findViewById3 != null) {
                ((Button) findViewById3).setOnClickListener(new e(0, this));
                View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.D0 = textView;
                    textView.setText(Html.fromHtml(o0(R.string.com_facebook_device_auth_instructions)));
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void l1() {
        if (!this.F0.compareAndSet(false, true)) {
            return;
        }
        c cVar = this.I0;
        if (cVar != null) {
            c6.a aVar = c6.a.f4540a;
            c6.a.a(cVar.f22087b);
        }
        i iVar = this.E0;
        if (iVar != null) {
            iVar.e().e(new p.e(iVar.e().f22117g, p.e.a.CANCEL, null, "User canceled log in.", null));
        }
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void m1(o5.p pVar) {
        if (!this.F0.compareAndSet(false, true)) {
            return;
        }
        c cVar = this.I0;
        if (cVar != null) {
            c6.a aVar = c6.a.f4540a;
            c6.a.a(cVar.f22087b);
        }
        i iVar = this.E0;
        if (iVar != null) {
            p.d dVar = iVar.e().f22117g;
            String message = pVar.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            iVar.e().e(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void n1(String str, long j10, Long l10) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (j10 != 0) {
            date = new Date((j10 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date2 = new Date(l10.longValue() * 1000);
        }
        o5.a aVar = new o5.a(str, o5.v.b(), "0", null, null, null, null, date, null, date2);
        String str2 = o5.y.f22858j;
        o5.y g10 = y.c.g(aVar, "me", new p5.h(this, str, date, date2, 1));
        g10.k(f0.GET);
        g10.f22864d = bundle;
        g10.d();
    }

    public final void o1() {
        c cVar = this.I0;
        if (cVar != null) {
            cVar.f22090e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        c cVar2 = this.I0;
        String str = null;
        if (cVar2 != null) {
            str = cVar2.f22088c;
        }
        bundle.putString("code", str);
        bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, j1());
        String str2 = o5.y.f22858j;
        this.G0 = y.c.i("device/login_status", bundle, new h6.b(1, this)).d();
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        gm.l.f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (this.J0) {
            return;
        }
        l1();
    }

    public final void p1() {
        Long valueOf;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        c cVar = this.I0;
        if (cVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(cVar.f22089d);
        }
        if (valueOf != null) {
            synchronized (i.f22092d) {
                if (i.f22093e == null) {
                    i.f22093e = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = i.f22093e;
                if (scheduledThreadPoolExecutor == null) {
                    gm.l.l("backgroundExecutor");
                    throw null;
                }
            }
            this.H0 = scheduledThreadPoolExecutor.schedule(new androidx.activity.h(7, this), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1(n6.h.c r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.h.q1(n6.h$c):void");
    }

    public final void r1(p.d dVar) {
        String jSONObject;
        this.L0 = dVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", dVar.f22124b));
        m0 m0Var = m0.f12709a;
        m0.I(bundle, "redirect_uri", dVar.f22129g);
        m0.I(bundle, "target_user_id", dVar.f22131i);
        bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, j1());
        c6.a aVar = c6.a.f4540a;
        if (!i6.a.b(c6.a.class)) {
            try {
                HashMap hashMap = new HashMap();
                String str = Build.DEVICE;
                gm.l.e(str, "DEVICE");
                hashMap.put("device", str);
                String str2 = Build.MODEL;
                gm.l.e(str2, "MODEL");
                hashMap.put("model", str2);
                jSONObject = new JSONObject(hashMap).toString();
                gm.l.e(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
            } catch (Throwable th2) {
                i6.a.a(c6.a.class, th2);
            }
            bundle.putString("device_info", jSONObject);
            String str3 = o5.y.f22858j;
            y.c.i("device/login", bundle, new o5.z(1, this)).d();
        }
        jSONObject = null;
        bundle.putString("device_info", jSONObject);
        String str32 = o5.y.f22858j;
        y.c.i("device/login", bundle, new o5.z(1, this)).d();
    }
}

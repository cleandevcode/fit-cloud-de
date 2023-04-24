package n6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import d6.e0;
import java.util.ArrayList;
import n6.p;
import n6.w;
import s.l0;

/* loaded from: classes.dex */
public final class k extends w {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: c */
    public j f22095c;

    /* renamed from: d */
    public final String f22096d;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
        this.f22096d = "get_token";
    }

    public k(p pVar) {
        super(pVar);
        this.f22096d = "get_token";
    }

    @Override // n6.w
    public final void b() {
        j jVar = this.f22095c;
        if (jVar != null) {
            jVar.f12683d = false;
            jVar.f12682c = null;
            this.f22095c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // n6.w
    public final String f() {
        return this.f22096d;
    }

    @Override // n6.w
    public final int o(p.d dVar) {
        int i10;
        boolean z10;
        Context f10 = e().f();
        if (f10 == null) {
            f10 = o5.v.a();
        }
        j jVar = new j(f10, dVar);
        this.f22095c = jVar;
        synchronized (jVar) {
            if (!jVar.f12683d) {
                e0 e0Var = e0.f12668a;
                int i11 = jVar.f12688i;
                if (!i6.a.b(e0.class)) {
                    i10 = e0.f12668a.k(e0.f12670c, new int[]{i11}).f12676b;
                } else {
                    i10 = 0;
                }
                if (i10 != -1) {
                    e0 e0Var2 = e0.f12668a;
                    Intent e10 = e0.e(jVar.f12680a);
                    if (e10 == null) {
                        z10 = false;
                    } else {
                        jVar.f12683d = true;
                        jVar.f12680a.bindService(e10, jVar, 1);
                        z10 = true;
                    }
                }
            }
            z10 = false;
        }
        if (gm.l.a(Boolean.valueOf(z10), Boolean.FALSE)) {
            return 0;
        }
        p.a aVar = e().f22115e;
        if (aVar != null) {
            aVar.a();
        }
        l0 l0Var = new l0(this, dVar, 2);
        j jVar2 = this.f22095c;
        if (jVar2 != null) {
            jVar2.f12682c = l0Var;
        }
        return 1;
    }

    public final void p(Bundle bundle, p.d dVar) {
        p.e eVar;
        o5.a a10;
        String str;
        String string;
        o5.h hVar;
        boolean z10;
        gm.l.f(dVar, "request");
        gm.l.f(bundle, WiseOpenHianalyticsData.UNION_RESULT);
        try {
            a10 = w.a.a(bundle, dVar.f22126d);
            str = dVar.f22137o;
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (o5.p e10) {
            p.d dVar2 = e().f22117g;
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            eVar = new p.e(dVar2, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null);
        }
        if (string != null) {
            boolean z11 = true;
            if (string.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && str != null) {
                if (str.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    try {
                        hVar = new o5.h(string, str);
                        eVar = new p.e(dVar, p.e.a.SUCCESS, a10, hVar, null, null);
                        e().e(eVar);
                    } catch (Exception e11) {
                        throw new o5.p(e11.getMessage());
                    }
                }
            }
        }
        hVar = null;
        eVar = new p.e(dVar, p.e.a.SUCCESS, a10, hVar, null, null);
        e().e(eVar);
    }
}

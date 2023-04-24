package bk;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import hj.p;
import java.util.concurrent.TimeUnit;
import jj.o0;
import p000do.a;
import ph.q;

/* loaded from: classes2.dex */
public abstract class d extends PhoneStateListener {

    /* renamed from: g */
    public static final /* synthetic */ int f4422g = 0;

    /* renamed from: a */
    public final Context f4423a;

    /* renamed from: b */
    public final hj.a f4424b;

    /* renamed from: c */
    public String f4425c;

    /* renamed from: d */
    public String f4426d;

    /* renamed from: e */
    public long f4427e;

    /* renamed from: f */
    public final kj.e f4428f;

    public d(Context context, hj.a aVar) {
        p pVar;
        gm.l.f(context, "context");
        gm.l.f(aVar, "connector");
        this.f4423a = context;
        this.f4424b = aVar;
        if (aVar instanceof p) {
            pVar = (p) aVar;
        } else {
            pVar = null;
        }
        kj.e eVar = pVar != null ? pVar.f16147k : null;
        this.f4428f = eVar;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Telephony");
        bVar.h("mediaMusicController:%s", eVar);
    }

    public final void a(hj.a aVar, int i10) {
        o0 k10 = aVar.k();
        String str = this.f4426d;
        if (str == null) {
            str = this.f4425c;
        }
        new bl.g(k10.b(i10, str, null)).f();
    }

    public abstract boolean b(Context context);

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i10, String str) {
        boolean z10;
        Integer num;
        boolean z11;
        boolean z12;
        boolean z13;
        super.onCallStateChanged(i10, str);
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Telephony");
        bVar.h("onCallStateChanged state:%d phoneNumber:%s", Integer.valueOf(i10), str);
        if (!b(this.f4423a)) {
            return;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    String str2 = this.f4425c;
                    if (str2 != null && str2.length() != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z13) {
                        bVar.t("Fc#Telephony");
                        bVar.h("answered:%s", this.f4425c);
                        a(this.f4424b, 2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (str != null && str.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    String str3 = this.f4425c;
                    if (str3 != null && str3.length() != 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        bVar.t("Fc#Telephony");
                        bVar.h("incoming:%s", str);
                        this.f4425c = str;
                        this.f4426d = m.c(this.f4423a, str);
                        this.f4427e = System.currentTimeMillis();
                        a(this.f4424b, 1);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            kj.e eVar = this.f4428f;
            if (eVar != null) {
                bVar.t("Fc#MediaMusic");
                bVar.h("exit silent_mode", new Object[0]);
                lj.c cVar = eVar.f18613a;
                if (cVar != null && (num = cVar.f20041b) != null) {
                    int intValue = num.intValue();
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (!cVar.f20042c) {
                            cVar.f20040a.adjustStreamVolume(2, 100, 0);
                        }
                        if (!cVar.f20043d) {
                            cVar.f20040a.adjustStreamVolume(3, 100, 0);
                        }
                    }
                    cVar.f20040a.setRingerMode(intValue);
                    cVar.f20041b = null;
                }
            }
            String str4 = this.f4425c;
            if (str4 != null && str4.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                bVar.t("Fc#Telephony");
                bVar.h("rejected:%s", this.f4425c);
                a(this.f4424b, 3);
                if (this.f4424b.o().f17930d.g(288)) {
                    bVar.t("Fc#Telephony");
                    bVar.h("missed:%s", this.f4425c);
                    String str5 = this.f4425c;
                    if (str5 != null) {
                        tk.i.D(3L, TimeUnit.SECONDS).w(sk.c.a()).y(new q(6, new b(this, this.f4427e, str5, this.f4424b, this.f4426d)), new ph.k(8, c.f4421b), yk.a.f31788c);
                    }
                }
            } else {
                return;
            }
        }
        this.f4425c = null;
        this.f4426d = null;
    }
}

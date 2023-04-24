package yb;

import android.content.Context;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yb.j;

/* loaded from: classes.dex */
public final class s implements d0 {

    /* renamed from: a */
    public Context f31381a = y.s();

    /* renamed from: b */
    public String f31382b;

    /* renamed from: c */
    public JSONObject f31383c;

    /* renamed from: d */
    public String f31384d;

    /* renamed from: e */
    public String f31385e;

    /* renamed from: f */
    public String f31386f;

    /* renamed from: g */
    public String f31387g;

    /* renamed from: h */
    public Boolean f31388h;

    public s(String str, JSONObject jSONObject, String str2, String str3, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str4;
        w a10;
        this.f31382b = str;
        this.f31383c = jSONObject;
        this.f31384d = str2;
        this.f31385e = str3;
        this.f31386f = String.valueOf(j10);
        r.a().getClass();
        c0 c0Var = (c0) r.f31378b.get(str2);
        boolean z13 = false;
        if (c0Var != null && (a10 = c0Var.a("oper")) != null) {
            z10 = a10.f31398b;
        } else {
            z10 = false;
        }
        if (z10) {
            if (f.f31298b == null) {
                synchronized (f.class) {
                    if (f.f31298b == null) {
                        f.f31298b = new f();
                    }
                }
            }
            f fVar = f.f31298b;
            if (!fVar.f31299a.containsKey(str2)) {
                fVar.f31299a.put(str2, new j());
            }
            j jVar = (j) fVar.f31299a.get(str2);
            j.a aVar = jVar.f31324c;
            if (aVar == null) {
                m2.f.b("Session is first flush");
                jVar.f31324c = new j.a(j10);
            } else {
                if (j.this.f31323b) {
                    j.this.f31323b = false;
                } else {
                    long j11 = aVar.f31327c;
                    if (j10 - j11 >= j.this.f31322a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(j11);
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(j10);
                        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            aVar.f31327c = j10;
                            aVar.f31326b = false;
                        }
                    }
                }
                m2.f.b("getNewSession() session is flush!");
                String uuid = UUID.randomUUID().toString();
                aVar.f31325a = uuid;
                aVar.f31325a = uuid.replace("-", "");
                aVar.f31325a += "_" + j10;
                aVar.f31327c = j10;
                aVar.f31326b = true;
            }
            j.a aVar2 = jVar.f31324c;
            if (aVar2 == null) {
                m2.f.h("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
                str4 = "";
            } else {
                str4 = aVar2.f31325a;
            }
            this.f31387g = str4;
            j.a aVar3 = jVar.f31324c;
            if (aVar3 == null) {
                m2.f.h("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
            } else {
                z13 = aVar3.f31326b;
            }
            this.f31388h = Boolean.valueOf(z13);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        String valueOf;
        JSONArray jSONArray;
        m2.f.b("Begin to run EventRecordTask...");
        r.a().f31380a.getClass();
        w r10 = y.r(this.f31384d, this.f31385e);
        if (r10 != null) {
            i10 = r10.f31407k;
        } else {
            i10 = 10;
        }
        if (g0.a(this.f31381a, 5242880, "stat_v2_1")) {
            m2.f.b("stat sp file reach max limited size, discard new event");
            n.a().c("", "alltype");
            return;
        }
        h0 h0Var = new h0();
        h0Var.f31311b = this.f31382b;
        h0Var.f31312c = this.f31383c.toString();
        h0Var.f31310a = this.f31385e;
        h0Var.f31313d = this.f31386f;
        h0Var.f31314e = this.f31387g;
        Boolean bool = this.f31388h;
        if (bool == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(bool);
        }
        h0Var.f31315f = valueOf;
        try {
            JSONObject c10 = h0Var.c();
            String e10 = y.e(this.f31384d, this.f31385e);
            String b10 = l.b(this.f31381a, "stat_v2_1", e10);
            try {
                if (!TextUtils.isEmpty(b10)) {
                    jSONArray = new JSONArray(b10);
                } else {
                    jSONArray = new JSONArray();
                }
            } catch (JSONException unused) {
                m2.f.d("Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(c10);
            l.e(this.f31381a, "stat_v2_1", e10, jSONArray.toString());
            if (jSONArray.toString().length() > i10 * DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) {
                n.a().c(this.f31384d, this.f31385e);
            }
        } catch (JSONException unused2) {
            m2.f.e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}

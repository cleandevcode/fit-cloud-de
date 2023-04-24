package com.mob.commons;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.a;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.SharePrefrenceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class w {
    private static w A;
    private SharePrefrenceHelper B;

    /* renamed from: v */
    private static final String f8553v = com.mob.commons.a.d.a("011m>fdgdeeehfd2mm=fdelgh");

    /* renamed from: a */
    public static final String f8532a = com.mob.commons.a.d.a("009OekHjLejee%iXefggeg4f");

    /* renamed from: b */
    public static final String f8533b = com.mob.commons.a.d.a("010Nek_jAejee]iNedLfi6eh8i");

    /* renamed from: c */
    public static final String f8534c = com.mob.commons.a.d.a("010;ek(jWejeeeled%fUeiehZi");

    /* renamed from: d */
    public static final String f8535d = com.mob.commons.a.d.a("009FekOj:ejeeeledfeegfe");

    /* renamed from: e */
    public static final String f8536e = com.mob.commons.a.d.a("010Lek;j0ejeegheledfeegfe");

    /* renamed from: f */
    public static final String f8537f = com.mob.commons.a.d.a("010!ek@j2ejeeeledfe'f,fe_e");

    /* renamed from: g */
    public static final String f8538g = com.mob.commons.a.d.a("018[ekSjVejeeegei]eBeeelCj5em]e1eeDeLfdGe egfe");

    /* renamed from: h */
    public static final String f8539h = com.mob.commons.a.d.a("011AekKjEejeeMffVeeelehghej");

    /* renamed from: i */
    public static final String f8540i = com.mob.commons.a.d.a("011>ek[j@ejeeKff'eeggei,ei");

    /* renamed from: j */
    public static final String f8541j = com.mob.commons.a.d.a("031<ek*jUejeeelPjCem8e<eeed6fYfefdeg-iUeeeg8ff4eeegeh2e'efQkj7ee2e+efGmj");

    /* renamed from: k */
    public static final String f8542k = com.mob.commons.a.d.a("012>ekVj.ejee:jQem?e1eeefelgifd");

    /* renamed from: l */
    public static final String f8543l = com.mob.commons.a.d.a("033+ekHj]ejeeel9jUemNeGee7ijk-eeRjXem^eFeeefelgifdeeed.fGfefdeg+i-ee>eGef;mj");

    /* renamed from: m */
    public static final String f8544m = com.mob.commons.a.d.a("032TekRjXejeeelPjSemAe1eePijk1eeDjAem^e4ee=kQegeieeed>f9fefdeg$i^ee3eZef>mj");

    /* renamed from: n */
    public static final String f8545n = com.mob.commons.a.d.a("025@ek+j*ejeegdedgigiYj>ei>jiSeefefdehegAeReffdelee+miGif");

    /* renamed from: o */
    public static final String f8546o = com.mob.commons.a.d.a("038:ek?j)ejeeel>j)emPe*eeedAfAfefdeg=iQeegdedgigi-j>ei^ji3eefefdehegGeYeffdelee7e1ef=mj");

    /* renamed from: p */
    public static final String f8547p = com.mob.commons.a.d.a("022>ekZjSejeeghef+m(edfeeg!eZfdeieeefelgifdee<miJif");

    /* renamed from: q */
    public static final String f8548q = com.mob.commons.a.d.a("014RgeefgiefeefeegghSe,eeefelgifd");

    /* renamed from: r */
    public static final String f8549r = com.mob.commons.a.d.a("018_ek.j(ejeegeefgiefeefeefgh4e'eeDd3egghLd");

    /* renamed from: s */
    public static final String f8550s = com.mob.commons.a.d.a("030Nek2jLejeeel*j4em1e:eeed4f0fefdeg!iGeegeefgiefeefeefgh7e5ee$eIefXmj");

    /* renamed from: t */
    public static final String f8551t = com.mob.commons.a.d.a("012.ek,j>ejeeghgeefAeBeh8dj!gh");

    /* renamed from: u */
    public static final String f8552u = com.mob.commons.a.d.a("022Xek9jQejeeghgeefFeEehSdjZgheeFe,efHmjMghXe.eg<mf");

    /* renamed from: w */
    private static final String f8554w = com.mob.commons.a.d.a("019-ek.jFejeeeg@ff[eeegehDe5efXkjFeeGeUef@mj");

    /* renamed from: x */
    private static final String f8555x = com.mob.commons.a.d.a("012Uek6jWejeeehVdRegelelSjYfegh");

    /* renamed from: y */
    private static AtomicBoolean f8556y = new AtomicBoolean(false);

    /* renamed from: z */
    private static AtomicBoolean f8557z = new AtomicBoolean(false);

    private w() {
        if (this.B == null) {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
            this.B = sharePrefrenceHelper;
            sharePrefrenceHelper.open(f8553v, 1);
        }
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (A == null) {
                A = new w();
            }
            wVar = A;
        }
        return wVar;
    }

    public static void f() {
        h();
    }

    private static String g() {
        return Data.MD5(DeviceHelper.getInstance(MobSDK.getContext()).getModel());
    }

    private static void h() {
        if (f8557z.compareAndSet(false, true)) {
            new com.mob.tools.utils.f("DS-W") { // from class: com.mob.commons.w.1
                @Override // com.mob.tools.utils.f
                public void a() {
                    Object obj = l.f8441i;
                    synchronized (obj) {
                        try {
                            obj.wait();
                            ConcurrentHashMap<String, Object> e10 = b.e();
                            e10.clear();
                            d.a((ArrayList) e10.get(com.mob.commons.a.d.a("002-feEe")), new com.mob.tools.utils.b<Void>() { // from class: com.mob.commons.w.1.1
                                @Override // com.mob.tools.utils.b
                                public void a(Void r12) {
                                }
                            });
                        }
                    }
                }
            }.start();
        }
    }

    public Object a(String str) {
        return this.B.get(str);
    }

    public void a(a.C0104a c0104a) {
        String str = null;
        if (c0104a != null) {
            try {
                str = c0104a.a();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return;
            }
        }
        a("key_duid_entity", Base64.encodeToString(Data.AES128Encode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), str), 0));
    }

    public void a(a.c cVar) {
        a("key_duid_param_blacklist", cVar != null ? cVar.a() : null);
    }

    public void a(String str, int i10) {
        this.B.putInt(str, Integer.valueOf(i10));
    }

    public void a(String str, long j10) {
        this.B.putLong(str, Long.valueOf(j10));
    }

    public void a(String str, Object obj) {
        this.B.put(str, obj);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.B.remove(str);
        } else {
            this.B.putString(str, str2);
        }
    }

    public void a(HashMap<String, Object> hashMap) {
        a(f8555x, HashonHelper.fromHashMap(hashMap));
    }

    public boolean a(String str, boolean z10) {
        return this.B.getBoolean(str, z10);
    }

    public int b(String str, int i10) {
        return this.B.getInt(str, i10);
    }

    public long b(String str, long j10) {
        return this.B.getLong(str, j10);
    }

    public String b() {
        String b10 = b(f8551t, (String) null);
        if (TextUtils.isEmpty(b10)) {
            return b10;
        }
        try {
            return Data.AES128Decode(g(), Base64.decode(b10, 0));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return b10;
        }
    }

    public String b(String str, String str2) {
        return this.B.getString(str, str2);
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(Data.AES128Encode(g(), str), 0);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        a(f8551t, str);
    }

    public String c(String str, String str2) {
        return b(com.mob.commons.a.d.a("011'ekPj0ejee:i]fd[m@egefelee") + str, str2);
    }

    public HashMap<String, Object> c() {
        String b10 = b(f8555x, (String) null);
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        return HashonHelper.fromJson(b10);
    }

    public a.c d() {
        return a.c.a(b("key_duid_param_blacklist", (String) null));
    }

    public void d(String str, String str2) {
        a(com.mob.commons.a.d.a("011)ekRjNejeeYi,fd4m2egefelee") + str, str2);
    }

    public a.C0104a e() {
        try {
            String b10 = b("key_duid_entity", (String) null);
            if (!TextUtils.isEmpty(b10)) {
                return a.C0104a.a(Data.AES128Decode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), Base64.decode(b10, 0)));
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return null;
    }
}

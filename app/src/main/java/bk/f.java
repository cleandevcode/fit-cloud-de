package bk;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import bk.d;
import p000do.a;
import ph.o;

/* loaded from: classes2.dex */
public abstract class f<T extends d> {

    /* renamed from: a */
    public final Context f4430a;

    /* renamed from: b */
    public final hj.a f4431b;

    /* renamed from: c */
    public final h<T> f4432c;

    /* renamed from: d */
    public final TelephonyManager f4433d;

    /* renamed from: e */
    public SparseArray<T> f4434e;

    /* renamed from: f */
    public T f4435f;

    /* renamed from: g */
    public final al.j f4436g;

    /* renamed from: h */
    public boolean f4437h;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<pj.a, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ f<T> f4438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<T> fVar) {
            super(1);
            this.f4438b = fVar;
        }

        @Override // fm.l
        public final tl.l k(pj.a aVar) {
            String str;
            boolean z10;
            boolean z11;
            byte b10;
            pj.a aVar2 = aVar;
            int i10 = aVar2.f24277a;
            if (i10 == 11) {
                m.a(this.f4438b.f4430a);
            } else if (i10 == 12) {
                Object obj = aVar2.f24278b;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    f<T> fVar = this.f4438b;
                    if (y0.a.a(fVar.f4430a, "android.permission.SEND_SMS") == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    wi.a aVar3 = fVar.f4431b.k().f17951a;
                    byte[] bArr = new byte[1];
                    if (z11) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    bArr[0] = b10;
                    new bl.g(h7.a.s(aVar3, new bj.b((byte) 2, (byte) -106, bArr))).f();
                    if (z11) {
                        m.a(fVar.f4430a);
                        SparseArray<T> sparseArray = fVar.f4434e;
                        if (sparseArray != null) {
                            int size = sparseArray.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                int keyAt = sparseArray.keyAt(i11);
                                T valueAt = sparseArray.valueAt(i11);
                                a.b bVar = p000do.a.f13275a;
                                bVar.t("Fc#Telephony");
                                bVar.h("send sms id:%d number:%s content:%s", Integer.valueOf(keyAt), valueAt.f4425c, str);
                                String str2 = valueAt.f4425c;
                                if (str2 != null) {
                                    m.d(fVar.f4430a, Integer.valueOf(keyAt), str2, str);
                                }
                            }
                        }
                        T t10 = fVar.f4435f;
                        if (t10 != null) {
                            a.b bVar2 = p000do.a.f13275a;
                            bVar2.t("Fc#Telephony");
                            bVar2.h("send sms id:def number:%s content:%s", t10.f4425c, str);
                            String str3 = t10.f4425c;
                            if (str3 != null) {
                                m.d(fVar.f4430a, null, str3, str);
                            }
                        }
                    }
                }
            }
            return tl.l.f28297a;
        }
    }

    public f(Context context, hj.a aVar, h<T> hVar) {
        gm.l.f(context, "context");
        gm.l.f(aVar, "connector");
        this.f4430a = context;
        this.f4431b = aVar;
        this.f4432c = hVar;
        Object systemService = context.getSystemService("phone");
        gm.l.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.f4433d = (TelephonyManager) systemService;
        this.f4436g = aVar.k().a().y(new o(9, new a(this)), yk.a.f31790e, yk.a.f31788c);
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0072 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:49:0x0007, B:53:0x0016, B:60:0x0039, B:62:0x0055, B:64:0x005b, B:66:0x0066, B:72:0x0072, B:73:0x0081, B:75:0x0087, B:76:0x00be, B:78:0x00c2, B:79:0x00df), top: B:84:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.f.a():void");
    }
}

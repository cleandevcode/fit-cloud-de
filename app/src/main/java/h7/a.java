package h7;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.topstep.fitcloudpro.R;
import f5.c;
import f7.e;
import fl.d0;
import fl.q;
import gm.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import lm.h;
import lm.j;
import m5.a;
import qi.p;
import s.p1;
import ul.i;
import ul.s;
import um.g;
import um.x;
import xl.d;
import yi.k;
import za.f;

/* loaded from: classes.dex */
public class a implements c, f, pk.a {

    /* renamed from: a */
    public static final x f15889a = new x("NULL");

    /* renamed from: b */
    public static final x f15890b = new x("UNINITIALIZED");

    /* renamed from: c */
    public static a f15891c;

    public /* synthetic */ a() {
    }

    public /* synthetic */ a(int i10) {
    }

    public static final j A(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            j jVar = j.f20078d;
            return j.f20078d;
        }
        return new j(i10, i11 - 1);
    }

    public static bl.c e() {
        return new bl.c(new k());
    }

    public static final ArrayList f(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ul.f(objArr, true));
    }

    public static final vl.a g(vl.a aVar) {
        if (aVar.f29442e == null) {
            aVar.k();
            aVar.f29441d = true;
            return aVar;
        }
        throw new IllegalStateException();
    }

    public static void h(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final int i(int i10, j jVar) {
        Comparable i11;
        l.f(jVar, "range");
        if (jVar instanceof lm.f) {
            Object valueOf = Integer.valueOf(i10);
            lm.f fVar = (lm.f) jVar;
            l.f(valueOf, "<this>");
            if (!fVar.isEmpty()) {
                if (fVar.e(valueOf, fVar.f()) && !fVar.e(fVar.f(), valueOf)) {
                    valueOf = fVar.f();
                } else if (fVar.e(fVar.i(), valueOf) && !fVar.e(valueOf, fVar.i())) {
                    valueOf = fVar.i();
                }
                return ((Number) valueOf).intValue();
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
        } else if (!jVar.isEmpty()) {
            if (i10 < ((Number) jVar.f()).intValue()) {
                i11 = jVar.f();
            } else if (i10 > ((Number) jVar.i()).intValue()) {
                i11 = jVar.i();
            } else {
                return i10;
            }
            return ((Number) i11).intValue();
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + jVar + '.');
        }
    }

    public static Application j(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static final int k(List list) {
        l.f(list, "<this>");
        return list.size() - 1;
    }

    public static final pm.j l(d dVar) {
        if (dVar instanceof g) {
            pm.j m10 = ((g) dVar).m();
            if (m10 != null) {
                if (!m10.B()) {
                    m10 = null;
                }
                if (m10 != null) {
                    return m10;
                }
            }
            return new pm.j(2, dVar);
        }
        return new pm.j(1, dVar);
    }

    public static final boolean m(nj.c cVar, int i10) {
        l.f(cVar, "<this>");
        return (cVar.e() || cVar.g(i10)) ? false : true;
    }

    public static boolean n(Context context) {
        l.f(context, "context");
        return o(e.b(context));
    }

    public static boolean o(Locale locale) {
        if (l.a(locale.getLanguage(), Locale.CHINESE.getLanguage())) {
            String locale2 = locale.toString();
            l.e(locale2, "locale.toString()");
            if (om.l.c0(locale2, "Hans", true)) {
                return true;
            }
            String country = locale.getCountry();
            if (TextUtils.isEmpty(country)) {
                return true;
            }
            l.e(country, "country");
            Locale locale3 = Locale.US;
            l.e(locale3, "US");
            String upperCase = country.toUpperCase(locale3);
            l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return l.a(upperCase, "CN");
        }
        return false;
    }

    public static final List p(Object obj) {
        List singletonList = Collections.singletonList(obj);
        l.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List q(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length > 0 ? i.t(objArr) : s.f28879a;
    }

    public static final ArrayList r(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ul.f(objArr, true));
    }

    public static final d0 s(wi.a aVar, bj.b bVar) {
        l.f(aVar, "<this>");
        l.f(bVar, "send");
        return new d0(((wi.k) aVar).i(new ti.e(bVar)));
    }

    public static final tk.i t(wi.a aVar) {
        l.f(aVar, "<this>");
        ql.b<Object> bVar = ((wi.k) aVar).f29910r;
        l.e(bVar, "messageSubject");
        tk.i<R> u10 = bVar.u(new wk.e() { // from class: jj.e
            @Override // wk.e
            public final Object apply(Object obj) {
                gm.l.d(obj, "null cannot be cast to non-null type com.topstep.fitcloud.sdk.v2.model.message.FcMessageInfo");
                return (pj.a) obj;
            }
        });
        l.e(u10, "observerMessage().map {\n…it as FcMessageInfo\n    }");
        return u10;
    }

    public static final List u(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : p(list.get(0)) : s.f28879a;
    }

    public static final void v(d7.e eVar, Context context, Throwable th2) {
        int i10;
        String string;
        l.f(eVar, "<this>");
        l.f(th2, "throwable");
        p000do.a.f13275a.q(th2);
        if (th2 instanceof yi.c) {
            yi.c cVar = (yi.c) th2;
            int i11 = cVar.f31772a;
            int i12 = cVar.f31773b;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4 && i12 == 2) {
                            i10 = R.string.ds_dfu_error_device_not_found;
                        }
                        i10 = 0;
                    } else if (i12 != 2) {
                        if (i12 == 3) {
                            i10 = R.string.device_state_disconnected;
                        }
                        i10 = 0;
                    } else {
                        i10 = R.string.ds_dfu_error_low_battery;
                    }
                } else {
                    if (i12 == 2) {
                        i10 = R.string.tip_download_failed;
                    }
                    i10 = 0;
                }
            } else if (i12 != 2) {
                if (i12 == 4) {
                    i10 = R.string.ds_dfu_error_insufficient_storage;
                }
                i10 = 0;
            } else {
                i10 = R.string.device_state_bt_disabled;
            }
            if (i10 != 0) {
                string = context.getString(R.string.ds_push_fail, context.getString(i10));
            } else {
                string = context.getString(R.string.ds_push_fail, p1.a("errorType:", i11, " errorCode", i12));
            }
            d7.e.e(eVar, string);
            return;
        }
        p.f(eVar, th2);
    }

    public static final q w(wi.a aVar, bj.b bVar, bj.b bVar2) {
        l.f(aVar, "<this>");
        return new q(((wi.k) aVar).i(new ti.i(bVar, bVar2)));
    }

    public static final h x(h hVar, int i10) {
        boolean z10;
        l.f(hVar, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer valueOf = Integer.valueOf(i10);
        l.f(valueOf, "step");
        if (z10) {
            int i11 = hVar.f20071a;
            int i12 = hVar.f20072b;
            if (hVar.f20073c <= 0) {
                i10 = -i10;
            }
            return new h(i11, i12, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static void y(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static final void z() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @Override // pk.a
    public void a(pn.e eVar) {
        gm.j.e("ThingCommunicate", "sdk version reply success...");
    }

    @Override // pk.a
    public void b(pn.e eVar, Exception exc) {
        gm.j.e("ThingCommunicate", "onFailure ===> " + exc);
    }

    @Override // f5.c
    public t4.x c(t4.x xVar, r4.h hVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((e5.c) xVar.get()).f13443a.f13453a.f13455a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = m5.a.f20355a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f20358a == 0 && bVar.f20359b == bVar.f20360c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new b5.b(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0426  */
    @Override // za.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bb.b d(java.lang.String r18, za.a r19, java.util.EnumMap r20) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.d(java.lang.String, za.a, java.util.EnumMap):bb.b");
    }

    public /* synthetic */ a(Object obj) {
    }
}

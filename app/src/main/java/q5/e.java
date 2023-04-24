package q5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import om.l;
import p5.r;
import t.n;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e */
    public static final HashMap f24597e;

    /* renamed from: c */
    public final WeakReference<Activity> f24600c;

    /* renamed from: a */
    public final LinkedHashSet f24598a = new LinkedHashSet();

    /* renamed from: b */
    public final Handler f24599b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final AtomicBoolean f24601d = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0042, code lost:
            if (r4.equals("r5") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x004b, code lost:
            if (r4.equals("r4") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x004e, code lost:
            r0 = java.util.regex.Pattern.compile("[^a-z]+");
            gm.l.e(r0, "compile(pattern)");
            r5 = r0.matcher(r5).replaceAll("");
            gm.l.e(r5, "nativePattern.matcher(in…).replaceAll(replacement)");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void a(java.util.HashMap r3, java.lang.String r4, java.lang.String r5) {
            /*
                java.util.HashMap r0 = q5.e.f24597e
                int r0 = r4.hashCode()
                r1 = 0
                switch(r0) {
                    case 3585: goto L69;
                    case 3586: goto L45;
                    case 3587: goto L3c;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L8f
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L16
                goto L8f
            L16:
                java.lang.String r0 = "-"
                boolean r2 = om.l.c0(r5, r0, r1)
                if (r2 == 0) goto L8f
                om.c r2 = new om.c
                r2.<init>(r0)
                java.util.List r5 = r2.a(r5)
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                if (r5 == 0) goto L34
                java.lang.String[] r5 = (java.lang.String[]) r5
                r5 = r5[r1]
                goto L8f
            L34:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
                r3.<init>(r4)
                throw r3
            L3c:
                java.lang.String r0 = "r5"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L4e
                goto L8f
            L45:
                java.lang.String r0 = "r4"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L4e
                goto L8f
            L4e:
                java.lang.String r0 = "[^a-z]+"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.lang.String r1 = "compile(pattern)"
                gm.l.e(r0, r1)
                java.util.regex.Matcher r5 = r0.matcher(r5)
                java.lang.String r0 = ""
                java.lang.String r5 = r5.replaceAll(r0)
                java.lang.String r0 = "nativePattern.matcher(in…).replaceAll(replacement)"
                gm.l.e(r5, r0)
                goto L8f
            L69:
                java.lang.String r0 = "r3"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L72
                goto L8f
            L72:
                java.lang.String r0 = "m"
                boolean r2 = om.h.a0(r5, r0, r1)
                if (r2 != 0) goto L8e
                java.lang.String r2 = "b"
                boolean r2 = om.h.a0(r5, r2, r1)
                if (r2 != 0) goto L8e
                java.lang.String r2 = "ge"
                boolean r5 = om.h.a0(r5, r2, r1)
                if (r5 == 0) goto L8b
                goto L8e
            L8b:
                java.lang.String r5 = "f"
                goto L8f
            L8e:
                r5 = r0
            L8f:
                r3.put(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.e.a.a(java.util.HashMap, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(android.app.Activity r3) {
            /*
                java.lang.String r0 = "activity"
                gm.l.f(r3, r0)
                int r0 = r3.hashCode()
                java.lang.Class<q5.e> r1 = q5.e.class
                boolean r1 = i6.a.b(r1)
                if (r1 == 0) goto L12
                goto L1b
            L12:
                java.util.HashMap r1 = q5.e.f24597e     // Catch: java.lang.Throwable -> L15
                goto L1c
            L15:
                r1 = move-exception
                java.lang.Class<q5.e> r2 = q5.e.class
                i6.a.a(r2, r1)
            L1b:
                r1 = 0
            L1c:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r2 = r1.get(r0)
                if (r2 != 0) goto L2e
                q5.e r2 = new q5.e
                r2.<init>(r3)
                r1.put(r0, r2)
            L2e:
                q5.e r2 = (q5.e) r2
                java.lang.Class<q5.e> r3 = q5.e.class
                boolean r3 = i6.a.b(r3)
                if (r3 == 0) goto L39
                goto L74
            L39:
                boolean r3 = i6.a.b(r2)     // Catch: java.lang.Throwable -> L6e
                if (r3 == 0) goto L40
                goto L74
            L40:
                java.util.concurrent.atomic.AtomicBoolean r3 = r2.f24601d     // Catch: java.lang.Throwable -> L69
                r0 = 1
                boolean r3 = r3.getAndSet(r0)     // Catch: java.lang.Throwable -> L69
                if (r3 == 0) goto L4a
                goto L74
            L4a:
                int r3 = x5.e.f30297a     // Catch: java.lang.Throwable -> L69
                java.lang.ref.WeakReference<android.app.Activity> r3 = r2.f24600c     // Catch: java.lang.Throwable -> L69
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L69
                android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L69
                android.view.View r3 = x5.e.b(r3)     // Catch: java.lang.Throwable -> L69
                if (r3 != 0) goto L5b
                goto L74
            L5b:
                android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()     // Catch: java.lang.Throwable -> L69
                boolean r0 = r3.isAlive()     // Catch: java.lang.Throwable -> L69
                if (r0 == 0) goto L74
                r3.addOnGlobalFocusChangeListener(r2)     // Catch: java.lang.Throwable -> L69
                goto L74
            L69:
                r3 = move-exception
                i6.a.a(r2, r3)     // Catch: java.lang.Throwable -> L6e
                goto L74
            L6e:
                r3 = move-exception
                java.lang.Class<q5.e> r0 = q5.e.class
                i6.a.a(r0, r3)
            L74:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.e.a.b(android.app.Activity):void");
        }
    }

    static {
        new a();
        f24597e = new HashMap();
    }

    public e(Activity activity) {
        this.f24600c = new WeakReference<>(activity);
    }

    public final void a(View view) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            n nVar = new n(view, this, 10);
            if (!i6.a.b(this)) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    nVar.run();
                } else {
                    this.f24599b.post(nVar);
                }
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void b(View view) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        boolean z12;
        if (i6.a.b(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj != null) {
                String obj2 = l.x0(obj).toString();
                if (obj2 != null) {
                    String lowerCase = obj2.toLowerCase();
                    gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (lowerCase.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !this.f24598a.contains(lowerCase) && lowerCase.length() <= 100) {
                        this.f24598a.add(lowerCase);
                        HashMap hashMap = new HashMap();
                        ArrayList b10 = c.b(view);
                        CopyOnWriteArraySet copyOnWriteArraySet = d.f24593d;
                        Iterator it = new HashSet(d.a()).iterator();
                        ArrayList arrayList3 = null;
                        while (it.hasNext()) {
                            d dVar = (d) it.next();
                            if (gm.l.a("r2", dVar.b())) {
                                Pattern compile = Pattern.compile("[^\\d.]");
                                gm.l.e(compile, "compile(pattern)");
                                str = compile.matcher(lowerCase).replaceAll("");
                                gm.l.e(str, "nativePattern.matcher(in…).replaceAll(replacement)");
                            } else {
                                str = lowerCase;
                            }
                            if (i6.a.b(dVar)) {
                                str2 = null;
                            } else {
                                str2 = dVar.f24595b;
                            }
                            if (str2.length() > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                c cVar = c.f24592a;
                                if (i6.a.b(dVar)) {
                                    str3 = null;
                                } else {
                                    str3 = dVar.f24595b;
                                }
                                if (!i6.a.b(c.class)) {
                                    gm.l.f(str3, "rule");
                                    Pattern compile2 = Pattern.compile(str3);
                                    gm.l.e(compile2, "compile(pattern)");
                                    z12 = compile2.matcher(str).matches();
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                }
                            }
                            c cVar2 = c.f24592a;
                            if (i6.a.b(dVar)) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(dVar.f24596c);
                            }
                            if (!c.d(b10, arrayList)) {
                                if (arrayList3 == null) {
                                    arrayList3 = c.a(view);
                                }
                                if (i6.a.b(dVar)) {
                                    arrayList2 = null;
                                } else {
                                    arrayList2 = new ArrayList(dVar.f24596c);
                                }
                                if (c.d(arrayList3, arrayList2)) {
                                }
                            }
                            a.a(hashMap, dVar.b(), str);
                        }
                        r.a.a(hashMap);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (i6.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}

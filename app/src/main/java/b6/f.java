package b6;

import android.view.View;
import cn.sharesdk.framework.InnerShareParams;
import d6.m0;
import gm.l;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import om.h;
import org.json.JSONObject;
import y.g0;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: e */
    public static final HashSet f4019e;

    /* renamed from: a */
    public final View.OnClickListener f4020a;

    /* renamed from: b */
    public final WeakReference<View> f4021b;

    /* renamed from: c */
    public final WeakReference<View> f4022c;

    /* renamed from: d */
    public final String f4023d;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:35:0x0023 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final boolean a(java.lang.String r3, java.lang.String r4) {
            /*
                java.util.HashSet r0 = b6.f.f4019e
                b6.b r0 = b6.b.f4005a
                java.lang.Class<b6.b> r0 = b6.b.class
                boolean r1 = i6.a.b(r0)
                if (r1 == 0) goto Ld
                goto L20
            Ld:
                java.util.LinkedHashMap r1 = b6.b.f4006b     // Catch: java.lang.Throwable -> L1c
                boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L1c
                if (r2 == 0) goto L20
                java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1c
                goto L21
            L1c:
                r3 = move-exception
                i6.a.a(r0, r3)
            L20:
                r3 = 0
            L21:
                if (r3 != 0) goto L25
                r3 = 0
                goto L36
            L25:
                java.lang.String r0 = "other"
                boolean r0 = gm.l.a(r3, r0)
                if (r0 != 0) goto L35
                s.u r0 = new s.u
                r0.<init>(r3, r4)
                d6.m0.M(r0)
            L35:
                r3 = 1
            L36:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: b6.f.a.a(java.lang.String, java.lang.String):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0073 A[Catch: all -> 0x0055, Exception -> 0x007e, TRY_ENTER, TryCatch #7 {Exception -> 0x007e, all -> 0x0055, blocks: (B:71:0x003a, B:72:0x0046, B:83:0x0060, B:84:0x0066, B:89:0x0073, B:90:0x0077), top: B:111:0x003a }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(android.view.View r5, android.view.View r6, java.lang.String r7) {
            /*
                java.lang.String r0 = "hostView"
                gm.l.f(r5, r0)
                int r0 = r5.hashCode()
                java.util.HashSet r1 = b6.f.f4019e
                java.lang.Class<b6.f> r1 = b6.f.class
                boolean r1 = i6.a.b(r1)
                r2 = 0
                if (r1 == 0) goto L16
            L14:
                r1 = r2
                goto L20
            L16:
                java.util.HashSet r1 = b6.f.f4019e     // Catch: java.lang.Throwable -> L19
                goto L20
            L19:
                r1 = move-exception
                java.lang.Class<b6.f> r3 = b6.f.class
                i6.a.a(r3, r1)
                goto L14
            L20:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                boolean r1 = r1.contains(r3)
                if (r1 != 0) goto L97
                t5.f r1 = t5.f.f27790a
                b6.f r1 = new b6.f
                r1.<init>(r5, r6, r7)
                java.lang.Class<t5.f> r6 = t5.f.class
                boolean r7 = i6.a.b(r6)
                if (r7 == 0) goto L3a
                goto L7e
            L3a:
                java.lang.String r7 = "android.view.View"
                java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L57 java.lang.Exception -> L7e
                java.lang.String r3 = "mListenerInfo"
                java.lang.reflect.Field r7 = r7.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L57 java.lang.Exception -> L7e
                java.lang.String r3 = "android.view.View$ListenerInfo"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.lang.Exception -> L7e
                java.lang.String r4 = "mOnClickListener"
                java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.lang.Exception -> L7e
                goto L5a
            L53:
                goto L59
            L55:
                r5 = move-exception
                goto L7b
            L57:
                r7 = r2
            L59:
                r3 = r2
            L5a:
                if (r7 == 0) goto L77
                if (r3 != 0) goto L5f
                goto L77
            L5f:
                r4 = 1
                r7.setAccessible(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L7e
                r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L7e
                r7.setAccessible(r4)     // Catch: java.lang.Throwable -> L55 java.lang.IllegalAccessException -> L6e java.lang.Exception -> L7e
                java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L55 java.lang.IllegalAccessException -> L6e java.lang.Exception -> L7e
                goto L70
            L6e:
                r7 = r2
            L70:
                if (r7 != 0) goto L73
                goto L77
            L73:
                r3.set(r7, r1)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L7e
                goto L7e
            L77:
                r5.setOnClickListener(r1)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L7e
                goto L7e
            L7b:
                i6.a.a(r6, r5)
            L7e:
                java.lang.Class<b6.f> r5 = b6.f.class
                boolean r5 = i6.a.b(r5)
                if (r5 == 0) goto L87
                goto L90
            L87:
                java.util.HashSet r2 = b6.f.f4019e     // Catch: java.lang.Throwable -> L8a
                goto L90
            L8a:
                r5 = move-exception
                java.lang.Class<b6.f> r6 = b6.f.class
                i6.a.a(r6, r5)
            L90:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r2.add(r5)
            L97:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b6.f.a.b(android.view.View, android.view.View, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void c(java.lang.String r7, java.lang.String r8, float[] r9) {
            /*
                java.lang.Class<b6.d> r0 = b6.d.class
                b6.d r1 = b6.d.f4011a
                boolean r1 = i6.a.b(r0)
                r2 = 0
                java.lang.String r3 = "event"
                if (r1 == 0) goto Le
                goto L1c
            Le:
                gm.l.f(r7, r3)     // Catch: java.lang.Throwable -> L18
                java.util.LinkedHashSet r1 = b6.d.f4013c     // Catch: java.lang.Throwable -> L18
                boolean r1 = r1.contains(r7)     // Catch: java.lang.Throwable -> L18
                goto L1d
            L18:
                r1 = move-exception
                i6.a.a(r0, r1)
            L1c:
                r1 = 0
            L1d:
                r4 = 0
                if (r1 == 0) goto L4d
                android.content.Context r9 = o5.v.a()
                p5.m r0 = new p5.m
                r0.<init>(r9, r4)
                boolean r9 = i6.a.b(r0)
                if (r9 == 0) goto L31
                goto Lc8
            L31:
                android.os.Bundle r9 = new android.os.Bundle     // Catch: java.lang.Throwable -> L47
                r9.<init>()     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "_is_suggested_event"
                java.lang.String r2 = "1"
                r9.putString(r1, r2)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "_button_text"
                r9.putString(r1, r8)     // Catch: java.lang.Throwable -> L47
                r0.d(r9, r7)     // Catch: java.lang.Throwable -> L47
                goto Lc8
            L47:
                r7 = move-exception
                i6.a.a(r0, r7)
                goto Lc8
            L4d:
                b6.d r1 = b6.d.f4011a
                boolean r1 = i6.a.b(r0)
                if (r1 == 0) goto L56
                goto L64
            L56:
                gm.l.f(r7, r3)     // Catch: java.lang.Throwable -> L60
                java.util.LinkedHashSet r1 = b6.d.f4014d     // Catch: java.lang.Throwable -> L60
                boolean r0 = r1.contains(r7)     // Catch: java.lang.Throwable -> L60
                goto L65
            L60:
                r1 = move-exception
                i6.a.a(r0, r1)
            L64:
                r0 = 0
            L65:
                if (r0 == 0) goto Lc8
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "event_name"
                r0.putString(r1, r7)     // Catch: org.json.JSONException -> Lc8
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc8
                r7.<init>()     // Catch: org.json.JSONException -> Lc8
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lc8
                r1.<init>()     // Catch: org.json.JSONException -> Lc8
                int r3 = r9.length     // Catch: org.json.JSONException -> Lc8
                r5 = 0
            L7d:
                if (r5 >= r3) goto L8c
                r6 = r9[r5]     // Catch: org.json.JSONException -> Lc8
                int r5 = r5 + 1
                r1.append(r6)     // Catch: org.json.JSONException -> Lc8
                java.lang.String r6 = ","
                r1.append(r6)     // Catch: org.json.JSONException -> Lc8
                goto L7d
            L8c:
                java.lang.String r9 = "dense"
                java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> Lc8
                r7.put(r9, r1)     // Catch: org.json.JSONException -> Lc8
                java.lang.String r9 = "button_text"
                r7.put(r9, r8)     // Catch: org.json.JSONException -> Lc8
                java.lang.String r8 = "metadata"
                java.lang.String r7 = r7.toString()     // Catch: org.json.JSONException -> Lc8
                r0.putString(r8, r7)     // Catch: org.json.JSONException -> Lc8
                java.lang.String r7 = o5.y.f22858j     // Catch: org.json.JSONException -> Lc8
                java.util.Locale r7 = java.util.Locale.US     // Catch: org.json.JSONException -> Lc8
                java.lang.String r8 = "%s/suggested_events"
                r9 = 1
                java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch: org.json.JSONException -> Lc8
                java.lang.String r3 = o5.v.b()     // Catch: org.json.JSONException -> Lc8
                r1[r2] = r3     // Catch: org.json.JSONException -> Lc8
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r1, r9)     // Catch: org.json.JSONException -> Lc8
                java.lang.String r7 = java.lang.String.format(r7, r8, r9)     // Catch: org.json.JSONException -> Lc8
                java.lang.String r8 = "java.lang.String.format(locale, format, *args)"
                gm.l.e(r7, r8)     // Catch: org.json.JSONException -> Lc8
                o5.y r7 = o5.y.c.h(r4, r7, r4, r4)     // Catch: org.json.JSONException -> Lc8
                r7.f22864d = r0     // Catch: org.json.JSONException -> Lc8
                r7.c()     // Catch: org.json.JSONException -> Lc8
            Lc8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b6.f.a.c(java.lang.String, java.lang.String, float[]):void");
        }
    }

    static {
        new a();
        f4019e = new HashSet();
    }

    public f(View view, View view2, String str) {
        this.f4020a = t5.f.e(view);
        this.f4021b = new WeakReference<>(view2);
        this.f4022c = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f4023d = h.Y(lowerCase, InnerShareParams.ACTIVITY, "");
    }

    public final void a() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            View view = this.f4021b.get();
            View view2 = this.f4022c.get();
            if (view != null && view2 != null) {
                try {
                    String d10 = c.d(view2);
                    String b10 = b.b(view2, d10);
                    if (b10 == null || a.a(b10, d10)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f4023d);
                    if (!i6.a.b(this)) {
                        try {
                            m0.M(new g0(jSONObject, d10, this, b10, 1));
                        } catch (Throwable th2) {
                            i6.a.a(this, th2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th3) {
            i6.a.a(this, th3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            l.f(view, "view");
            View.OnClickListener onClickListener = this.f4020a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}

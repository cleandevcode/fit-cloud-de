package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import q2.a;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: f */
    public static final Class<? extends Object>[] f2738f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final LinkedHashMap f2739a;

    /* renamed from: b */
    public final LinkedHashMap f2740b;

    /* renamed from: c */
    public final LinkedHashMap f2741c;

    /* renamed from: d */
    public final LinkedHashMap f2742d;

    /* renamed from: e */
    public final a.b f2743e;

    /* loaded from: classes.dex */
    public static final class a {
        public static l0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new l0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    gm.l.e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new l0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new l0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    public l0() {
        this.f2739a = new LinkedHashMap();
        this.f2740b = new LinkedHashMap();
        this.f2741c = new LinkedHashMap();
        this.f2742d = new LinkedHashMap();
        this.f2743e = new a.b() { // from class: androidx.lifecycle.k0
            @Override // q2.a.b
            public final Bundle a() {
                return l0.a(l0.this);
            }
        };
    }

    public l0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2739a = linkedHashMap;
        this.f2740b = new LinkedHashMap();
        this.f2741c = new LinkedHashMap();
        this.f2742d = new LinkedHashMap();
        this.f2743e = new a.b() { // from class: androidx.lifecycle.k0
            @Override // q2.a.b
            public final Bundle a() {
                return l0.a(l0.this);
            }
        };
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(l0 l0Var) {
        gm.l.f(l0Var, "this$0");
        for (Map.Entry entry : ul.z.E(l0Var.f2740b).entrySet()) {
            l0Var.d((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        Set<String> keySet = l0Var.f2739a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(l0Var.f2739a.get(str));
        }
        return tb.a.e(new tl.f("keys", arrayList), new tl.f("values", arrayList2));
    }

    public final boolean b(String str) {
        return this.f2739a.containsKey(str);
    }

    public final <T> T c(String str) {
        return (T) this.f2739a.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void d(java.lang.String r6, T r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            gm.l.f(r6, r0)
            r0 = 0
            if (r7 != 0) goto L9
            goto L1b
        L9:
            java.lang.Class<? extends java.lang.Object>[] r1 = androidx.lifecycle.l0.f2738f
            r2 = 29
            r3 = 0
        Le:
            if (r3 >= r2) goto L20
            r4 = r1[r3]
            gm.l.c(r4)
            boolean r4 = r4.isInstance(r7)
            if (r4 == 0) goto L1d
        L1b:
            r0 = 1
            goto L20
        L1d:
            int r3 = r3 + 1
            goto Le
        L20:
            if (r0 == 0) goto L4a
            java.util.LinkedHashMap r0 = r5.f2741c
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof androidx.lifecycle.a0
            if (r1 == 0) goto L2f
            androidx.lifecycle.a0 r0 = (androidx.lifecycle.a0) r0
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L36
            r0.j(r7)
            goto L3b
        L36:
            java.util.LinkedHashMap r0 = r5.f2739a
            r0.put(r6, r7)
        L3b:
            java.util.LinkedHashMap r0 = r5.f2742d
            java.lang.Object r6 = r0.get(r6)
            sm.r0 r6 = (sm.r0) r6
            if (r6 != 0) goto L46
            goto L49
        L46:
            r6.setValue(r7)
        L49:
            return
        L4a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't put value with type "
            r0.append(r1)
            gm.l.c(r7)
            java.lang.Class r7 = r7.getClass()
            r0.append(r7)
            java.lang.String r7 = " into saved state"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l0.d(java.lang.String, java.lang.Object):void");
    }
}

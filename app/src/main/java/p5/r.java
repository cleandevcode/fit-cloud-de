package p5;

import android.content.Context;
import android.os.Bundle;
import d6.m0;
import ih.v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o5.q0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    public final m f23939a;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(HashMap hashMap) {
            String[] strArr;
            boolean z10;
            int i10;
            boolean z11;
            u uVar = u.f23947a;
            if (!i6.a.b(u.class)) {
                try {
                    if (!u.f23950d.get()) {
                        u.f23947a.b();
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        m0 m0Var = m0.f12709a;
                        u uVar2 = u.f23947a;
                        int i11 = 1;
                        int length = str2.length() - 1;
                        int i12 = 0;
                        boolean z12 = false;
                        while (i12 <= length) {
                            if (!z12) {
                                i10 = i12;
                            } else {
                                i10 = length;
                            }
                            if (gm.l.h(str2.charAt(i10), 32) <= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z12) {
                                if (!z11) {
                                    z12 = true;
                                } else {
                                    i12++;
                                }
                            } else if (!z11) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        String O = m0.O(uVar2.c(str, str2.subSequence(i12, length + 1).toString()));
                        ConcurrentHashMap<String, String> concurrentHashMap = u.f23952f;
                        if (concurrentHashMap.containsKey(str)) {
                            String str3 = concurrentHashMap.get(str);
                            if (str3 == null) {
                                strArr = null;
                            } else {
                                Object[] array = new om.c(",").a(str3).toArray(new String[0]);
                                if (array != null) {
                                    strArr = (String[]) array;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                            if (strArr == null) {
                                strArr = new String[0];
                            }
                            Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                            gm.l.f(copyOf, "elements");
                            LinkedHashSet linkedHashSet = new LinkedHashSet(v.j(copyOf.length));
                            ul.i.E(linkedHashSet, copyOf);
                            if (!linkedHashSet.contains(O)) {
                                StringBuilder sb2 = new StringBuilder();
                                if (strArr.length == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    if (strArr.length < 5) {
                                        sb2.append(str3);
                                        sb2.append(",");
                                    } else {
                                        while (true) {
                                            int i13 = i11 + 1;
                                            sb2.append(strArr[i11]);
                                            sb2.append(",");
                                            if (i13 >= 5) {
                                                break;
                                            }
                                            i11 = i13;
                                        }
                                        sb2.append(O);
                                        linkedHashSet.remove(strArr[0]);
                                        u.f23952f.put(str, sb2.toString());
                                    }
                                }
                                sb2.append(O);
                                u.f23952f.put(str, sb2.toString());
                            } else {
                                return;
                            }
                        } else {
                            concurrentHashMap.put(str, O);
                        }
                    }
                    u uVar3 = u.f23947a;
                    m0 m0Var2 = m0.f12709a;
                    String E = m0.E(u.f23952f);
                    uVar3.getClass();
                    if (!i6.a.b(uVar3)) {
                        o5.v.c().execute(new s.o("com.facebook.appevents.UserDataStore.internalUserData", E, 8));
                    }
                } catch (Throwable th2) {
                    i6.a.a(u.class, th2);
                }
            }
        }
    }

    public r(Context context) {
        this.f23939a = new m(context, (String) null);
    }

    public final void a(Bundle bundle, String str) {
        o5.v vVar = o5.v.f22837a;
        if (q0.b()) {
            this.f23939a.f(str, bundle);
        }
    }

    public r(Context context, String str) {
        this.f23939a = new m(context, str);
    }
}

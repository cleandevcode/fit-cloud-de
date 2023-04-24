package androidx.work;

import android.util.Log;
import f3.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b */
    public static final String f3646b = m.e("Data");

    /* renamed from: c */
    public static final b f3647c;

    /* renamed from: a */
    public HashMap f3648a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public HashMap f3649a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f3649a.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            HashMap hashMap2 = this.f3649a;
                            boolean[] zArr = (boolean[]) value;
                            String str2 = b.f3646b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            HashMap hashMap3 = this.f3649a;
                            byte[] bArr = (byte[]) value;
                            String str3 = b.f3646b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            hashMap3.put(str, bArr2);
                        } else if (cls == int[].class) {
                            HashMap hashMap4 = this.f3649a;
                            int[] iArr = (int[]) value;
                            String str4 = b.f3646b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            hashMap4.put(str, numArr);
                        } else if (cls == long[].class) {
                            HashMap hashMap5 = this.f3649a;
                            long[] jArr = (long[]) value;
                            String str5 = b.f3646b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            hashMap5.put(str, lArr);
                        } else if (cls == float[].class) {
                            HashMap hashMap6 = this.f3649a;
                            float[] fArr = (float[]) value;
                            String str6 = b.f3646b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            hashMap6.put(str, fArr2);
                        } else if (cls == double[].class) {
                            HashMap hashMap7 = this.f3649a;
                            double[] dArr = (double[]) value;
                            String str7 = b.f3646b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            hashMap7.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                        }
                    } else {
                        this.f3649a.put(str, value);
                    }
                }
            }
        }
    }

    static {
        b bVar = new b(new HashMap());
        b(bVar);
        f3647c = bVar;
    }

    public b() {
    }

    public b(b bVar) {
        this.f3648a = new HashMap(bVar.f3648a);
    }

    public b(HashMap hashMap) {
        this.f3648a = new HashMap(hashMap);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0067: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:105:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.b a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L7f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f3646b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L39
            goto L60
        L39:
            r7 = move-exception
            goto L5b
        L3b:
            r7 = move-exception
            goto L66
        L3d:
            r7 = move-exception
            goto L49
        L3f:
            r7 = move-exception
            goto L49
        L41:
            r1 = move-exception
            goto L68
        L43:
            r3 = move-exception
            goto L46
        L45:
            r3 = move-exception
        L46:
            r6 = r3
            r3 = r7
            r7 = r6
        L49:
            java.lang.String r4 = androidx.work.b.f3646b     // Catch: java.lang.Throwable -> L3b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L54
            goto L35
        L54:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f3646b
            android.util.Log.e(r3, r0, r7)
            goto L35
        L5b:
            java.lang.String r2 = androidx.work.b.f3646b
            android.util.Log.e(r2, r0, r7)
        L60:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L66:
            r1 = r7
            r7 = r3
        L68:
            if (r7 == 0) goto L74
            r7.close()     // Catch: java.io.IOException -> L6e
            goto L74
        L6e:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f3646b
            android.util.Log.e(r3, r0, r7)
        L74:
            r2.close()     // Catch: java.io.IOException -> L78
            goto L7e
        L78:
            r7 = move-exception
            java.lang.String r2 = androidx.work.b.f3646b
            android.util.Log.e(r2, r0, r7)
        L7e:
            throw r1
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.a(byte[]):androidx.work.b");
    }

    public static byte[] b(b bVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(bVar.f3648a.size());
                    for (Map.Entry entry : bVar.f3648a.entrySet()) {
                        objectOutputStream.writeUTF((String) entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException e10) {
                        Log.e(f3646b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f3646b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream2 = objectOutputStream;
                    Log.e(f3646b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e13) {
                            Log.e(f3646b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f3646b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f3646b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e16) {
                        Log.e(f3646b, "Error in Data#toByteArray: ", e16);
                    }
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.f3648a.keySet();
        if (keySet.equals(bVar.f3648a.keySet())) {
            for (String str : keySet) {
                Object obj2 = this.f3648a.get(str);
                Object obj3 = bVar.f3648a.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z10 = obj2.equals(obj3);
                    continue;
                }
                if (!z10) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3648a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f3648a.isEmpty()) {
            for (String str : this.f3648a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f3648a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}

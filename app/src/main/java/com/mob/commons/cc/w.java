package com.mob.commons.cc;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class w {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public ArrayList<Object> f8316a;

        /* renamed from: b */
        public DataInputStream f8317b;

        /* renamed from: c */
        public int f8318c;

        private a(ArrayList<Object> arrayList, DataInputStream dataInputStream, int i10) {
            this.f8316a = arrayList;
            this.f8317b = dataInputStream;
            this.f8318c = i10;
        }

        public void a() {
            this.f8317b.readShort();
        }

        public void a(x xVar) {
            xVar.f8327b = (String) this.f8316a.get(this.f8317b.readShort());
            xVar.f8328c = this.f8317b.readShort();
        }

        public <T> T b() {
            return (T) this.f8316a.get(this.f8317b.readShort());
        }

        public int c() {
            return this.f8318c;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        private b(ArrayList<Object> arrayList, DataInputStream dataInputStream, int i10) {
            super(arrayList, dataInputStream, i10);
        }

        @Override // com.mob.commons.cc.w.a
        public void a() {
            this.f8317b.readInt();
        }

        @Override // com.mob.commons.cc.w.a
        public void a(x xVar) {
            xVar.f8327b = (String) this.f8316a.get(this.f8317b.readInt());
            xVar.f8328c = this.f8317b.readInt();
        }

        @Override // com.mob.commons.cc.w.a
        public <T> T b() {
            return (T) this.f8316a.get(this.f8317b.readInt());
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private d f8319a;

        private c(Object obj) {
            this.f8319a = new d(obj);
        }

        public c a(Object obj) {
            this.f8319a.a(obj);
            return this;
        }

        public d a(String str, Class<?> cls) {
            return this.f8319a.a(str, cls);
        }

        public d a(String str, Object obj) {
            return this.f8319a.a(str, obj);
        }

        public void a() {
            this.f8319a.a();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private ArrayList<Object> f8320a;

        /* renamed from: b */
        private ArrayList<Object> f8321b;

        /* renamed from: c */
        private HashMap<String, Object> f8322c;

        /* renamed from: d */
        private HashMap<String, Object> f8323d;

        /* renamed from: e */
        private String f8324e;

        /* renamed from: f */
        private HashMap<Class<?>, Class<? extends s<?>>> f8325f;

        private d(Object obj) {
            ArrayList<Object> arrayList = new ArrayList<>();
            this.f8320a = arrayList;
            arrayList.add(obj);
            this.f8321b = new ArrayList<>();
            this.f8322c = new HashMap<>();
            this.f8323d = new HashMap<>();
            this.f8325f = new HashMap<>();
            this.f8322c.put("t_map", this.f8323d);
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x003e A[Catch: all -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:70:0x0032, B:76:0x003e), top: B:92:0x0032 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String a(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                if (r5 != 0) goto L5
                return r0
            L5:
                r1 = 0
                r2 = r5
            L7:
                if (r2 == 0) goto L13
                boolean r3 = r2 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L31
                if (r3 == 0) goto Le
                return r0
            Le:
                java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L31
                goto L7
            L13:
                java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L31
                r0.<init>()     // Catch: java.lang.Throwable -> L31
                java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2e
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
                r5.printStackTrace(r1)     // Catch: java.lang.Throwable -> L2e
                r1.flush()     // Catch: java.lang.Throwable -> L2e
                r1.close()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L2e
                r0.close()     // Catch: java.lang.Throwable -> L2d
            L2d:
                return r5
            L2e:
                r5 = move-exception
                r1 = r0
                goto L32
            L31:
                r5 = move-exception
            L32:
                boolean r0 = r5 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L48
                if (r0 == 0) goto L3e
                java.lang.String r5 = "getStackTraceString oom"
                if (r1 == 0) goto L3d
                r1.close()     // Catch: java.lang.Throwable -> L3d
            L3d:
                return r5
            L3e:
                java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L48
                if (r1 == 0) goto L47
                r1.close()     // Catch: java.lang.Throwable -> L47
            L47:
                return r5
            L48:
                r5 = move-exception
                if (r1 == 0) goto L4e
                r1.close()     // Catch: java.lang.Throwable -> L4e
            L4e:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.w.d.a(java.lang.Throwable):java.lang.String");
        }

        private String a(byte[] bArr, String str) {
            if (bArr != null) {
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AES");
                    sb2.append("/EC");
                    sb2.append("B/PKCS7P");
                    sb2.append("adding");
                    Provider provider = Security.getProvider("BC");
                    Cipher cipher = provider != null ? Cipher.getInstance(sb2.toString(), provider) : Cipher.getInstance(sb2.toString(), "BC");
                    cipher.init(1, secretKeySpec);
                    byte[] bArr2 = new byte[cipher.getOutputSize(bytes.length)];
                    cipher.doFinal(bArr2, cipher.update(bytes, 0, bytes.length, bArr2, 0));
                    return new BigInteger(1, bArr2).toString(16);
                } catch (Throwable unused) {
                    return "";
                }
            }
            return str;
        }

        private void a(InputStream inputStream, ArrayList<x> arrayList, t tVar) {
            if (inputStream.read() != 60) {
                inputStream.close();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (inputStream.read() == 1) {
                inputStream = new GZIPInputStream(inputStream);
            }
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(null);
            int readInt = dataInputStream.readInt();
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList2.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int readInt2 = dataInputStream.readInt();
            for (int i11 = 0; i11 < readInt2; i11++) {
                arrayList2.add(Long.valueOf(dataInputStream.readLong()));
            }
            int readInt3 = dataInputStream.readInt();
            for (int i12 = 0; i12 < readInt3; i12++) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt4 = dataInputStream.readInt();
            for (int i13 = 0; i13 < readInt4; i13++) {
                arrayList2.add(Double.valueOf(dataInputStream.readDouble()));
            }
            int readInt5 = dataInputStream.readInt();
            for (int i14 = 0; i14 < readInt5; i14++) {
                arrayList2.add(Boolean.valueOf(dataInputStream.readBoolean()));
            }
            int readInt6 = dataInputStream.readInt();
            for (int i15 = 0; i15 < readInt6; i15++) {
                arrayList2.add(dataInputStream.readUTF());
            }
            if (dataInputStream.readByte() != 15) {
                throw new RuntimeException("data has offset in pos 1");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            this.f8323d.put("lc_t", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
            a bVar = dataInputStream.readBoolean() ? new b(arrayList2, dataInputStream, arrayList.size()) : new a(arrayList2, dataInputStream, arrayList.size());
            int readInt7 = dataInputStream.readInt();
            boolean readBoolean = dataInputStream.readBoolean();
            if (dataInputStream.readByte() != 25) {
                throw new RuntimeException("data has offset in pos 2");
            }
            for (int i16 = 0; i16 < readInt7; i16++) {
                x xVar = new x();
                xVar.f8326a = dataInputStream.readByte();
                if (readBoolean) {
                    bVar.a(xVar);
                }
                xVar.a(bVar);
                arrayList.add(xVar);
            }
            if (dataInputStream.readByte() != 39) {
                throw new RuntimeException("data has offset in pos 3");
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            this.f8323d.put("lcmd_t", Long.valueOf(currentTimeMillis3 - currentTimeMillis2));
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            tVar.a(bArr);
            dataInputStream.close();
            this.f8323d.put("mreg_t", Long.valueOf(System.currentTimeMillis() - currentTimeMillis3));
        }

        public void a(Object obj) {
            this.f8320a.add(obj);
        }

        public <T> d a(Class<T> cls, Class<? extends s<T>> cls2) {
            this.f8325f.put(cls, cls2);
            return this;
        }

        public d a(String str) {
            this.f8324e = str;
            return this;
        }

        public d a(String str, Class<?> cls) {
            v.f8313a.put(str, cls);
            return this;
        }

        public d a(String str, Object obj) {
            this.f8322c.put(str, obj);
            return this;
        }

        public void a() {
            byte[] bArr;
            String message;
            InputStream byteArrayInputStream;
            ArrayList<x> arrayList = new ArrayList<>();
            String str = this.f8324e;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
                System.arraycopy(bArr, 0, new byte[16], 0, Math.min(bArr.length, 16));
            } else {
                bArr = null;
            }
            try {
                t tVar = new t();
                Iterator<Object> it = this.f8320a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        byteArrayInputStream = new FileInputStream((String) next);
                    } else if (next instanceof byte[]) {
                        byteArrayInputStream = new ByteArrayInputStream((byte[]) next);
                    } else {
                        throw new ClassCastException("program is not string or byte array");
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    a(byteArrayInputStream, arrayList, tVar);
                    this.f8323d.put("l_t", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                for (Map.Entry<Class<?>, Class<? extends s<?>>> entry : this.f8325f.entrySet()) {
                    tVar.a(entry.getKey(), entry.getValue());
                }
                new v(arrayList, this.f8321b).a(this.f8322c, tVar);
            } catch (Throwable th2) {
                th = th2;
                if (bArr != null) {
                    if (th.getMessage() == null) {
                        message = th.getClass().toString();
                    } else {
                        message = th.getMessage();
                    }
                    if (th instanceof u) {
                        th = th.getCause();
                    }
                    StringBuilder a10 = p.a.a(message, " ");
                    a10.append(a(th));
                    throw new u(a(bArr, a10.toString()), th);
                }
                throw th;
            }
        }
    }

    private w() {
    }

    public static int a() {
        return 60;
    }

    private static c a(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        c cVar = new c(objArr[0]);
        for (int i10 = 1; i10 < objArr.length; i10++) {
            cVar.a(objArr[i10]);
        }
        return cVar;
    }

    public static c a(String... strArr) {
        return a((Object[]) strArr);
    }

    public static c a(byte[]... bArr) {
        return a((Object[]) bArr);
    }
}

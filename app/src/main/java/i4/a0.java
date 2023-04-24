package i4;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class a0 extends o {
    public a0(h4.k kVar, Class<?> cls) {
        super(kVar, cls, cls);
    }

    public static Throwable o(String str, Throwable th2, Class cls) {
        Constructor<?>[] constructors;
        Object newInstance;
        Constructor<?> constructor = null;
        Constructor<?> constructor2 = null;
        Constructor<?> constructor3 = null;
        for (Constructor<?> constructor4 : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor4.getParameterTypes();
            if (parameterTypes.length == 0) {
                constructor3 = constructor4;
            } else if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                constructor2 = constructor4;
            } else if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == Throwable.class) {
                constructor = constructor4;
            }
        }
        if (constructor != null) {
            newInstance = constructor.newInstance(str, th2);
        } else if (constructor2 != null) {
            newInstance = constructor2.newInstance(str);
        } else if (constructor3 == null) {
            return null;
        } else {
            newInstance = constructor3.newInstance(new Object[0]);
        }
        return (Throwable) newInstance;
    }

    @Override // i4.o, i4.t
    public final int b() {
        return 12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0030, code lost:
        if (java.lang.Throwable.class.isAssignableFrom(r14) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00df, code lost:
        r15.J(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00e2, code lost:
        if (r14 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00e4, code lost:
        r15 = (T) new java.lang.Exception(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00f0, code lost:
        if (java.lang.Throwable.class.isAssignableFrom(r14) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00f2, code lost:
        r15 = (T) o(r5, r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00f6, code lost:
        if (r15 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00f8, code lost:
        r15 = (T) new java.lang.Exception(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00fd, code lost:
        if (r6 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00ff, code lost:
        ((java.lang.Throwable) r15).setStackTrace(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0102, code lost:
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0104, code lost:
        if (r14 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0108, code lost:
        if (r14 != r12.f16456c) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x010a, code lost:
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x010c, code lost:
        r14 = r13.f15771c.d(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0114, code lost:
        if ((r14 instanceof i4.o) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0116, code lost:
        r14 = (i4.o) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0119, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x011a, code lost:
        if (r14 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x011c, code lost:
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0128, code lost:
        if (r0.hasNext() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x012a, code lost:
        r2 = (java.util.Map.Entry) r0.next();
        r2 = r2.getValue();
        r3 = r14.i((java.lang.String) r2.getKey(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x013e, code lost:
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0140, code lost:
        r4 = r3.f16452a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0148, code lost:
        if (r4.f21951e.isInstance(r2) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x014a, code lost:
        r2 = n4.n.d(r2, r4.f21952f, r13.f15771c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0152, code lost:
        r3.d(r15, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0156, code lost:
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0157, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x015f, code lost:
        throw new e4.d("create instance error", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x016f, code lost:
        throw new e4.d(k.f.a(r14, android.support.v4.media.d.a("type not match, not Throwable. ")));
     */
    @Override // i4.o, i4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T d(h4.a r13, java.lang.reflect.Type r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a0.d(h4.a, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}

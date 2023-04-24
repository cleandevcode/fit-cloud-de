package i4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class r extends e {

    /* renamed from: a */
    public static r f16486a = new r();

    public static Map g(int i10, Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class) {
            return (i10 & h4.b.OrderedField.f15812a) != 0 ? new LinkedHashMap() : new HashMap();
        } else if (type == HashMap.class) {
            return new HashMap();
        } else {
            if (type == LinkedHashMap.class) {
                return new LinkedHashMap();
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : g(i10, rawType);
            }
            Class cls = (Class) type;
            if (cls.isInterface()) {
                throw new e4.d("unsupport type " + type);
            } else if ("java.util.Collections$UnmodifiableMap".equals(cls.getName())) {
                return new HashMap();
            } else {
                try {
                    return (Map) cls.newInstance();
                } catch (Exception e10) {
                    throw new e4.d("unsupport type " + type, e10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x01c3, code lost:
        r4.J(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0224, code lost:
        return r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0349, code lost:
        return r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01ba A[Catch: all -> 0x024c, TryCatch #2 {all -> 0x024c, blocks: (B:253:0x00b3, B:257:0x00c6, B:261:0x00d9, B:285:0x0163, B:287:0x0173, B:289:0x017b, B:294:0x0186, B:306:0x01b2, B:308:0x01ba, B:310:0x01c3, B:311:0x01c7, B:313:0x01d3, B:315:0x01d7, B:316:0x01da, B:297:0x0197, B:300:0x01a2, B:303:0x01a7, B:318:0x01e4, B:320:0x01e9, B:321:0x01ec, B:323:0x01f4, B:325:0x01fd, B:331:0x0218, B:324:0x01f9, B:264:0x00ea, B:265:0x0102, B:268:0x0107, B:272:0x0115, B:274:0x011d, B:277:0x012d, B:278:0x0145, B:279:0x0146, B:280:0x014b, B:281:0x014c, B:283:0x0154, B:336:0x0225, B:337:0x0245, B:338:0x0246, B:339:0x024b), top: B:418:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02e8 A[Catch: all -> 0x03c3, TRY_LEAVE, TryCatch #0 {all -> 0x03c3, blocks: (B:351:0x028a, B:353:0x0290, B:354:0x0295, B:356:0x029b, B:358:0x02a1, B:360:0x02a9, B:362:0x02b2, B:364:0x02be, B:371:0x02d0, B:373:0x02df, B:375:0x02e8, B:377:0x02ef, B:378:0x02f6, B:365:0x02c1, B:368:0x02ca, B:372:0x02d3, B:379:0x02f7, B:380:0x0315, B:381:0x0316, B:383:0x031c, B:385:0x0322, B:387:0x032e, B:389:0x0336, B:391:0x0342, B:394:0x034a, B:395:0x0351, B:397:0x0357, B:399:0x035b, B:401:0x037e, B:403:0x0386, B:405:0x039d, B:407:0x03a8, B:408:0x03c2, B:400:0x037a), top: B:415:0x028a }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x02ef A[Catch: all -> 0x03c3, TRY_ENTER, TryCatch #0 {all -> 0x03c3, blocks: (B:351:0x028a, B:353:0x0290, B:354:0x0295, B:356:0x029b, B:358:0x02a1, B:360:0x02a9, B:362:0x02b2, B:364:0x02be, B:371:0x02d0, B:373:0x02df, B:375:0x02e8, B:377:0x02ef, B:378:0x02f6, B:365:0x02c1, B:368:0x02ca, B:372:0x02d3, B:379:0x02f7, B:380:0x0315, B:381:0x0316, B:383:0x031c, B:385:0x0322, B:387:0x032e, B:389:0x0336, B:391:0x0342, B:394:0x034a, B:395:0x0351, B:397:0x0357, B:399:0x035b, B:401:0x037e, B:403:0x0386, B:405:0x039d, B:407:0x03a8, B:408:0x03c2, B:400:0x037a), top: B:415:0x028a }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x01c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(int r16, h4.a r17, java.lang.Object r18, java.lang.reflect.Type r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.r.h(int, h4.a, java.lang.Object, java.lang.reflect.Type, java.util.Map):java.lang.Object");
    }

    @Override // i4.t
    public final int b() {
        return 12;
    }

    @Override // i4.e
    public final <T> T f(h4.a aVar, Type type, Object obj, String str, int i10) {
        boolean z10;
        Map g10;
        if (type == e4.e.class) {
            aVar.getClass();
            return (T) aVar.L();
        }
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() == 8) {
            cVar.J(16);
            return null;
        }
        if ((type instanceof Class) && "java.util.Collections$UnmodifiableMap".equals(((Class) type).getName())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((cVar.l0() & h4.b.OrderedField.f15812a) != 0) {
            g10 = g(cVar.l0(), type);
        } else {
            g10 = g(e4.a.f13345g, type);
        }
        h4.j jVar = aVar.f15775g;
        try {
            aVar.b0(jVar, g10, obj);
            T t10 = (T) h(i10, aVar, obj, type, g10);
            if (z10) {
                t10 = (T) Collections.unmodifiableMap((Map) t10);
            }
            return t10;
        } finally {
            aVar.h0(jVar);
        }
    }
}

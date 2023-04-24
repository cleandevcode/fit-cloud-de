package u1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import w1.a1;
import w1.b1;
import w1.e0;
import w1.g;
import w1.q0;
import w1.w;
import w1.x0;
import w1.y;
import w1.y0;

/* loaded from: classes.dex */
public final class e extends w<e, a> implements q0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile x0<e> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y.c<String> strings_ = a1.f29536d;

    /* loaded from: classes.dex */
    public static final class a extends w.a<e, a> implements q0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        w.o(e.class, eVar);
    }

    public static void q(e eVar, Set set) {
        int i10;
        if (!eVar.strings_.m()) {
            y.c<String> cVar = eVar.strings_;
            int size = cVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            eVar.strings_ = cVar.c(i10);
        }
        List list = eVar.strings_;
        Charset charset = y.f29729a;
        set.getClass();
        if (set instanceof e0) {
            List<?> g10 = ((e0) set).g();
            e0 e0Var = (e0) list;
            int size2 = list.size();
            for (Object obj : g10) {
                if (obj == null) {
                    StringBuilder a10 = android.support.v4.media.d.a("Element at index ");
                    a10.append(e0Var.size() - size2);
                    a10.append(" is null.");
                    String sb2 = a10.toString();
                    int size3 = e0Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        }
                        e0Var.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof g) {
                    e0Var.d((g) obj);
                } else {
                    e0Var.add((String) obj);
                }
            }
        } else if (set instanceof y0) {
            list.addAll(set);
        } else {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : set) {
                if (obj2 == null) {
                    StringBuilder a11 = android.support.v4.media.d.a("Element at index ");
                    a11.append(list.size() - size4);
                    a11.append(" is null.");
                    String sb3 = a11.toString();
                    int size5 = list.size();
                    while (true) {
                        size5--;
                        if (size5 < size4) {
                            break;
                        }
                        list.remove(size5);
                    }
                    throw new NullPointerException(sb3);
                }
                list.add(obj2);
            }
        }
    }

    public static e r() {
        return DEFAULT_INSTANCE;
    }

    public static a t() {
        return (a) ((w.a) DEFAULT_INSTANCE.k(w.f.NEW_BUILDER));
    }

    @Override // w1.w
    public final Object k(w.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0<e> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (e.class) {
                        try {
                            x0Var = PARSER;
                            if (x0Var == null) {
                                x0Var = new w.b<>(DEFAULT_INSTANCE);
                                PARSER = x0Var;
                            }
                        } finally {
                        }
                    }
                }
                return x0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final y.c s() {
        return this.strings_;
    }
}

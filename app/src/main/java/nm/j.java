package nm;

import bi.m0;
import java.util.Iterator;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes2.dex */
public class j extends m0 {

    /* loaded from: classes2.dex */
    public static final class a<T> implements g<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f22491a;

        public a(Iterator it) {
            this.f22491a = it;
        }

        @Override // nm.g
        public final Iterator<T> iterator() {
            return this.f22491a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends gm.m implements fm.a<T> {

        /* renamed from: b */
        public final /* synthetic */ T f22492b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t10) {
            super(0);
            this.f22492b = t10;
        }

        @Override // fm.a
        public final T m() {
            return this.f22492b;
        }
    }

    public static final <T> g<T> G(Iterator<? extends T> it) {
        gm.l.f(it, "<this>");
        a aVar = new a(it);
        return aVar instanceof nm.a ? aVar : new nm.a(aVar);
    }

    public static final <T> g<T> H(T t10, fm.l<? super T, ? extends T> lVar) {
        return t10 == null ? d.f22475a : new f(new b(t10), lVar);
    }
}

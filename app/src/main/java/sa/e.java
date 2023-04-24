package sa;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final Map<Type, qa.i<?>> f26749a;

    /* renamed from: b */
    public final boolean f26750b = true;

    /* renamed from: c */
    public final List<qa.t> f26751c;

    /* loaded from: classes.dex */
    public class a<T> implements p<T> {

        /* renamed from: a */
        public final /* synthetic */ qa.i f26752a;

        public a(qa.i iVar, Type type) {
            this.f26752a = iVar;
        }

        @Override // sa.p
        public final T a() {
            return (T) this.f26752a.a();
        }
    }

    /* loaded from: classes.dex */
    public class b<T> implements p<T> {

        /* renamed from: a */
        public final /* synthetic */ qa.i f26753a;

        public b(qa.i iVar, Type type) {
            this.f26753a = iVar;
        }

        @Override // sa.p
        public final T a() {
            return (T) this.f26753a.a();
        }
    }

    /* loaded from: classes.dex */
    public class c<T> implements p<T> {

        /* renamed from: a */
        public final /* synthetic */ String f26754a;

        public c(String str) {
            this.f26754a = str;
        }

        @Override // sa.p
        public final T a() {
            throw new qa.m(this.f26754a);
        }
    }

    /* loaded from: classes.dex */
    public class d<T> implements p<T> {

        /* renamed from: a */
        public final /* synthetic */ String f26755a;

        public d(String str) {
            this.f26755a = str;
        }

        @Override // sa.p
        public final T a() {
            throw new qa.m(this.f26755a);
        }
    }

    public e(Map map, List list) {
        this.f26749a = map;
        this.f26751c = list;
    }

    public static String a(Class<?> cls) {
        StringBuilder sb2;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            sb2 = new StringBuilder();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            sb2 = new StringBuilder();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        sb2.append(str);
        sb2.append(cls.getName());
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> sa.p<T> b(xa.a<T> r10) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.e.b(xa.a):sa.p");
    }

    public final String toString() {
        return this.f26749a.toString();
    }
}

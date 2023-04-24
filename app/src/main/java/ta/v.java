package ta;

import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class v implements y {

    /* renamed from: a */
    public final /* synthetic */ Class f27953a;

    /* renamed from: b */
    public final /* synthetic */ x f27954b;

    /* loaded from: classes.dex */
    public class a extends x<Object> {

        /* renamed from: a */
        public final /* synthetic */ Class f27955a;

        public a(Class cls) {
            v.this = r1;
            this.f27955a = cls;
        }

        @Override // qa.x
        public final Object a(ya.a aVar) {
            Object a10 = v.this.f27954b.a(aVar);
            if (a10 != null && !this.f27955a.isInstance(a10)) {
                StringBuilder a11 = android.support.v4.media.d.a("Expected a ");
                a11.append(this.f27955a.getName());
                a11.append(" but was ");
                a11.append(a10.getClass().getName());
                a11.append("; at path ");
                a11.append(aVar.C());
                throw new qa.s(a11.toString());
            }
            return a10;
        }

        @Override // qa.x
        public final void b(ya.b bVar, Object obj) {
            v.this.f27954b.b(bVar, obj);
        }
    }

    public v(Class cls, x xVar) {
        this.f27953a = cls;
        this.f27954b = xVar;
    }

    @Override // qa.y
    public final <T2> x<T2> a(qa.h hVar, xa.a<T2> aVar) {
        Class<? super T2> cls = aVar.f30456a;
        if (!this.f27953a.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Factory[typeHierarchy=");
        a10.append(this.f27953a.getName());
        a10.append(",adapter=");
        a10.append(this.f27954b);
        a10.append("]");
        return a10.toString();
    }
}

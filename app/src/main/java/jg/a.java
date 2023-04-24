package jg;

import a0.a2;
import eh.f;
import eh.i;
import eh.j;
import gm.l;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: jg.a$a */
    /* loaded from: classes2.dex */
    public static final class C0308a {

        /* renamed from: a */
        public final String f17662a;

        public C0308a(String str) {
            l.f(str, "processId");
            this.f17662a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0308a) && l.a(this.f17662a, ((C0308a) obj).f17662a);
        }

        public final int hashCode() {
            return this.f17662a.hashCode();
        }

        public final String toString() {
            return a2.a(android.support.v4.media.d.a("NeedFillUser(processId="), this.f17662a, ')');
        }
    }

    Long a();

    Object b(String str, String str2, String str3, f.b bVar);

    Object c(String str, boolean z10, xl.d<? super tl.l> dVar);

    Object d(long j10, String str, String str2, xl.d<? super tl.l> dVar);

    Object e(xl.d<? super String> dVar);

    Object f(xl.d<? super tl.l> dVar);

    Object g(String str, String str2, boolean z10, i.b bVar);

    Object h(long j10, String str, xl.d<? super tl.l> dVar);

    Object i(String str, String str2, j.b bVar);

    Object j(xl.d<? super C0308a> dVar);

    Object k(String str, String str2, int i10, String str3, float f10, float f11, String str4, xl.d<? super Boolean> dVar);

    Object l(String str, String str2, String str3, boolean z10, xl.d<? super C0308a> dVar);
}

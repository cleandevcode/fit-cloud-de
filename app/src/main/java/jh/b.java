package jh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.d1;

/* loaded from: classes2.dex */
public final class b implements y3.b0 {

    /* renamed from: a */
    public final String f17738a;

    /* renamed from: b */
    public final y3.b<tl.l> f17739b;

    /* renamed from: c */
    public final int f17740c;

    public b() {
        this(null, null, 0, 7, null);
    }

    public b(String str, y3.b<tl.l> bVar, int i10) {
        gm.l.f(bVar, "requestAuthCode");
        this.f17738a = str;
        this.f17739b = bVar;
        this.f17740c = i10;
    }

    public /* synthetic */ b(String str, y3.b bVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? d1.f30940b : bVar, (i11 & 4) != 0 ? 0 : i10);
    }

    public static b copy$default(b bVar, String str, y3.b bVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f17738a;
        }
        if ((i11 & 2) != 0) {
            bVar2 = bVar.f17739b;
        }
        if ((i11 & 4) != 0) {
            i10 = bVar.f17740c;
        }
        bVar.getClass();
        gm.l.f(bVar2, "requestAuthCode");
        return new b(str, bVar2, i10);
    }

    public final String component1() {
        return this.f17738a;
    }

    public final y3.b<tl.l> component2() {
        return this.f17739b;
    }

    public final int component3() {
        return this.f17740c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return gm.l.a(this.f17738a, bVar.f17738a) && gm.l.a(this.f17739b, bVar.f17739b) && this.f17740c == bVar.f17740c;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17738a;
        return ((this.f17739b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31) + this.f17740c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AuthCodeState(usernameWhoRequestAuthCode=");
        a10.append(this.f17738a);
        a10.append(", requestAuthCode=");
        a10.append(this.f17739b);
        a10.append(", authCodeCountdown=");
        return a1.b.a(a10, this.f17740c, ')');
    }
}

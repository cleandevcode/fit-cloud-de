package eh;

import a0.a2;
import i2.t;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class b extends dh.b<a, Boolean> {

    /* renamed from: b */
    public final jg.a f13628b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f13629a;

        /* renamed from: b */
        public String f13630b;

        /* renamed from: c */
        public int f13631c;

        /* renamed from: d */
        public Date f13632d;

        /* renamed from: e */
        public float f13633e;

        /* renamed from: f */
        public float f13634f;

        /* renamed from: g */
        public String f13635g;

        public a(String str, String str2, int i10, Date date, float f10, float f11, String str3) {
            gm.l.f(str, "processId");
            gm.l.f(str2, "nickName");
            gm.l.f(date, "birthday");
            this.f13629a = str;
            this.f13630b = str2;
            this.f13631c = i10;
            this.f13632d = date;
            this.f13633e = f10;
            this.f13634f = f11;
            this.f13635g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f13629a, aVar.f13629a) && gm.l.a(this.f13630b, aVar.f13630b) && this.f13631c == aVar.f13631c && gm.l.a(this.f13632d, aVar.f13632d) && Float.compare(this.f13633e, aVar.f13633e) == 0 && Float.compare(this.f13634f, aVar.f13634f) == 0 && gm.l.a(this.f13635g, aVar.f13635g);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f13630b;
            int hashCode2 = this.f13632d.hashCode();
            int b10 = t0.e.b(this.f13634f, t0.e.b(this.f13633e, (hashCode2 + ((t.a(str, this.f13629a.hashCode() * 31, 31) + this.f13631c) * 31)) * 31, 31), 31);
            String str2 = this.f13635g;
            if (str2 == null) {
                hashCode = 0;
            } else {
                hashCode = str2.hashCode();
            }
            return b10 + hashCode;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Params(processId=");
            a10.append(this.f13629a);
            a10.append(", nickName=");
            a10.append(this.f13630b);
            a10.append(", sex=");
            a10.append(this.f13631c);
            a10.append(", birthday=");
            a10.append(this.f13632d);
            a10.append(", height=");
            a10.append(this.f13633e);
            a10.append(", weight=");
            a10.append(this.f13634f);
            a10.append(", avatar=");
            return a2.a(a10, this.f13635g, ')');
        }
    }

    public b(wm.b bVar, jg.b bVar2) {
        super(bVar);
        this.f13628b = bVar2;
    }

    @Override // dh.b
    public final Object a(a aVar, xl.d<? super Boolean> dVar) {
        a aVar2 = aVar;
        jg.a aVar3 = this.f13628b;
        String str = aVar2.f13629a;
        String str2 = aVar2.f13630b;
        int i10 = aVar2.f13631c;
        Date date = aVar2.f13632d;
        int i11 = hh.b.f16094a;
        gm.l.f(date, "<this>");
        String format = new SimpleDateFormat("yyyy/MM/dd", Locale.US).format(date);
        gm.l.e(format, "SimpleDateFormat(\"yyyy/M…, Locale.US).format(this)");
        return aVar3.k(str, str2, i10, format, aVar2.f13633e, aVar2.f13634f, aVar2.f13635g, dVar);
    }
}

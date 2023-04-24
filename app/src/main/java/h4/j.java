package h4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public Object f15833a;

    /* renamed from: b */
    public final j f15834b;

    /* renamed from: c */
    public final Object f15835c;

    /* renamed from: d */
    public final int f15836d;

    /* renamed from: e */
    public Type f15837e;

    /* renamed from: f */
    public transient String f15838f;

    public j(j jVar, Object obj, Object obj2) {
        this.f15834b = jVar;
        this.f15833a = obj;
        this.f15835c = obj2;
        this.f15836d = jVar == null ? 0 : jVar.f15836d + 1;
    }

    public final String toString() {
        StringBuilder sb2;
        String sb3;
        if (this.f15838f == null) {
            if (this.f15834b == null) {
                sb3 = "$";
            } else {
                if (this.f15835c instanceof Integer) {
                    sb2 = new StringBuilder();
                    sb2.append(this.f15834b.toString());
                    sb2.append("[");
                    sb2.append(this.f15835c);
                    sb2.append("]");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(this.f15834b.toString());
                    sb2.append(".");
                    sb2.append(this.f15835c);
                }
                sb3 = sb2.toString();
            }
            this.f15838f = sb3;
        }
        return this.f15838f;
    }
}

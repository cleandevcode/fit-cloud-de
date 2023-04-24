package g4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e */
    public static String f15002e = n4.b.b(f4.d.class);

    /* renamed from: f */
    public static final a f15003f = new a();

    /* renamed from: a */
    public final String f15004a;

    /* renamed from: b */
    public final Class<?>[] f15005b;

    /* renamed from: c */
    public f f15006c = null;

    /* renamed from: d */
    public boolean f15007d;

    /* loaded from: classes.dex */
    public static class a extends HashMap<String, String> {
        public a() {
            put("int", "I");
            put("boolean", "Z");
            put("byte", "B");
            put("char", "C");
            put("short", "S");
            put("float", "F");
            put("long", "J");
            put("double", "D");
        }
    }

    public j(String str, Class<?>[] clsArr) {
        this.f15004a = str;
        this.f15005b = clsArr;
    }

    public final String[] a() {
        String str;
        f fVar = this.f15006c;
        if (fVar != null && fVar.f14979e) {
            if (fVar.f14978d.length() != 0) {
                str = fVar.f14978d.substring(1);
            } else {
                str = "";
            }
            return str.split(",");
        }
        return new String[0];
    }
}
